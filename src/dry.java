import java.util.Optional;
import javax.annotation.Nullable;

public class dry extends drs implements brg {
   private static final int a = 2;
   private static final int b = 4;
   private final jw<cvp> c = jw.a(4, cvp.k);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final dal.a<dax, czt> f = dal.b(dan.e);

   public dry(je $$0, duo $$1) {
      super(dru.G, $$0, $$1);
   }

   public static void a(deg $$0, je $$1, duo $$2, dry $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cvp $$6 = $$3.c.get($$5);
         if (!$$6.f()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               dax $$7 = new dax($$6);
               cvp $$8 = $$3.f.a($$7, $$0).map($$2x -> ((czt)$$2x.b()).a($$7, $$0.F_())).orElse($$6);
               if ($$8.a($$0.J())) {
                  brl.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cvp.k);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dzl.c, $$1, dzl.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(deg $$0, je $$1, duo $$2, dry $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = azd.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(deg $$0, je $$1, duo $$2, dry $$3) {
      azl $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dhx.a($$0, $$1, $$2.c(dhx.d), false);
         }
      }

      int $$6 = $$2.c(dhx.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).f() && $$4.i() < 0.2F) {
            jj $$8 = jj.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(ln.ae, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jw<cvp> b() {
      return this.c;
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      brj.b($$0, this.c, $$1);
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
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      brj.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public acg c() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      uf $$1 = new uf();
      brj.a($$1, this.c, true, $$0);
      return $$1;
   }

   public Optional<daj<czt>> b(cvp $$0) {
      return this.c.stream().noneMatch(cvp::f) ? Optional.empty() : this.f.a(new dax($$0), this.o);
   }

   public boolean a(@Nullable buk $$0, cvp $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cvp $$4 = this.c.get($$3);
         if ($$4.f()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.b(1, $$0));
            this.o.a(dzl.c, this.aB_(), dzl.a.a($$0, this.m()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.aB_(), this.m(), this.m(), 3);
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
   protected void a(drs.b $$0) {
      super.a($$0);
      $$0.a(kr.ag, cyl.a).a(this.b());
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kr.ag, cyl.a(this.b()));
   }

   @Override
   public void a(uf $$0) {
      $$0.r("Items");
   }
}
