import com.google.common.collect.Lists;
import java.util.List;

public class cgn extends cer {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cfc t;
   private final cfh u = cfh.a();
   private final cqb v;
   private List<cmq<cnh>> w = Lists.newArrayList();
   private cjl x = cjl.b;
   long y;
   final cgj m;
   final cgj n;
   Runnable z = () -> {
   };
   public final bgx o = new bhl(1) {
      @Override
      public void e() {
         super.e();
         cgn.this.a(this);
         cgn.this.z.run();
      }
   };
   final cge A = new cge();

   public cgn(int $$0, cbz $$1) {
      this($$0, $$1, cfc.a);
   }

   public cgn(int $$0, cbz $$1, final cfc $$2) {
      super(cfw.x, $$0);
      this.t = $$2;
      this.v = $$1.m.dL();
      this.m = this.a(new cgj(this.o, 0, 20, 33));
      this.n = this.a(new cgj(this.A, 1, 143, 33) {
         @Override
         public boolean a(cjl $$0) {
            return false;
         }

         @Override
         public void a(cca $$0, cjl $$1) {
            $$1.a($$0.dL(), $$0, $$1.L());
            cgn.this.A.a($$0, this.i());
            cjl $$2 = cgn.this.m.a(1);
            if (!$$2.b()) {
               cgn.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.V();
               if (cgn.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, apg.yy, aph.e, 1.0F, 1.0F);
                  cgn.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cjl> i() {
            return List.of(cgn.this.m.e());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cgj($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cgj($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cmq<cnh>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.f() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cca $$0) {
      return a(this.t, $$0, cte.oc);
   }

   @Override
   public boolean b(cca $$0, int $$1) {
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
   public void a(bgx $$0) {
      cjl $$1 = this.m.e();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bgx $$0, cjl $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.e(cjl.b);
      if (!$$1.b()) {
         this.w = this.v.q().b(cmt.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cmq<cnh> $$0 = this.w.get(this.u.b());
         cjl $$1 = $$0.b().a(this.o, this.v.G_());
         if ($$1.a(this.v.G())) {
            this.A.a($$0);
            this.n.e($$1);
         } else {
            this.n.e(cjl.b);
         }
      } else {
         this.n.e(cjl.b);
      }

      this.d();
   }

   @Override
   public cfw<?> a() {
      return cfw.x;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cjl $$0, cgj $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cjl a(cca $$0, int $$1) {
      cjl $$2 = cjl.b;
      cgj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjl $$4 = $$3.e();
         cjg $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dL(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cjl.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cjl.b;
            }
         } else if (this.v.q().a(cmt.f, new bhl($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cjl.b;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cjl.b;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cjl.b;
         }

         if ($$4.b()) {
            $$3.d(cjl.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return cjl.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cca $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
