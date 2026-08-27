import java.util.Optional;
import javax.annotation.Nullable;

public class dfj extends dfd implements bio {
   private static final int a = 2;
   private static final int b = 4;
   private final il<clj> c = il.a(4, clj.b);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cor.a<biq, coa> f = cor.b(cot.e);

   public dfj(ht $$0, dhi $$1) {
      super(dff.G, $$0, $$1);
   }

   public static void a(csa $$0, ht $$1, dhi $$2, dfj $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         clj $$6 = $$3.c.get($$5);
         if (!$$6.b()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               biq $$7 = new bje($$6);
               clj $$8 = $$3.f.a($$7, $$0).map($$2x -> ((coa)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.H())) {
                  bit.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, clj.b);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dls.c, $$1, dls.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(csa $$0, ht $$1, dhi $$2, dfj $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = atm.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(csa $$0, ht $$1, dhi $$2, dfj $$3) {
      ats $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            cvo.a($$0, $$1, $$2.c(cvo.d), false);
         }
      }

      int $$6 = $$2.c(cvo.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).b() && $$4.i() < 0.2F) {
            hx $$8 = hx.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(js.Z, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public il<clj> c() {
      return this.c;
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c.clear();
      bir.b($$0, this.c);
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
   protected void b(rz $$0) {
      super.b($$0);
      bir.a($$0, this.c, true);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public yk d() {
      return yk.a(this);
   }

   @Override
   public rz aw_() {
      rz $$0 = new rz();
      bir.a($$0, this.c, true);
      return $$0;
   }

   public Optional<coq<coa>> a(clj $$0) {
      return this.c.stream().noneMatch(clj::b) ? Optional.empty() : this.f.a(new bje($$0), this.o);
   }

   public boolean a(@Nullable bkq $$0, clj $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         clj $$4 = this.c.get($$3);
         if ($$4.b()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.o.a(dls.c, this.p(), dls.a.a($$0, this.q()));
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
