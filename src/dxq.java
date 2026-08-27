import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class dxq extends dxy {
   private final Long2ObjectMap<dxp> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(cmz $$0, bgb $$1) {
      super.a($$0, $$1);
      this.l.clear();
      $$1.A();
   }

   @Override
   public void b() {
      this.b.C();
      this.l.clear();
      super.b();
   }

   @Override
   public dxr a() {
      int $$0;
      if (this.f() && this.b.aV()) {
         $$0 = this.b.do();
         gu.a $$1 = new gu.a(this.b.dn(), (double)$$0, this.b.dt());

         for (dcb $$2 = this.a.a_($$1); $$2.a(cpo.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dn(), (double)(++$$0), this.b.dt());
         }
      } else {
         $$0 = apa.a(this.b.dp() + 0.5);
      }

      gu $$4 = gu.a(this.b.dn(), (double)$$0, this.b.dt());
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
      dxp $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public dxx a(double $$0, double $$1, double $$2) {
      return this.a(this.b(apa.a($$0), apa.a($$1), apa.a($$2)));
   }

   @Override
   public int a(dxr[] $$0, dxr $$1) {
      int $$2 = 0;
      dxr $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      dxr $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      dxr $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      dxr $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      dxr $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      dxr $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      dxr $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      dxr $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      dxr $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      dxr $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      dxr $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      dxr $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      dxr $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      dxr $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      dxr $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      dxr $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      dxr $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      dxr $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      dxr $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      dxr $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      dxr $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      dxr $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      dxr $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      dxr $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      dxr $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      dxr $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable dxr $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable dxr $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected dxr a(int $$0, int $$1, int $$2) {
      dxr $$3 = null;
      dxp $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == dxp.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private dxp c(int $$0, int $$1, int $$2) {
      return (dxp)this.l.computeIfAbsent(gu.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public dxp a(cls $$0, int $$1, int $$2, int $$3, bgb $$4) {
      EnumSet<dxp> $$5 = EnumSet.noneOf(dxp.class);
      dxp $$6 = dxp.a;
      gu $$7 = $$4.di();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(dxp.h)) {
         return dxp.h;
      } else {
         dxp $$8 = dxp.a;

         for (dxp $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == dxp.b && $$4.a($$8) == 0.0F ? dxp.b : $$8;
      }
   }

   @Override
   public dxp a(cls $$0, int $$1, int $$2, int $$3) {
      gu.a $$4 = new gu.a();
      dxp $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == dxp.b && $$2 >= $$0.C_() + 1) {
         dxp $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == dxp.o || $$6 == dxp.i) {
            $$5 = dxp.o;
         } else if ($$6 == dxp.q) {
            $$5 = dxp.q;
         } else if ($$6 == dxp.x) {
            $$5 = dxp.x;
         } else if ($$6 == dxp.h) {
            if (!$$4.equals(this.b.di())) {
               $$5 = dxp.h;
            }
         } else {
            $$5 = $$6 != dxp.c && $$6 != dxp.b && $$6 != dxp.j ? dxp.c : dxp.b;
         }
      }

      if ($$5 == dxp.c || $$5 == dxp.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<gu> a(bgb $$0) {
      float $$1 = 1.0F;
      eed $$2 = $$0.cE();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            gu.a($$2.a, (double)$$0.do(), $$2.c),
            gu.a($$2.a, (double)$$0.do(), $$2.f),
            gu.a($$2.d, (double)$$0.do(), $$2.c),
            gu.a($$2.d, (double)$$0.do(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         eed $$7 = $$2.c($$5, $$6, $$4);
         return gu.a($$0.ec(), 10, apa.a($$7.a), apa.a($$7.b), apa.a($$7.c), apa.a($$7.d), apa.a($$7.e), apa.a($$7.f));
      }
   }
}
