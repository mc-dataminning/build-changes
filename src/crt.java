import com.google.common.collect.Lists;
import java.util.List;

public class crt extends cps {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cqd t;
   private final cqk u = cqk.a();
   private final dbw v;
   private List<cyv<czn>> w = Lists.newArrayList();
   private cun x = cun.l;
   long y;
   final crn m;
   final crn n;
   Runnable z = () -> {
   };
   public final bql o = new brb(1) {
      @Override
      public void e() {
         super.e();
         crt.this.a(this);
         crt.this.z.run();
      }
   };
   final cri A = new cri();

   public crt(int $$0, cmu $$1) {
      this($$0, $$1, cqd.a);
   }

   public crt(int $$0, cmu $$1, final cqd $$2) {
      super(cqz.y, $$0);
      this.t = $$2;
      this.v = $$1.l.dP();
      this.m = this.a(new crn(this.o, 0, 20, 33));
      this.n = this.a(new crn(this.A, 1, 143, 33) {
         @Override
         public boolean a(cun $$0) {
            return false;
         }

         @Override
         public void a(cmv $$0, cun $$1) {
            $$1.a($$0.dP(), $$0, $$1.I());
            crt.this.A.a($$0, this.j());
            cun $$2 = crt.this.m.a(1);
            if (!$$2.e()) {
               crt.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Z();
               if (crt.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, avz.As, awa.e, 1.0F, 1.0F);
                  crt.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cun> j() {
            return List.of(crt.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crn($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crn($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cyv<czn>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cmv $$0) {
      return a(this.t, $$0, dez.oc);
   }

   @Override
   public boolean b(cmv $$0, int $$1) {
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
   public void a(bql $$0) {
      cun $$1 = this.m.g();
      if (!$$1.a(this.x.g())) {
         this.x = $$1.s();
         this.a($$0, $$1);
      }
   }

   private void a(bql $$0, cun $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cun.l);
      if (!$$1.e()) {
         this.w = this.v.r().b(cyy.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cyv<czn> $$0 = this.w.get(this.u.b());
         cun $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cun.l);
         }
      } else {
         this.n.f(cun.l);
      }

      this.d();
   }

   @Override
   public cqz<?> a() {
      return cqz.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cun $$0, crn $$1) {
      return $$1.c != this.A && super.a($$0, $$1);
   }

   @Override
   public cun a(cmv $$0, int $$1) {
      cun $$2 = cun.l;
      crn $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cun $$4 = $$3.g();
         cui $$5 = $$4.g();
         $$2 = $$4.s();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cun.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cun.l;
            }
         } else if (this.v.r().a(cyy.f, new brb($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cun.l;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cun.l;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cun.l;
         }

         if ($$4.e()) {
            $$3.e(cun.l);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return cun.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cmv $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
