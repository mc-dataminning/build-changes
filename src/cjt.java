import com.google.common.collect.Lists;
import java.util.List;

public class cjt extends chu {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cif t;
   private final cim u = cim.a();
   private final cti v;
   private List<cpx<cqp>> w = Lists.newArrayList();
   private cmr x = cmr.f;
   long y;
   final cjp m;
   final cjp n;
   Runnable z = () -> {
   };
   public final bjo o = new bkd(1) {
      @Override
      public void e() {
         super.e();
         cjt.this.a(this);
         cjt.this.z.run();
      }
   };
   final cjk A = new cjk();

   public cjt(int $$0, cfa $$1) {
      this($$0, $$1, cif.a);
   }

   public cjt(int $$0, cfa $$1, final cif $$2) {
      super(cjb.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dM();
      this.m = this.a(new cjp(this.o, 0, 20, 33));
      this.n = this.a(new cjp(this.A, 1, 143, 33) {
         @Override
         public boolean a(cmr $$0) {
            return false;
         }

         @Override
         public void a(cfb $$0, cmr $$1) {
            $$1.a($$0.dM(), $$0, $$1.L());
            cjt.this.A.a($$0, this.j());
            cmr $$2 = cjt.this.m.a(1);
            if (!$$2.b()) {
               cjt.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.X();
               if (cjt.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, arm.zy, arn.e, 1.0F, 1.0F);
                  cjt.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cmr> j() {
            return List.of(cjt.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjp($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cpx<cqp>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cfb $$0) {
      return a(this.t, $$0, cwl.oc);
   }

   @Override
   public boolean b(cfb $$0, int $$1) {
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
   public void a(bjo $$0) {
      cmr $$1 = this.m.g();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bjo $$0, cmr $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cmr.f);
      if (!$$1.b()) {
         this.w = this.v.r().b(cqa.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cpx<cqp> $$0 = this.w.get(this.u.b());
         cmr $$1 = $$0.b().a(this.o, this.v.I_());
         if ($$1.a(this.v.I())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cmr.f);
         }
      } else {
         this.n.f(cmr.f);
      }

      this.d();
   }

   @Override
   public cjb<?> a() {
      return cjb.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cmr $$0, cjp $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cmr a(cfb $$0, int $$1) {
      cmr $$2 = cmr.f;
      cjp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmr $$4 = $$3.g();
         cmm $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cmr.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cmr.f;
            }
         } else if (this.v.r().a(cqa.f, new bkd($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cmr.f;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cmr.f;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cmr.f;
         }

         if ($$4.b()) {
            $$3.e(cmr.f);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return cmr.f;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cfb $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
