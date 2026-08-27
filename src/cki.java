import com.google.common.collect.Lists;
import java.util.List;

public class cki extends cij {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final ciu t;
   private final cjb u = cjb.a();
   private final ctx v;
   private List<cqm<cre>> w = Lists.newArrayList();
   private cng x = cng.f;
   long y;
   final cke m;
   final cke n;
   Runnable z = () -> {
   };
   public final bjv o = new bkl(1) {
      @Override
      public void e() {
         super.e();
         cki.this.a(this);
         cki.this.z.run();
      }
   };
   final cjz A = new cjz();

   public cki(int $$0, cfp $$1) {
      this($$0, $$1, ciu.a);
   }

   public cki(int $$0, cfp $$1, final ciu $$2) {
      super(cjq.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dL();
      this.m = this.a(new cke(this.o, 0, 20, 33));
      this.n = this.a(new cke(this.A, 1, 143, 33) {
         @Override
         public boolean a(cng $$0) {
            return false;
         }

         @Override
         public void a(cfq $$0, cng $$1) {
            $$1.a($$0.dL(), $$0, $$1.L());
            cki.this.A.a($$0, this.j());
            cng $$2 = cki.this.m.a(1);
            if (!$$2.b()) {
               cki.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.X();
               if (cki.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, art.zN, aru.e, 1.0F, 1.0F);
                  cki.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cng> j() {
            return List.of(cki.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cke($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cke($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cqm<cre>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cfq $$0) {
      return a(this.t, $$0, cxa.oc);
   }

   @Override
   public boolean b(cfq $$0, int $$1) {
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
   public void a(bjv $$0) {
      cng $$1 = this.m.g();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bjv $$0, cng $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cng.f);
      if (!$$1.b()) {
         this.w = this.v.r().b(cqp.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cqm<cre> $$0 = this.w.get(this.u.b());
         cng $$1 = $$0.b().a(this.o, this.v.I_());
         if ($$1.a(this.v.I())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cng.f);
         }
      } else {
         this.n.f(cng.f);
      }

      this.d();
   }

   @Override
   public cjq<?> a() {
      return cjq.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cng $$0, cke $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cng a(cfq $$0, int $$1) {
      cng $$2 = cng.f;
      cke $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cng $$4 = $$3.g();
         cnb $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dL(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cng.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cng.f;
            }
         } else if (this.v.r().a(cqp.f, new bkl($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cng.f;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cng.f;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cng.f;
         }

         if ($$4.b()) {
            $$3.e(cng.f);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return cng.f;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cfq $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
