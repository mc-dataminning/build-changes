import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class epp extends eqa {
   private final Long2ObjectMap<epv> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.0F;
   private static final float n = 1.1F;
   private static final int o = 10;

   @Override
   public void a(dcn $$0, bsq $$1) {
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
   public epq a() {
      int $$0;
      if (this.f() && this.b.bi()) {
         $$0 = this.b.dA();
         ir.a $$1 = new ir.a(this.b.dz(), (double)$$0, this.b.dF());

         for (dtc $$2 = this.a.a($$1); $$2.a(dfe.al); $$2 = this.a.a($$1)) {
            $$1.b(this.b.dz(), (double)(++$$0), this.b.dF());
         }
      } else {
         $$0 = aym.a(this.b.dB() + 0.5);
      }

      ir $$4 = ir.a(this.b.dz(), (double)$$0, this.b.dF());
      if (!this.a($$4)) {
         for (ir $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(ir $$0) {
      epv $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public epz a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(epq[] $$0, epq $$1) {
      int $$2 = 0;
      epq $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      epq $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      epq $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      epq $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      epq $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      epq $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      epq $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      epq $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      epq $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      epq $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      epq $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      epq $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      epq $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      epq $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      epq $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      epq $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      epq $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      epq $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      epq $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      epq $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      epq $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      epq $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      epq $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      epq $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      epq $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      epq $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable epq $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable epq $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected epq a(int $$0, int $$1, int $$2) {
      epq $$3 = null;
      epv $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.c($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == epv.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   @Override
   protected epv b(int $$0, int $$1, int $$2) {
      return (epv)this.l.computeIfAbsent(ir.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public epv a(epx $$0, int $$1, int $$2, int $$3) {
      epv $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == epv.b && $$2 >= $$0.a().J_() + 1) {
         ir $$5 = new ir($$1, $$2 - 1, $$3);
         epv $$6 = $$0.a($$5.u(), $$5.v(), $$5.w());
         if ($$6 == epv.o || $$6 == epv.i) {
            $$4 = epv.o;
         } else if ($$6 == epv.q) {
            $$4 = epv.q;
         } else if ($$6 == epv.x) {
            $$4 = epv.x;
         } else if ($$6 == epv.h) {
            if (!$$5.equals($$0.b())) {
               $$4 = epv.h;
            }
         } else {
            $$4 = $$6 != epv.c && $$6 != epv.b && $$6 != epv.j ? epv.c : epv.b;
         }
      }

      if ($$4 == epv.c || $$4 == epv.b) {
         $$4 = a($$0, $$1, $$2, $$3, $$4);
      }

      return $$4;
   }

   private Iterable<ir> a(bsq $$0) {
      ewp $$1 = $$0.cP();
      boolean $$2 = $$1.a() < 1.0;
      if (!$$2) {
         return List.of(
            ir.a($$1.a, (double)$$0.dA(), $$1.c),
            ir.a($$1.a, (double)$$0.dA(), $$1.f),
            ir.a($$1.d, (double)$$0.dA(), $$1.c),
            ir.a($$1.d, (double)$$0.dA(), $$1.f)
         );
      } else {
         double $$3 = Math.max(0.0, 1.1F - $$1.d());
         double $$4 = Math.max(0.0, 1.1F - $$1.b());
         double $$5 = Math.max(0.0, 1.1F - $$1.c());
         ewp $$6 = $$1.c($$4, $$5, $$3);
         return ir.a($$0.et(), 10, aym.a($$6.a), aym.a($$6.b), aym.a($$6.c), aym.a($$6.d), aym.a($$6.e), aym.a($$6.f));
      }
   }
}
