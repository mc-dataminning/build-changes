import java.util.Optional;
import javax.annotation.Nullable;

public class cqm extends cri<cyp, cyq> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cql r = new crx(this, 3, 3);
   private final crl s = new crl();
   private final cqg t;
   private final cmx u;
   private boolean v;

   public cqm(int $$0, cmw $$1) {
      this($$0, $$1, cqg.a);
   }

   public cqm(int $$0, cmw $$1, cqg $$2) {
      super(crc.m, $$0);
      this.t = $$2;
      this.u = $$1.l;
      this.a(new crm($$1.l, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new crq(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crq($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crq($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cpu $$0, dcw $$1, cmx $$2, cql $$3, crl $$4, @Nullable czb<cyq> $$5) {
      if (!$$1.B) {
         cyp $$6 = $$3.aE_();
         aqv $$7 = (aqv)$$2;
         cuq $$8 = cuq.l;
         Optional<czb<cyq>> $$9 = $$1.o().aJ().a(czf.a, $$6, $$1, $$5);
         if ($$9.isPresent()) {
            czb<cyq> $$10 = $$9.get();
            cyq $$11 = $$10.b();
            if ($$4.a($$1, $$7, $$10)) {
               cuq $$12 = $$11.a($$6, $$1.H_());
               if ($$12.a($$1.J())) {
                  $$8 = $$12;
               }
            }
         }

         $$4.a(0, $$8);
         $$0.a(0, $$8);
         $$7.c.b(new acr($$0.j, $$0.k(), 0, $$8));
      }
   }

   @Override
   public void a(bqk $$0) {
      if (!this.v) {
         this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s, null));
      }
   }

   @Override
   public void an_() {
      this.v = true;
   }

   @Override
   public void b(czb<cyq> $$0) {
      this.v = false;
      this.t.a(($$1, $$2) -> a(this, $$1, this.u, this.r, this.s, $$0));
   }

   @Override
   public void a(cnb $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(czb<cyq> $$0) {
      return $$0.b().a(this.r.aE_(), this.u.dP());
   }

   @Override
   public void a(cmx $$0) {
      super.a($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean b(cmx $$0) {
      return a(this.t, $$0, dga.cA);
   }

   @Override
   public cuq b(cmx $$0, int $$1) {
      cuq $$2 = cuq.l;
      crq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuq $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.g().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cuq.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cuq.l;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cuq.l;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cuq.l;
         }

         if ($$4.e()) {
            $$3.e(cuq.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuq.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cuq $$0, crq $$1) {
      return $$1.c != this.s && super.a($$0, $$1);
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public int n() {
      return this.r.f();
   }

   @Override
   public int o() {
      return this.r.g();
   }

   @Override
   public int p() {
      return 10;
   }

   @Override
   public crj t() {
      return crj.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
