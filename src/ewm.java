import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public interface ewm {
   ewm a(double var1, double var3, double var5);

   ewm a(int var1, int var2, int var3, int var4);

   ewm a(float var1, float var2);

   ewm a(int var1, int var2);

   ewm b(int var1, int var2);

   ewm a(float var1, float var2, float var3);

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

   void l();

   default ewm a(float $$0, float $$1, float $$2, float $$3) {
      return this.a((int)($$0 * 255.0F), (int)($$1 * 255.0F), (int)($$2 * 255.0F), (int)($$3 * 255.0F));
   }

   default ewm a(int $$0) {
      return this.a(awu.b.b($$0), awu.b.c($$0), awu.b.d($$0), awu.b.a($$0));
   }

   default ewm b(int $$0) {
      return this.b($$0 & 65535, $$0 >> 16 & 65535);
   }

   default ewm c(int $$0) {
      return this.a($$0 & 65535, $$0 >> 16 & 65535);
   }

   default void a(ewi.a $$0, gaw $$1, float $$2, float $$3, float $$4, float $$5, int $$6, int $$7) {
      this.a($$0, $$1, new float[]{1.0F, 1.0F, 1.0F, 1.0F}, $$2, $$3, $$4, $$5, new int[]{$$6, $$6, $$6, $$6}, $$7, false);
   }

   default void a(ewi.a $$0, gaw $$1, float[] $$2, float $$3, float $$4, float $$5, float $$6, int[] $$7, int $$8, boolean $$9) {
      float[] $$10 = new float[]{$$2[0], $$2[1], $$2[2], $$2[3]};
      int[] $$11 = new int[]{$$7[0], $$7[1], $$7[2], $$7[3]};
      int[] $$12 = $$1.b();
      jg $$13 = $$1.e().q();
      Matrix4f $$14 = $$0.a();
      Vector3f $$15 = $$0.a((float)$$13.u(), (float)$$13.v(), (float)$$13.w(), new Vector3f());
      int $$16 = 8;
      int $$17 = $$12.length / 8;
      MemoryStack $$18 = MemoryStack.stackPush();

      try {
         ByteBuffer $$19 = $$18.malloc(ewg.j.b());
         IntBuffer $$20 = $$19.asIntBuffer();

         for (int $$21 = 0; $$21 < $$17; $$21++) {
            $$20.clear();
            $$20.put($$12, $$21 * 8, 8);
            float $$22 = $$19.getFloat(0);
            float $$23 = $$19.getFloat(4);
            float $$24 = $$19.getFloat(8);
            float $$28;
            float $$29;
            float $$30;
            if ($$9) {
               float $$25 = (float)($$19.get(12) & 255) / 255.0F;
               float $$26 = (float)($$19.get(13) & 255) / 255.0F;
               float $$27 = (float)($$19.get(14) & 255) / 255.0F;
               $$28 = $$25 * $$10[$$21] * $$3;
               $$29 = $$26 * $$10[$$21] * $$4;
               $$30 = $$27 * $$10[$$21] * $$5;
            } else {
               $$28 = $$10[$$21] * $$3;
               $$29 = $$10[$$21] * $$4;
               $$30 = $$10[$$21] * $$5;
            }

            int $$34 = $$11[$$21];
            float $$35 = $$19.getFloat(16);
            float $$36 = $$19.getFloat(20);
            Vector4f $$37 = $$14.transform(new Vector4f($$22, $$23, $$24, 1.0F));
            this.a($$37.x(), $$37.y(), $$37.z(), $$28, $$29, $$30, $$6, $$35, $$36, $$8, $$34, $$15.x(), $$15.y(), $$15.z());
         }
      } catch (Throwable var34) {
         if ($$18 != null) {
            try {
               $$18.close();
            } catch (Throwable var33) {
               var34.addSuppressed(var33);
            }
         }

         throw var34;
      }

      if ($$18 != null) {
         $$18.close();
      }
   }

   default ewm a(ewi.a $$0, float $$1, float $$2, float $$3) {
      return this.a($$0.a(), $$1, $$2, $$3);
   }

   default ewm a(Matrix4f $$0, float $$1, float $$2, float $$3) {
      Vector3f $$4 = $$0.transformPosition($$1, $$2, $$3, new Vector3f());
      return this.a((double)$$4.x(), (double)$$4.y(), (double)$$4.z());
   }

   default ewm b(ewi.a $$0, float $$1, float $$2, float $$3) {
      Vector3f $$4 = $$0.a($$1, $$2, $$3, new Vector3f());
      return this.a($$4.x(), $$4.y(), $$4.z());
   }
}
