import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dyk {
   public static final Codec<dyk> d = kh.W.q().dispatch(dyk::a, dyl::a);
   protected final blq e;
   protected final blq f;

   protected static <P extends dyk> P2<Mu<P>, blq, blq> b(Instance<P> $$0) {
      return $$0.group(blq.b(0, 16).fieldOf("radius").forGetter($$0x -> $$0x.e), blq.b(0, 16).fieldOf("offset").forGetter($$0x -> $$0x.f));
   }

   public dyk(blq $$0, blq $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   protected abstract dyl<?> a();

   public void a(cwk $$0, dyk.b $$1, awt $$2, dxu $$3, int $$4, dyk.a $$5, int $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
   }

   protected abstract void a(cwk var1, dyk.b var2, awt var3, dxu var4, int var5, dyk.a var6, int var7, int var8, int var9);

   public abstract int a(awt var1, int var2, dxu var3);

   public int a(awt $$0, int $$1) {
      return this.e.a($$0);
   }

   private int a(awt $$0) {
      return this.f.a($$0);
   }

   protected abstract boolean a(awt var1, int var2, int var3, int var4, int var5, boolean var6);

   protected boolean b(awt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
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

   protected void a(cwk $$0, dyk.b $$1, awt $$2, dxu $$3, ib $$4, int $$5, int $$6, boolean $$7) {
      int $$8 = $$7 ? 1 : 0;
      ib.a $$9 = new ib.a();

      for (int $$10 = -$$5; $$10 <= $$5 + $$8; $$10++) {
         for (int $$11 = -$$5; $$11 <= $$5 + $$8; $$11++) {
            if (!this.b($$2, $$10, $$6, $$11, $$5, $$7)) {
               $$9.a($$4, $$10, $$6, $$11);
               a($$0, $$1, $$2, $$3, $$9);
            }
         }
      }
   }

   protected final void a(cwk $$0, dyk.b $$1, awt $$2, dxu $$3, ib $$4, int $$5, int $$6, boolean $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      int $$10 = $$7 ? 1 : 0;
      ib $$11 = $$4.d();
      ib.a $$12 = new ib.a();

      for (ih $$13 : ih.c.a) {
         ih $$14 = $$13.h();
         int $$15 = $$14.f() == ih.b.a ? $$5 + $$10 : $$5;
         $$12.a($$4, 0, $$6 - 1, 0).c($$14, $$15).c($$13, -$$5);
         int $$16 = -$$5;

         while ($$16 < $$5 + $$10) {
            boolean $$17 = $$1.a($$12.c(ih.b));
            $$12.c(ih.a);
            if ($$17 && a($$0, $$1, $$2, $$3, $$8, $$11, $$12)) {
               $$12.c(ih.a);
               a($$0, $$1, $$2, $$3, $$9, $$11, $$12);
               $$12.c(ih.b);
            }

            $$16++;
            $$12.c($$13);
         }
      }
   }

   private static boolean a(cwk $$0, dyk.b $$1, awt $$2, dxu $$3, float $$4, ib $$5, ib.a $$6) {
      if ($$6.k($$5) >= 7) {
         return false;
      } else {
         return $$2.i() > $$4 ? false : a($$0, $$1, $$2, $$3, $$6);
      }
   }

   protected static boolean a(cwk $$0, dyk.b $$1, awt $$2, dxu $$3, ib $$4) {
      if (!dwg.c($$0, $$4)) {
         return false;
      } else {
         dme $$5 = $$3.e.a($$2, $$4);
         if ($$5.b(dmu.C)) {
            $$5 = $$5.a(dmu.C, Boolean.valueOf($$0.b($$4, $$0x -> $$0x.a(ehs.c))));
         }

         $$1.a($$4, $$5);
         return true;
      }
   }

   public static final class a {
      private final ib a;
      private final int b;
      private final boolean c;

      public a(ib $$0, int $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ib a() {
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
      void a(ib var1, dme var2);

      boolean a(ib var1);
   }
}
