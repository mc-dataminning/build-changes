import com.google.common.collect.Lists;
import java.util.List;

public class cil extends cgm {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cgx t;
   private final che u = che.a();
   private final csa v;
   private List<coq<cph>> w = Lists.newArrayList();
   private clj x = clj.b;
   long y;
   final cih m;
   final cih n;
   Runnable z = () -> {
   };
   public final biq o = new bje(1) {
      @Override
      public void e() {
         super.e();
         cil.this.a(this);
         cil.this.z.run();
      }
   };
   final cic A = new cic();

   public cil(int $$0, cdt $$1) {
      this($$0, $$1, cgx.a);
   }

   public cil(int $$0, cdt $$1, final cgx $$2) {
      super(cht.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dN();
      this.m = this.a(new cih(this.o, 0, 20, 33));
      this.n = this.a(new cih(this.A, 1, 143, 33) {
         @Override
         public boolean a(clj $$0) {
            return false;
         }

         @Override
         public void a(cdu $$0, clj $$1) {
            $$1.a($$0.dN(), $$0, $$1.L());
            cil.this.A.a($$0, this.i());
            clj $$2 = cil.this.m.a(1);
            if (!$$2.b()) {
               cil.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.W();
               if (cil.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, aqr.zd, aqs.e, 1.0F, 1.0F);
                  cil.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<clj> i() {
            return List.of(cil.this.m.f());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cih($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cih($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<coq<cph>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.g() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cdu $$0) {
      return a(this.t, $$0, cvc.oc);
   }

   @Override
   public boolean b(cdu $$0, int $$1) {
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
   public void a(biq $$0) {
      clj $$1 = this.m.f();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(biq $$0, clj $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(clj.b);
      if (!$$1.b()) {
         this.w = this.v.q().b(cot.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         coq<cph> $$0 = this.w.get(this.u.b());
         clj $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.H())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(clj.b);
         }
      } else {
         this.n.f(clj.b);
      }

      this.d();
   }

   @Override
   public cht<?> a() {
      return cht.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(clj $$0, cih $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public clj a(cdu $$0, int $$1) {
      clj $$2 = clj.b;
      cih $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clj $$4 = $$3.f();
         cle $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dN(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return clj.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return clj.b;
            }
         } else if (this.v.q().a(cot.f, new bje($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return clj.b;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return clj.b;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return clj.b;
         }

         if ($$4.b()) {
            $$3.e(clj.b);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return clj.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cdu $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
