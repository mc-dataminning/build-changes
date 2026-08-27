import com.google.common.collect.Lists;
import java.util.List;

public class cga extends cee {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cep t;
   private final ceu u = ceu.a();
   private final cpm v;
   private List<cms> w = Lists.newArrayList();
   private ciy x = ciy.b;
   long y;
   final cfw m;
   final cfw n;
   Runnable z = () -> {
   };
   public final bgj o = new bgx(1) {
      @Override
      public void e() {
         super.e();
         cga.this.a(this);
         cga.this.z.run();
      }
   };
   final cfr A = new cfr();

   public cga(int $$0, cbm $$1) {
      this($$0, $$1, cep.a);
   }

   public cga(int $$0, cbm $$1, final cep $$2) {
      super(cfj.x, $$0);
      this.t = $$2;
      this.v = $$1.m.dK();
      this.m = this.a(new cfw(this.o, 0, 20, 33));
      this.n = this.a(new cfw(this.A, 1, 143, 33) {
         @Override
         public boolean a(ciy $$0) {
            return false;
         }

         @Override
         public void a(cbn $$0, ciy $$1) {
            $$1.a($$0.dK(), $$0, $$1.L());
            cga.this.A.a($$0, this.i());
            ciy $$2 = cga.this.m.a(1);
            if (!$$2.b()) {
               cga.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.V();
               if (cga.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, aow.yt, aox.e, 1.0F, 1.0F);
                  cga.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<ciy> i() {
            return List.of(cga.this.m.e());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cfw($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cfw($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cms> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.f() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cbn $$0) {
      return a(this.t, $$0, csn.oc);
   }

   @Override
   public boolean b(cbn $$0, int $$1) {
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
   public void a(bgj $$0) {
      ciy $$1 = this.m.e();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bgj $$0, ciy $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.e(ciy.b);
      if (!$$1.b()) {
         this.w = this.v.q().b(cme.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cms $$0 = this.w.get(this.u.b());
         ciy $$1 = $$0.a(this.o, this.v.B_());
         if ($$1.a(this.v.G())) {
            this.A.a($$0);
            this.n.e($$1);
         } else {
            this.n.e(ciy.b);
         }
      } else {
         this.n.e(ciy.b);
      }

      this.d();
   }

   @Override
   public cfj<?> a() {
      return cfj.x;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(ciy $$0, cfw $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public ciy a(cbn $$0, int $$1) {
      ciy $$2 = ciy.b;
      cfw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciy $$4 = $$3.e();
         cit $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dK(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return ciy.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return ciy.b;
            }
         } else if (this.v.q().a(cme.f, new bgx($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return ciy.b;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return ciy.b;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return ciy.b;
         }

         if ($$4.b()) {
            $$3.d(ciy.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return ciy.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cbn $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
