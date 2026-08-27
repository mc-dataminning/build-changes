import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class eej extends edw {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eej> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egf.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, eej::new)
   );
   private final ege c;
   private final boolean d;

   private eej(List<efj> $$0, ege $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public edy b() {
      return edz.j;
   }

   @Override
   public Set<ees<?>> a() {
      return this.c.a();
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      if ($$0.i()) {
         int $$2 = $$0.l();
         float $$3 = this.d ? 1.0F - (float)$$0.k() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - asb.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(asb.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static edw.a<?> a(ege $$0) {
      return a($$1 -> new eej($$1, $$0, false));
   }

   public static edw.a<?> a(ege $$0, boolean $$1) {
      return a($$2 -> new eej($$2, $$0, $$1));
   }
}
