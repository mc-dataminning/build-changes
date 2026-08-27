import com.google.common.collect.Lists;
import java.util.List;

public class cjj extends chk {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final chv t;
   private final cic u = cic.a();
   private final csy v;
   private List<cpn<cqf>> w = Lists.newArrayList();
   private cmh x = cmh.f;
   long y;
   final cjf m;
   final cjf n;
   Runnable z = () -> {
   };
   public final bje o = new bjt(1) {
      @Override
      public void e() {
         super.e();
         cjj.this.a(this);
         cjj.this.z.run();
      }
   };
   final cja A = new cja();

   public cjj(int $$0, ceq $$1) {
      this($$0, $$1, chv.a);
   }

   public cjj(int $$0, ceq $$1, final chv $$2) {
      super(cir.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dM();
      this.m = this.a(new cjf(this.o, 0, 20, 33));
      this.n = this.a(new cjf(this.A, 1, 143, 33) {
         @Override
         public boolean a(cmh $$0) {
            return false;
         }

         @Override
         public void a(cer $$0, cmh $$1) {
            $$1.a($$0.dM(), $$0, $$1.L());
            cjj.this.A.a($$0, this.j());
            cmh $$2 = cjj.this.m.a(1);
            if (!$$2.b()) {
               cjj.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.W();
               if (cjj.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, arc.zy, ard.e, 1.0F, 1.0F);
                  cjj.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cmh> j() {
            return List.of(cjj.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjf($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjf($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cpn<cqf>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cer $$0) {
      return a(this.t, $$0, cwb.oc);
   }

   @Override
   public boolean b(cer $$0, int $$1) {
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
   public void a(bje $$0) {
      cmh $$1 = this.m.g();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bje $$0, cmh $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cmh.f);
      if (!$$1.b()) {
         this.w = this.v.q().b(cpq.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cpn<cqf> $$0 = this.w.get(this.u.b());
         cmh $$1 = $$0.b().a(this.o, this.v.I_());
         if ($$1.a(this.v.H())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cmh.f);
         }
      } else {
         this.n.f(cmh.f);
      }

      this.d();
   }

   @Override
   public cir<?> a() {
      return cir.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cmh $$0, cjf $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cmh a(cer $$0, int $$1) {
      cmh $$2 = cmh.f;
      cjf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmh $$4 = $$3.g();
         cmc $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cmh.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cmh.f;
            }
         } else if (this.v.q().a(cpq.f, new bjt($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cmh.f;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cmh.f;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cmh.f;
         }

         if ($$4.b()) {
            $$3.e(cmh.f);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return cmh.f;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cer $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
