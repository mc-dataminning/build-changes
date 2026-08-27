import com.google.common.collect.Lists;
import java.util.List;

public class cgh extends cel {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cew t;
   private final cfb u = cfb.a();
   private final cpv v;
   private List<cmk<cnb>> w = Lists.newArrayList();
   private cjf x = cjf.b;
   long y;
   final cgd m;
   final cgd n;
   Runnable z = () -> {
   };
   public final bgr o = new bhf(1) {
      @Override
      public void e() {
         super.e();
         cgh.this.a(this);
         cgh.this.z.run();
      }
   };
   final cfy A = new cfy();

   public cgh(int $$0, cbt $$1) {
      this($$0, $$1, cew.a);
   }

   public cgh(int $$0, cbt $$1, final cew $$2) {
      super(cfq.x, $$0);
      this.t = $$2;
      this.v = $$1.m.dL();
      this.m = this.a(new cgd(this.o, 0, 20, 33));
      this.n = this.a(new cgd(this.A, 1, 143, 33) {
         @Override
         public boolean a(cjf $$0) {
            return false;
         }

         @Override
         public void a(cbu $$0, cjf $$1) {
            $$1.a($$0.dL(), $$0, $$1.L());
            cgh.this.A.a($$0, this.i());
            cjf $$2 = cgh.this.m.a(1);
            if (!$$2.b()) {
               cgh.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.V();
               if (cgh.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, ape.yy, apf.e, 1.0F, 1.0F);
                  cgh.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cjf> i() {
            return List.of(cgh.this.m.e());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cgd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cgd($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cmk<cnb>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.f() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cbu $$0) {
      return a(this.t, $$0, csw.oc);
   }

   @Override
   public boolean b(cbu $$0, int $$1) {
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
   public void a(bgr $$0) {
      cjf $$1 = this.m.e();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bgr $$0, cjf $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.e(cjf.b);
      if (!$$1.b()) {
         this.w = this.v.q().b(cmn.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cmk<cnb> $$0 = this.w.get(this.u.b());
         cjf $$1 = $$0.b().a(this.o, this.v.G_());
         if ($$1.a(this.v.G())) {
            this.A.a($$0);
            this.n.e($$1);
         } else {
            this.n.e(cjf.b);
         }
      } else {
         this.n.e(cjf.b);
      }

      this.d();
   }

   @Override
   public cfq<?> a() {
      return cfq.x;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cjf $$0, cgd $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cjf a(cbu $$0, int $$1) {
      cjf $$2 = cjf.b;
      cgd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjf $$4 = $$3.e();
         cja $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dL(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cjf.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cjf.b;
            }
         } else if (this.v.q().a(cmn.f, new bhf($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cjf.b;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cjf.b;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cjf.b;
         }

         if ($$4.b()) {
            $$3.d(cjf.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return cjf.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cbu $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
