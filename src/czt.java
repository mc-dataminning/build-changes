import java.util.Optional;
import javax.annotation.Nullable;

public class czt extends czn implements bdo {
   private static final int a = 2;
   private static final int b = 4;
   private final hn<cfz> c = hn.a(4, cfz.b);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cjd.a<bdq, ciq> f = cjd.b(cjf.e);

   public czt(gu $$0, dcb $$1) {
      super(czp.G, $$0, $$1);
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, czt $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cfz $$6 = $$3.c.get($$5);
         if (!$$6.b()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bdq $$7 = new bee($$6);
               cfz $$8 = $$3.f.a($$7, $$0).map($$2x -> $$2x.a($$7, $$0.B_())).orElse($$6);
               if ($$8.a($$0.G())) {
                  bdt.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cfz.b);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dgl.c, $$1, dgl.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(cmm $$0, gu $$1, dcb $$2, czt $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = apa.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(cmm $$0, gu $$1, dcb $$2, czt $$3) {
      apf $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            cqa.a($$0, $$1, $$2.c(cqa.c), false);
         }
      }

      int $$6 = $$2.c(cqa.e).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).b() && $$4.i() < 0.2F) {
            ha $$8 = ha.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(iv.Z, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public hn<cfz> c() {
      return this.c;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c.clear();
      bdr.b($$0, this.c);
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
   protected void b(qr $$0) {
      super.b($$0);
      bdr.a($$0, this.c, true);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public uz d() {
      return uz.a(this);
   }

   @Override
   public qr ao_() {
      qr $$0 = new qr();
      bdr.a($$0, this.c, true);
      return $$0;
   }

   public Optional<ciq> a(cfz $$0) {
      return this.c.stream().noneMatch(cfz::b) ? Optional.empty() : this.f.a(new bee($$0), this.o);
   }

   public boolean a(@Nullable bfj $$0, cfz $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cfz $$4 = this.c.get($$3);
         if ($$4.b()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.o.a(dgl.c, this.p(), dgl.a.a($$0, this.q()));
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
