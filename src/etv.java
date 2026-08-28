import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class etv extends etc {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<etv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evx.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, etv::new)
   );
   private final evw c;
   private final boolean d;

   private etv(List<eva> $$0, evw $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ete<etv> b() {
      return etf.n;
   }

   @Override
   public Set<eui<?>> a() {
      return this.c.a();
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      if ($$0.l()) {
         int $$2 = $$0.o();
         float $$3 = this.d ? 1.0F - (float)$$0.n() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - ayo.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(ayo.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static etc.a<?> a(evw $$0) {
      return a($$1 -> new etv($$1, $$0, false));
   }

   public static etc.a<?> a(evw $$0, boolean $$1) {
      return a($$2 -> new etv($$2, $$0, $$1));
   }
}
