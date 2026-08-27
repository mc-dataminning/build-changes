import com.mojang.serialization.Codec;

public class ech extends eca {
   public static final Codec<ech> b = doz.b.fieldOf("state").xmap(doy.a::b, dby::n).xmap(ech::new, $$0 -> $$0.c).codec();
   private final dby c;

   public ech(dby $$0) {
      this.c = $$0;
   }

   @Override
   protected ecb<?> a() {
      return ecb.f;
   }

   @Override
   public doz a(axr $$0, ib $$1) {
      ih.a $$2 = ih.a.a($$0);
      return this.c.n().a(dij.i, $$2);
   }
}
