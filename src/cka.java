import com.google.common.collect.Lists;
import java.util.List;

public class cka extends cib {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cim t;
   private final cit u = cit.a();
   private final ctp v;
   private List<cqe<cqw>> w = Lists.newArrayList();
   private cmy x = cmy.f;
   long y;
   final cjw m;
   final cjw n;
   Runnable z = () -> {
   };
   public final bju o = new bkj(1) {
      @Override
      public void e() {
         super.e();
         cka.this.a(this);
         cka.this.z.run();
      }
   };
   final cjr A = new cjr();

   public cka(int $$0, cfh $$1) {
      this($$0, $$1, cim.a);
   }

   public cka(int $$0, cfh $$1, final cim $$2) {
      super(cji.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dM();
      this.m = this.a(new cjw(this.o, 0, 20, 33));
      this.n = this.a(new cjw(this.A, 1, 143, 33) {
         @Override
         public boolean a(cmy $$0) {
            return false;
         }

         @Override
         public void a(cfi $$0, cmy $$1) {
            $$1.a($$0.dM(), $$0, $$1.L());
            cka.this.A.a($$0, this.j());
            cmy $$2 = cka.this.m.a(1);
            if (!$$2.b()) {
               cka.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.X();
               if (cka.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, ars.zy, art.e, 1.0F, 1.0F);
                  cka.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cmy> j() {
            return List.of(cka.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjw($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjw($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cqe<cqw>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cfi $$0) {
      return a(this.t, $$0, cws.oc);
   }

   @Override
   public boolean b(cfi $$0, int $$1) {
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
   public void a(bju $$0) {
      cmy $$1 = this.m.g();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bju $$0, cmy $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cmy.f);
      if (!$$1.b()) {
         this.w = this.v.r().b(cqh.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cqe<cqw> $$0 = this.w.get(this.u.b());
         cmy $$1 = $$0.b().a(this.o, this.v.I_());
         if ($$1.a(this.v.I())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cmy.f);
         }
      } else {
         this.n.f(cmy.f);
      }

      this.d();
   }

   @Override
   public cji<?> a() {
      return cji.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cmy $$0, cjw $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cmy a(cfi $$0, int $$1) {
      cmy $$2 = cmy.f;
      cjw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmy $$4 = $$3.g();
         cmt $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cmy.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cmy.f;
            }
         } else if (this.v.r().a(cqh.f, new bkj($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cmy.f;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cmy.f;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cmy.f;
         }

         if ($$4.b()) {
            $$3.e(cmy.f);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return cmy.f;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cfi $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
