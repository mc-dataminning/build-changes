import com.google.common.collect.ImmutableList;

public class fpw<T extends cge> extends fov<T> {
   private static final String a = "lid";
   private static final String b = "base";
   private final frd f;
   private final frd g;
   private final frd h;

   public fpw(frd $$0) {
      super(fxy::f);
      this.g = $$0.b("lid");
      this.f = $$0.b("base");
      this.h = $$0.b("head");
   }

   public static frj a() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("lid", fri.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F), frf.a(0.0F, 24.0F, 0.0F));
      $$1.a("base", fri.c().a(0, 28).a(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F), frf.a(0.0F, 24.0F, 0.0F));
      $$1.a("head", fri.c().a(0, 52).a(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F), frf.a(0.0F, 12.0F, 0.0F));
      return frj.a($$0, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$3 - (float)$$0.ah;
      float $$7 = (0.5F + $$0.G($$6)) * (float) Math.PI;
      float $$8 = -1.0F + aww.a($$7);
      float $$9 = 0.0F;
      if ($$7 > (float) Math.PI) {
         $$9 = aww.a($$3 * 0.1F) * 0.7F;
      }

      this.g.a(0.0F, 16.0F + aww.a($$7) * 8.0F + $$9, 0.0F);
      if ($$0.G($$6) > 0.3F) {
         this.g.f = $$8 * $$8 * $$8 * $$8 * (float) Math.PI * 0.125F;
      } else {
         this.g.f = 0.0F;
      }

      this.h.e = $$5 * (float) (Math.PI / 180.0);
      this.h.f = ($$0.aZ - 180.0F - $$0.aX) * (float) (Math.PI / 180.0);
   }

   @Override
   public Iterable<frd> d() {
      return ImmutableList.of(this.f, this.g);
   }

   public frd b() {
      return this.g;
   }

   public frd c() {
      return this.h;
   }
}
