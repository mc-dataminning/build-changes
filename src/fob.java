import com.google.common.collect.Lists;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fob {
   private static final float f = 0.01F;
   public static final float a = 0.03F;
   public static final int b = 0;
   public static final int c = 8;
   public final int d = 9;
   public final azh e = azh.a();
   private final Function<aku, frk> g;
   final boolean h;
   private final flt i;

   public fob(Function<aku, frk> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      this.i = new flt(($$0x, $$1x) -> this.a($$1x.l()).a($$0x, this.h).a($$1x.c()));
   }

   frk a(aku $$0) {
      return this.g.apply($$0);
   }

   public String a(String $$0) {
      try {
         Bidi $$1 = new Bidi(new ArabicShaping(8).shape($$0), 127);
         $$1.setReorderingMode(0);
         return $$1.writeReordered(2);
      } catch (ArabicShapingException var3) {
         return $$0;
      }
   }

   public int a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glx $$6, fob.a $$7, int $$8, int $$9) {
      if (this.a()) {
         $$0 = this.a($$0);
      }

      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, true);
   }

   public int a(wo $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glx $$6, fob.a $$7, int $$8, int $$9) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, true);
   }

   public int a(wo $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glx $$6, fob.a $$7, int $$8, int $$9, boolean $$10) {
      return this.a($$0.g(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
   }

   public int a(ayl $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glx $$6, fob.a $$7, int $$8, int $$9) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, true);
   }

   public void a(ayl $$0, float $$1, float $$2, int $$3, int $$4, Matrix4f $$5, glx $$6, int $$7) {
      int $$8 = a($$4);
      fob.b $$9 = new fob.b(this, $$6, 0.0F, 0.0F, $$8, false, $$5, fob.a.a, $$7);

      for (int $$10 = -1; $$10 <= 1; $$10++) {
         for (int $$11 = -1; $$11 <= 1; $$11++) {
            if ($$10 != 0 || $$11 != 0) {
               float[] $$12 = new float[]{$$1};
               int $$13 = $$10;
               int $$14 = $$11;
               $$0.accept(($$6x, $$7x, $$8x) -> {
                  boolean $$9x = $$7x.c();
                  frk $$10x = this.a($$7x.l());
                  fds $$11x = $$10x.a($$8x, this.h);
                  $$9.j = $$12[0] + (float)$$13 * $$11x.b();
                  $$9.k = $$2 + (float)$$14 * $$11x.b();
                  $$12[0] += $$11x.a($$9x);
                  return $$9.accept($$6x, $$7x.a($$8), $$8x);
               });
            }
         }
      }

      $$9.a();
      fob.b $$15 = new fob.b(this, $$6, $$1, $$2, a($$3), false, $$5, fob.a.c, $$7);
      $$0.accept($$15);
      $$15.a($$1);
   }

   private static int a(int $$0) {
      return ($$0 & -67108864) == 0 ? axk.f($$0) : $$0;
   }

   private int a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glx $$6, fob.a $$7, int $$8, int $$9, boolean $$10) {
      $$3 = a($$3);
      $$1 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
      return (int)$$1 + ($$4 ? 1 : 0);
   }

   private int a(ayl $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glx $$6, fob.a $$7, int $$8, int $$9, boolean $$10) {
      $$3 = a($$3);
      $$1 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
      return (int)$$1 + ($$4 ? 1 : 0);
   }

   private float b(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glx $$6, fob.a $$7, int $$8, int $$9, boolean $$10) {
      fob.b $$11 = new fob.b(this, $$6, $$1, $$2, $$3, $$8, $$4, $$5, $$7, $$9, $$10);
      azu.c($$0, xl.a, $$11);
      return $$11.a($$1);
   }

   private float b(ayl $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, glx $$6, fob.a $$7, int $$8, int $$9, boolean $$10) {
      fob.b $$11 = new fob.b(this, $$6, $$1, $$2, $$3, $$8, $$4, $$5, $$7, $$9, $$10);
      $$0.accept($$11);
      return $$11.a($$1);
   }

   public int b(String $$0) {
      return ayz.f(this.i.a($$0));
   }

   public int a(wt $$0) {
      return ayz.f(this.i.a($$0));
   }

   public int a(ayl $$0) {
      return ayz.f(this.i.a($$0));
   }

   public String a(String $$0, int $$1, boolean $$2) {
      return $$2 ? this.i.c($$0, $$1, xl.a) : this.i.b($$0, $$1, xl.a);
   }

   public String a(String $$0, int $$1) {
      return this.i.b($$0, $$1, xl.a);
   }

   public wt a(wt $$0, int $$1) {
      return this.i.a($$0, $$1, xl.a);
   }

   public int b(String $$0, int $$1) {
      return 9 * this.i.g($$0, $$1, xl.a).size();
   }

   public int b(wt $$0, int $$1) {
      return 9 * this.i.b($$0, $$1, xl.a).size();
   }

   public List<ayl> c(wt $$0, int $$1) {
      return tl.a().a(this.i.b($$0, $$1, xl.a));
   }

   public boolean a() {
      return tl.a().b();
   }

   public flt b() {
      return this.i;
   }

   public static enum a {
      a,
      b,
      c;
   }

   class b implements aym {
      final glx a;
      private final boolean c;
      private final int d;
      private final int e;
      private final Matrix4f f;
      private final fob.a g;
      private final int h;
      private final boolean i;
      float j;
      float k;
      private final List<fro.b> l;
      @Nullable
      private List<fro.a> m;

      private void a(fro.a $$0) {
         if (this.m == null) {
            this.m = Lists.newArrayList();
         }

         this.m.add($$0);
      }

      public b(
         final fob param1,
         final glx $$0,
         final float $$1,
         final float $$2,
         final int $$3,
         final boolean $$4,
         final Matrix4f $$5,
         final fob.a $$6,
         final int $$7
      ) {
         this(var1, $$0, $$1, $$2, $$3, 0, $$4, $$5, $$6, $$7, true);
      }

      public b(
         final fob param1,
         final glx $$0,
         final float $$1,
         final float $$2,
         final int $$3,
         final int $$4,
         final boolean $$5,
         final Matrix4f $$6,
         final fob.a $$7,
         final int $$8,
         final boolean $$9
      ) {
         this.b = var1;
         this.l = new ArrayList<>();
         this.a = $$0;
         this.j = $$1;
         this.k = $$2;
         this.c = $$5;
         this.d = $$3;
         this.e = $$4;
         this.f = $$6;
         this.g = $$7;
         this.h = $$8;
         this.i = $$9;
      }

      @Override
      public boolean accept(int $$0, xl $$1, int $$2) {
         frk $$3 = this.b.a($$1.l());
         fds $$4 = $$3.a($$2, this.b.h);
         fro $$5 = $$1.g() && $$2 != 32 ? $$3.a($$4) : $$3.a($$2);
         boolean $$6 = $$1.c();
         xn $$7 = $$1.a();
         int $$8 = this.a($$7);
         int $$9 = this.a($$1, $$8);
         float $$10 = $$4.a($$6);
         float $$11 = $$0 == 0 ? this.j - 1.0F : this.j;
         float $$12 = $$4.b();
         if (!($$5 instanceof frp)) {
            float $$13 = $$6 ? $$4.a() : 0.0F;
            this.l.add(new fro.b(this.j, this.k, $$8, $$9, $$5, $$1, $$13, $$12));
         }

         if ($$1.e()) {
            this.a(new fro.a($$11, this.k + 4.5F, this.j + $$10, this.k + 4.5F - 1.0F, this.b(), $$8, $$9, $$12));
         }

         if ($$1.f()) {
            this.a(new fro.a($$11, this.k + 9.0F, this.j + $$10, this.k + 9.0F - 1.0F, this.b(), $$8, $$9, $$12));
         }

         this.j += $$10;
         return true;
      }

      float a(float $$0) {
         fro $$1 = null;
         if (this.e != 0) {
            fro.a $$2 = new fro.a($$0 - 1.0F, this.k + 9.0F, this.j, this.k - 1.0F, this.c(), this.e);
            $$1 = this.b.a(xl.b).b();
            ffy $$3 = this.a.getBuffer($$1.a(this.g));
            $$1.a($$2, this.f, $$3, this.h);
         }

         this.a();
         if (this.m != null) {
            if ($$1 == null) {
               $$1 = this.b.a(xl.b).b();
            }

            ffy $$4 = this.a.getBuffer($$1.a(this.g));

            for (fro.a $$5 : this.m) {
               $$1.a($$5, this.f, $$4, this.h);
            }
         }

         return this.j;
      }

      private int a(@Nullable xn $$0) {
         if ($$0 != null) {
            int $$1 = axk.a(this.d);
            int $$2 = $$0.a();
            return axk.c($$1, $$2);
         } else {
            return this.d;
         }
      }

      private int a(xl $$0, int $$1) {
         Integer $$2 = $$0.b();
         if ($$2 != null) {
            float $$3 = axk.i($$1);
            float $$4 = axk.i($$2);
            return $$3 != 1.0F ? axk.c(axk.b($$3 * $$4), $$2) : $$2;
         } else {
            return this.c ? axk.a($$1, 0.25F) : 0;
         }
      }

      void a() {
         for (fro.b $$0 : this.l) {
            fro $$1 = $$0.e();
            ffy $$2 = this.a.getBuffer($$1.a(this.g));
            $$1.a($$0, this.f, $$2, this.h);
         }
      }

      private float b() {
         return this.i ? 0.01F : -0.01F;
      }

      private float c() {
         return this.i ? -0.01F : 0.01F;
      }
   }
}
