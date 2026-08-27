public class fpj<T extends bpr> extends fpk<T> {
   public final frf a = this.k.b("right_ear");
   private final frf A = this.k.b("left_ear");
   private final frh B = this.m.a();
   private final frh C = this.k.a();
   private final frh D = this.o.a();
   private final frh E = this.n.a();

   public fpj(frf $$0) {
      super($$0, false);
   }

   public static frn a(frj $$0) {
      frn $$1 = fpk.a($$0, false);
      fro $$2 = $$1.a();
      $$2.a("body", frk.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), frh.a);
      a($$0, $$1);
      $$2.a("hat", frk.c(), frh.a);
      return $$1;
   }

   public static void a(frj $$0, frn $$1) {
      fro $$2 = $$1.a();
      fro $$3 = $$2.a(
         "head",
         frk.c()
            .a(0, 0)
            .a(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, $$0)
            .a(31, 1)
            .a(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, $$0)
            .a(2, 4)
            .a(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, $$0)
            .a(2, 0)
            .a(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, $$0),
         frh.a
      );
      $$3.a("left_ear", frk.c().a(51, 6).a(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, $$0), frh.a(4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 6)));
      $$3.a("right_ear", frk.c().a(39, 6).a(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, $$0), frh.a(-4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 6)));
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
      this.A.g = (float) (-Math.PI / 6) - aww.b($$7 * 1.2F) * $$8;
      this.a.g = (float) (Math.PI / 6) + aww.b($$7) * $$8;
      if ($$0 instanceof chj $$9) {
         chm $$10 = $$9.gp();
         if ($$10 == chm.e) {
            float $$11 = $$3 / 60.0F;
            this.a.g = (float) (Math.PI / 6) + (float) (Math.PI / 180.0) * aww.a($$11 * 30.0F) * 10.0F;
            this.A.g = (float) (-Math.PI / 6) - (float) (Math.PI / 180.0) * aww.b($$11 * 30.0F) * 10.0F;
            this.k.b = aww.a($$11 * 10.0F);
            this.k.c = aww.a($$11 * 40.0F) + 0.4F;
            this.n.g = (float) (Math.PI / 180.0) * (70.0F + aww.b($$11 * 40.0F) * 10.0F);
            this.o.g = this.n.g * -1.0F;
            this.n.c = aww.a($$11 * 40.0F) * 0.5F + 1.5F;
            this.o.c = aww.a($$11 * 40.0F) * 0.5F + 1.5F;
            this.m.c = aww.a($$11 * 40.0F) * 0.35F;
         } else if ($$10 == chm.a && this.c == 0.0F) {
            this.a($$0);
         } else if ($$10 == chm.b) {
            fnc.a(this.n, this.o, this.k, !$$0.ge());
         } else if ($$10 == chm.c) {
            fnc.a(this.n, this.o, $$0, !$$0.ge());
         } else if ($$10 == chm.d) {
            this.k.e = 0.5F;
            this.k.f = 0.0F;
            if ($$0.ge()) {
               this.n.f = -0.5F;
               this.n.e = -0.9F;
            } else {
               this.o.f = 0.5F;
               this.o.e = -0.9F;
            }
         }
      } else if ($$0.ai() == bpd.bx) {
         fnc.a(this.o, this.n, $$0.gf(), this.c, $$3);
      }

      this.x.a(this.q);
      this.y.a(this.p);
      this.b.a(this.o);
      this.w.a(this.n);
      this.z.a(this.m);
      this.l.a(this.k);
   }

   protected void a(T $$0, float $$1) {
      if (this.c > 0.0F && $$0 instanceof chk && ((chk)$$0).gp() == chm.a) {
         fnc.a(this.n, this.o, $$0, this.c, $$1);
      } else {
         super.a($$0, $$1);
      }
   }

   private void a(T $$0) {
      if ($$0.ge()) {
         this.o.e = -1.8F;
      } else {
         this.n.e = -1.8F;
      }
   }
}
