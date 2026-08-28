import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eeu {
   public static final Codec<eeu> d = lq.U.r().dispatch(eeu::a, eev::a);
   protected final bpi e;
   protected final bpi f;

   protected static <P extends eeu> P2<Mu<P>, bpi, bpi> b(Instance<P> $$0) {
      return $$0.group(bpi.b(0, 16).fieldOf("radius").forGetter($$0x -> $$0x.e), bpi.b(0, 16).fieldOf("offset").forGetter($$0x -> $$0x.f));
   }

   public eeu(bpi $$0, bpi $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   protected abstract eev<?> a();

   public void a(dcj $$0, eeu.b $$1, aym $$2, eee $$3, int $$4, eeu.a $$5, int $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
   }

   protected abstract void a(dcj var1, eeu.b var2, aym var3, eee var4, int var5, eeu.a var6, int var7, int var8, int var9);

   public abstract int a(aym var1, int var2, eee var3);

   public int a(aym $$0, int $$1) {
      return this.e.a($$0);
   }

   private int a(aym $$0) {
      return this.f.a($$0);
   }

   protected abstract boolean a(aym var1, int var2, int var3, int var4, int var5, boolean var6);

   protected boolean b(aym $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
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

   protected void a(dcj $$0, eeu.b $$1, aym $$2, eee $$3, ja $$4, int $$5, int $$6, boolean $$7) {
      int $$8 = $$7 ? 1 : 0;
      ja.a $$9 = new ja.a();

      for (int $$10 = -$$5; $$10 <= $$5 + $$8; $$10++) {
         for (int $$11 = -$$5; $$11 <= $$5 + $$8; $$11++) {
            if (!this.b($$2, $$10, $$6, $$11, $$5, $$7)) {
               $$9.a($$4, $$10, $$6, $$11);
               a($$0, $$1, $$2, $$3, $$9);
            }
         }
      }
   }

   protected final void a(dcj $$0, eeu.b $$1, aym $$2, eee $$3, ja $$4, int $$5, int $$6, boolean $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      int $$10 = $$7 ? 1 : 0;
      ja $$11 = $$4.d();
      ja.a $$12 = new ja.a();

      for (jf $$13 : jf.c.a) {
         jf $$14 = $$13.h();
         int $$15 = $$14.f() == jf.b.a ? $$5 + $$10 : $$5;
         $$12.a($$4, 0, $$6 - 1, 0).c($$14, $$15).c($$13, -$$5);
         int $$16 = -$$5;

         while ($$16 < $$5 + $$10) {
            boolean $$17 = $$1.a($$12.c(jf.b));
            $$12.c(jf.a);
            if ($$17 && a($$0, $$1, $$2, $$3, $$8, $$11, $$12)) {
               $$12.c(jf.a);
               a($$0, $$1, $$2, $$3, $$9, $$11, $$12);
               $$12.c(jf.b);
            }

            $$16++;
            $$12.c($$13);
         }
      }
   }

   private static boolean a(dcj $$0, eeu.b $$1, aym $$2, eee $$3, float $$4, ja $$5, ja.a $$6) {
      if ($$6.k($$5) >= 7) {
         return false;
      } else {
         return $$2.i() > $$4 ? false : a($$0, $$1, $$2, $$3, $$6);
      }
   }

   protected static boolean a(dcj $$0, eeu.b $$1, aym $$2, eee $$3, ja $$4) {
      if (!ecq.c($$0, $$4)) {
         return false;
      } else {
         dsh $$5 = $$3.e.a($$2, $$4);
         if ($$5.b(dsx.C)) {
            $$5 = $$5.a(dsx.C, Boolean.valueOf($$0.b($$4, $$0x -> $$0x.a(eoc.c))));
         }

         $$1.a($$4, $$5);
         return true;
      }
   }

   public static final class a {
      private final ja a;
      private final int b;
      private final boolean c;

      public a(ja $$0, int $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ja a() {
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
      void a(ja var1, dsh var2);

      boolean a(ja var1);
   }
}
