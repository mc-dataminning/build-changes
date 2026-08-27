import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public interface ein {
   ein a(double var1, double var3, double var5);

   ein a(int var1, int var2, int var3, int var4);

   ein a(float var1, float var2);

   ein a(int var1, int var2);

   ein b(int var1, int var2);

   ein a(float var1, float var2, float var3);

   void e();

   default void a(
      float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, int $$9, int $$10, float $$11, float $$12, float $$13
   ) {
      this.a((double)$$0, (double)$$1, (double)$$2);
      this.a($$3, $$4, $$5, $$6);
      this.a($$7, $$8);
      this.c($$9);
      this.b($$10);
      this.a($$11, $$12, $$13);
      this.e();
   }

   void b(int var1, int var2, int var3, int var4);

   void k();

   default ein a(float $$0, float $$1, float $$2, float $$3) {
      return this.a((int)($$0 * 255.0F), (int)($$1 * 255.0F), (int)($$2 * 255.0F), (int)($$3 * 255.0F));
   }

   default ein a(int $$0) {
      return this.a(aok.b.b($$0), aok.b.c($$0), aok.b.d($$0), aok.b.a($$0));
   }

   default ein b(int $$0) {
      return this.b($$0 & 65535, $$0 >> 16 & 65535);
   }

   default ein c(int $$0) {
      return this.a($$0 & 65535, $$0 >> 16 & 65535);
   }

   default void a(eij.a $$0, fkr $$1, float $$2, float $$3, float $$4, int $$5, int $$6) {
      this.a($$0, $$1, new float[]{1.0F, 1.0F, 1.0F, 1.0F}, $$2, $$3, $$4, new int[]{$$5, $$5, $$5, $$5}, $$6, false);
   }

   default void a(eij.a $$0, fkr $$1, float[] $$2, float $$3, float $$4, float $$5, int[] $$6, int $$7, boolean $$8) {
      float[] $$9 = new float[]{$$2[0], $$2[1], $$2[2], $$2[3]};
      int[] $$10 = new int[]{$$6[0], $$6[1], $$6[2], $$6[3]};
      int[] $$11 = $$1.b();
      hz $$12 = $$1.e().q();
      Matrix4f $$13 = $$0.a();
      Vector3f $$14 = $$0.b().transform(new Vector3f((float)$$12.u(), (float)$$12.v(), (float)$$12.w()));
      int $$15 = 8;
      int $$16 = $$11.length / 8;
      MemoryStack $$17 = MemoryStack.stackPush();

      try {
         ByteBuffer $$18 = $$17.malloc(eih.j.b());
         IntBuffer $$19 = $$18.asIntBuffer();

         for (int $$20 = 0; $$20 < $$16; $$20++) {
            $$19.clear();
            $$19.put($$11, $$20 * 8, 8);
            float $$21 = $$18.getFloat(0);
            float $$22 = $$18.getFloat(4);
            float $$23 = $$18.getFloat(8);
            float $$27;
            float $$28;
            float $$29;
            if ($$8) {
               float $$24 = (float)($$18.get(12) & 255) / 255.0F;
               float $$25 = (float)($$18.get(13) & 255) / 255.0F;
               float $$26 = (float)($$18.get(14) & 255) / 255.0F;
               $$27 = $$24 * $$9[$$20] * $$3;
               $$28 = $$25 * $$9[$$20] * $$4;
               $$29 = $$26 * $$9[$$20] * $$5;
            } else {
               $$27 = $$9[$$20] * $$3;
               $$28 = $$9[$$20] * $$4;
               $$29 = $$9[$$20] * $$5;
            }

            int $$33 = $$10[$$20];
            float $$34 = $$18.getFloat(16);
            float $$35 = $$18.getFloat(20);
            Vector4f $$36 = $$13.transform(new Vector4f($$21, $$22, $$23, 1.0F));
            this.a($$36.x(), $$36.y(), $$36.z(), $$27, $$28, $$29, 1.0F, $$34, $$35, $$7, $$33, $$14.x(), $$14.y(), $$14.z());
         }
      } catch (Throwable var33) {
         if ($$17 != null) {
            try {
               $$17.close();
            } catch (Throwable var32) {
               var33.addSuppressed(var32);
            }
         }

         throw var33;
      }

      if ($$17 != null) {
         $$17.close();
      }
   }

   default ein a(Matrix4f $$0, float $$1, float $$2, float $$3) {
      Vector4f $$4 = $$0.transform(new Vector4f($$1, $$2, $$3, 1.0F));
      return this.a((double)$$4.x(), (double)$$4.y(), (double)$$4.z());
   }

   default ein a(Matrix3f $$0, float $$1, float $$2, float $$3) {
      Vector3f $$4 = $$0.transform(new Vector3f($$1, $$2, $$3));
      return this.a($$4.x(), $$4.y(), $$4.z());
   }
}
