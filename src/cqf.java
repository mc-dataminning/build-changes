import com.google.common.collect.Lists;
import java.util.List;

public class cqf extends cod {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cop t;
   private final cow u = cow.a();
   private final dad v;
   private List<cxf<cxx>> w = Lists.newArrayList();
   private csz x = csz.i;
   long y;
   final cpz m;
   final cpz n;
   Runnable z = () -> {
   };
   public final bpf o = new bpv(1) {
      @Override
      public void e() {
         super.e();
         cqf.this.a(this);
         cqf.this.z.run();
      }
   };
   final cpu A = new cpu();

   public cqf(int $$0, clg $$1) {
      this($$0, $$1, cop.a);
   }

   public cqf(int $$0, clg $$1, final cop $$2) {
      super(cpl.y, $$0);
      this.t = $$2;
      this.v = $$1.l.dN();
      this.m = this.a(new cpz(this.o, 0, 20, 33));
      this.n = this.a(new cpz(this.A, 1, 143, 33) {
         @Override
         public boolean a(csz $$0) {
            return false;
         }

         @Override
         public void a(clh $$0, csz $$1) {
            $$1.a($$0.dN(), $$0, $$1.G());
            cqf.this.A.a($$0, this.j());
            csz $$2 = cqf.this.m.a(1);
            if (!$$2.d()) {
               cqf.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Y();
               if (cqf.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, avc.Ah, avd.e, 1.0F, 1.0F);
                  cqf.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<csz> j() {
            return List.of(cqf.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cpz($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cpz($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cxf<cxx>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(clh $$0) {
      return a(this.t, $$0, ddg.oc);
   }

   @Override
   public boolean b(clh $$0, int $$1) {
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
   public void a(bpf $$0) {
      csz $$1 = this.m.g();
      if (!$$1.a(this.x.f())) {
         this.x = $$1.r();
         this.a($$0, $$1);
      }
   }

   private void a(bpf $$0, csz $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(csz.i);
      if (!$$1.d()) {
         this.w = this.v.r().b(cxi.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cxf<cxx> $$0 = this.w.get(this.u.b());
         csz $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(csz.i);
         }
      } else {
         this.n.f(csz.i);
      }

      this.d();
   }

   @Override
   public cpl<?> a() {
      return cpl.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(csz $$0, cpz $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public csz a(clh $$0, int $$1) {
      csz $$2 = csz.i;
      cpz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csz $$4 = $$3.g();
         csu $$5 = $$4.f();
         $$2 = $$4.r();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dN(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return csz.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return csz.i;
            }
         } else if (this.v.r().a(cxi.f, new bpv($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return csz.i;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return csz.i;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return csz.i;
         }

         if ($$4.d()) {
            $$3.e(csz.i);
         }

         $$3.b();
         if ($$4.G() == $$2.G()) {
            return csz.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(clh $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
