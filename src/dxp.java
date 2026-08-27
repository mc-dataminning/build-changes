import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dxp {
   public static final Codec<dxp> d = kf.W.q().dispatch(dxp::a, dxq::a);
   protected final blb e;
   protected final blb f;

   protected static <P extends dxp> P2<Mu<P>, blb, blb> b(Instance<P> $$0) {
      return $$0.group(blb.b(0, 16).fieldOf("radius").forGetter($$0x -> $$0x.e), blb.b(0, 16).fieldOf("offset").forGetter($$0x -> $$0x.f));
   }

   public dxp(blb $$0, blb $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   protected abstract dxq<?> a();

   public void a(cvx $$0, dxp.b $$1, awp $$2, dwz $$3, int $$4, dxp.a $$5, int $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
   }

   protected abstract void a(cvx var1, dxp.b var2, awp var3, dwz var4, int var5, dxp.a var6, int var7, int var8, int var9);

   public abstract int a(awp var1, int var2, dwz var3);

   public int a(awp $$0, int $$1) {
      return this.e.a($$0);
   }

   private int a(awp $$0) {
      return this.f.a($$0);
   }

   protected abstract boolean a(awp var1, int var2, int var3, int var4, int var5, boolean var6);

   protected boolean b(awp $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
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

   protected void a(cvx $$0, dxp.b $$1, awp $$2, dwz $$3, hz $$4, int $$5, int $$6, boolean $$7) {
      int $$8 = $$7 ? 1 : 0;
      hz.a $$9 = new hz.a();

      for (int $$10 = -$$5; $$10 <= $$5 + $$8; $$10++) {
         for (int $$11 = -$$5; $$11 <= $$5 + $$8; $$11++) {
            if (!this.b($$2, $$10, $$6, $$11, $$5, $$7)) {
               $$9.a($$4, $$10, $$6, $$11);
               a($$0, $$1, $$2, $$3, $$9);
            }
         }
      }
   }

   protected final void a(cvx $$0, dxp.b $$1, awp $$2, dwz $$3, hz $$4, int $$5, int $$6, boolean $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      int $$10 = $$7 ? 1 : 0;
      hz $$11 = $$4.d();
      hz.a $$12 = new hz.a();

      for (ie $$13 : ie.c.a) {
         ie $$14 = $$13.h();
         int $$15 = $$14.f() == ie.b.a ? $$5 + $$10 : $$5;
         $$12.a($$4, 0, $$6 - 1, 0).c($$14, $$15).c($$13, -$$5);
         int $$16 = -$$5;

         while ($$16 < $$5 + $$10) {
            boolean $$17 = $$1.a($$12.c(ie.b));
            $$12.c(ie.a);
            if ($$17 && a($$0, $$1, $$2, $$3, $$8, $$11, $$12)) {
               $$12.c(ie.a);
               a($$0, $$1, $$2, $$3, $$9, $$11, $$12);
               $$12.c(ie.b);
            }

            $$16++;
            $$12.c($$13);
         }
      }
   }

   private static boolean a(cvx $$0, dxp.b $$1, awp $$2, dwz $$3, float $$4, hz $$5, hz.a $$6) {
      if ($$6.k($$5) >= 7) {
         return false;
      } else {
         return $$2.i() > $$4 ? false : a($$0, $$1, $$2, $$3, $$6);
      }
   }

   protected static boolean a(cvx $$0, dxp.b $$1, awp $$2, dwz $$3, hz $$4) {
      if (!dvl.c($$0, $$4)) {
         return false;
      } else {
         dlj $$5 = $$3.e.a($$2, $$4);
         if ($$5.b(dlz.C)) {
            $$5 = $$5.a(dlz.C, Boolean.valueOf($$0.b($$4, $$0x -> $$0x.a(egx.c))));
         }

         $$1.a($$4, $$5);
         return true;
      }
   }

   public static final class a {
      private final hz a;
      private final int b;
      private final boolean c;

      public a(hz $$0, int $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public hz a() {
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
      void a(hz var1, dlj var2);

      boolean a(hz var1);
   }
}
