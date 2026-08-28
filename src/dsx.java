import java.util.Optional;
import javax.annotation.Nullable;

public class dsx extends dsr implements bry {
   private static final int a = 2;
   private static final int b = 4;
   private final jz<cwf> c = jz.a(4, cwf.k);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final dax.a<dbi, daf> f = dax.b(daz.e);

   public dsx(jh $$0, dvo $$1) {
      super(dst.G, $$0, $$1);
   }

   public static void a(dff $$0, jh $$1, dvo $$2, dsx $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cwf $$6 = $$3.c.get($$5);
         if (!$$6.f()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               dbi $$7 = new dbi($$6);
               cwf $$8 = $$3.f.a($$7, $$0).map($$2x -> ((daf)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.J())) {
                  bsd.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cwf.k);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(eak.c, $$1, eak.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dff $$0, jh $$1, dvo $$2, dsx $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = azn.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(dff $$0, jh $$1, dvo $$2, dsx $$3) {
      azv $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dix.a($$0, $$1, $$2.c(dix.d), false);
         }
      }

      int $$6 = $$2.c(dix.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).f() && $$4.i() < 0.2F) {
            jm $$8 = jm.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(ls.ae, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jz<cwf> b() {
      return this.c;
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bsb.b($$0, this.c, $$1);
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
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      bsb.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public aco c() {
      return aco.a(this);
   }

   @Override
   public un a(js.a $$0) {
      un $$1 = new un();
      bsb.a($$1, this.c, true, $$0);
      return $$1;
   }

   public Optional<dav<daf>> b(cwf $$0) {
      return this.c.stream().noneMatch(cwf::f) ? Optional.empty() : this.f.a(new dbi($$0), this.o);
   }

   public boolean a(@Nullable bve $$0, cwf $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cwf $$4 = this.c.get($$3);
         if ($$4.f()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.b(1, $$0));
            this.o.a(eak.c, this.aB_(), eak.a.a($$0, this.m()));
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
   protected void a(dsr.b $$0) {
      super.a($$0);
      $$0.a(ku.al, cyx.a).a(this.b());
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.al, cyx.a(this.b()));
   }

   @Override
   public void a(un $$0) {
      $$0.r("Items");
   }
}
