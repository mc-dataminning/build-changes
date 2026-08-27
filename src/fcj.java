public class fcj<T extends bgb> extends fck<T> {
   public final fee a = this.k.b("right_ear");
   private final fee A = this.k.b("left_ear");
   private final feg B = this.m.a();
   private final feg C = this.k.a();
   private final feg D = this.o.a();
   private final feg E = this.n.a();

   public fcj(fee $$0) {
      super($$0, false);
   }

   public static fem a(fei $$0) {
      fem $$1 = fck.a($$0, false);
      fen $$2 = $$1.a();
      $$2.a("body", fej.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), feg.a);
      a($$0, $$1);
      $$2.a("hat", fej.c(), feg.a);
      return $$1;
   }

   public static void a(fei $$0, fem $$1) {
      fen $$2 = $$1.a();
      fen $$3 = $$2.a(
         "head",
         fej.c()
            .a(0, 0)
            .a(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, $$0)
            .a(31, 1)
            .a(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, $$0)
            .a(2, 4)
            .a(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, $$0)
            .a(2, 0)
            .a(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, $$0),
         feg.a
      );
      $$3.a("left_ear", fej.c().a(51, 6).a(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, $$0), feg.a(4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 6)));
      $$3.a("right_ear", fej.c().a(39, 6).a(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, $$0), feg.a(-4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 6)));
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
      this.A.g = (float) (-Math.PI / 6) - apa.b($$7 * 1.2F) * $$8;
      this.a.g = (float) (Math.PI / 6) + apa.b($$7) * $$8;
      if ($$0 instanceof bxd $$9) {
         bxg $$10 = $$9.ga();
         if ($$10 == bxg.e) {
            float $$11 = $$3 / 60.0F;
            this.a.g = (float) (Math.PI / 6) + (float) (Math.PI / 180.0) * apa.a($$11 * 30.0F) * 10.0F;
            this.A.g = (float) (-Math.PI / 6) - (float) (Math.PI / 180.0) * apa.b($$11 * 30.0F) * 10.0F;
            this.k.b = apa.a($$11 * 10.0F);
            this.k.c = apa.a($$11 * 40.0F) + 0.4F;
            this.n.g = (float) (Math.PI / 180.0) * (70.0F + apa.b($$11 * 40.0F) * 10.0F);
            this.o.g = this.n.g * -1.0F;
            this.n.c = apa.a($$11 * 40.0F) * 0.5F + 1.5F;
            this.o.c = apa.a($$11 * 40.0F) * 0.5F + 1.5F;
            this.m.c = apa.a($$11 * 40.0F) * 0.35F;
         } else if ($$10 == bxg.a && this.c == 0.0F) {
            this.a($$0);
         } else if ($$10 == bxg.b) {
            faf.a(this.n, this.o, this.k, !$$0.fR());
         } else if ($$10 == bxg.c) {
            faf.a(this.n, this.o, $$0, !$$0.fR());
         } else if ($$10 == bxg.d) {
            this.k.e = 0.5F;
            this.k.f = 0.0F;
            if ($$0.fR()) {
               this.n.f = -0.5F;
               this.n.e = -0.9F;
            } else {
               this.o.f = 0.5F;
               this.o.e = -0.9F;
            }
         }
      } else if ($$0.ae() == bfn.bs) {
         faf.a(this.o, this.n, $$0.fS(), this.c, $$3);
      }

      this.x.a(this.q);
      this.y.a(this.p);
      this.b.a(this.o);
      this.w.a(this.n);
      this.z.a(this.m);
      this.l.a(this.k);
   }

   protected void a(T $$0, float $$1) {
      if (this.c > 0.0F && $$0 instanceof bxe && ((bxe)$$0).ga() == bxg.a) {
         faf.a(this.n, this.o, $$0, this.c, $$1);
      } else {
         super.a($$0, $$1);
      }
   }

   private void a(T $$0) {
      if ($$0.fR()) {
         this.o.e = -1.8F;
      } else {
         this.n.e = -1.8F;
      }
   }
}
