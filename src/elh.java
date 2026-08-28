import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class elh {
   public static final Codec<elh> d = md.U.q().dispatch(elh::a, eli::a);
   protected final bsv e;
   protected final bsv f;

   protected static <P extends elh> P2<Mu<P>, bsv, bsv> b(Instance<P> $$0) {
      return $$0.group(bsv.b(0, 16).fieldOf("radius").forGetter($$0x -> $$0x.e), bsv.b(0, 16).fieldOf("offset").forGetter($$0x -> $$0x.f));
   }

   public elh(bsv $$0, bsv $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   protected abstract eli<?> a();

   public void a(dhv $$0, elh.b $$1, azs $$2, ekr $$3, int $$4, elh.a $$5, int $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
   }

   protected abstract void a(dhv var1, elh.b var2, azs var3, ekr var4, int var5, elh.a var6, int var7, int var8, int var9);

   public abstract int a(azs var1, int var2, ekr var3);

   public int a(azs $$0, int $$1) {
      return this.e.a($$0);
   }

   private int a(azs $$0) {
      return this.f.a($$0);
   }

   protected abstract boolean a(azs var1, int var2, int var3, int var4, int var5, boolean var6);

   protected boolean b(azs $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
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

   protected void a(dhv $$0, elh.b $$1, azs $$2, ekr $$3, jj $$4, int $$5, int $$6, boolean $$7) {
      int $$8 = $$7 ? 1 : 0;
      jj.a $$9 = new jj.a();

      for (int $$10 = -$$5; $$10 <= $$5 + $$8; $$10++) {
         for (int $$11 = -$$5; $$11 <= $$5 + $$8; $$11++) {
            if (!this.b($$2, $$10, $$6, $$11, $$5, $$7)) {
               $$9.a($$4, $$10, $$6, $$11);
               a($$0, $$1, $$2, $$3, $$9);
            }
         }
      }
   }

   protected final void a(dhv $$0, elh.b $$1, azs $$2, ekr $$3, jj $$4, int $$5, int $$6, boolean $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      int $$10 = $$7 ? 1 : 0;
      jj $$11 = $$4.e();
      jj.a $$12 = new jj.a();

      for (jo $$13 : jo.c.a) {
         jo $$14 = $$13.h();
         int $$15 = $$14.f() == jo.b.a ? $$5 + $$10 : $$5;
         $$12.a($$4, 0, $$6 - 1, 0).c($$14, $$15).c($$13, -$$5);
         int $$16 = -$$5;

         while ($$16 < $$5 + $$10) {
            boolean $$17 = $$1.a($$12.c(jo.b));
            $$12.c(jo.a);
            if ($$17 && a($$0, $$1, $$2, $$3, $$8, $$11, $$12)) {
               $$12.c(jo.a);
               a($$0, $$1, $$2, $$3, $$9, $$11, $$12);
               $$12.c(jo.b);
            }

            $$16++;
            $$12.c($$13);
         }
      }
   }

   private static boolean a(dhv $$0, elh.b $$1, azs $$2, ekr $$3, float $$4, jj $$5, jj.a $$6) {
      if ($$6.k($$5) >= 7) {
         return false;
      } else {
         return $$2.i() > $$4 ? false : a($$0, $$1, $$2, $$3, $$6);
      }
   }

   protected static boolean a(dhv $$0, elh.b $$1, azs $$2, ekr $$3, jj $$4) {
      boolean $$5 = $$0.a($$4, $$0x -> $$0x.a(dzc.z, Boolean.valueOf(false)));
      if (!$$5 && ejd.d($$0, $$4)) {
         dym $$6 = $$3.e.a($$2, $$4);
         if ($$6.b(dzc.I)) {
            $$6 = $$6.b(dzc.I, Boolean.valueOf($$0.b($$4, $$0x -> $$0x.a(euu.c))));
         }

         $$1.a($$4, $$6);
         return true;
      } else {
         return false;
      }
   }

   public static final class a {
      private final jj a;
      private final int b;
      private final boolean c;

      public a(jj $$0, int $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public jj a() {
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
      void a(jj var1, dym var2);

      boolean a(jj var1);
   }
}
