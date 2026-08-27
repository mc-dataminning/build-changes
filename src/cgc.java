import com.google.common.collect.Lists;
import java.util.List;

public class cgc extends ceg {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cer t;
   private final cew u = cew.a();
   private final cpq v;
   private List<cmf<cmw>> w = Lists.newArrayList();
   private cja x = cja.b;
   long y;
   final cfy m;
   final cfy n;
   Runnable z = () -> {
   };
   public final bgm o = new bha(1) {
      @Override
      public void e() {
         super.e();
         cgc.this.a(this);
         cgc.this.z.run();
      }
   };
   final cft A = new cft();

   public cgc(int $$0, cbo $$1) {
      this($$0, $$1, cer.a);
   }

   public cgc(int $$0, cbo $$1, final cer $$2) {
      super(cfl.x, $$0);
      this.t = $$2;
      this.v = $$1.m.dK();
      this.m = this.a(new cfy(this.o, 0, 20, 33));
      this.n = this.a(new cfy(this.A, 1, 143, 33) {
         @Override
         public boolean a(cja $$0) {
            return false;
         }

         @Override
         public void a(cbp $$0, cja $$1) {
            $$1.a($$0.dK(), $$0, $$1.L());
            cgc.this.A.a($$0, this.i());
            cja $$2 = cgc.this.m.a(1);
            if (!$$2.b()) {
               cgc.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.V();
               if (cgc.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, aoz.yy, apa.e, 1.0F, 1.0F);
                  cgc.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cja> i() {
            return List.of(cgc.this.m.e());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cfy($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cfy($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cmf<cmw>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.f() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cbp $$0) {
      return a(this.t, $$0, csr.oc);
   }

   @Override
   public boolean b(cbp $$0, int $$1) {
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
   public void a(bgm $$0) {
      cja $$1 = this.m.e();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bgm $$0, cja $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.e(cja.b);
      if (!$$1.b()) {
         this.w = this.v.q().b(cmi.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cmf<cmw> $$0 = this.w.get(this.u.b());
         cja $$1 = $$0.b().a(this.o, this.v.B_());
         if ($$1.a(this.v.G())) {
            this.A.a($$0);
            this.n.e($$1);
         } else {
            this.n.e(cja.b);
         }
      } else {
         this.n.e(cja.b);
      }

      this.d();
   }

   @Override
   public cfl<?> a() {
      return cfl.x;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cja $$0, cfy $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cja a(cbp $$0, int $$1) {
      cja $$2 = cja.b;
      cfy $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cja $$4 = $$3.e();
         civ $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dK(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cja.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cja.b;
            }
         } else if (this.v.q().a(cmi.f, new bha($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cja.b;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cja.b;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cja.b;
         }

         if ($$4.b()) {
            $$3.d(cja.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return cja.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cbp $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
