import com.google.common.collect.Lists;
import java.util.List;

public class cuc extends crz {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final csm v;
   private final cst w = cst.a();
   private final dfm x;
   private List<dbc<dbw>> y = Lists.newArrayList();
   private cwm z = cwm.k;
   long A;
   final ctw o;
   final ctw p;
   Runnable B = () -> {
   };
   public final bsd q = new bsr(1) {
      @Override
      public void e() {
         super.e();
         cuc.this.a(this);
         cuc.this.B.run();
      }
   };
   final ctr C = new ctr();

   public cuc(int $$0, cot $$1) {
      this($$0, $$1, csm.a);
   }

   public cuc(int $$0, cot $$1, final csm $$2) {
      super(cti.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dV();
      this.o = this.a(new ctw(this.q, 0, 20, 33));
      this.p = this.a(new ctw(this.C, 1, 143, 33) {
         @Override
         public boolean a(cwm $$0) {
            return false;
         }

         @Override
         public void a(cou $$0, cwm $$1) {
            $$1.a($$0.dV(), $$0, $$1.L());
            cuc.this.C.a($$0, this.j());
            cwm $$2 = cuc.this.o.a(1);
            if (!$$2.f()) {
               cuc.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ab();
               if (cuc.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awn.Az, awo.e, 1.0F, 1.0F);
                  cuc.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cwm> j() {
            return List.of(cuc.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public List<dbc<dbw>> m() {
      return this.y;
   }

   public int n() {
      return this.y.size();
   }

   public boolean o() {
      return this.o.h() && !this.y.isEmpty();
   }

   @Override
   public boolean b(cou $$0) {
      return a(this.v, $$0, dis.oc);
   }

   @Override
   public boolean a(cou $$0, int $$1) {
      if (this.e($$1)) {
         this.w.a($$1);
         this.p();
      }

      return true;
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.y.size();
   }

   @Override
   public void a(bsd $$0) {
      cwm $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.a($$0, $$1);
      }
   }

   private static dbp c(bsd $$0) {
      return new dbp($$0.a(0));
   }

   private void a(bsd $$0, cwm $$1) {
      this.y.clear();
      this.w.a(-1);
      this.p.f(cwm.k);
      if (!$$1.f()) {
         this.y = this.x.s().b(dbg.f, c($$0), this.x);
      }
   }

   void p() {
      if (!this.y.isEmpty() && this.e(this.w.b())) {
         dbc<dbw> $$0 = this.y.get(this.w.b());
         cwm $$1 = $$0.b().a(c(this.q), this.x.J_());
         if ($$1.a(this.x.J())) {
            this.C.a($$0);
            this.p.f($$1);
         } else {
            this.p.f(cwm.k);
         }
      } else {
         this.p.f(cwm.k);
      }

      this.d();
   }

   @Override
   public cti<?> a() {
      return cti.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cwm $$0, ctw $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         cwi $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cwm.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cwm.k;
            }
         } else if (this.x.s().a(dbg.f, new dbp($$4), this.x).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cwm.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cwm.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cwm.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 1) {
            $$0.a($$4, false);
         }

         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
