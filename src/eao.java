import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class eao extends eaw {
   private final Long2ObjectMap<ean> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(cpy $$0, bja $$1) {
      super.a($$0, $$1);
      this.l.clear();
      $$1.z();
   }

   @Override
   public void b() {
      this.b.A();
      this.l.clear();
      super.b();
   }

   @Override
   public eap a() {
      int $$0;
      if (this.f() && this.b.aX()) {
         $$0 = this.b.dq();
         gu.a $$1 = new gu.a(this.b.dp(), (double)$$0, this.b.dv());

         for (dez $$2 = this.a.a_($$1); $$2.a(csm.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dp(), (double)(++$$0), this.b.dv());
         }
      } else {
         $$0 = arp.a(this.b.dr() + 0.5);
      }

      gu $$4 = gu.a(this.b.dp(), (double)$$0, this.b.dv());
      if (!this.a($$4)) {
         for (gu $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(gu $$0) {
      ean $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public eav a(double $$0, double $$1, double $$2) {
      return this.a(this.b(arp.a($$0), arp.a($$1), arp.a($$2)));
   }

   @Override
   public int a(eap[] $$0, eap $$1) {
      int $$2 = 0;
      eap $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      eap $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      eap $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      eap $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      eap $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      eap $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      eap $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      eap $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      eap $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      eap $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      eap $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      eap $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      eap $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      eap $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      eap $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      eap $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      eap $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      eap $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      eap $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      eap $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      eap $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      eap $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      eap $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      eap $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      eap $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      eap $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable eap $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable eap $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected eap a(int $$0, int $$1, int $$2) {
      eap $$3 = null;
      ean $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == ean.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private ean c(int $$0, int $$1, int $$2) {
      return (ean)this.l.computeIfAbsent(gu.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public ean a(cor $$0, int $$1, int $$2, int $$3, bja $$4) {
      EnumSet<ean> $$5 = EnumSet.noneOf(ean.class);
      ean $$6 = ean.a;
      gu $$7 = $$4.dk();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(ean.h)) {
         return ean.h;
      } else {
         ean $$8 = ean.a;

         for (ean $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == ean.b && $$4.a($$8) == 0.0F ? ean.b : $$8;
      }
   }

   @Override
   public ean a(cor $$0, int $$1, int $$2, int $$3) {
      gu.a $$4 = new gu.a();
      ean $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == ean.b && $$2 >= $$0.C_() + 1) {
         ean $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == ean.o || $$6 == ean.i) {
            $$5 = ean.o;
         } else if ($$6 == ean.q) {
            $$5 = ean.q;
         } else if ($$6 == ean.x) {
            $$5 = ean.x;
         } else if ($$6 == ean.h) {
            if (!$$4.equals(this.b.dk())) {
               $$5 = ean.h;
            }
         } else {
            $$5 = $$6 != ean.c && $$6 != ean.b && $$6 != ean.j ? ean.c : ean.b;
         }
      }

      if ($$5 == ean.c || $$5 == ean.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<gu> a(bja $$0) {
      float $$1 = 1.0F;
      egy $$2 = $$0.cG();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            gu.a($$2.a, (double)$$0.dq(), $$2.c),
            gu.a($$2.a, (double)$$0.dq(), $$2.f),
            gu.a($$2.d, (double)$$0.dq(), $$2.c),
            gu.a($$2.d, (double)$$0.dq(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         egy $$7 = $$2.c($$5, $$6, $$4);
         return gu.a($$0.ee(), 10, arp.a($$7.a), arp.a($$7.b), arp.a($$7.c), arp.a($$7.d), arp.a($$7.e), arp.a($$7.f));
      }
   }
}
