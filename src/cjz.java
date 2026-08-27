import com.google.common.collect.Lists;
import java.util.List;

public class cjz extends cia {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cil t;
   private final cis u = cis.a();
   private final cto v;
   private List<cqd<cqv>> w = Lists.newArrayList();
   private cmx x = cmx.f;
   long y;
   final cjv m;
   final cjv n;
   Runnable z = () -> {
   };
   public final bjt o = new bki(1) {
      @Override
      public void e() {
         super.e();
         cjz.this.a(this);
         cjz.this.z.run();
      }
   };
   final cjq A = new cjq();

   public cjz(int $$0, cfg $$1) {
      this($$0, $$1, cil.a);
   }

   public cjz(int $$0, cfg $$1, final cil $$2) {
      super(cjh.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dM();
      this.m = this.a(new cjv(this.o, 0, 20, 33));
      this.n = this.a(new cjv(this.A, 1, 143, 33) {
         @Override
         public boolean a(cmx $$0) {
            return false;
         }

         @Override
         public void a(cfh $$0, cmx $$1) {
            $$1.a($$0.dM(), $$0, $$1.L());
            cjz.this.A.a($$0, this.j());
            cmx $$2 = cjz.this.m.a(1);
            if (!$$2.b()) {
               cjz.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.X();
               if (cjz.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, arr.zy, ars.e, 1.0F, 1.0F);
                  cjz.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cmx> j() {
            return List.of(cjz.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjv($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjv($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cqd<cqv>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cfh $$0) {
      return a(this.t, $$0, cwr.oc);
   }

   @Override
   public boolean b(cfh $$0, int $$1) {
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
   public void a(bjt $$0) {
      cmx $$1 = this.m.g();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bjt $$0, cmx $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cmx.f);
      if (!$$1.b()) {
         this.w = this.v.r().b(cqg.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cqd<cqv> $$0 = this.w.get(this.u.b());
         cmx $$1 = $$0.b().a(this.o, this.v.I_());
         if ($$1.a(this.v.I())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cmx.f);
         }
      } else {
         this.n.f(cmx.f);
      }

      this.d();
   }

   @Override
   public cjh<?> a() {
      return cjh.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cmx $$0, cjv $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cmx a(cfh $$0, int $$1) {
      cmx $$2 = cmx.f;
      cjv $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmx $$4 = $$3.g();
         cms $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cmx.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cmx.f;
            }
         } else if (this.v.r().a(cqg.f, new bki($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cmx.f;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cmx.f;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cmx.f;
         }

         if ($$4.b()) {
            $$3.e(cmx.f);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return cmx.f;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cfh $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
