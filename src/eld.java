import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class eld extends elo {
   private final Long2ObjectMap<elj> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(czk $$0, bqq $$1) {
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
   public ele a() {
      int $$0;
      if (this.f() && this.b.bc()) {
         $$0 = this.b.ds();
         ib.a $$1 = new ib.a(this.b.dr(), (double)$$0, this.b.dx());

         for (doz $$2 = this.a.a($$1); $$2.a(dca.G); $$2 = this.a.a($$1)) {
            $$1.b(this.b.dr(), (double)(++$$0), this.b.dx());
         }
      } else {
         $$0 = axk.a(this.b.dt() + 0.5);
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
      elj $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public eln a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(ele[] $$0, ele $$1) {
      int $$2 = 0;
      ele $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      ele $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      ele $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      ele $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      ele $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      ele $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      ele $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      ele $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      ele $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      ele $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      ele $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      ele $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      ele $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      ele $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      ele $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      ele $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      ele $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      ele $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      ele $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      ele $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      ele $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      ele $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      ele $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      ele $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      ele $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      ele $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable ele $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable ele $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected ele a(int $$0, int $$1, int $$2) {
      ele $$3 = null;
      elj $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.c($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == elj.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   @Override
   protected elj b(int $$0, int $$1, int $$2) {
      return (elj)this.l.computeIfAbsent(ib.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public elj a(ell $$0, int $$1, int $$2, int $$3) {
      elj $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == elj.b && $$2 >= $$0.a().I_() + 1) {
         ib $$5 = new ib($$1, $$2 - 1, $$3);
         elj $$6 = $$0.a($$5.u(), $$5.v(), $$5.w());
         if ($$6 == elj.o || $$6 == elj.i) {
            $$4 = elj.o;
         } else if ($$6 == elj.q) {
            $$4 = elj.q;
         } else if ($$6 == elj.x) {
            $$4 = elj.x;
         } else if ($$6 == elj.h) {
            if (!$$5.equals($$0.b())) {
               $$4 = elj.h;
            }
         } else {
            $$4 = $$6 != elj.c && $$6 != elj.b && $$6 != elj.j ? elj.c : elj.b;
         }
      }

      if ($$4 == elj.c || $$4 == elj.b) {
         $$4 = a($$0, $$1, $$2, $$3, $$4);
      }

      return $$4;
   }

   private Iterable<ib> a(bqq $$0) {
      float $$1 = 1.0F;
      erv $$2 = $$0.cH();
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
         erv $$7 = $$2.c($$5, $$6, $$4);
         return ib.a($$0.ei(), 10, axk.a($$7.a), axk.a($$7.b), axk.a($$7.c), axk.a($$7.d), axk.a($$7.e), axk.a($$7.f));
      }
   }
}
