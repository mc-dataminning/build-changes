import javax.annotation.Nullable;

public class exz extends eym {
   private final boolean a;
   private float m;
   private float n;

   public exz(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dkm $$0, bxy $$1) {
      super.a($$0, $$1);
      $$1.a(eyh.j, 0.0F);
      this.m = $$1.a(eyh.c);
      $$1.a(eyh.c, 6.0F);
      this.n = $$1.a(eyh.k);
      $$1.a(eyh.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(eyh.c, this.m);
      this.c.a(eyh.k, this.n);
      super.b();
   }

   @Override
   public eyc a() {
      return !this.c.bi() ? super.a() : this.c(new iw(azq.a(this.c.cR().a), azq.a(this.c.cR().b + 0.5), azq.a(this.c.cR().c)));
   }

   @Override
   public eyl a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eyc[] $$0, eyc $$1) {
      int $$2 = super.a($$0, $$1);
      eyh $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eyh $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != eyh.w) {
         $$5 = azq.d(Math.max(1.0F, this.c.dP()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new iw($$1.a, $$1.b, $$1.c));
      eyc $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jc.b, $$4);
      eyc $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jc.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eyh.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eyc $$11 = $$0[$$10];
         if ($$11.l == eyh.j && this.a && $$11.b < this.c.dV().P() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eyc $$0, eyc $$1) {
      return this.a($$0, $$1) && $$0.l == eyh.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eyh a(eyj $$0, int $$1, int $$2, int $$3) {
      eyh $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eyh.j) {
         iw.a $$5 = new iw.a();

         for (jc $$6 : jc.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eyh $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eyh.a) {
               return eyh.k;
            }
         }

         return eyh.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
