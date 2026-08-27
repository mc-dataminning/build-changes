import com.google.common.collect.Lists;
import java.util.List;

public class cpj extends cnh {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cns t;
   private final cnz u = cnz.a();
   private final czu v;
   private List<cwi<cxa>> w = Lists.newArrayList();
   private csd x = csd.i;
   long y;
   final cpd m;
   final cpd n;
   Runnable z = () -> {
   };
   public final boj o = new boz(1) {
      @Override
      public void e() {
         super.e();
         cpj.this.a(this);
         cpj.this.z.run();
      }
   };
   final coy A = new coy();

   public cpj(int $$0, ckk $$1) {
      this($$0, $$1, cns.a);
   }

   public cpj(int $$0, ckk $$1, final cns $$2) {
      super(cop.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dN();
      this.m = this.a(new cpd(this.o, 0, 20, 33));
      this.n = this.a(new cpd(this.A, 1, 143, 33) {
         @Override
         public boolean a(csd $$0) {
            return false;
         }

         @Override
         public void a(ckl $$0, csd $$1) {
            $$1.a($$0.dN(), $$0, $$1.G());
            cpj.this.A.a($$0, this.j());
            csd $$2 = cpj.this.m.a(1);
            if (!$$2.d()) {
               cpj.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Y();
               if (cpj.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, auz.Ag, ava.e, 1.0F, 1.0F);
                  cpj.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<csd> j() {
            return List.of(cpj.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cpd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cpd($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cwi<cxa>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(ckl $$0) {
      return a(this.t, $$0, dcx.oc);
   }

   @Override
   public boolean b(ckl $$0, int $$1) {
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
   public void a(boj $$0) {
      csd $$1 = this.m.g();
      if (!$$1.a(this.x.f())) {
         this.x = $$1.r();
         this.a($$0, $$1);
      }
   }

   private void a(boj $$0, csd $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(csd.i);
      if (!$$1.d()) {
         this.w = this.v.r().b(cwl.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cwi<cxa> $$0 = this.w.get(this.u.b());
         csd $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(csd.i);
         }
      } else {
         this.n.f(csd.i);
      }

      this.d();
   }

   @Override
   public cop<?> a() {
      return cop.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(csd $$0, cpd $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public csd a(ckl $$0, int $$1) {
      csd $$2 = csd.i;
      cpd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csd $$4 = $$3.g();
         cry $$5 = $$4.f();
         $$2 = $$4.r();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dN(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return csd.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return csd.i;
            }
         } else if (this.v.r().a(cwl.f, new boz($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return csd.i;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return csd.i;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return csd.i;
         }

         if ($$4.d()) {
            $$3.e(csd.i);
         }

         $$3.b();
         if ($$4.G() == $$2.G()) {
            return csd.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(ckl $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
