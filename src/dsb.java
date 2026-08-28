import java.util.Optional;
import javax.annotation.Nullable;

public class dsb extends drv implements brj {
   private static final int a = 2;
   private static final int b = 4;
   private final jx<cvs> c = jx.a(4, cvs.k);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final dao.a<dba, czw> f = dao.b(daq.e);

   public dsb(jf $$0, dus $$1) {
      super(drx.G, $$0, $$1);
   }

   public static void a(dej $$0, jf $$1, dus $$2, dsb $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cvs $$6 = $$3.c.get($$5);
         if (!$$6.f()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               dba $$7 = new dba($$6);
               cvs $$8 = $$3.f.a($$7, $$0).map($$2x -> ((czw)$$2x.b()).a($$7, $$0.G_())).orElse($$6);
               if ($$8.a($$0.J())) {
                  bro.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cvs.k);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dzp.c, $$1, dzp.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dej $$0, jf $$1, dus $$2, dsb $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = azf.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(dej $$0, jf $$1, dus $$2, dsb $$3) {
      azn $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dia.a($$0, $$1, $$2.c(dia.d), false);
         }
      }

      int $$6 = $$2.c(dia.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).f() && $$4.i() < 0.2F) {
            jk $$8 = jk.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(lo.ae, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jx<cvs> b() {
      return this.c;
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      brm.b($$0, this.c, $$1);
      if ($$0.b("CookingTimes", 11)) {
         int[] $$2 = $$0.n("CookingTimes");
         System.arraycopy($$2, 0, this.d, 0, Math.min(this.e.length, $$2.length));
      }

      if ($$0.b("CookingTotalTimes", 11)) {
         int[] $$3 = $$0.n("CookingTotalTimes");
         System.arraycopy($$3, 0, this.e, 0, Math.min(this.e.length, $$3.length));
      }
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      brm.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public ach c() {
      return ach.a(this);
   }

   @Override
   public ug a(jq.a $$0) {
      ug $$1 = new ug();
      brm.a($$1, this.c, true, $$0);
      return $$1;
   }

   public Optional<dam<czw>> b(cvs $$0) {
      return this.c.stream().noneMatch(cvs::f) ? Optional.empty() : this.f.a(new dba($$0), this.o);
   }

   public boolean a(@Nullable bun $$0, cvs $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cvs $$4 = this.c.get($$3);
         if ($$4.f()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.b(1, $$0));
            this.o.a(dzp.c, this.aC_(), dzp.a.a($$0, this.m()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.aC_(), this.m(), this.m(), 3);
   }

   @Override
   public void a() {
      this.c.clear();
   }

   public void d() {
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void a(drv.b $$0) {
      super.a($$0);
      $$0.a(ks.ag, cyo.a).a(this.b());
   }

   @Override
   protected void a(ko.a $$0) {
      super.a($$0);
      $$0.a(ks.ag, cyo.a(this.b()));
   }

   @Override
   public void a(ug $$0) {
      $$0.r("Items");
   }
}
