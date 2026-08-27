import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class efc extends efk {
   private final Long2ObjectMap<efb> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(cub $$0, bmm $$1) {
      super.a($$0, $$1);
      this.l.clear();
      $$1.E();
   }

   @Override
   public void b() {
      this.b.G();
      this.l.clear();
      super.b();
   }

   @Override
   public efd a() {
      int $$0;
      if (this.f() && this.b.aZ()) {
         $$0 = this.b.ds();
         hx.a $$1 = new hx.a(this.b.dr(), (double)$$0, this.b.dx());

         for (djg $$2 = this.a.a_($$1); $$2.a(cwr.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dr(), (double)(++$$0), this.b.dx());
         }
      } else {
         $$0 = aun.a(this.b.dt() + 0.5);
      }

      hx $$4 = hx.a(this.b.dr(), (double)$$0, this.b.dx());
      if (!this.a($$4)) {
         for (hx $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(hx $$0) {
      efb $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public efj a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aun.a($$0), aun.a($$1), aun.a($$2)));
   }

   @Override
   public int a(efd[] $$0, efd $$1) {
      int $$2 = 0;
      efd $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      efd $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      efd $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      efd $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      efd $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      efd $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      efd $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      efd $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      efd $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      efd $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      efd $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      efd $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      efd $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      efd $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      efd $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      efd $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      efd $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      efd $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      efd $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      efd $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      efd $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      efd $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      efd $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      efd $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      efd $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      efd $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable efd $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable efd $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected efd a(int $$0, int $$1, int $$2) {
      efd $$3 = null;
      efb $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == efb.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private efb c(int $$0, int $$1, int $$2) {
      return (efb)this.l.computeIfAbsent(hx.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public efb a(csu $$0, int $$1, int $$2, int $$3, bmm $$4) {
      EnumSet<efb> $$5 = EnumSet.noneOf(efb.class);
      efb $$6 = efb.a;
      hx $$7 = $$4.dm();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(efb.h)) {
         return efb.h;
      } else {
         efb $$8 = efb.a;

         for (efb $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == efb.b && $$4.a($$8) == 0.0F ? efb.b : $$8;
      }
   }

   @Override
   public efb a(csu $$0, int $$1, int $$2, int $$3) {
      hx.a $$4 = new hx.a();
      efb $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == efb.b && $$2 >= $$0.J_() + 1) {
         efb $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == efb.o || $$6 == efb.i) {
            $$5 = efb.o;
         } else if ($$6 == efb.q) {
            $$5 = efb.q;
         } else if ($$6 == efb.x) {
            $$5 = efb.x;
         } else if ($$6 == efb.h) {
            if (!$$4.equals(this.b.dm())) {
               $$5 = efb.h;
            }
         } else {
            $$5 = $$6 != efb.c && $$6 != efb.b && $$6 != efb.j ? efb.c : efb.b;
         }
      }

      if ($$5 == efb.c || $$5 == efb.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<hx> a(bmm $$0) {
      float $$1 = 1.0F;
      eln $$2 = $$0.cH();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            hx.a($$2.a, (double)$$0.ds(), $$2.c),
            hx.a($$2.a, (double)$$0.ds(), $$2.f),
            hx.a($$2.d, (double)$$0.ds(), $$2.c),
            hx.a($$2.d, (double)$$0.ds(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         eln $$7 = $$2.c($$5, $$6, $$4);
         return hx.a($$0.eg(), 10, aun.a($$7.a), aun.a($$7.b), aun.a($$7.c), aun.a($$7.d), aun.a($$7.e), aun.a($$7.f));
      }
   }
}
