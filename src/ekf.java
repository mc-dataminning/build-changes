import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class ekf {
   public static final Codec<ekf> d = ma.U.q().dispatch(ekf::a, ekg::a);
   protected final bsf e;
   protected final bsf f;

   protected static <P extends ekf> P2<Mu<P>, bsf, bsf> b(Instance<P> $$0) {
      return $$0.group(bsf.b(0, 16).fieldOf("radius").forGetter($$0x -> $$0x.e), bsf.b(0, 16).fieldOf("offset").forGetter($$0x -> $$0x.f));
   }

   public ekf(bsf $$0, bsf $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   protected abstract ekg<?> a();

   public void a(dhf $$0, ekf.b $$1, bac $$2, ejp $$3, int $$4, ekf.a $$5, int $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
   }

   protected abstract void a(dhf var1, ekf.b var2, bac var3, ejp var4, int var5, ekf.a var6, int var7, int var8, int var9);

   public abstract int a(bac var1, int var2, ejp var3);

   public int a(bac $$0, int $$1) {
      return this.e.a($$0);
   }

   private int a(bac $$0) {
      return this.f.a($$0);
   }

   protected abstract boolean a(bac var1, int var2, int var3, int var4, int var5, boolean var6);

   protected boolean b(bac $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      int $$6;
      int $$7;
      if ($$5) {
         $$6 = Math.min(Math.abs($$1), Math.abs($$1 - 1));
         $$7 = Math.min(Math.abs($$3), Math.abs($$3 - 1));
      } else {
         $$6 = Math.abs($$1);
         $$7 = Math.abs($$3);
      }

      return this.a($$0, $$6, $$2, $$7, $$4, $$5);
   }

   protected void a(dhf $$0, ekf.b $$1, bac $$2, ejp $$3, jh $$4, int $$5, int $$6, boolean $$7) {
      int $$8 = $$7 ? 1 : 0;
      jh.a $$9 = new jh.a();

      for (int $$10 = -$$5; $$10 <= $$5 + $$8; $$10++) {
         for (int $$11 = -$$5; $$11 <= $$5 + $$8; $$11++) {
            if (!this.b($$2, $$10, $$6, $$11, $$5, $$7)) {
               $$9.a($$4, $$10, $$6, $$11);
               a($$0, $$1, $$2, $$3, $$9);
            }
         }
      }
   }

   protected final void a(dhf $$0, ekf.b $$1, bac $$2, ejp $$3, jh $$4, int $$5, int $$6, boolean $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      int $$10 = $$7 ? 1 : 0;
      jh $$11 = $$4.e();
      jh.a $$12 = new jh.a();

      for (jm $$13 : jm.c.a) {
         jm $$14 = $$13.h();
         int $$15 = $$14.f() == jm.b.a ? $$5 + $$10 : $$5;
         $$12.a($$4, 0, $$6 - 1, 0).c($$14, $$15).c($$13, -$$5);
         int $$16 = -$$5;

         while ($$16 < $$5 + $$10) {
            boolean $$17 = $$1.a($$12.c(jm.b));
            $$12.c(jm.a);
            if ($$17 && a($$0, $$1, $$2, $$3, $$8, $$11, $$12)) {
               $$12.c(jm.a);
               a($$0, $$1, $$2, $$3, $$9, $$11, $$12);
               $$12.c(jm.b);
            }

            $$16++;
            $$12.c($$13);
         }
      }
   }

   private static boolean a(dhf $$0, ekf.b $$1, bac $$2, ejp $$3, float $$4, jh $$5, jh.a $$6) {
      if ($$6.k($$5) >= 7) {
         return false;
      } else {
         return $$2.i() > $$4 ? false : a($$0, $$1, $$2, $$3, $$6);
      }
   }

   protected static boolean a(dhf $$0, ekf.b $$1, bac $$2, ejp $$3, jh $$4) {
      boolean $$5 = $$0.a($$4, $$0x -> $$0x.a(dye.A, Boolean.valueOf(false)));
      if (!$$5 && eib.c($$0, $$4)) {
         dxo $$6 = $$3.e.a($$2, $$4);
         if ($$6.b(dye.J)) {
            $$6 = $$6.b(dye.J, Boolean.valueOf($$0.b($$4, $$0x -> $$0x.a(etr.c))));
         }

         $$1.a($$4, $$6);
         return true;
      } else {
         return false;
      }
   }

   public static final class a {
      private final jh a;
      private final int b;
      private final boolean c;

      public a(jh $$0, int $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public jh a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }

      public boolean c() {
         return this.c;
      }
   }

   public interface b {
      void a(jh var1, dxo var2);

      boolean a(jh var1);
   }
}
