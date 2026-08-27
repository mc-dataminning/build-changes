import java.util.Optional;
import javax.annotation.Nullable;

public class dex extends der implements bih {
   private static final int a = 2;
   private static final int b = 4;
   private final il<clb> c = il.a(4, clb.b);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final coi.a<bij, cns> f = coi.b(cok.e);

   public dex(ht $$0, dgw $$1) {
      super(det.G, $$0, $$1);
   }

   public static void a(crs $$0, ht $$1, dgw $$2, dex $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         clb $$6 = $$3.c.get($$5);
         if (!$$6.b()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bij $$7 = new bix($$6);
               clb $$8 = $$3.f.a($$7, $$0).map($$2x -> ((cns)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.G())) {
                  bim.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, clb.b);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dlg.c, $$1, dlg.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(crs $$0, ht $$1, dgw $$2, dex $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = ati.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(crs $$0, ht $$1, dgw $$2, dex $$3) {
      ato $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            cvh.a($$0, $$1, $$2.c(cvh.d), false);
         }
      }

      int $$6 = $$2.c(cvh.f).e();

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

   public il<clb> c() {
      return this.c;
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c.clear();
      bik.b($$0, this.c);
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
      bik.a($$0, this.c, true);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public yk d() {
      return yk.a(this);
   }

   @Override
   public rz av_() {
      rz $$0 = new rz();
      bik.a($$0, this.c, true);
      return $$0;
   }

   public Optional<coh<cns>> a(clb $$0) {
      return this.c.stream().noneMatch(clb::b) ? Optional.empty() : this.f.a(new bix($$0), this.o);
   }

   public boolean a(@Nullable bki $$0, clb $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         clb $$4 = this.c.get($$3);
         if ($$4.b()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.o.a(dlg.c, this.p(), dlg.a.a($$0, this.q()));
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
