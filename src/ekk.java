import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class ekk {
   public static final Codec<ekk> d = mb.U.q().dispatch(ekk::a, ekl::a);
   protected final bsd e;
   protected final bsd f;

   protected static <P extends ekk> P2<Mu<P>, bsd, bsd> b(Instance<P> $$0) {
      return $$0.group(bsd.b(0, 16).fieldOf("radius").forGetter($$0x -> $$0x.e), bsd.b(0, 16).fieldOf("offset").forGetter($$0x -> $$0x.f));
   }

   public ekk(bsd $$0, bsd $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   protected abstract ekl<?> a();

   public void a(dhf $$0, ekk.b $$1, azh $$2, eju $$3, int $$4, ekk.a $$5, int $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
   }

   protected abstract void a(dhf var1, ekk.b var2, azh var3, eju var4, int var5, ekk.a var6, int var7, int var8, int var9);

   public abstract int a(azh var1, int var2, eju var3);

   public int a(azh $$0, int $$1) {
      return this.e.a($$0);
   }

   private int a(azh $$0) {
      return this.f.a($$0);
   }

   protected abstract boolean a(azh var1, int var2, int var3, int var4, int var5, boolean var6);

   protected boolean b(azh $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
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

   protected void a(dhf $$0, ekk.b $$1, azh $$2, eju $$3, ji $$4, int $$5, int $$6, boolean $$7) {
      int $$8 = $$7 ? 1 : 0;
      ji.a $$9 = new ji.a();

      for (int $$10 = -$$5; $$10 <= $$5 + $$8; $$10++) {
         for (int $$11 = -$$5; $$11 <= $$5 + $$8; $$11++) {
            if (!this.b($$2, $$10, $$6, $$11, $$5, $$7)) {
               $$9.a($$4, $$10, $$6, $$11);
               a($$0, $$1, $$2, $$3, $$9);
            }
         }
      }
   }

   protected final void a(dhf $$0, ekk.b $$1, azh $$2, eju $$3, ji $$4, int $$5, int $$6, boolean $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      int $$10 = $$7 ? 1 : 0;
      ji $$11 = $$4.e();
      ji.a $$12 = new ji.a();

      for (jn $$13 : jn.c.a) {
         jn $$14 = $$13.h();
         int $$15 = $$14.f() == jn.b.a ? $$5 + $$10 : $$5;
         $$12.a($$4, 0, $$6 - 1, 0).c($$14, $$15).c($$13, -$$5);
         int $$16 = -$$5;

         while ($$16 < $$5 + $$10) {
            boolean $$17 = $$1.a($$12.c(jn.b));
            $$12.c(jn.a);
            if ($$17 && a($$0, $$1, $$2, $$3, $$8, $$11, $$12)) {
               $$12.c(jn.a);
               a($$0, $$1, $$2, $$3, $$9, $$11, $$12);
               $$12.c(jn.b);
            }

            $$16++;
            $$12.c($$13);
         }
      }
   }

   private static boolean a(dhf $$0, ekk.b $$1, azh $$2, eju $$3, float $$4, ji $$5, ji.a $$6) {
      if ($$6.k($$5) >= 7) {
         return false;
      } else {
         return $$2.i() > $$4 ? false : a($$0, $$1, $$2, $$3, $$6);
      }
   }

   protected static boolean a(dhf $$0, ekk.b $$1, azh $$2, eju $$3, ji $$4) {
      boolean $$5 = $$0.a($$4, $$0x -> $$0x.a(dyg.z, Boolean.valueOf(false)));
      if (!$$5 && eig.d($$0, $$4)) {
         dxq $$6 = $$3.e.a($$2, $$4);
         if ($$6.b(dyg.I)) {
            $$6 = $$6.b(dyg.I, Boolean.valueOf($$0.b($$4, $$0x -> $$0x.a(etx.c))));
         }

         $$1.a($$4, $$6);
         return true;
      } else {
         return false;
      }
   }

   public static final class a {
      private final ji a;
      private final int b;
      private final boolean c;

      public a(ji $$0, int $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ji a() {
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
      void a(ji var1, dxq var2);

      boolean a(ji var1);
   }
}
