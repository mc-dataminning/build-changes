import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class emj {
   public static final Codec<emj> d = mf.U.q().dispatch(emj::a, emk::a);
   protected final btd e;
   protected final btd f;

   protected static <P extends emj> P2<Mu<P>, btd, btd> b(Instance<P> $$0) {
      return $$0.group(btd.b(0, 16).fieldOf("radius").forGetter($$0x -> $$0x.e), btd.b(0, 16).fieldOf("offset").forGetter($$0x -> $$0x.f));
   }

   public emj(btd $$0, btd $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   protected abstract emk<?> a();

   public void a(div $$0, emj.b $$1, azt $$2, elt $$3, int $$4, emj.a $$5, int $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
   }

   protected abstract void a(div var1, emj.b var2, azt var3, elt var4, int var5, emj.a var6, int var7, int var8, int var9);

   public abstract int a(azt var1, int var2, elt var3);

   public int a(azt $$0, int $$1) {
      return this.e.a($$0);
   }

   private int a(azt $$0) {
      return this.f.a($$0);
   }

   protected abstract boolean a(azt var1, int var2, int var3, int var4, int var5, boolean var6);

   protected boolean b(azt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
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

   protected void a(div $$0, emj.b $$1, azt $$2, elt $$3, iu $$4, int $$5, int $$6, boolean $$7) {
      int $$8 = $$7 ? 1 : 0;
      iu.a $$9 = new iu.a();

      for (int $$10 = -$$5; $$10 <= $$5 + $$8; $$10++) {
         for (int $$11 = -$$5; $$11 <= $$5 + $$8; $$11++) {
            if (!this.b($$2, $$10, $$6, $$11, $$5, $$7)) {
               $$9.a($$4, $$10, $$6, $$11);
               a($$0, $$1, $$2, $$3, $$9);
            }
         }
      }
   }

   protected final void a(div $$0, emj.b $$1, azt $$2, elt $$3, iu $$4, int $$5, int $$6, boolean $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      int $$10 = $$7 ? 1 : 0;
      iu $$11 = $$4.e();
      iu.a $$12 = new iu.a();

      for (ja $$13 : ja.c.a) {
         ja $$14 = $$13.h();
         int $$15 = $$14.f() == ja.b.a ? $$5 + $$10 : $$5;
         $$12.a($$4, 0, $$6 - 1, 0).c($$14, $$15).c($$13, -$$5);
         int $$16 = -$$5;

         while ($$16 < $$5 + $$10) {
            boolean $$17 = $$1.a($$12.c(ja.b));
            $$12.c(ja.a);
            if ($$17 && a($$0, $$1, $$2, $$3, $$8, $$11, $$12)) {
               $$12.c(ja.a);
               a($$0, $$1, $$2, $$3, $$9, $$11, $$12);
               $$12.c(ja.b);
            }

            $$16++;
            $$12.c($$13);
         }
      }
   }

   private static boolean a(div $$0, emj.b $$1, azt $$2, elt $$3, float $$4, iu $$5, iu.a $$6) {
      if ($$6.k($$5) >= 7) {
         return false;
      } else {
         return $$2.i() > $$4 ? false : a($$0, $$1, $$2, $$3, $$6);
      }
   }

   protected static boolean a(div $$0, emj.b $$1, azt $$2, elt $$3, iu $$4) {
      boolean $$5 = $$0.a($$4, $$0x -> $$0x.a(eae.z, Boolean.valueOf(false)));
      if (!$$5 && ekf.d($$0, $$4)) {
         dzo $$6 = $$3.e.a($$2, $$4);
         if ($$6.b(eae.I)) {
            $$6 = $$6.b(eae.I, Boolean.valueOf($$0.b($$4, $$0x -> $$0x.a(evw.c))));
         }

         $$1.a($$4, $$6);
         return true;
      } else {
         return false;
      }
   }

   public static final class a {
      private final iu a;
      private final int b;
      private final boolean c;

      public a(iu $$0, int $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public iu a() {
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
      void a(iu var1, dzo var2);

      boolean a(iu var1);
   }
}
