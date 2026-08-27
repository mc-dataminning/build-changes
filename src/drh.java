import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class drh {
   public static final Codec<drh> d = jd.X.q().dispatch(drh::a, dri::a);
   protected final bfy e;
   protected final bfy f;

   protected static <P extends drh> P2<Mu<P>, bfy, bfy> b(Instance<P> $$0) {
      return $$0.group(bfy.b(0, 16).fieldOf("radius").forGetter($$0x -> $$0x.e), bfy.b(0, 16).fieldOf("offset").forGetter($$0x -> $$0x.f));
   }

   public drh(bfy $$0, bfy $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   protected abstract dri<?> a();

   public void a(cpw $$0, drh.b $$1, arx $$2, dqr $$3, int $$4, drh.a $$5, int $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
   }

   protected abstract void a(cpw var1, drh.b var2, arx var3, dqr var4, int var5, drh.a var6, int var7, int var8, int var9);

   public abstract int a(arx var1, int var2, dqr var3);

   public int a(arx $$0, int $$1) {
      return this.e.a($$0);
   }

   private int a(arx $$0) {
      return this.f.a($$0);
   }

   protected abstract boolean a(arx var1, int var2, int var3, int var4, int var5, boolean var6);

   protected boolean b(arx $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
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

   protected void a(cpw $$0, drh.b $$1, arx $$2, dqr $$3, gw $$4, int $$5, int $$6, boolean $$7) {
      int $$8 = $$7 ? 1 : 0;
      gw.a $$9 = new gw.a();

      for (int $$10 = -$$5; $$10 <= $$5 + $$8; $$10++) {
         for (int $$11 = -$$5; $$11 <= $$5 + $$8; $$11++) {
            if (!this.b($$2, $$10, $$6, $$11, $$5, $$7)) {
               $$9.a($$4, $$10, $$6, $$11);
               a($$0, $$1, $$2, $$3, $$9);
            }
         }
      }
   }

   protected final void a(cpw $$0, drh.b $$1, arx $$2, dqr $$3, gw $$4, int $$5, int $$6, boolean $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      int $$10 = $$7 ? 1 : 0;
      gw $$11 = $$4.d();
      gw.a $$12 = new gw.a();

      for (hc $$13 : hc.c.a) {
         hc $$14 = $$13.h();
         int $$15 = $$14.f() == hc.b.a ? $$5 + $$10 : $$5;
         $$12.a($$4, 0, $$6 - 1, 0).c($$14, $$15).c($$13, -$$5);
         int $$16 = -$$5;

         while ($$16 < $$5 + $$10) {
            boolean $$17 = $$1.a($$12.c(hc.b));
            $$12.c(hc.a);
            if ($$17 && a($$0, $$1, $$2, $$3, $$8, $$11, $$12)) {
               $$12.c(hc.a);
               a($$0, $$1, $$2, $$3, $$9, $$11, $$12);
               $$12.c(hc.b);
            }

            $$16++;
            $$12.c($$13);
         }
      }
   }

   private static boolean a(cpw $$0, drh.b $$1, arx $$2, dqr $$3, float $$4, gw $$5, gw.a $$6) {
      if ($$6.k($$5) >= 7) {
         return false;
      } else {
         return $$2.i() > $$4 ? false : a($$0, $$1, $$2, $$3, $$6);
      }
   }

   protected static boolean a(cpw $$0, drh.b $$1, arx $$2, dqr $$3, gw $$4) {
      if (!dpd.c($$0, $$4)) {
         return false;
      } else {
         dfe $$5 = $$3.e.a($$2, $$4);
         if ($$5.b(dfu.C)) {
            $$5 = $$5.a(dfu.C, Boolean.valueOf($$0.b($$4, $$0x -> $$0x.a(eai.c))));
         }

         $$1.a($$4, $$5);
         return true;
      }
   }

   public static final class a {
      private final gw a;
      private final int b;
      private final boolean c;

      public a(gw $$0, int $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public gw a() {
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
      void a(gw var1, dfe var2);

      boolean a(gw var1);
   }
}
