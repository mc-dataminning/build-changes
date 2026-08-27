import java.util.Optional;
import javax.annotation.Nullable;

public class dml extends dmf implements bnr {
   private static final int a = 2;
   private static final int b = 4;
   private final iu<crj> c = iu.a(4, crj.i);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cvm.a<bnt, cux> f = cvm.b(cvo.e);

   public dml(ib $$0, doz $$1) {
      super(dmh.G, $$0, $$1);
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dml $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         crj $$6 = $$3.c.get($$5);
         if (!$$6.d()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bnt $$7 = new boj($$6);
               crj $$8 = $$3.f.a($$7, $$0).map($$2x -> ((cux)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.J())) {
                  bnw.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, crj.i);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dts.c, $$1, dts.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(cyx $$0, ib $$1, doz $$2, dml $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = axk.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(cyx $$0, ib $$1, doz $$2, dml $$3) {
      axr $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dcm.a($$0, $$1, $$2.c(dcm.d), false);
         }
      }

      int $$6 = $$2.c(dcm.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).d() && $$4.i() < 0.2F) {
            ih $$8 = ih.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(kl.ac, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public iu<crj> b() {
      return this.c;
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bnu.b($$0, this.c, $$1);
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
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      bnu.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public abf c() {
      return abf.a(this);
   }

   @Override
   public tm a(in.a $$0) {
      tm $$1 = new tm();
      bnu.a($$1, this.c, true, $$0);
      return $$1;
   }

   public Optional<cvl<cux>> a(crj $$0) {
      return this.c.stream().noneMatch(crj::d) ? Optional.empty() : this.f.a(new boj($$0), this.o);
   }

   public boolean a(@Nullable bpv $$0, crj $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         crj $$4 = this.c.get($$3);
         if ($$4.d()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.o.a(dts.c, this.aA_(), dts.a.a($$0, this.n()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.aA_(), this.n(), this.n(), 3);
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
}
