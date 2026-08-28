import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class efb {
   public static final Codec<efb> d = lq.U.r().dispatch(efb::a, efc::a);
   protected final bpm e;
   protected final bpm f;

   protected static <P extends efb> P2<Mu<P>, bpm, bpm> b(Instance<P> $$0) {
      return $$0.group(bpm.b(0, 16).fieldOf("radius").forGetter($$0x -> $$0x.e), bpm.b(0, 16).fieldOf("offset").forGetter($$0x -> $$0x.f));
   }

   public efb(bpm $$0, bpm $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   protected abstract efc<?> a();

   public void a(dcm $$0, efb.b $$1, ayo $$2, eel $$3, int $$4, efb.a $$5, int $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
   }

   protected abstract void a(dcm var1, efb.b var2, ayo var3, eel var4, int var5, efb.a var6, int var7, int var8, int var9);

   public abstract int a(ayo var1, int var2, eel var3);

   public int a(ayo $$0, int $$1) {
      return this.e.a($$0);
   }

   private int a(ayo $$0) {
      return this.f.a($$0);
   }

   protected abstract boolean a(ayo var1, int var2, int var3, int var4, int var5, boolean var6);

   protected boolean b(ayo $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
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

   protected void a(dcm $$0, efb.b $$1, ayo $$2, eel $$3, ja $$4, int $$5, int $$6, boolean $$7) {
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

   protected final void a(dcm $$0, efb.b $$1, ayo $$2, eel $$3, ja $$4, int $$5, int $$6, boolean $$7, float $$8, float $$9) {
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

   private static boolean a(dcm $$0, efb.b $$1, ayo $$2, eel $$3, float $$4, ja $$5, ja.a $$6) {
      if ($$6.k($$5) >= 7) {
         return false;
      } else {
         return $$2.i() > $$4 ? false : a($$0, $$1, $$2, $$3, $$6);
      }
   }

   protected static boolean a(dcm $$0, efb.b $$1, ayo $$2, eel $$3, ja $$4) {
      if (!ecx.c($$0, $$4)) {
         return false;
      } else {
         dsl $$5 = $$3.e.a($$2, $$4);
         if ($$5.b(dtb.C)) {
            $$5 = $$5.a(dtb.C, Boolean.valueOf($$0.b($$4, $$0x -> $$0x.a(eok.c))));
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
      void a(ja var1, dsl var2);

      boolean a(ja var1);
   }
}
