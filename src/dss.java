import java.util.Optional;
import javax.annotation.Nullable;

public class dss extends dsm implements bru {
   private static final int a = 2;
   private static final int b = 4;
   private final jz<cwb> c = jz.a(4, cwb.k);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final dat.a<dbf, dab> f = dat.b(dav.e);

   public dss(jh $$0, dvj $$1) {
      super(dso.G, $$0, $$1);
   }

   public static void a(dfb $$0, jh $$1, dvj $$2, dss $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cwb $$6 = $$3.c.get($$5);
         if (!$$6.f()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               dbf $$7 = new dbf($$6);
               cwb $$8 = $$3.f.a($$7, $$0).map($$2x -> ((dab)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.J())) {
                  brz.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cwb.k);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(eag.c, $$1, eag.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dfb $$0, jh $$1, dvj $$2, dss $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = azk.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(dfb $$0, jh $$1, dvj $$2, dss $$3) {
      azs $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dis.a($$0, $$1, $$2.c(dis.d), false);
         }
      }

      int $$6 = $$2.c(dis.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).f() && $$4.i() < 0.2F) {
            jm $$8 = jm.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(lr.ae, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jz<cwb> b() {
      return this.c;
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      brx.b($$0, this.c, $$1);
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
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      brx.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public acl c() {
      return acl.a(this);
   }

   @Override
   public uk a(js.a $$0) {
      uk $$1 = new uk();
      brx.a($$1, this.c, true, $$0);
      return $$1;
   }

   public Optional<dar<dab>> b(cwb $$0) {
      return this.c.stream().noneMatch(cwb::f) ? Optional.empty() : this.f.a(new dbf($$0), this.o);
   }

   public boolean a(@Nullable bva $$0, cwb $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cwb $$4 = this.c.get($$3);
         if ($$4.f()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.b(1, $$0));
            this.o.a(eag.c, this.aB_(), eag.a.a($$0, this.m()));
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
   protected void a(dsm.b $$0) {
      super.a($$0);
      $$0.a(ku.al, cyt.a).a(this.b());
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.al, cyt.a(this.b()));
   }

   @Override
   public void a(uk $$0) {
      $$0.r("Items");
   }
}
