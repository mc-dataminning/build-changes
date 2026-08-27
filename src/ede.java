import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ede extends edm {
   private final Long2ObjectMap<edd> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(csn $$0, bli $$1) {
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
   public edf a() {
      int $$0;
      if (this.f() && this.b.aZ()) {
         $$0 = this.b.dt();
         ht.a $$1 = new ht.a(this.b.ds(), (double)$$0, this.b.dy());

         for (dhi $$2 = this.a.a_($$1); $$2.a(cvc.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.ds(), (double)(++$$0), this.b.dy());
         }
      } else {
         $$0 = atm.a(this.b.du() + 0.5);
      }

      ht $$4 = ht.a(this.b.ds(), (double)$$0, this.b.dy());
      if (!this.a($$4)) {
         for (ht $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(ht $$0) {
      edd $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public edl a(double $$0, double $$1, double $$2) {
      return this.a(this.b(atm.a($$0), atm.a($$1), atm.a($$2)));
   }

   @Override
   public int a(edf[] $$0, edf $$1) {
      int $$2 = 0;
      edf $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      edf $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      edf $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      edf $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      edf $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      edf $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      edf $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      edf $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      edf $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      edf $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      edf $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      edf $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      edf $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      edf $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      edf $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      edf $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      edf $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      edf $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      edf $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      edf $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      edf $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      edf $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      edf $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      edf $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      edf $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      edf $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable edf $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable edf $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected edf a(int $$0, int $$1, int $$2) {
      edf $$3 = null;
      edd $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == edd.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private edd c(int $$0, int $$1, int $$2) {
      return (edd)this.l.computeIfAbsent(ht.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public edd a(crg $$0, int $$1, int $$2, int $$3, bli $$4) {
      EnumSet<edd> $$5 = EnumSet.noneOf(edd.class);
      edd $$6 = edd.a;
      ht $$7 = $$4.dn();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(edd.h)) {
         return edd.h;
      } else {
         edd $$8 = edd.a;

         for (edd $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == edd.b && $$4.a($$8) == 0.0F ? edd.b : $$8;
      }
   }

   @Override
   public edd a(crg $$0, int $$1, int $$2, int $$3) {
      ht.a $$4 = new ht.a();
      edd $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == edd.b && $$2 >= $$0.I_() + 1) {
         edd $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == edd.o || $$6 == edd.i) {
            $$5 = edd.o;
         } else if ($$6 == edd.q) {
            $$5 = edd.q;
         } else if ($$6 == edd.x) {
            $$5 = edd.x;
         } else if ($$6 == edd.h) {
            if (!$$4.equals(this.b.dn())) {
               $$5 = edd.h;
            }
         } else {
            $$5 = $$6 != edd.c && $$6 != edd.b && $$6 != edd.j ? edd.c : edd.b;
         }
      }

      if ($$5 == edd.c || $$5 == edd.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<ht> a(bli $$0) {
      float $$1 = 1.0F;
      ejp $$2 = $$0.cH();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            ht.a($$2.a, (double)$$0.dt(), $$2.c),
            ht.a($$2.a, (double)$$0.dt(), $$2.f),
            ht.a($$2.d, (double)$$0.dt(), $$2.c),
            ht.a($$2.d, (double)$$0.dt(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         ejp $$7 = $$2.c($$5, $$6, $$4);
         return ht.a($$0.eh(), 10, atm.a($$7.a), atm.a($$7.b), atm.a($$7.c), atm.a($$7.d), atm.a($$7.e), atm.a($$7.f));
      }
   }
}
