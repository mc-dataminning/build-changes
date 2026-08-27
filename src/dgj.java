import java.util.Optional;
import javax.annotation.Nullable;

public class dgj extends dgd implements bjc {
   private static final int a = 2;
   private static final int b = 4;
   private final io<cmh> c = io.a(4, cmh.f);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cpo.a<bje, coz> f = cpo.b(cpq.e);

   public dgj(hv $$0, dip $$1) {
      super(dgf.G, $$0, $$1);
   }

   public static void a(csy $$0, hv $$1, dip $$2, dgj $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cmh $$6 = $$3.c.get($$5);
         if (!$$6.b()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bje $$7 = new bjt($$6);
               cmh $$8 = $$3.f.a($$7, $$0).map($$2x -> ((coz)$$2x.b()).a($$7, $$0.I_())).orElse($$6);
               if ($$8.a($$0.H())) {
                  bjh.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cmh.f);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dmz.c, $$1, dmz.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(csy $$0, hv $$1, dip $$2, dgj $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = aty.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(csy $$0, hv $$1, dip $$2, dgj $$3) {
      auf $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            cwn.a($$0, $$1, $$2.c(cwn.d), false);
         }
      }

      int $$6 = $$2.c(cwn.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).b() && $$4.i() < 0.2F) {
            ia $$8 = ia.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(jv.ab, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public io<cmh> c() {
      return this.c;
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.c.clear();
      bjf.b($$0, this.c);
      if ($$0.b("CookingTimes", 11)) {
         int[] $$1 = $$0.n("CookingTimes");
         System.arraycopy($$1, 0, this.d, 0, Math.min(this.e.length, $$1.length));
      }

      if ($$0.b("CookingTotalTimes", 11)) {
         int[] $$2 = $$0.n("CookingTotalTimes");
         System.arraycopy($$2, 0, this.e, 0, Math.min(this.e.length, $$2.length));
      }
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      bjf.a($$0, this.c, true);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public yv d() {
      return yv.a(this);
   }

   @Override
   public sj ax_() {
      sj $$0 = new sj();
      bjf.a($$0, this.c, true);
      return $$0;
   }

   public Optional<cpn<coz>> a(cmh $$0) {
      return this.c.stream().noneMatch(cmh::b) ? Optional.empty() : this.f.a(new bjt($$0), this.o);
   }

   public boolean a(@Nullable blf $$0, cmh $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cmh $$4 = this.c.get($$3);
         if ($$4.b()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.o.a(dmz.c, this.aB_(), dmz.a.a($$0, this.r()));
            this.g();
            return true;
         }
      }

      return false;
   }

   private void g() {
      this.e();
      this.i().a(this.aB_(), this.r(), this.r(), 3);
   }

   @Override
   public void a() {
      this.c.clear();
   }

   public void f() {
      if (this.o != null) {
         this.g();
      }
   }
}
