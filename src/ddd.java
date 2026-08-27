import java.util.Optional;
import javax.annotation.Nullable;

public class ddd extends dcx implements bgr {
   private static final int a = 2;
   private static final int b = 4;
   private final hp<cjh> c = hp.a(4, cjh.b);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cmn.a<bgt, cly> f = cmn.b(cmp.e);

   public ddd(gw $$0, dfl $$1) {
      super(dcz.G, $$0, $$1);
   }

   public static void a(cpx $$0, gw $$1, dfl $$2, ddd $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cjh $$6 = $$3.c.get($$5);
         if (!$$6.b()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bgt $$7 = new bhh($$6);
               cjh $$8 = $$3.f.a($$7, $$0).map($$2x -> ((cly)$$2x.b()).a($$7, $$0.G_())).orElse($$6);
               if ($$8.a($$0.G())) {
                  bgw.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cjh.b);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(djv.c, $$1, djv.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(cpx $$0, gw $$1, dfl $$2, ddd $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = ary.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(cpx $$0, gw $$1, dfl $$2, ddd $$3) {
      ase $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            ctk.a($$0, $$1, $$2.c(ctk.c), false);
         }
      }

      int $$6 = $$2.c(ctk.e).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).b() && $$4.i() < 0.2F) {
            hc $$8 = hc.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(ix.Z, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public hp<cjh> c() {
      return this.c;
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.c.clear();
      bgu.b($$0, this.c);
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
   protected void b(qy $$0) {
      super.b($$0);
      bgu.a($$0, this.c, true);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public xf d() {
      return xf.a(this);
   }

   @Override
   public qy as_() {
      qy $$0 = new qy();
      bgu.a($$0, this.c, true);
      return $$0;
   }

   public Optional<cmm<cly>> a(cjh $$0) {
      return this.c.stream().noneMatch(cjh::b) ? Optional.empty() : this.f.a(new bhh($$0), this.o);
   }

   public boolean a(@Nullable bis $$0, cjh $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cjh $$4 = this.c.get($$3);
         if ($$4.b()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.o.a(djv.c, this.p(), djv.a.a($$0, this.q()));
            this.g();
            return true;
         }
      }

      return false;
   }

   private void g() {
      this.e();
      this.k().a(this.p(), this.q(), this.q(), 3);
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
