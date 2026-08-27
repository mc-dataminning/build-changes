import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class eat extends ebb {
   private final Long2ObjectMap<eas> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(cqd $$0, bjd $$1) {
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
   public eau a() {
      int $$0;
      if (this.f() && this.b.aX()) {
         $$0 = this.b.dq();
         gw.a $$1 = new gw.a(this.b.dp(), (double)$$0, this.b.dv());

         for (dfe $$2 = this.a.a_($$1); $$2.a(csr.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dp(), (double)(++$$0), this.b.dv());
         }
      } else {
         $$0 = ars.a(this.b.dr() + 0.5);
      }

      gw $$4 = gw.a(this.b.dp(), (double)$$0, this.b.dv());
      if (!this.a($$4)) {
         for (gw $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(gw $$0) {
      eas $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public eba a(double $$0, double $$1, double $$2) {
      return this.a(this.b(ars.a($$0), ars.a($$1), ars.a($$2)));
   }

   @Override
   public int a(eau[] $$0, eau $$1) {
      int $$2 = 0;
      eau $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      eau $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      eau $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      eau $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      eau $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      eau $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      eau $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      eau $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      eau $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      eau $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      eau $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      eau $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      eau $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      eau $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      eau $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      eau $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      eau $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      eau $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      eau $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      eau $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      eau $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      eau $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      eau $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      eau $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      eau $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      eau $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable eau $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable eau $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected eau a(int $$0, int $$1, int $$2) {
      eau $$3 = null;
      eas $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == eas.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private eas c(int $$0, int $$1, int $$2) {
      return (eas)this.l.computeIfAbsent(gw.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public eas a(cow $$0, int $$1, int $$2, int $$3, bjd $$4) {
      EnumSet<eas> $$5 = EnumSet.noneOf(eas.class);
      eas $$6 = eas.a;
      gw $$7 = $$4.dk();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(eas.h)) {
         return eas.h;
      } else {
         eas $$8 = eas.a;

         for (eas $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == eas.b && $$4.a($$8) == 0.0F ? eas.b : $$8;
      }
   }

   @Override
   public eas a(cow $$0, int $$1, int $$2, int $$3) {
      gw.a $$4 = new gw.a();
      eas $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eas.b && $$2 >= $$0.C_() + 1) {
         eas $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == eas.o || $$6 == eas.i) {
            $$5 = eas.o;
         } else if ($$6 == eas.q) {
            $$5 = eas.q;
         } else if ($$6 == eas.x) {
            $$5 = eas.x;
         } else if ($$6 == eas.h) {
            if (!$$4.equals(this.b.dk())) {
               $$5 = eas.h;
            }
         } else {
            $$5 = $$6 != eas.c && $$6 != eas.b && $$6 != eas.j ? eas.c : eas.b;
         }
      }

      if ($$5 == eas.c || $$5 == eas.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<gw> a(bjd $$0) {
      float $$1 = 1.0F;
      ehd $$2 = $$0.cG();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            gw.a($$2.a, (double)$$0.dq(), $$2.c),
            gw.a($$2.a, (double)$$0.dq(), $$2.f),
            gw.a($$2.d, (double)$$0.dq(), $$2.c),
            gw.a($$2.d, (double)$$0.dq(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         ehd $$7 = $$2.c($$5, $$6, $$4);
         return gw.a($$0.ee(), 10, ars.a($$7.a), ars.a($$7.b), ars.a($$7.c), ars.a($$7.d), ars.a($$7.e), ars.a($$7.f));
      }
   }
}
