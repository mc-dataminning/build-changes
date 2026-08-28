import java.util.Optional;
import javax.annotation.Nullable;

public class cqa extends cqw<cxz, cya> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cpz r = new crl(this, 3, 3);
   private final cqz s = new cqz();
   private final cpu t;
   private final cml u;
   private boolean v;

   public cqa(int $$0, cmk $$1) {
      this($$0, $$1, cpu.a);
   }

   public cqa(int $$0, cmk $$1, cpu $$2) {
      super(cqq.m, $$0);
      this.t = $$2;
      this.u = $$1.l;
      this.a(new cra($$1.l, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cre(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cre($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cre($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cpi $$0, dcg $$1, cml $$2, cpz $$3, cqz $$4, @Nullable cyl<cya> $$5) {
      if (!$$1.B) {
         cxz $$6 = $$3.aA_();
         aqn $$7 = (aqn)$$2;
         cud $$8 = cud.l;
         Optional<cyl<cya>> $$9 = $$1.o().aK().a(cyp.a, $$6, $$1, $$5);
         if ($$9.isPresent()) {
            cyl<cya> $$10 = $$9.get();
            cya $$11 = $$10.b();
            if ($$4.a($$1, $$7, $$10)) {
               cud $$12 = $$11.a($$6, $$1.H_());
               if ($$12.a($$1.J())) {
                  $$8 = $$12;
               }
            }
         }

         $$4.a(0, $$8);
         $$0.a(0, $$8);
         $$7.c.b(new ack($$0.j, $$0.k(), 0, $$8));
      }
   }

   @Override
   public void a(bqa $$0) {
      if (!this.v) {
         this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s, null));
      }
   }

   @Override
   public void aj_() {
      this.v = true;
   }

   @Override
   public void b(cyl<cya> $$0) {
      this.v = false;
      this.t.a(($$1, $$2) -> a(this, $$1, this.u, this.r, this.s, $$0));
   }

   @Override
   public void a(cmp $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cyl<cya> $$0) {
      return $$0.b().a(this.r.aA_(), this.u.dR());
   }

   @Override
   public void a(cml $$0) {
      super.a($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean b(cml $$0) {
      return a(this.t, $$0, dfk.cA);
   }

   @Override
   public cud b(cml $$0, int $$1) {
      cud $$2 = cud.l;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cud $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.g().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cud.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cud.l;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cud.l;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cud.l;
         }

         if ($$4.e()) {
            $$3.e(cud.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cud.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cud $$0, cre $$1) {
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
   public cqx t() {
      return cqx.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
