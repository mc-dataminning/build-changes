import com.mojang.serialization.Codec;

public class dvo extends dvh {
   public static final Codec<dvo> b = dip.b.fieldOf("state").xmap(dio.a::b, cvz::o).xmap(dvo::new, $$0 -> $$0.c).codec();
   private final cvz c;

   public dvo(cvz $$0) {
      this.c = $$0;
   }

   @Override
   protected dvi<?> a() {
      return dvi.f;
   }

   @Override
   public dip a(auf $$0, hv $$1) {
      ia.a $$2 = ia.a.a($$0);
      return this.c.o().a(dck.i, $$2);
   }
}
