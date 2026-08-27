import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class eml extends emw {
   private final Long2ObjectMap<emr> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.0F;
   private static final float n = 1.1F;
   private static final int o = 10;

   @Override
   public void a(daq $$0, bsc $$1) {
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
   public emm a() {
      int $$0;
      if (this.f() && this.b.bc()) {
         $$0 = this.b.dt();
         in.a $$1 = new in.a(this.b.ds(), (double)$$0, this.b.dy());

         for (dqh $$2 = this.a.a($$1); $$2.a(ddg.G); $$2 = this.a.a($$1)) {
            $$1.b(this.b.ds(), (double)(++$$0), this.b.dy());
         }
      } else {
         $$0 = axz.a(this.b.du() + 0.5);
      }

      in $$4 = in.a(this.b.ds(), (double)$$0, this.b.dy());
      if (!this.a($$4)) {
         for (in $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(in $$0) {
      emr $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public emv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(emm[] $$0, emm $$1) {
      int $$2 = 0;
      emm $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      emm $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      emm $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      emm $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      emm $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      emm $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      emm $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      emm $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      emm $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      emm $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      emm $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      emm $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      emm $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      emm $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      emm $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      emm $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      emm $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      emm $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      emm $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      emm $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      emm $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      emm $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      emm $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      emm $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      emm $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      emm $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable emm $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable emm $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected emm a(int $$0, int $$1, int $$2) {
      emm $$3 = null;
      emr $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.c($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == emr.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   @Override
   protected emr b(int $$0, int $$1, int $$2) {
      return (emr)this.l.computeIfAbsent(in.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public emr a(emt $$0, int $$1, int $$2, int $$3) {
      emr $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == emr.b && $$2 >= $$0.a().I_() + 1) {
         in $$5 = new in($$1, $$2 - 1, $$3);
         emr $$6 = $$0.a($$5.u(), $$5.v(), $$5.w());
         if ($$6 == emr.o || $$6 == emr.i) {
            $$4 = emr.o;
         } else if ($$6 == emr.q) {
            $$4 = emr.q;
         } else if ($$6 == emr.x) {
            $$4 = emr.x;
         } else if ($$6 == emr.h) {
            if (!$$5.equals($$0.b())) {
               $$4 = emr.h;
            }
         } else {
            $$4 = $$6 != emr.c && $$6 != emr.b && $$6 != emr.j ? emr.c : emr.b;
         }
      }

      if ($$4 == emr.c || $$4 == emr.b) {
         $$4 = a($$0, $$1, $$2, $$3, $$4);
      }

      return $$4;
   }

   private Iterable<in> a(bsc $$0) {
      etk $$1 = $$0.cI();
      boolean $$2 = $$1.a() < 1.0;
      if (!$$2) {
         return List.of(
            in.a($$1.a, (double)$$0.dt(), $$1.c),
            in.a($$1.a, (double)$$0.dt(), $$1.f),
            in.a($$1.d, (double)$$0.dt(), $$1.c),
            in.a($$1.d, (double)$$0.dt(), $$1.f)
         );
      } else {
         double $$3 = Math.max(0.0, 1.1F - $$1.d());
         double $$4 = Math.max(0.0, 1.1F - $$1.b());
         double $$5 = Math.max(0.0, 1.1F - $$1.c());
         etk $$6 = $$1.c($$4, $$5, $$3);
         return in.a($$0.ej(), 10, axz.a($$6.a), axz.a($$6.b), axz.a($$6.c), axz.a($$6.d), axz.a($$6.e), axz.a($$6.f));
      }
   }
}
