import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class exl extends exw {
   private final Long2ObjectMap<exr> a = new Long2ObjectOpenHashMap();
   private static final float m = 1.0F;
   private static final float n = 1.1F;
   private static final int o = 10;

   @Override
   public void a(djz $$0, bxl $$1) {
      super.a($$0, $$1);
      this.a.clear();
      $$1.G();
   }

   @Override
   public void b() {
      this.c.H();
      this.a.clear();
      super.b();
   }

   @Override
   public exm a() {
      int $$0;
      if (this.f() && this.c.bh()) {
         $$0 = this.c.dA();
         iv.a $$1 = new iv.a(this.c.dz(), (double)$$0, this.c.dF());

         for (eat $$2 = this.b.a($$1); $$2.a(dmt.J); $$2 = this.b.a($$1)) {
            $$1.b(this.c.dz(), (double)(++$$0), this.c.dF());
         }
      } else {
         $$0 = azm.a(this.c.dB() + 0.5);
      }

      iv $$4 = iv.a(this.c.dz(), (double)$$0, this.c.dF());
      if (!this.a($$4)) {
         for (iv $$5 : this.a(this.c)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(iv $$0) {
      exr $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return this.c.a($$1) >= 0.0F;
   }

   @Override
   public exv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(exm[] $$0, exm $$1) {
      int $$2 = 0;
      exm $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      exm $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      exm $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      exm $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      exm $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      exm $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      exm $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      exm $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      exm $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      exm $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      exm $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      exm $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      exm $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      exm $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      exm $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      exm $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      exm $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      exm $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      exm $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      exm $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      exm $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      exm $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      exm $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      exm $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      exm $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      exm $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable exm $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable exm $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected exm a(int $$0, int $$1, int $$2) {
      exm $$3 = null;
      exr $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.c.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.c($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == exr.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   @Override
   protected exr b(int $$0, int $$1, int $$2) {
      return (exr)this.a.computeIfAbsent(iv.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public exr a(ext $$0, int $$1, int $$2, int $$3) {
      exr $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == exr.b && $$2 >= $$0.a().G_() + 1) {
         iv $$5 = new iv($$1, $$2 - 1, $$3);
         exr $$6 = $$0.a($$5.u(), $$5.v(), $$5.w());
         if ($$6 == exr.o || $$6 == exr.i) {
            $$4 = exr.o;
         } else if ($$6 == exr.q) {
            $$4 = exr.q;
         } else if ($$6 == exr.x) {
            $$4 = exr.x;
         } else if ($$6 == exr.h) {
            if (!$$5.equals($$0.b())) {
               $$4 = exr.h;
            }
         } else {
            $$4 = $$6 != exr.c && $$6 != exr.b && $$6 != exr.j ? exr.c : exr.b;
         }
      }

      if ($$4 == exr.c || $$4 == exr.b) {
         $$4 = a($$0, $$1, $$2, $$3, $$4);
      }

      return $$4;
   }

   private Iterable<iv> a(bxl $$0) {
      fex $$1 = $$0.cQ();
      boolean $$2 = $$1.a() < 1.0;
      if (!$$2) {
         return List.of(
            iv.a($$1.a, (double)$$0.dA(), $$1.c),
            iv.a($$1.a, (double)$$0.dA(), $$1.f),
            iv.a($$1.d, (double)$$0.dA(), $$1.c),
            iv.a($$1.d, (double)$$0.dA(), $$1.f)
         );
      } else {
         double $$3 = Math.max(0.0, 1.1F - $$1.d());
         double $$4 = Math.max(0.0, 1.1F - $$1.b());
         double $$5 = Math.max(0.0, 1.1F - $$1.c());
         fex $$6 = $$1.c($$4, $$5, $$3);
         return iv.a($$0.dX(), 10, azm.a($$6.a), azm.a($$6.b), azm.a($$6.c), azm.a($$6.d), azm.a($$6.e), azm.a($$6.f));
      }
   }
}
