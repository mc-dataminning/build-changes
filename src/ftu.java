import com.google.common.collect.ImmutableList;

public class ftu<T extends cit> extends fst<T> {
   private static final String a = "lid";
   private static final String b = "base";
   private final fvb f;
   private final fvb g;
   private final fvb h;

   public ftu(fvb $$0) {
      super(gbw::f);
      this.g = $$0.b("lid");
      this.f = $$0.b("base");
      this.h = $$0.b("head");
   }

   public static fvh a() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      $$1.a("lid", fvg.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F), fvd.a(0.0F, 24.0F, 0.0F));
      $$1.a("base", fvg.c().a(0, 28).a(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F), fvd.a(0.0F, 24.0F, 0.0F));
      $$1.a("head", fvg.c().a(0, 52).a(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F), fvd.a(0.0F, 12.0F, 0.0F));
      return fvh.a($$0, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$3 - (float)$$0.ai;
      float $$7 = (0.5F + $$0.G($$6)) * (float) Math.PI;
      float $$8 = -1.0F + axz.a($$7);
      float $$9 = 0.0F;
      if ($$7 > (float) Math.PI) {
         $$9 = axz.a($$3 * 0.1F) * 0.7F;
      }

      this.g.a(0.0F, 16.0F + axz.a($$7) * 8.0F + $$9, 0.0F);
      if ($$0.G($$6) > 0.3F) {
         this.g.f = $$8 * $$8 * $$8 * $$8 * (float) Math.PI * 0.125F;
      } else {
         this.g.f = 0.0F;
      }

      this.h.e = $$5 * (float) (Math.PI / 180.0);
      this.h.f = ($$0.bb - 180.0F - $$0.aZ) * (float) (Math.PI / 180.0);
   }

   @Override
   public Iterable<fvb> d() {
      return ImmutableList.of(this.f, this.g);
   }

   public fvb b() {
      return this.g;
   }

   public fvb c() {
      return this.h;
   }
}
