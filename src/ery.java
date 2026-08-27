import com.google.common.collect.Lists;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class ery {
   private static final float d = 0.01F;
   private static final Vector3f e = new Vector3f(0.0F, 0.0F, 0.03F);
   public static final int a = 8;
   public final int b = 9;
   public final arx c = arx.a();
   private final Function<aeu, euz> f;
   final boolean g;
   private final erc h;

   public ery(Function<aeu, euz> $$0, boolean $$1) {
      this.f = $$0;
      this.g = $$1;
      this.h = new erc(($$0x, $$1x) -> this.a($$1x.k()).a($$0x, this.g).a($$1x.b()));
   }

   euz a(aeu $$0) {
      return this.f.apply($$0);
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

   public int a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fnz $$6, ery.a $$7, int $$8, int $$9) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, this.a());
   }

   public int a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fnz $$6, ery.a $$7, int $$8, int $$9, boolean $$10) {
      return this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
   }

   public int a(ti $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fnz $$6, ery.a $$7, int $$8, int $$9) {
      return this.a($$0.f(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public int a(arf $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fnz $$6, ery.a $$7, int $$8, int $$9) {
      return this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public void a(arf $$0, float $$1, float $$2, int $$3, int $$4, Matrix4f $$5, fnz $$6, int $$7) {
      int $$8 = a($$4);
      ery.b $$9 = new ery.b($$6, 0.0F, 0.0F, $$8, false, $$5, ery.a.a, $$7);

      for (int $$10 = -1; $$10 <= 1; $$10++) {
         for (int $$11 = -1; $$11 <= 1; $$11++) {
            if ($$10 != 0 || $$11 != 0) {
               float[] $$12 = new float[]{$$1};
               int $$13 = $$10;
               int $$14 = $$11;
               $$0.accept(($$6x, $$7x, $$8x) -> {
                  boolean $$9x = $$7x.b();
                  euz $$10x = this.a($$7x.k());
                  ejm $$11x = $$10x.a($$8x, this.g);
                  $$9.l = $$12[0] + (float)$$13 * $$11x.b();
                  $$9.m = $$2 + (float)$$14 * $$11x.b();
                  $$12[0] += $$11x.a($$9x);
                  return $$9.accept($$6x, $$7x.a($$8), $$8x);
               });
            }
         }
      }

      ery.b $$15 = new ery.b($$6, $$1, $$2, a($$3), false, $$5, ery.a.c, $$7);
      $$0.accept($$15);
      $$15.a(0, $$1);
   }

   private static int a(int $$0) {
      return ($$0 & -67108864) == 0 ? $$0 | 0xFF000000 : $$0;
   }

   private int b(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fnz $$6, ery.a $$7, int $$8, int $$9, boolean $$10) {
      if ($$10) {
         $$0 = this.a($$0);
      }

      $$3 = a($$3);
      Matrix4f $$11 = new Matrix4f($$5);
      if ($$4) {
         this.b($$0, $$1, $$2, $$3, true, $$5, $$6, $$7, $$8, $$9);
         $$11.translate(e);
      }

      $$1 = this.b($$0, $$1, $$2, $$3, false, $$11, $$6, $$7, $$8, $$9);
      return (int)$$1 + ($$4 ? 1 : 0);
   }

   private int b(arf $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fnz $$6, ery.a $$7, int $$8, int $$9) {
      $$3 = a($$3);
      Matrix4f $$10 = new Matrix4f($$5);
      if ($$4) {
         this.c($$0, $$1, $$2, $$3, true, $$5, $$6, $$7, $$8, $$9);
         $$10.translate(e);
      }

      $$1 = this.c($$0, $$1, $$2, $$3, false, $$10, $$6, $$7, $$8, $$9);
      return (int)$$1 + ($$4 ? 1 : 0);
   }

   private float b(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fnz $$6, ery.a $$7, int $$8, int $$9) {
      ery.b $$10 = new ery.b($$6, $$1, $$2, $$3, $$4, $$5, $$7, $$9);
      asj.c($$0, ue.a, $$10);
      return $$10.a($$8, $$1);
   }

   private float c(arf $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, fnz $$6, ery.a $$7, int $$8, int $$9) {
      ery.b $$10 = new ery.b($$6, $$1, $$2, $$3, $$4, $$5, $$7, $$9);
      $$0.accept($$10);
      return $$10.a($$8, $$1);
   }

   void a(evd $$0, boolean $$1, boolean $$2, float $$3, float $$4, float $$5, Matrix4f $$6, elo $$7, float $$8, float $$9, float $$10, float $$11, int $$12) {
      $$0.a($$2, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12);
      if ($$1) {
         $$0.a($$2, $$4 + $$3, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   public int b(String $$0) {
      return ars.f(this.h.a($$0));
   }

   public int a(tm $$0) {
      return ars.f(this.h.a($$0));
   }

   public int a(arf $$0) {
      return ars.f(this.h.a($$0));
   }

   public String a(String $$0, int $$1, boolean $$2) {
      return $$2 ? this.h.c($$0, $$1, ue.a) : this.h.b($$0, $$1, ue.a);
   }

   public String a(String $$0, int $$1) {
      return this.h.b($$0, $$1, ue.a);
   }

   public tm a(tm $$0, int $$1) {
      return this.h.a($$0, $$1, ue.a);
   }

   public int b(String $$0, int $$1) {
      return 9 * this.h.g($$0, $$1, ue.a).size();
   }

   public int b(tm $$0, int $$1) {
      return 9 * this.h.b($$0, $$1, ue.a).size();
   }

   public List<arf> c(tm $$0, int $$1) {
      return qp.a().a(this.h.b($$0, $$1, ue.a));
   }

   public boolean a() {
      return qp.a().b();
   }

   public erc b() {
      return this.h;
   }

   public static enum a {
      a,
      b,
      c;
   }

   class b implements arg {
      final fnz a;
      private final boolean c;
      private final float d;
      private final float e;
      private final float f;
      private final float g;
      private final float h;
      private final Matrix4f i;
      private final ery.a j;
      private final int k;
      float l;
      float m;
      @Nullable
      private List<evd.a> n;

      private void a(evd.a $$0) {
         if (this.n == null) {
            this.n = Lists.newArrayList();
         }

         this.n.add($$0);
      }

      public b(fnz $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, ery.a $$6, int $$7) {
         this.a = $$0;
         this.l = $$1;
         this.m = $$2;
         this.c = $$4;
         this.d = $$4 ? 0.25F : 1.0F;
         this.e = (float)($$3 >> 16 & 0xFF) / 255.0F * this.d;
         this.f = (float)($$3 >> 8 & 0xFF) / 255.0F * this.d;
         this.g = (float)($$3 & 0xFF) / 255.0F * this.d;
         this.h = (float)($$3 >> 24 & 0xFF) / 255.0F;
         this.i = $$5;
         this.j = $$6;
         this.k = $$7;
      }

      @Override
      public boolean accept(int $$0, ue $$1, int $$2) {
         euz $$3 = ery.this.a($$1.k());
         ejm $$4 = $$3.a($$2, ery.this.g);
         evd $$5 = $$1.f() && $$2 != 32 ? $$3.a($$4) : $$3.a($$2);
         boolean $$6 = $$1.b();
         float $$7 = this.h;
         ug $$8 = $$1.a();
         float $$10;
         float $$11;
         float $$12;
         if ($$8 != null) {
            int $$9 = $$8.a();
            $$10 = (float)($$9 >> 16 & 0xFF) / 255.0F * this.d;
            $$11 = (float)($$9 >> 8 & 0xFF) / 255.0F * this.d;
            $$12 = (float)($$9 & 0xFF) / 255.0F * this.d;
         } else {
            $$10 = this.e;
            $$11 = this.f;
            $$12 = this.g;
         }

         if (!($$5 instanceof eve)) {
            float $$16 = $$6 ? $$4.a() : 0.0F;
            float $$17 = this.c ? $$4.b() : 0.0F;
            elo $$18 = this.a.getBuffer($$5.a(this.j));
            ery.this.a($$5, $$6, $$1.c(), $$16, this.l + $$17, this.m + $$17, this.i, $$18, $$10, $$11, $$12, $$7, this.k);
         }

         float $$19 = $$4.a($$6);
         float $$20 = this.c ? 1.0F : 0.0F;
         if ($$1.d()) {
            this.a(new evd.a(this.l + $$20 - 1.0F, this.m + $$20 + 4.5F, this.l + $$20 + $$19, this.m + $$20 + 4.5F - 1.0F, 0.01F, $$10, $$11, $$12, $$7));
         }

         if ($$1.e()) {
            this.a(new evd.a(this.l + $$20 - 1.0F, this.m + $$20 + 9.0F, this.l + $$20 + $$19, this.m + $$20 + 9.0F - 1.0F, 0.01F, $$10, $$11, $$12, $$7));
         }

         this.l += $$19;
         return true;
      }

      public float a(int $$0, float $$1) {
         if ($$0 != 0) {
            float $$2 = (float)($$0 >> 24 & 0xFF) / 255.0F;
            float $$3 = (float)($$0 >> 16 & 0xFF) / 255.0F;
            float $$4 = (float)($$0 >> 8 & 0xFF) / 255.0F;
            float $$5 = (float)($$0 & 0xFF) / 255.0F;
            this.a(new evd.a($$1 - 1.0F, this.m + 9.0F, this.l + 1.0F, this.m - 1.0F, 0.01F, $$3, $$4, $$5, $$2));
         }

         if (this.n != null) {
            evd $$6 = ery.this.a(ue.c).a();
            elo $$7 = this.a.getBuffer($$6.a(this.j));

            for (evd.a $$8 : this.n) {
               $$6.a($$8, this.i, $$7, this.k);
            }
         }

         return this.l;
      }
   }
}
