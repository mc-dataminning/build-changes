import com.google.common.collect.Lists;
import java.util.List;

public class crv extends cpu {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cqf t;
   private final cqm u = cqm.a();
   private final dby v;
   private List<cyx<czp>> w = Lists.newArrayList();
   private cup x = cup.l;
   long y;
   final crp m;
   final crp n;
   Runnable z = () -> {
   };
   public final bqn o = new brd(1) {
      @Override
      public void e() {
         super.e();
         crv.this.a(this);
         crv.this.z.run();
      }
   };
   final crk A = new crk();

   public crv(int $$0, cmw $$1) {
      this($$0, $$1, cqf.a);
   }

   public crv(int $$0, cmw $$1, final cqf $$2) {
      super(crb.y, $$0);
      this.t = $$2;
      this.v = $$1.l.dP();
      this.m = this.a(new crp(this.o, 0, 20, 33));
      this.n = this.a(new crp(this.A, 1, 143, 33) {
         @Override
         public boolean a(cup $$0) {
            return false;
         }

         @Override
         public void a(cmx $$0, cup $$1) {
            $$1.a($$0.dP(), $$0, $$1.I());
            crv.this.A.a($$0, this.j());
            cup $$2 = crv.this.m.a(1);
            if (!$$2.e()) {
               crv.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Z();
               if (crv.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, awa.As, awb.e, 1.0F, 1.0F);
                  crv.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cup> j() {
            return List.of(crv.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crp($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cyx<czp>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cmx $$0) {
      return a(this.t, $$0, dfb.oc);
   }

   @Override
   public boolean b(cmx $$0, int $$1) {
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
   public void a(bqn $$0) {
      cup $$1 = this.m.g();
      if (!$$1.a(this.x.g())) {
         this.x = $$1.s();
         this.a($$0, $$1);
      }
   }

   private void a(bqn $$0, cup $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cup.l);
      if (!$$1.e()) {
         this.w = this.v.r().b(cza.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cyx<czp> $$0 = this.w.get(this.u.b());
         cup $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cup.l);
         }
      } else {
         this.n.f(cup.l);
      }

      this.d();
   }

   @Override
   public crb<?> a() {
      return crb.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cup $$0, crp $$1) {
      return $$1.c != this.A && super.a($$0, $$1);
   }

   @Override
   public cup a(cmx $$0, int $$1) {
      cup $$2 = cup.l;
      crp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cup $$4 = $$3.g();
         cuk $$5 = $$4.g();
         $$2 = $$4.s();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cup.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cup.l;
            }
         } else if (this.v.r().a(cza.f, new brd($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cup.l;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cup.l;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cup.l;
         }

         if ($$4.e()) {
            $$3.e(cup.l);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return cup.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cmx $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
