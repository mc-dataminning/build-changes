import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class efq {
   public static final Codec<efq> d = lt.U.r().dispatch(efq::a, efr::a);
   protected final bpv e;
   protected final bpv f;

   protected static <P extends efq> P2<Mu<P>, bpv, bpv> b(Instance<P> $$0) {
      return $$0.group(bpv.b(0, 16).fieldOf("radius").forGetter($$0x -> $$0x.e), bpv.b(0, 16).fieldOf("offset").forGetter($$0x -> $$0x.f));
   }

   public efq(bpv $$0, bpv $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   protected abstract efr<?> a();

   public void a(dda $$0, efq.b $$1, ayv $$2, efa $$3, int $$4, efq.a $$5, int $$6, int $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$2));
   }

   protected abstract void a(dda var1, efq.b var2, ayv var3, efa var4, int var5, efq.a var6, int var7, int var8, int var9);

   public abstract int a(ayv var1, int var2, efa var3);

   public int a(ayv $$0, int $$1) {
      return this.e.a($$0);
   }

   private int a(ayv $$0) {
      return this.f.a($$0);
   }

   protected abstract boolean a(ayv var1, int var2, int var3, int var4, int var5, boolean var6);

   protected boolean b(ayv $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
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

   protected void a(dda $$0, efq.b $$1, ayv $$2, efa $$3, jd $$4, int $$5, int $$6, boolean $$7) {
      int $$8 = $$7 ? 1 : 0;
      jd.a $$9 = new jd.a();

      for (int $$10 = -$$5; $$10 <= $$5 + $$8; $$10++) {
         for (int $$11 = -$$5; $$11 <= $$5 + $$8; $$11++) {
            if (!this.b($$2, $$10, $$6, $$11, $$5, $$7)) {
               $$9.a($$4, $$10, $$6, $$11);
               a($$0, $$1, $$2, $$3, $$9);
            }
         }
      }
   }

   protected final void a(dda $$0, efq.b $$1, ayv $$2, efa $$3, jd $$4, int $$5, int $$6, boolean $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      int $$10 = $$7 ? 1 : 0;
      jd $$11 = $$4.d();
      jd.a $$12 = new jd.a();

      for (ji $$13 : ji.c.a) {
         ji $$14 = $$13.h();
         int $$15 = $$14.f() == ji.b.a ? $$5 + $$10 : $$5;
         $$12.a($$4, 0, $$6 - 1, 0).c($$14, $$15).c($$13, -$$5);
         int $$16 = -$$5;

         while ($$16 < $$5 + $$10) {
            boolean $$17 = $$1.a($$12.c(ji.b));
            $$12.c(ji.a);
            if ($$17 && a($$0, $$1, $$2, $$3, $$8, $$11, $$12)) {
               $$12.c(ji.a);
               a($$0, $$1, $$2, $$3, $$9, $$11, $$12);
               $$12.c(ji.b);
            }

            $$16++;
            $$12.c($$13);
         }
      }
   }

   private static boolean a(dda $$0, efq.b $$1, ayv $$2, efa $$3, float $$4, jd $$5, jd.a $$6) {
      if ($$6.k($$5) >= 7) {
         return false;
      } else {
         return $$2.i() > $$4 ? false : a($$0, $$1, $$2, $$3, $$6);
      }
   }

   protected static boolean a(dda $$0, efq.b $$1, ayv $$2, efa $$3, jd $$4) {
      if (!edm.c($$0, $$4)) {
         return false;
      } else {
         dta $$5 = $$3.e.a($$2, $$4);
         if ($$5.b(dtq.C)) {
            $$5 = $$5.a(dtq.C, Boolean.valueOf($$0.b($$4, $$0x -> $$0x.a(eoz.c))));
         }

         $$1.a($$4, $$5);
         return true;
      }
   }

   public static final class a {
      private final jd a;
      private final int b;
      private final boolean c;

      public a(jd $$0, int $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public jd a() {
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
      void a(jd var1, dta var2);

      boolean a(jd var1);
   }
}
