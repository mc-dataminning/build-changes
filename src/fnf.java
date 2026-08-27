public class fnf<T extends boi> extends fng<T> {
   public final fpc a = this.k.b("right_ear");
   private final fpc A = this.k.b("left_ear");
   private final fpe B = this.m.a();
   private final fpe C = this.k.a();
   private final fpe D = this.o.a();
   private final fpe E = this.n.a();

   public fnf(fpc $$0) {
      super($$0, false);
   }

   public static fpk a(fpg $$0) {
      fpk $$1 = fng.a($$0, false);
      fpl $$2 = $$1.a();
      $$2.a("body", fph.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), fpe.a);
      a($$0, $$1);
      $$2.a("hat", fph.c(), fpe.a);
      return $$1;
   }

   public static void a(fpg $$0, fpk $$1) {
      fpl $$2 = $$1.a();
      fpl $$3 = $$2.a(
         "head",
         fph.c()
            .a(0, 0)
            .a(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, $$0)
            .a(31, 1)
            .a(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, $$0)
            .a(2, 4)
            .a(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, $$0)
            .a(2, 0)
            .a(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, $$0),
         fpe.a
      );
      $$3.a("left_ear", fph.c().a(51, 6).a(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, $$0), fpe.a(4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 6)));
      $$3.a("right_ear", fph.c().a(39, 6).a(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, $$0), fpe.a(-4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 6)));
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.m.b(this.B);
      this.k.b(this.C);
      this.o.b(this.D);
      this.n.b(this.E);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = (float) (Math.PI / 6);
      float $$7 = $$3 * 0.1F + $$1 * 0.5F;
      float $$8 = 0.08F + $$2 * 0.4F;
      this.A.g = (float) (-Math.PI / 6) - awh.b($$7 * 1.2F) * $$8;
      this.a.g = (float) (Math.PI / 6) + awh.b($$7) * $$8;
      if ($$0 instanceof cfw $$9) {
         cfz $$10 = $$9.gi();
         if ($$10 == cfz.e) {
            float $$11 = $$3 / 60.0F;
            this.a.g = (float) (Math.PI / 6) + (float) (Math.PI / 180.0) * awh.a($$11 * 30.0F) * 10.0F;
            this.A.g = (float) (-Math.PI / 6) - (float) (Math.PI / 180.0) * awh.b($$11 * 30.0F) * 10.0F;
            this.k.b = awh.a($$11 * 10.0F);
            this.k.c = awh.a($$11 * 40.0F) + 0.4F;
            this.n.g = (float) (Math.PI / 180.0) * (70.0F + awh.b($$11 * 40.0F) * 10.0F);
            this.o.g = this.n.g * -1.0F;
            this.n.c = awh.a($$11 * 40.0F) * 0.5F + 1.5F;
            this.o.c = awh.a($$11 * 40.0F) * 0.5F + 1.5F;
            this.m.c = awh.a($$11 * 40.0F) * 0.35F;
         } else if ($$10 == cfz.a && this.c == 0.0F) {
            this.a($$0);
         } else if ($$10 == cfz.b) {
            fkz.a(this.n, this.o, this.k, !$$0.fX());
         } else if ($$10 == cfz.c) {
            fkz.a(this.n, this.o, $$0, !$$0.fX());
         } else if ($$10 == cfz.d) {
            this.k.e = 0.5F;
            this.k.f = 0.0F;
            if ($$0.fX()) {
               this.n.f = -0.5F;
               this.n.e = -0.9F;
            } else {
               this.o.f = 0.5F;
               this.o.e = -0.9F;
            }
         }
      } else if ($$0.ai() == bnu.bv) {
         fkz.a(this.o, this.n, $$0.fY(), this.c, $$3);
      }

      this.x.a(this.q);
      this.y.a(this.p);
      this.b.a(this.o);
      this.w.a(this.n);
      this.z.a(this.m);
      this.l.a(this.k);
   }

   protected void a(T $$0, float $$1) {
      if (this.c > 0.0F && $$0 instanceof cfx && ((cfx)$$0).gi() == cfz.a) {
         fkz.a(this.n, this.o, $$0, this.c, $$1);
      } else {
         super.a($$0, $$1);
      }
   }

   private void a(T $$0) {
      if ($$0.fX()) {
         this.o.e = -1.8F;
      } else {
         this.n.e = -1.8F;
      }
   }
}
