import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryStack;

public interface fbm {
   fbm a(float var1, float var2, float var3);

   fbm a(int var1, int var2, int var3, int var4);

   fbm a(float var1, float var2);

   fbm a(int var1, int var2);

   fbm b(int var1, int var2);

   fbm b(float var1, float var2, float var3);

   default void a(float $$0, float $$1, float $$2, int $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10) {
      this.a($$0, $$1, $$2);
      this.a($$3);
      this.a($$4, $$5);
      this.b($$6);
      this.c($$7);
      this.b($$8, $$9, $$10);
   }

   default fbm a(float $$0, float $$1, float $$2, float $$3) {
      return this.a((int)($$0 * 255.0F), (int)($$1 * 255.0F), (int)($$2 * 255.0F), (int)($$3 * 255.0F));
   }

   default fbm a(int $$0) {
      return this.a(axy.b.b($$0), axy.b.c($$0), axy.b.d($$0), axy.b.a($$0));
   }

   default fbm d(int $$0) {
      return this.a(axy.b.b($$0, -1));
   }

   default fbm c(int $$0) {
      return this.b($$0 & 65535, $$0 >> 16 & 65535);
   }

   default fbm b(int $$0) {
      return this.a($$0 & 65535, $$0 >> 16 & 65535);
   }

   default void a(fbi.a $$0, gfw $$1, float $$2, float $$3, float $$4, float $$5, int $$6, int $$7) {
      this.a($$0, $$1, new float[]{1.0F, 1.0F, 1.0F, 1.0F}, $$2, $$3, $$4, $$5, new int[]{$$6, $$6, $$6, $$6}, $$7, false);
   }

   default void a(fbi.a $$0, gfw $$1, float[] $$2, float $$3, float $$4, float $$5, float $$6, int[] $$7, int $$8, boolean $$9) {
      int[] $$10 = $$1.b();
      kh $$11 = $$1.e().q();
      Matrix4f $$12 = $$0.a();
      Vector3f $$13 = $$0.a((float)$$11.u(), (float)$$11.v(), (float)$$11.w(), new Vector3f());
      int $$14 = 8;
      int $$15 = $$10.length / 8;
      int $$16 = (int)($$6 * 255.0F);
      MemoryStack $$17 = MemoryStack.stackPush();

      try {
         ByteBuffer $$18 = $$17.malloc(fbg.b.b());
         IntBuffer $$19 = $$18.asIntBuffer();

         for (int $$20 = 0; $$20 < $$15; $$20++) {
            $$19.clear();
            $$19.put($$10, $$20 * 8, 8);
            float $$21 = $$18.getFloat(0);
            float $$22 = $$18.getFloat(4);
            float $$23 = $$18.getFloat(8);
            float $$27;
            float $$28;
            float $$29;
            if ($$9) {
               float $$24 = (float)($$18.get(12) & 255);
               float $$25 = (float)($$18.get(13) & 255);
               float $$26 = (float)($$18.get(14) & 255);
               $$27 = $$24 * $$2[$$20] * $$3;
               $$28 = $$25 * $$2[$$20] * $$4;
               $$29 = $$26 * $$2[$$20] * $$5;
            } else {
               $$27 = $$2[$$20] * $$3 * 255.0F;
               $$28 = $$2[$$20] * $$4 * 255.0F;
               $$29 = $$2[$$20] * $$5 * 255.0F;
            }

            int $$33 = axy.b.a($$16, (int)$$27, (int)$$28, (int)$$29);
            int $$34 = $$7[$$20];
            float $$35 = $$18.getFloat(16);
            float $$36 = $$18.getFloat(20);
            Vector3f $$37 = $$12.transformPosition($$21, $$22, $$23, new Vector3f());
            this.a($$37.x(), $$37.y(), $$37.z(), $$33, $$35, $$36, $$8, $$34, $$13.x(), $$13.y(), $$13.z());
         }
      } catch (Throwable var34) {
         if ($$17 != null) {
            try {
               $$17.close();
            } catch (Throwable var33) {
               var34.addSuppressed(var33);
            }
         }

         throw var34;
      }

      if ($$17 != null) {
         $$17.close();
      }
   }

   default fbm a(Vector3f $$0) {
      return this.a($$0.x(), $$0.y(), $$0.z());
   }

   default fbm a(fbi.a $$0, Vector3f $$1) {
      return this.a($$0, $$1.x(), $$1.y(), $$1.z());
   }

   default fbm a(fbi.a $$0, float $$1, float $$2, float $$3) {
      return this.a($$0.a(), $$1, $$2, $$3);
   }

   default fbm a(Matrix4f $$0, float $$1, float $$2, float $$3) {
      Vector3f $$4 = $$0.transformPosition($$1, $$2, $$3, new Vector3f());
      return this.a($$4.x(), $$4.y(), $$4.z());
   }

   default fbm b(fbi.a $$0, float $$1, float $$2, float $$3) {
      Vector3f $$4 = $$0.a($$1, $$2, $$3, new Vector3f());
      return this.b($$4.x(), $$4.y(), $$4.z());
   }
}
