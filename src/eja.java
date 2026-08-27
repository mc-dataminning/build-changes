import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class eja extends ejj {
   private final Long2ObjectMap<ejg> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(cxo $$0, bpr $$1) {
      super.a($$0, $$1);
      this.l.clear();
      $$1.C();
   }

   @Override
   public void b() {
      this.b.D();
      this.l.clear();
      super.b();
   }

   @Override
   public ejb a() {
      int $$0;
      if (this.f() && this.b.bc()) {
         $$0 = this.b.ds();
         ib.a $$1 = new ib.a(this.b.dr(), (double)$$0, this.b.dx());

         for (dnb $$2 = this.a.a_($$1); $$2.a(dae.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dr(), (double)(++$$0), this.b.dx());
         }
      } else {
         $$0 = aww.a(this.b.dt() + 0.5);
      }

      ib $$4 = ib.a(this.b.dr(), (double)$$0, this.b.dx());
      if (!this.a($$4)) {
         for (ib $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(ib $$0) {
      ejg $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public eji a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(ejb[] $$0, ejb $$1) {
      int $$2 = 0;
      ejb $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      ejb $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      ejb $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      ejb $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      ejb $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      ejb $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      ejb $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      ejb $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      ejb $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      ejb $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      ejb $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      ejb $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      ejb $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      ejb $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      ejb $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      ejb $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      ejb $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      ejb $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      ejb $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      ejb $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      ejb $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      ejb $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      ejb $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      ejb $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      ejb $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      ejb $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable ejb $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable ejb $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected ejb a(int $$0, int $$1, int $$2) {
      ejb $$3 = null;
      ejg $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.c($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == ejg.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   @Override
   protected ejg b(int $$0, int $$1, int $$2) {
      return (ejg)this.l.computeIfAbsent(ib.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public ejg a(cwh $$0, int $$1, int $$2, int $$3) {
      ib.a $$4 = new ib.a();
      ejg $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == ejg.b && $$2 >= $$0.I_() + 1) {
         ejg $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == ejg.o || $$6 == ejg.i) {
            $$5 = ejg.o;
         } else if ($$6 == ejg.q) {
            $$5 = ejg.q;
         } else if ($$6 == ejg.x) {
            $$5 = ejg.x;
         } else if ($$6 == ejg.h) {
            if (!$$4.equals(this.b.dm())) {
               $$5 = ejg.h;
            }
         } else {
            $$5 = $$6 != ejg.c && $$6 != ejg.b && $$6 != ejg.j ? ejg.c : ejg.b;
         }
      }

      if ($$5 == ejg.c || $$5 == ejg.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<ib> a(bpr $$0) {
      float $$1 = 1.0F;
      epo $$2 = $$0.cH();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            ib.a($$2.a, (double)$$0.ds(), $$2.c),
            ib.a($$2.a, (double)$$0.ds(), $$2.f),
            ib.a($$2.d, (double)$$0.ds(), $$2.c),
            ib.a($$2.d, (double)$$0.ds(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         epo $$7 = $$2.c($$5, $$6, $$4);
         return ib.a($$0.ei(), 10, aww.a($$7.a), aww.a($$7.b), aww.a($$7.c), aww.a($$7.d), aww.a($$7.e), aww.a($$7.f));
      }
   }
}
