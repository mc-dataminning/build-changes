import com.google.common.collect.Lists;
import java.util.List;

public class cgj extends cen {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cey t;
   private final cfd u = cfd.a();
   private final cpx v;
   private List<cmm<cnd>> w = Lists.newArrayList();
   private cjh x = cjh.b;
   long y;
   final cgf m;
   final cgf n;
   Runnable z = () -> {
   };
   public final bgt o = new bhh(1) {
      @Override
      public void e() {
         super.e();
         cgj.this.a(this);
         cgj.this.z.run();
      }
   };
   final cga A = new cga();

   public cgj(int $$0, cbv $$1) {
      this($$0, $$1, cey.a);
   }

   public cgj(int $$0, cbv $$1, final cey $$2) {
      super(cfs.x, $$0);
      this.t = $$2;
      this.v = $$1.m.dL();
      this.m = this.a(new cgf(this.o, 0, 20, 33));
      this.n = this.a(new cgf(this.A, 1, 143, 33) {
         @Override
         public boolean a(cjh $$0) {
            return false;
         }

         @Override
         public void a(cbw $$0, cjh $$1) {
            $$1.a($$0.dL(), $$0, $$1.L());
            cgj.this.A.a($$0, this.i());
            cjh $$2 = cgj.this.m.a(1);
            if (!$$2.b()) {
               cgj.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.V();
               if (cgj.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, apf.yy, apg.e, 1.0F, 1.0F);
                  cgj.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cjh> i() {
            return List.of(cgj.this.m.e());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cgf($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cgf($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cmm<cnd>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.f() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cbw $$0) {
      return a(this.t, $$0, csy.oc);
   }

   @Override
   public boolean b(cbw $$0, int $$1) {
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
   public void a(bgt $$0) {
      cjh $$1 = this.m.e();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bgt $$0, cjh $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.e(cjh.b);
      if (!$$1.b()) {
         this.w = this.v.q().b(cmp.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cmm<cnd> $$0 = this.w.get(this.u.b());
         cjh $$1 = $$0.b().a(this.o, this.v.G_());
         if ($$1.a(this.v.G())) {
            this.A.a($$0);
            this.n.e($$1);
         } else {
            this.n.e(cjh.b);
         }
      } else {
         this.n.e(cjh.b);
      }

      this.d();
   }

   @Override
   public cfs<?> a() {
      return cfs.x;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cjh $$0, cgf $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cjh a(cbw $$0, int $$1) {
      cjh $$2 = cjh.b;
      cgf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjh $$4 = $$3.e();
         cjc $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dL(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cjh.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cjh.b;
            }
         } else if (this.v.q().a(cmp.f, new bhh($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cjh.b;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cjh.b;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cjh.b;
         }

         if ($$4.b()) {
            $$3.d(cjh.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return cjh.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cbw $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
