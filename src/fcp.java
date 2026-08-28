import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class fcp extends fbw {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fcp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fep.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, fcp::new)
   );
   private final feo c;
   private final boolean d;

   private fcp(List<fds> $$0, feo $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public fby<fcp> b() {
      return fbz.n;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.c.a();
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      if ($$0.m()) {
         int $$2 = $$0.p();
         float $$3 = this.d ? 1.0F - (float)$$0.o() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - azq.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(azq.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static fbw.a<?> a(feo $$0) {
      return a($$1 -> new fcp($$1, $$0, false));
   }

   public static fbw.a<?> a(feo $$0, boolean $$1) {
      return a($$2 -> new fcp($$2, $$0, $$1));
   }
}
