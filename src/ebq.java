import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ebq extends eby {
   private final Long2ObjectMap<ebp> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(crm $$0, bkl $$1) {
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
   public ebr a() {
      int $$0;
      if (this.f() && this.b.aX()) {
         $$0 = this.b.dr();
         ht.a $$1 = new ht.a(this.b.dq(), (double)$$0, this.b.dw());

         for (dgb $$2 = this.a.a_($$1); $$2.a(cuc.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dq(), (double)(++$$0), this.b.dw());
         }
      } else {
         $$0 = asy.a(this.b.ds() + 0.5);
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
      ebp $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public ebx a(double $$0, double $$1, double $$2) {
      return this.a(this.b(asy.a($$0), asy.a($$1), asy.a($$2)));
   }

   @Override
   public int a(ebr[] $$0, ebr $$1) {
      int $$2 = 0;
      ebr $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      ebr $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      ebr $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      ebr $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      ebr $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      ebr $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      ebr $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      ebr $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      ebr $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      ebr $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      ebr $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      ebr $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      ebr $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      ebr $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      ebr $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      ebr $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      ebr $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      ebr $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      ebr $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      ebr $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      ebr $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      ebr $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      ebr $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      ebr $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      ebr $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      ebr $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable ebr $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable ebr $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected ebr a(int $$0, int $$1, int $$2) {
      ebr $$3 = null;
      ebp $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == ebp.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private ebp c(int $$0, int $$1, int $$2) {
      return (ebp)this.l.computeIfAbsent(ht.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public ebp a(cqf $$0, int $$1, int $$2, int $$3, bkl $$4) {
      EnumSet<ebp> $$5 = EnumSet.noneOf(ebp.class);
      ebp $$6 = ebp.a;
      ht $$7 = $$4.dl();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(ebp.h)) {
         return ebp.h;
      } else {
         ebp $$8 = ebp.a;

         for (ebp $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == ebp.b && $$4.a($$8) == 0.0F ? ebp.b : $$8;
      }
   }

   @Override
   public ebp a(cqf $$0, int $$1, int $$2, int $$3) {
      ht.a $$4 = new ht.a();
      ebp $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == ebp.b && $$2 >= $$0.I_() + 1) {
         ebp $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == ebp.o || $$6 == ebp.i) {
            $$5 = ebp.o;
         } else if ($$6 == ebp.q) {
            $$5 = ebp.q;
         } else if ($$6 == ebp.x) {
            $$5 = ebp.x;
         } else if ($$6 == ebp.h) {
            if (!$$4.equals(this.b.dl())) {
               $$5 = ebp.h;
            }
         } else {
            $$5 = $$6 != ebp.c && $$6 != ebp.b && $$6 != ebp.j ? ebp.c : ebp.b;
         }
      }

      if ($$5 == ebp.c || $$5 == ebp.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<ht> a(bkl $$0) {
      float $$1 = 1.0F;
      eia $$2 = $$0.cG();
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
         eia $$7 = $$2.c($$5, $$6, $$4);
         return ht.a($$0.ef(), 10, asy.a($$7.a), asy.a($$7.b), asy.a($$7.c), asy.a($$7.d), asy.a($$7.e), asy.a($$7.f));
      }
   }
}
