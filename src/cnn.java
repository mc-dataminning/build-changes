import com.google.common.collect.Lists;
import java.util.List;

public class cnn extends clo {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final clz t;
   private final cmg u = cmg.a();
   private final cwz v;
   private List<ctp<cuh>> w = Lists.newArrayList();
   private cqk x = cqk.h;
   long y;
   final cnj m;
   final cnj n;
   Runnable z = () -> {
   };
   public final bmv o = new bnl(1) {
      @Override
      public void e() {
         super.e();
         cnn.this.a(this);
         cnn.this.z.run();
      }
   };
   final cne A = new cne();

   public cnn(int $$0, cir $$1) {
      this($$0, $$1, clz.a);
   }

   public cnn(int $$0, cir $$1, final clz $$2) {
      super(cmv.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dM();
      this.m = this.a(new cnj(this.o, 0, 20, 33));
      this.n = this.a(new cnj(this.A, 1, 143, 33) {
         @Override
         public boolean a(cqk $$0) {
            return false;
         }

         @Override
         public void a(cis $$0, cqk $$1) {
            $$1.a($$0.dM(), $$0, $$1.M());
            cnn.this.A.a($$0, this.j());
            cqk $$2 = cnn.this.m.a(1);
            if (!$$2.b()) {
               cnn.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.X();
               if (cnn.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, aty.zR, atz.e, 1.0F, 1.0F);
                  cnn.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cqk> j() {
            return List.of(cnn.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cnj($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cnj($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<ctp<cuh>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cis $$0) {
      return a(this.t, $$0, dac.oc);
   }

   @Override
   public boolean b(cis $$0, int $$1) {
      if (this.e($$1)) {
         this.u.a($$1);
         this.p();
      }

      return true;
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.w.size();
   }

   @Override
   public void a(bmv $$0) {
      cqk $$1 = this.m.g();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.q();
         this.a($$0, $$1);
      }
   }

   private void a(bmv $$0, cqk $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cqk.h);
      if (!$$1.b()) {
         this.w = this.v.r().b(cts.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         ctp<cuh> $$0 = this.w.get(this.u.b());
         cqk $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.I())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cqk.h);
         }
      } else {
         this.n.f(cqk.h);
      }

      this.d();
   }

   @Override
   public cmv<?> a() {
      return cmv.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cqk $$0, cnj $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cqk a(cis $$0, int $$1) {
      cqk $$2 = cqk.h;
      cnj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqk $$4 = $$3.g();
         cqf $$5 = $$4.d();
         $$2 = $$4.q();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cqk.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cqk.h;
            }
         } else if (this.v.r().a(cts.f, new bnl($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cqk.h;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cqk.h;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cqk.h;
         }

         if ($$4.b()) {
            $$3.e(cqk.h);
         }

         $$3.b();
         if ($$4.M() == $$2.M()) {
            return cqk.h;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cis $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
