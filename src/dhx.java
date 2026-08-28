import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhx(jk<dgn> c, bty d) implements dhv {
   public static final MapCodec<dhx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jv.a(mi.aR).fieldOf("enchantments").forGetter(dhx::b), bty.c.fieldOf("cost").forGetter(dhx::c)).apply($$0, dhx::new)
   );

   @Override
   public void a(daa $$0, dgt.a $$1, azz $$2, bur $$3) {
      for (dgq $$5 : dgp.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.b(), $$5.c());
      }
   }

   @Override
   public MapCodec<dhx> a() {
      return b;
   }

   public jk<dgn> b() {
      return this.c;
   }

   public bty c() {
      return this.d;
   }
}
