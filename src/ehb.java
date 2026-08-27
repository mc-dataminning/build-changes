import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ehb extends ehj {
   private final Long2ObjectMap<eha> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(cwa $$0, boi $$1) {
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
   public ehc a() {
      int $$0;
      if (this.f() && this.b.aZ()) {
         $$0 = this.b.ds();
         hz.a $$1 = new hz.a(this.b.dr(), (double)$$0, this.b.dx());

         for (dlf $$2 = this.a.a_($$1); $$2.a(cyq.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dr(), (double)(++$$0), this.b.dx());
         }
      } else {
         $$0 = awh.a(this.b.dt() + 0.5);
      }

      hz $$4 = hz.a(this.b.dr(), (double)$$0, this.b.dx());
      if (!this.a($$4)) {
         for (hz $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(hz $$0) {
      eha $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public ehi a(double $$0, double $$1, double $$2) {
      return this.a(this.b(awh.a($$0), awh.a($$1), awh.a($$2)));
   }

   @Override
   public int a(ehc[] $$0, ehc $$1) {
      int $$2 = 0;
      ehc $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      ehc $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      ehc $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      ehc $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      ehc $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      ehc $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      ehc $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      ehc $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      ehc $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      ehc $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      ehc $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      ehc $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      ehc $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      ehc $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      ehc $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      ehc $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      ehc $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      ehc $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      ehc $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      ehc $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      ehc $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      ehc $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      ehc $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      ehc $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      ehc $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      ehc $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable ehc $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable ehc $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected ehc a(int $$0, int $$1, int $$2) {
      ehc $$3 = null;
      eha $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == eha.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private eha c(int $$0, int $$1, int $$2) {
      return (eha)this.l.computeIfAbsent(hz.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public eha a(cut $$0, int $$1, int $$2, int $$3, boi $$4) {
      EnumSet<eha> $$5 = EnumSet.noneOf(eha.class);
      eha $$6 = eha.a;
      hz $$7 = $$4.dm();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(eha.h)) {
         return eha.h;
      } else {
         eha $$8 = eha.a;

         for (eha $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == eha.b && $$4.a($$8) == 0.0F ? eha.b : $$8;
      }
   }

   @Override
   public eha a(cut $$0, int $$1, int $$2, int $$3) {
      hz.a $$4 = new hz.a();
      eha $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eha.b && $$2 >= $$0.J_() + 1) {
         eha $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == eha.o || $$6 == eha.i) {
            $$5 = eha.o;
         } else if ($$6 == eha.q) {
            $$5 = eha.q;
         } else if ($$6 == eha.x) {
            $$5 = eha.x;
         } else if ($$6 == eha.h) {
            if (!$$4.equals(this.b.dm())) {
               $$5 = eha.h;
            }
         } else {
            $$5 = $$6 != eha.c && $$6 != eha.b && $$6 != eha.j ? eha.c : eha.b;
         }
      }

      if ($$5 == eha.c || $$5 == eha.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<hz> a(boi $$0) {
      float $$1 = 1.0F;
      enn $$2 = $$0.cH();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            hz.a($$2.a, (double)$$0.ds(), $$2.c),
            hz.a($$2.a, (double)$$0.ds(), $$2.f),
            hz.a($$2.d, (double)$$0.ds(), $$2.c),
            hz.a($$2.d, (double)$$0.ds(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         enn $$7 = $$2.c($$5, $$6, $$4);
         return hz.a($$0.eh(), 10, awh.a($$7.a), awh.a($$7.b), awh.a($$7.c), awh.a($$7.d), awh.a($$7.e), awh.a($$7.f));
      }
   }
}
