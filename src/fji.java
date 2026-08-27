import com.google.common.collect.ImmutableList;

public class fji<T extends cbo> extends fih<T> {
   private static final String a = "lid";
   private static final String b = "base";
   private final fko f;
   private final fko g;
   private final fko h;

   public fji(fko $$0) {
      super(frc::f);
      this.g = $$0.b("lid");
      this.f = $$0.b("base");
      this.h = $$0.b("head");
   }

   public static fku a() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("lid", fkt.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F), fkq.a(0.0F, 24.0F, 0.0F));
      $$1.a("base", fkt.c().a(0, 28).a(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F), fkq.a(0.0F, 24.0F, 0.0F));
      $$1.a("head", fkt.c().a(0, 52).a(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F), fkq.a(0.0F, 12.0F, 0.0F));
      return fku.a($$0, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$3 - (float)$$0.ah;
      float $$7 = (0.5F + $$0.E($$6)) * (float) Math.PI;
      float $$8 = -1.0F + atm.a($$7);
      float $$9 = 0.0F;
      if ($$7 > (float) Math.PI) {
         $$9 = atm.a($$3 * 0.1F) * 0.7F;
      }

      this.g.a(0.0F, 16.0F + atm.a($$7) * 8.0F + $$9, 0.0F);
      if ($$0.E($$6) > 0.3F) {
         this.g.f = $$8 * $$8 * $$8 * $$8 * (float) Math.PI * 0.125F;
      } else {
         this.g.f = 0.0F;
      }

      this.h.e = $$5 * (float) (Math.PI / 180.0);
      this.h.f = ($$0.aW - 180.0F - $$0.aU) * (float) (Math.PI / 180.0);
   }

   @Override
   public Iterable<fko> d() {
      return ImmutableList.of(this.f, this.g);
   }

   public fko b() {
      return this.g;
   }

   public fko c() {
      return this.h;
   }
}
