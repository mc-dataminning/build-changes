import java.util.Optional;
import javax.annotation.Nullable;

public class dsm extends dsg implements brp {
   private static final int a = 2;
   private static final int b = 4;
   private final jy<cvx> c = jy.a(4, cvx.k);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final dan.a<daz, czv> f = dan.b(dap.e);

   public dsm(jg $$0, dvd $$1) {
      super(dsi.G, $$0, $$1);
   }

   public static void a(dev $$0, jg $$1, dvd $$2, dsm $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cvx $$6 = $$3.c.get($$5);
         if (!$$6.f()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               daz $$7 = new daz($$6);
               cvx $$8 = $$3.f.a($$7, $$0).map($$2x -> ((czv)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.J())) {
                  bru.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cvx.k);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(eaa.c, $$1, eaa.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dev $$0, jg $$1, dvd $$2, dsm $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = azj.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(dev $$0, jg $$1, dvd $$2, dsm $$3) {
      azr $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dim.a($$0, $$1, $$2.c(dim.d), false);
         }
      }

      int $$6 = $$2.c(dim.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).f() && $$4.i() < 0.2F) {
            jl $$8 = jl.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(lq.ae, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jy<cvx> b() {
      return this.c;
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      brs.b($$0, this.c, $$1);
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
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      brs.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public ack c() {
      return ack.a(this);
   }

   @Override
   public uj a(jr.a $$0) {
      uj $$1 = new uj();
      brs.a($$1, this.c, true, $$0);
      return $$1;
   }

   public Optional<dal<czv>> b(cvx $$0) {
      return this.c.stream().noneMatch(cvx::f) ? Optional.empty() : this.f.a(new daz($$0), this.o);
   }

   public boolean a(@Nullable buv $$0, cvx $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cvx $$4 = this.c.get($$3);
         if ($$4.f()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.b(1, $$0));
            this.o.a(eaa.c, this.aC_(), eaa.a.a($$0, this.m()));
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
   protected void a(dsg.b $$0) {
      super.a($$0);
      $$0.a(kt.ak, cyn.a).a(this.b());
   }

   @Override
   protected void a(kp.a $$0) {
      super.a($$0);
      $$0.a(kt.ak, cyn.a(this.b()));
   }

   @Override
   public void a(uj $$0) {
      $$0.r("Items");
   }
}
