import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class ebu {
   public static final Codec<ebu> d = kt.W.q().dispatch(ebu::a, ebv::a);
   protected final bnk e;
   protected final bnk f;

   protected static <P extends ebu> P2<Mu<P>, bnk, bnk> b(Instance<P> $$0) {
      return $$0.group(bnk.b(0, 16).fieldOf("radius").forGetter($$0x -> $$0x.e), bnk.b(0, 16).fieldOf("offset").forGetter($$0x -> $$0x.f));
   }

   public ebu(bnk $$0, bnk $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   protected abstract ebv<?> a();

   public void a(czm $$0, ebu.b $$1, axt $$2, ebe $$3, int $$4, ebu.a $$5, int $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
   }

   protected abstract void a(czm var1, ebu.b var2, axt var3, ebe var4, int var5, ebu.a var6, int var7, int var8, int var9);

   public abstract int a(axt var1, int var2, ebe var3);

   public int a(axt $$0, int $$1) {
      return this.e.a($$0);
   }

   private int a(axt $$0) {
      return this.f.a($$0);
   }

   protected abstract boolean a(axt var1, int var2, int var3, int var4, int var5, boolean var6);

   protected boolean b(axt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
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

   protected void a(czm $$0, ebu.b $$1, axt $$2, ebe $$3, id $$4, int $$5, int $$6, boolean $$7) {
      int $$8 = $$7 ? 1 : 0;
      id.a $$9 = new id.a();

      for (int $$10 = -$$5; $$10 <= $$5 + $$8; $$10++) {
         for (int $$11 = -$$5; $$11 <= $$5 + $$8; $$11++) {
            if (!this.b($$2, $$10, $$6, $$11, $$5, $$7)) {
               $$9.a($$4, $$10, $$6, $$11);
               a($$0, $$1, $$2, $$3, $$9);
            }
         }
      }
   }

   protected final void a(czm $$0, ebu.b $$1, axt $$2, ebe $$3, id $$4, int $$5, int $$6, boolean $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      int $$10 = $$7 ? 1 : 0;
      id $$11 = $$4.d();
      id.a $$12 = new id.a();

      for (ij $$13 : ij.c.a) {
         ij $$14 = $$13.h();
         int $$15 = $$14.f() == ij.b.a ? $$5 + $$10 : $$5;
         $$12.a($$4, 0, $$6 - 1, 0).c($$14, $$15).c($$13, -$$5);
         int $$16 = -$$5;

         while ($$16 < $$5 + $$10) {
            boolean $$17 = $$1.a($$12.c(ij.b));
            $$12.c(ij.a);
            if ($$17 && a($$0, $$1, $$2, $$3, $$8, $$11, $$12)) {
               $$12.c(ij.a);
               a($$0, $$1, $$2, $$3, $$9, $$11, $$12);
               $$12.c(ij.b);
            }

            $$16++;
            $$12.c($$13);
         }
      }
   }

   private static boolean a(czm $$0, ebu.b $$1, axt $$2, ebe $$3, float $$4, id $$5, id.a $$6) {
      if ($$6.k($$5) >= 7) {
         return false;
      } else {
         return $$2.i() > $$4 ? false : a($$0, $$1, $$2, $$3, $$6);
      }
   }

   protected static boolean a(czm $$0, ebu.b $$1, axt $$2, ebe $$3, id $$4) {
      if (!dzq.c($$0, $$4)) {
         return false;
      } else {
         dpi $$5 = $$3.e.a($$2, $$4);
         if ($$5.b(dpy.C)) {
            $$5 = $$5.a(dpy.C, Boolean.valueOf($$0.b($$4, $$0x -> $$0x.a(elc.c))));
         }

         $$1.a($$4, $$5);
         return true;
      }
   }

   public static final class a {
      private final id a;
      private final int b;
      private final boolean c;

      public a(id $$0, int $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public id a() {
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
      void a(id var1, dpi var2);

      boolean a(id var1);
   }
}
