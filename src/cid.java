import com.google.common.collect.Lists;
import java.util.List;

public class cid extends cge {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cgp t;
   private final cgw u = cgw.a();
   private final crs v;
   private List<coh<coz>> w = Lists.newArrayList();
   private clb x = clb.b;
   long y;
   final chz m;
   final chz n;
   Runnable z = () -> {
   };
   public final bij o = new bix(1) {
      @Override
      public void e() {
         super.e();
         cid.this.a(this);
         cid.this.z.run();
      }
   };
   final chu A = new chu();

   public cid(int $$0, cdl $$1) {
      this($$0, $$1, cgp.a);
   }

   public cid(int $$0, cdl $$1, final cgp $$2) {
      super(chl.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dL();
      this.m = this.a(new chz(this.o, 0, 20, 33));
      this.n = this.a(new chz(this.A, 1, 143, 33) {
         @Override
         public boolean a(clb $$0) {
            return false;
         }

         @Override
         public void a(cdm $$0, clb $$1) {
            $$1.a($$0.dL(), $$0, $$1.L());
            cid.this.A.a($$0, this.i());
            clb $$2 = cid.this.m.a(1);
            if (!$$2.b()) {
               cid.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.V();
               if (cid.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, aqn.yC, aqo.e, 1.0F, 1.0F);
                  cid.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<clb> i() {
            return List.of(cid.this.m.f());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new chz($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new chz($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<coh<coz>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.g() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cdm $$0) {
      return a(this.t, $$0, cuv.oc);
   }

   @Override
   public boolean b(cdm $$0, int $$1) {
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
   public void a(bij $$0) {
      clb $$1 = this.m.f();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bij $$0, clb $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(clb.b);
      if (!$$1.b()) {
         this.w = this.v.q().b(cok.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         coh<coz> $$0 = this.w.get(this.u.b());
         clb $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.G())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(clb.b);
         }
      } else {
         this.n.f(clb.b);
      }

      this.d();
   }

   @Override
   public chl<?> a() {
      return chl.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(clb $$0, chz $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public clb a(cdm $$0, int $$1) {
      clb $$2 = clb.b;
      chz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clb $$4 = $$3.f();
         ckw $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dL(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return clb.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return clb.b;
            }
         } else if (this.v.q().a(cok.f, new bix($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return clb.b;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return clb.b;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return clb.b;
         }

         if ($$4.b()) {
            $$3.e(clb.b);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return clb.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cdm $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
