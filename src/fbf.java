import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class fbf extends fam {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fbf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fdf.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, fbf::new)
   );
   private final fde c;
   private final boolean d;

   private fbf(List<fci> $$0, fde $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public fao<fbf> b() {
      return fap.n;
   }

   @Override
   public Set<bax<?>> a() {
      return this.c.a();
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      if ($$0.m()) {
         int $$2 = $$0.p();
         float $$3 = this.d ? 1.0F - (float)$$0.o() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - azm.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(azm.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static fam.a<?> a(fde $$0) {
      return a($$1 -> new fbf($$1, $$0, false));
   }

   public static fam.a<?> a(fde $$0, boolean $$1) {
      return a($$2 -> new fbf($$2, $$0, $$1));
   }
}
