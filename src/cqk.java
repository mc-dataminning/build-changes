import java.util.Optional;
import javax.annotation.Nullable;

public class cqk extends crg<cyn, cyo> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cqj r = new crv(this, 3, 3);
   private final crj s = new crj();
   private final cqe t;
   private final cmv u;
   private boolean v;

   public cqk(int $$0, cmu $$1) {
      this($$0, $$1, cqe.a);
   }

   public cqk(int $$0, cmu $$1, cqe $$2) {
      super(cra.m, $$0);
      this.t = $$2;
      this.u = $$1.l;
      this.a(new crk($$1.l, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cro(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cro($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cro($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cps $$0, dcu $$1, cmv $$2, cqj $$3, crj $$4, @Nullable cyz<cyo> $$5) {
      if (!$$1.B) {
         cyn $$6 = $$3.aA_();
         aqu $$7 = (aqu)$$2;
         cuo $$8 = cuo.l;
         Optional<cyz<cyo>> $$9 = $$1.o().aJ().a(czd.a, $$6, $$1, $$5);
         if ($$9.isPresent()) {
            cyz<cyo> $$10 = $$9.get();
            cyo $$11 = $$10.b();
            if ($$4.a($$1, $$7, $$10)) {
               cuo $$12 = $$11.a($$6, $$1.H_());
               if ($$12.a($$1.J())) {
                  $$8 = $$12;
               }
            }
         }

         $$4.a(0, $$8);
         $$0.a(0, $$8);
         $$7.c.b(new acq($$0.j, $$0.k(), 0, $$8));
      }
   }

   @Override
   public void a(bqj $$0) {
      if (!this.v) {
         this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s, null));
      }
   }

   @Override
   public void aj_() {
      this.v = true;
   }

   @Override
   public void b(cyz<cyo> $$0) {
      this.v = false;
      this.t.a(($$1, $$2) -> a(this, $$1, this.u, this.r, this.s, $$0));
   }

   @Override
   public void a(cmz $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cyz<cyo> $$0) {
      return $$0.b().a(this.r.aA_(), this.u.dQ());
   }

   @Override
   public void a(cmv $$0) {
      super.a($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean b(cmv $$0) {
      return a(this.t, $$0, dfy.cA);
   }

   @Override
   public cuo b(cmv $$0, int $$1) {
      cuo $$2 = cuo.l;
      cro $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuo $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.g().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cuo.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cuo.l;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cuo.l;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cuo.l;
         }

         if ($$4.e()) {
            $$3.e(cuo.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuo.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cuo $$0, cro $$1) {
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
   public crh t() {
      return crh.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
