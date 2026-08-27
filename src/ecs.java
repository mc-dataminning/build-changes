import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ecs extends eda {
   private final Long2ObjectMap<ecr> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(csf $$0, bla $$1) {
      super.a($$0, $$1);
      this.l.clear();
      $$1.C();
   }

   @Override
   public void b() {
      this.b.E();
      this.l.clear();
      super.b();
   }

   @Override
   public ect a() {
      int $$0;
      if (this.f() && this.b.aX()) {
         $$0 = this.b.dr();
         ht.a $$1 = new ht.a(this.b.dq(), (double)$$0, this.b.dw());

         for (dgw $$2 = this.a.a_($$1); $$2.a(cuv.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dq(), (double)(++$$0), this.b.dw());
         }
      } else {
         $$0 = ati.a(this.b.ds() + 0.5);
      }

      ht $$4 = ht.a(this.b.dq(), (double)$$0, this.b.dw());
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
      ecr $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public ecz a(double $$0, double $$1, double $$2) {
      return this.a(this.b(ati.a($$0), ati.a($$1), ati.a($$2)));
   }

   @Override
   public int a(ect[] $$0, ect $$1) {
      int $$2 = 0;
      ect $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      ect $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      ect $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      ect $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      ect $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      ect $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      ect $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      ect $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      ect $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      ect $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      ect $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      ect $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      ect $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      ect $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      ect $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      ect $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      ect $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      ect $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      ect $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      ect $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      ect $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      ect $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      ect $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      ect $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      ect $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      ect $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable ect $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable ect $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected ect a(int $$0, int $$1, int $$2) {
      ect $$3 = null;
      ecr $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == ecr.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private ecr c(int $$0, int $$1, int $$2) {
      return (ecr)this.l.computeIfAbsent(ht.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public ecr a(cqy $$0, int $$1, int $$2, int $$3, bla $$4) {
      EnumSet<ecr> $$5 = EnumSet.noneOf(ecr.class);
      ecr $$6 = ecr.a;
      ht $$7 = $$4.dl();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(ecr.h)) {
         return ecr.h;
      } else {
         ecr $$8 = ecr.a;

         for (ecr $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == ecr.b && $$4.a($$8) == 0.0F ? ecr.b : $$8;
      }
   }

   @Override
   public ecr a(cqy $$0, int $$1, int $$2, int $$3) {
      ht.a $$4 = new ht.a();
      ecr $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == ecr.b && $$2 >= $$0.I_() + 1) {
         ecr $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == ecr.o || $$6 == ecr.i) {
            $$5 = ecr.o;
         } else if ($$6 == ecr.q) {
            $$5 = ecr.q;
         } else if ($$6 == ecr.x) {
            $$5 = ecr.x;
         } else if ($$6 == ecr.h) {
            if (!$$4.equals(this.b.dl())) {
               $$5 = ecr.h;
            }
         } else {
            $$5 = $$6 != ecr.c && $$6 != ecr.b && $$6 != ecr.j ? ecr.c : ecr.b;
         }
      }

      if ($$5 == ecr.c || $$5 == ecr.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<ht> a(bla $$0) {
      float $$1 = 1.0F;
      ejd $$2 = $$0.cG();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            ht.a($$2.a, (double)$$0.dr(), $$2.c),
            ht.a($$2.a, (double)$$0.dr(), $$2.f),
            ht.a($$2.d, (double)$$0.dr(), $$2.c),
            ht.a($$2.d, (double)$$0.dr(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         ejd $$7 = $$2.c($$5, $$6, $$4);
         return ht.a($$0.ef(), 10, ati.a($$7.a), ati.a($$7.b), ati.a($$7.c), ati.a($$7.d), ati.a($$7.e), ati.a($$7.f));
      }
   }
}
