import com.google.common.collect.Lists;
import java.util.List;

public class crk extends cpg {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cpr t;
   private final cpy u = cpy.a();
   private final dca v;
   private List<czc<czu>> w = Lists.newArrayList();
   private cuh x = cuh.i;
   long y;
   final cre m;
   final cre n;
   Runnable z = () -> {
   };
   public final bpt o = new bqj(1) {
      @Override
      public void e() {
         super.e();
         crk.this.a(this);
         crk.this.z.run();
      }
   };
   final cqz A = new cqz();

   public crk(int $$0, clx $$1) {
      this($$0, $$1, cpr.a);
   }

   public crk(int $$0, clx $$1, final cpr $$2) {
      super(cqo.z, $$0);
      this.t = $$2;
      this.v = $$1.l.dU();
      this.m = this.a(new cre(this.o, 0, 20, 33));
      this.n = this.a(new cre(this.A, 1, 143, 33) {
         @Override
         public boolean a(cuh $$0) {
            return false;
         }

         @Override
         public void a(cly $$0, cuh $$1) {
            $$1.a($$0.dU(), $$0, $$1.G());
            crk.this.A.a($$0, this.j());
            cuh $$2 = crk.this.m.a(1);
            if (!$$2.d()) {
               crk.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Z();
               if (crk.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, avo.AQ, avq.e, 1.0F, 1.0F);
                  crk.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cuh> j() {
            return List.of(crk.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cre($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cre($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<czc<czu>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.t, $$0, dfe.pa);
   }

   @Override
   public boolean b(cly $$0, int $$1) {
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
   public void a(bpt $$0) {
      cuh $$1 = this.m.g();
      if (!$$1.a(this.x.f())) {
         this.x = $$1.r();
         this.a($$0, $$1);
      }
   }

   private void a(bpt $$0, cuh $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cuh.i);
      if (!$$1.d()) {
         this.w = this.v.r().b(czf.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         czc<czu> $$0 = this.w.get(this.u.b());
         cuh $$1 = $$0.b().a(this.o, this.v.I_());
         if ($$1.a(this.v.K())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cuh.i);
         }
      } else {
         this.n.f(cuh.i);
      }

      this.d();
   }

   @Override
   public cqo<?> a() {
      return cqo.z;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cuh $$0, cre $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuh $$4 = $$3.g();
         cuc $$5 = $$4.f();
         $$2 = $$4.r();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dU(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cuh.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cuh.i;
            }
         } else if (this.v.r().a(czf.f, new bqj($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cuh.i;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cuh.i;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cuh.i;
         }

         if ($$4.d()) {
            $$3.e(cuh.i);
         }

         $$3.b();
         if ($$4.G() == $$2.G()) {
            return cuh.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
