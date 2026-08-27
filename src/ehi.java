import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ehi extends ehq {
   private final Long2ObjectMap<ehh> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(cwe $$0, bok $$1) {
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
   public ehj a() {
      int $$0;
      if (this.f() && this.b.aZ()) {
         $$0 = this.b.ds();
         hz.a $$1 = new hz.a(this.b.dr(), (double)$$0, this.b.dx());

         for (dlj $$2 = this.a.a_($$1); $$2.a(cyu.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dr(), (double)(++$$0), this.b.dx());
         }
      } else {
         $$0 = awi.a(this.b.dt() + 0.5);
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
      ehh $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public ehp a(double $$0, double $$1, double $$2) {
      return this.a(this.b(awi.a($$0), awi.a($$1), awi.a($$2)));
   }

   @Override
   public int a(ehj[] $$0, ehj $$1) {
      int $$2 = 0;
      ehj $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      ehj $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      ehj $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      ehj $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      ehj $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      ehj $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      ehj $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      ehj $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      ehj $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      ehj $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      ehj $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      ehj $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      ehj $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      ehj $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      ehj $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      ehj $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      ehj $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      ehj $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      ehj $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      ehj $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      ehj $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      ehj $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      ehj $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      ehj $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      ehj $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      ehj $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable ehj $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable ehj $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected ehj a(int $$0, int $$1, int $$2) {
      ehj $$3 = null;
      ehh $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == ehh.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private ehh c(int $$0, int $$1, int $$2) {
      return (ehh)this.l.computeIfAbsent(hz.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public ehh a(cux $$0, int $$1, int $$2, int $$3, bok $$4) {
      EnumSet<ehh> $$5 = EnumSet.noneOf(ehh.class);
      ehh $$6 = ehh.a;
      hz $$7 = $$4.dm();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(ehh.h)) {
         return ehh.h;
      } else {
         ehh $$8 = ehh.a;

         for (ehh $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == ehh.b && $$4.a($$8) == 0.0F ? ehh.b : $$8;
      }
   }

   @Override
   public ehh a(cux $$0, int $$1, int $$2, int $$3) {
      hz.a $$4 = new hz.a();
      ehh $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == ehh.b && $$2 >= $$0.J_() + 1) {
         ehh $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == ehh.o || $$6 == ehh.i) {
            $$5 = ehh.o;
         } else if ($$6 == ehh.q) {
            $$5 = ehh.q;
         } else if ($$6 == ehh.x) {
            $$5 = ehh.x;
         } else if ($$6 == ehh.h) {
            if (!$$4.equals(this.b.dm())) {
               $$5 = ehh.h;
            }
         } else {
            $$5 = $$6 != ehh.c && $$6 != ehh.b && $$6 != ehh.j ? ehh.c : ehh.b;
         }
      }

      if ($$5 == ehh.c || $$5 == ehh.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<hz> a(bok $$0) {
      float $$1 = 1.0F;
      enu $$2 = $$0.cH();
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
         enu $$7 = $$2.c($$5, $$6, $$4);
         return hz.a($$0.eh(), 10, awi.a($$7.a), awi.a($$7.b), awi.a($$7.c), awi.a($$7.d), awi.a($$7.e), awi.a($$7.f));
      }
   }
}
