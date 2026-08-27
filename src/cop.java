import com.google.common.collect.Lists;
import java.util.List;

public class cop extends cmp {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cna t;
   private final cnh u = cnh.a();
   private final cyx v;
   private List<cvl<cwd>> w = Lists.newArrayList();
   private crj x = crj.i;
   long y;
   final cok m;
   final cok n;
   Runnable z = () -> {
   };
   public final bnt o = new boj(1) {
      @Override
      public void e() {
         super.e();
         cop.this.a(this);
         cop.this.z.run();
      }
   };
   final cof A = new cof();

   public cop(int $$0, cjs $$1) {
      this($$0, $$1, cna.a);
   }

   public cop(int $$0, cjs $$1, final cna $$2) {
      super(cnw.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dM();
      this.m = this.a(new cok(this.o, 0, 20, 33));
      this.n = this.a(new cok(this.A, 1, 143, 33) {
         @Override
         public boolean a(crj $$0) {
            return false;
         }

         @Override
         public void a(cjt $$0, crj $$1) {
            $$1.a($$0.dM(), $$0, $$1.G());
            cop.this.A.a($$0, this.j());
            crj $$2 = cop.this.m.a(1);
            if (!$$2.d()) {
               cop.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Y();
               if (cop.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, aum.zZ, aun.e, 1.0F, 1.0F);
                  cop.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<crj> j() {
            return List.of(cop.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cok($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cok($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cvl<cwd>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cjt $$0) {
      return a(this.t, $$0, dca.oc);
   }

   @Override
   public boolean b(cjt $$0, int $$1) {
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
   public void a(bnt $$0) {
      crj $$1 = this.m.g();
      if (!$$1.a(this.x.f())) {
         this.x = $$1.r();
         this.a($$0, $$1);
      }
   }

   private void a(bnt $$0, crj $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(crj.i);
      if (!$$1.d()) {
         this.w = this.v.r().b(cvo.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cvl<cwd> $$0 = this.w.get(this.u.b());
         crj $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(crj.i);
         }
      } else {
         this.n.f(crj.i);
      }

      this.d();
   }

   @Override
   public cnw<?> a() {
      return cnw.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(crj $$0, cok $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         cre $$5 = $$4.f();
         $$2 = $$4.r();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return crj.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return crj.i;
            }
         } else if (this.v.r().a(cvo.f, new boj($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return crj.i;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return crj.i;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return crj.i;
         }

         if ($$4.d()) {
            $$3.e(crj.i);
         }

         $$3.b();
         if ($$4.G() == $$2.G()) {
            return crj.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cjt $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
