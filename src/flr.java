public class flr<T extends bno> extends fmk<T> {
   private final fpc a;
   private final fpc b;

   public flr(fpc $$0) {
      this.a = $$0;
      this.b = $$0.b("tail_fin");
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fph.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), fpe.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", fph.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), fpe.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", fph.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), fpe.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", fph.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fpe.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fph.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fpe.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", fph.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), fpe.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", fph.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), fpe.a(0.0F, 20.0F, 0.0F));
      return fpi.a($$0, 32, 32);
   }

   @Override
   public fpc a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.aZ()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * awh.a(0.6F * $$3);
   }
}
