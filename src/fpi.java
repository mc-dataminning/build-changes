import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class fpi {
   public static final int a = 8;
   private static final float d = 1.0F / (float)Math.cos((float) (Math.PI / 8)) - 1.0F;
   private static final float e = 1.0F / (float)Math.cos((float) (Math.PI / 4)) - 1.0F;
   public static final int b = 4;
   private static final int f = 3;
   public static final int c = 4;

   public fpb a(Vector3f $$0, Vector3f $$1, fpd $$2, fze $$3, ha $$4, gbn $$5, @Nullable fpe $$6, boolean $$7, aew $$8) {
      fpf $$9 = $$2.e;
      if ($$5.c()) {
         $$9 = a($$2.e, $$4, $$5.b(), $$8);
      }

      float[] $$10 = new float[$$9.a.length];
      System.arraycopy($$9.a, 0, $$10, 0, $$10.length);
      float $$11 = $$3.k();
      float $$12 = ($$9.a[0] + $$9.a[0] + $$9.a[2] + $$9.a[2]) / 4.0F;
      float $$13 = ($$9.a[1] + $$9.a[1] + $$9.a[3] + $$9.a[3]) / 4.0F;
      $$9.a[0] = arw.i($$11, $$9.a[0], $$12);
      $$9.a[2] = arw.i($$11, $$9.a[2], $$12);
      $$9.a[1] = arw.i($$11, $$9.a[1], $$13);
      $$9.a[3] = arw.i($$11, $$9.a[3], $$13);
      int[] $$14 = this.a($$9, $$3, $$4, this.a($$0, $$1), $$5.b(), $$6, $$7);
      ha $$15 = a($$14);
      System.arraycopy($$10, 0, $$9.a, 0, $$10.length);
      if ($$6 == null) {
         this.a($$14, $$15);
      }

      return new fpb($$14, $$2.c, $$15, $$3, $$7);
   }

   public static fpf a(fpf $$0, ha $$1, j $$2, aew $$3) {
      Matrix4f $$4 = gv.a($$2, $$1, () -> "Unable to resolve UVLock for model: " + $$3).c();
      float $$5 = $$0.a($$0.c(0));
      float $$6 = $$0.b($$0.c(0));
      Vector4f $$7 = $$4.transform(new Vector4f($$5 / 16.0F, $$6 / 16.0F, 0.0F, 1.0F));
      float $$8 = 16.0F * $$7.x();
      float $$9 = 16.0F * $$7.y();
      float $$10 = $$0.a($$0.c(2));
      float $$11 = $$0.b($$0.c(2));
      Vector4f $$12 = $$4.transform(new Vector4f($$10 / 16.0F, $$11 / 16.0F, 0.0F, 1.0F));
      float $$13 = 16.0F * $$12.x();
      float $$14 = 16.0F * $$12.y();
      float $$15;
      float $$16;
      if (Math.signum($$10 - $$5) == Math.signum($$13 - $$8)) {
         $$15 = $$8;
         $$16 = $$13;
      } else {
         $$15 = $$13;
         $$16 = $$8;
      }

      float $$19;
      float $$20;
      if (Math.signum($$11 - $$6) == Math.signum($$14 - $$9)) {
         $$19 = $$9;
         $$20 = $$14;
      } else {
         $$19 = $$14;
         $$20 = $$9;
      }

      float $$23 = (float)Math.toRadians((double)$$0.b);
      Matrix3f $$24 = new Matrix3f($$4);
      Vector3f $$25 = $$24.transform(new Vector3f(arw.b($$23), arw.a($$23), 0.0F));
      int $$26 = Math.floorMod(-((int)Math.round(Math.toDegrees(Math.atan2((double)$$25.y(), (double)$$25.x())) / 90.0)) * 90, 360);
      return new fpf(new float[]{$$15, $$19, $$16, $$20}, $$26);
   }

   private int[] a(fpf $$0, fze $$1, ha $$2, float[] $$3, j $$4, @Nullable fpe $$5, boolean $$6) {
      int[] $$7 = new int[32];

      for (int $$8 = 0; $$8 < 4; $$8++) {
         this.a($$7, $$8, $$2, $$0, $$3, $$1, $$4, $$5, $$6);
      }

      return $$7;
   }

   private float[] a(Vector3f $$0, Vector3f $$1) {
      float[] $$2 = new float[ha.values().length];
      $$2[fnv.a.f] = $$0.x() / 16.0F;
      $$2[fnv.a.e] = $$0.y() / 16.0F;
      $$2[fnv.a.d] = $$0.z() / 16.0F;
      $$2[fnv.a.c] = $$1.x() / 16.0F;
      $$2[fnv.a.b] = $$1.y() / 16.0F;
      $$2[fnv.a.a] = $$1.z() / 16.0F;
      return $$2;
   }

   private void a(int[] $$0, int $$1, ha $$2, fpf $$3, float[] $$4, fze $$5, j $$6, @Nullable fpe $$7, boolean $$8) {
      fnv.b $$9 = fnv.a($$2).a($$1);
      Vector3f $$10 = new Vector3f($$4[$$9.a], $$4[$$9.b], $$4[$$9.c]);
      this.a($$10, $$7);
      this.a($$10, $$6);
      this.a($$0, $$1, $$10, $$5, $$3);
   }

   private void a(int[] $$0, int $$1, Vector3f $$2, fze $$3, fpf $$4) {
      int $$5 = $$1 * 8;
      $$0[$$5] = Float.floatToRawIntBits($$2.x());
      $$0[$$5 + 1] = Float.floatToRawIntBits($$2.y());
      $$0[$$5 + 2] = Float.floatToRawIntBits($$2.z());
      $$0[$$5 + 3] = -1;
      $$0[$$5 + 4] = Float.floatToRawIntBits($$3.a($$4.a($$1) / 16.0F));
      $$0[$$5 + 4 + 1] = Float.floatToRawIntBits($$3.c($$4.b($$1) / 16.0F));
   }

   private void a(Vector3f $$0, @Nullable fpe $$1) {
      if ($$1 != null) {
         Vector3f $$2;
         Vector3f $$3;
         switch ($$1.b()) {
            case a:
               $$2 = new Vector3f(1.0F, 0.0F, 0.0F);
               $$3 = new Vector3f(0.0F, 1.0F, 1.0F);
               break;
            case b:
               $$2 = new Vector3f(0.0F, 1.0F, 0.0F);
               $$3 = new Vector3f(1.0F, 0.0F, 1.0F);
               break;
            case c:
               $$2 = new Vector3f(0.0F, 0.0F, 1.0F);
               $$3 = new Vector3f(1.0F, 1.0F, 0.0F);
               break;
            default:
               throw new IllegalArgumentException("There are only 3 axes");
         }

         Quaternionf $$10 = new Quaternionf().rotationAxis($$1.c() * (float) (Math.PI / 180.0), $$2);
         if ($$1.d()) {
            if (Math.abs($$1.c()) == 22.5F) {
               $$3.mul(d);
            } else {
               $$3.mul(e);
            }

            $$3.add(1.0F, 1.0F, 1.0F);
         } else {
            $$3.set(1.0F, 1.0F, 1.0F);
         }

         this.a($$0, new Vector3f($$1.a()), new Matrix4f().rotation($$10), $$3);
      }
   }

   public void a(Vector3f $$0, j $$1) {
      if ($$1 != j.a()) {
         this.a($$0, new Vector3f(0.5F, 0.5F, 0.5F), $$1.c(), new Vector3f(1.0F, 1.0F, 1.0F));
      }
   }

   private void a(Vector3f $$0, Vector3f $$1, Matrix4f $$2, Vector3f $$3) {
      Vector4f $$4 = $$2.transform(new Vector4f($$0.x() - $$1.x(), $$0.y() - $$1.y(), $$0.z() - $$1.z(), 1.0F));
      $$4.mul(new Vector4f($$3, 1.0F));
      $$0.set($$4.x() + $$1.x(), $$4.y() + $$1.y(), $$4.z() + $$1.z());
   }

   public static ha a(int[] $$0) {
      Vector3f $$1 = new Vector3f(Float.intBitsToFloat($$0[0]), Float.intBitsToFloat($$0[1]), Float.intBitsToFloat($$0[2]));
      Vector3f $$2 = new Vector3f(Float.intBitsToFloat($$0[8]), Float.intBitsToFloat($$0[9]), Float.intBitsToFloat($$0[10]));
      Vector3f $$3 = new Vector3f(Float.intBitsToFloat($$0[16]), Float.intBitsToFloat($$0[17]), Float.intBitsToFloat($$0[18]));
      Vector3f $$4 = new Vector3f($$1).sub($$2);
      Vector3f $$5 = new Vector3f($$3).sub($$2);
      Vector3f $$6 = new Vector3f($$5).cross($$4).normalize();
      if (!$$6.isFinite()) {
         return ha.b;
      } else {
         ha $$7 = null;
         float $$8 = 0.0F;

         for (ha $$9 : ha.values()) {
            hy $$10 = $$9.q();
            Vector3f $$11 = new Vector3f((float)$$10.u(), (float)$$10.v(), (float)$$10.w());
            float $$12 = $$6.dot($$11);
            if ($$12 >= 0.0F && $$12 > $$8) {
               $$8 = $$12;
               $$7 = $$9;
            }
         }

         return $$7 == null ? ha.b : $$7;
      }
   }

   private void a(int[] $$0, ha $$1) {
      int[] $$2 = new int[$$0.length];
      System.arraycopy($$0, 0, $$2, 0, $$0.length);
      float[] $$3 = new float[ha.values().length];
      $$3[fnv.a.f] = 999.0F;
      $$3[fnv.a.e] = 999.0F;
      $$3[fnv.a.d] = 999.0F;
      $$3[fnv.a.c] = -999.0F;
      $$3[fnv.a.b] = -999.0F;
      $$3[fnv.a.a] = -999.0F;

      for (int $$4 = 0; $$4 < 4; $$4++) {
         int $$5 = 8 * $$4;
         float $$6 = Float.intBitsToFloat($$2[$$5]);
         float $$7 = Float.intBitsToFloat($$2[$$5 + 1]);
         float $$8 = Float.intBitsToFloat($$2[$$5 + 2]);
         if ($$6 < $$3[fnv.a.f]) {
            $$3[fnv.a.f] = $$6;
         }

         if ($$7 < $$3[fnv.a.e]) {
            $$3[fnv.a.e] = $$7;
         }

         if ($$8 < $$3[fnv.a.d]) {
            $$3[fnv.a.d] = $$8;
         }

         if ($$6 > $$3[fnv.a.c]) {
            $$3[fnv.a.c] = $$6;
         }

         if ($$7 > $$3[fnv.a.b]) {
            $$3[fnv.a.b] = $$7;
         }

         if ($$8 > $$3[fnv.a.a]) {
            $$3[fnv.a.a] = $$8;
         }
      }

      fnv $$9 = fnv.a($$1);

      for (int $$10 = 0; $$10 < 4; $$10++) {
         int $$11 = 8 * $$10;
         fnv.b $$12 = $$9.a($$10);
         float $$13 = $$3[$$12.a];
         float $$14 = $$3[$$12.b];
         float $$15 = $$3[$$12.c];
         $$0[$$11] = Float.floatToRawIntBits($$13);
         $$0[$$11 + 1] = Float.floatToRawIntBits($$14);
         $$0[$$11 + 2] = Float.floatToRawIntBits($$15);

         for (int $$16 = 0; $$16 < 4; $$16++) {
            int $$17 = 8 * $$16;
            float $$18 = Float.intBitsToFloat($$2[$$17]);
            float $$19 = Float.intBitsToFloat($$2[$$17 + 1]);
            float $$20 = Float.intBitsToFloat($$2[$$17 + 2]);
            if (arw.a($$13, $$18) && arw.a($$14, $$19) && arw.a($$15, $$20)) {
               $$0[$$11 + 4] = $$2[$$17 + 4];
               $$0[$$11 + 4 + 1] = $$2[$$17 + 4 + 1];
            }
         }
      }
   }
}
