import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.lwjgl.system.MemoryStack;

public interface fkc {
   fkc a(float var1, float var2, float var3);

   fkc a(int var1, int var2, int var3, int var4);

   fkc a(float var1, float var2);

   fkc a(int var1, int var2);

   fkc b(int var1, int var2);

   fkc b(float var1, float var2, float var3);

   default void a(float $$0, float $$1, float $$2, int $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10) {
      this.a($$0, $$1, $$2);
      this.a($$3);
      this.a($$4, $$5);
      this.b($$6);
      this.c($$7);
      this.b($$8, $$9, $$10);
   }

   default fkc a(float $$0, float $$1, float $$2, float $$3) {
      return this.a((int)($$0 * 255.0F), (int)($$1 * 255.0F), (int)($$2 * 255.0F), (int)($$3 * 255.0F));
   }

   default fkc a(int $$0) {
      return this.a(axw.b($$0), axw.c($$0), axw.d($$0), axw.a($$0));
   }

   default fkc d(int $$0) {
      return this.a(axw.c($$0, -1));
   }

   default fkc c(int $$0) {
      return this.b($$0 & 65535, $$0 >> 16 & 65535);
   }

   default fkc b(int $$0) {
      return this.a($$0 & 65535, $$0 >> 16 & 65535);
   }

   default void a(fjy.a $$0, grs $$1, float $$2, float $$3, float $$4, float $$5, int $$6, int $$7) {
      this.a($$0, $$1, new float[]{1.0F, 1.0F, 1.0F, 1.0F}, $$2, $$3, $$4, $$5, new int[]{$$6, $$6, $$6, $$6}, $$7, false);
   }

   default void a(fjy.a $$0, grs $$1, float[] $$2, float $$3, float $$4, float $$5, float $$6, int[] $$7, int $$8, boolean $$9) {
      int[] $$10 = $$1.b();
      Vector3fc $$11 = $$1.d().s();
      Matrix4f $$12 = $$0.a();
      Vector3f $$13 = $$0.a($$11, new Vector3f());
      int $$14 = 8;
      int $$15 = $$10.length / 8;
      int $$16 = (int)($$6 * 255.0F);
      int $$17 = $$1.g();
      MemoryStack $$18 = MemoryStack.stackPush();

      try {
         ByteBuffer $$19 = $$18.malloc(fjw.b.b());
         IntBuffer $$20 = $$19.asIntBuffer();

         for (int $$21 = 0; $$21 < $$15; $$21++) {
            $$20.clear();
            $$20.put($$10, $$21 * 8, 8);
            float $$22 = $$19.getFloat(0);
            float $$23 = $$19.getFloat(4);
            float $$24 = $$19.getFloat(8);
            float $$28;
            float $$29;
            float $$30;
            if ($$9) {
               float $$25 = (float)($$19.get(12) & 255);
               float $$26 = (float)($$19.get(13) & 255);
               float $$27 = (float)($$19.get(14) & 255);
               $$28 = $$25 * $$2[$$21] * $$3;
               $$29 = $$26 * $$2[$$21] * $$4;
               $$30 = $$27 * $$2[$$21] * $$5;
            } else {
               $$28 = $$2[$$21] * $$3 * 255.0F;
               $$29 = $$2[$$21] * $$4 * 255.0F;
               $$30 = $$2[$$21] * $$5 * 255.0F;
            }

            int $$34 = axw.a($$16, (int)$$28, (int)$$29, (int)$$30);
            int $$35 = gqj.b($$7[$$21], $$17);
            float $$36 = $$19.getFloat(16);
            float $$37 = $$19.getFloat(20);
            Vector3f $$38 = $$12.transformPosition($$22, $$23, $$24, new Vector3f());
            this.a($$38.x(), $$38.y(), $$38.z(), $$34, $$36, $$37, $$8, $$35, $$13.x(), $$13.y(), $$13.z());
         }
      } catch (Throwable var35) {
         if ($$18 != null) {
            try {
               $$18.close();
            } catch (Throwable var34) {
               var35.addSuppressed(var34);
            }
         }

         throw var35;
      }

      if ($$18 != null) {
         $$18.close();
      }
   }

   default fkc a(Vector3f $$0) {
      return this.a($$0.x(), $$0.y(), $$0.z());
   }

   default fkc a(fjy.a $$0, Vector3f $$1) {
      return this.a($$0, $$1.x(), $$1.y(), $$1.z());
   }

   default fkc a(fjy.a $$0, float $$1, float $$2, float $$3) {
      return this.a($$0.a(), $$1, $$2, $$3);
   }

   default fkc a(Matrix4f $$0, float $$1, float $$2, float $$3) {
      Vector3f $$4 = $$0.transformPosition($$1, $$2, $$3, new Vector3f());
      return this.a($$4.x(), $$4.y(), $$4.z());
   }

   default fkc b(fjy.a $$0, float $$1, float $$2, float $$3) {
      Vector3f $$4 = $$0.a($$1, $$2, $$3, new Vector3f());
      return this.b($$4.x(), $$4.y(), $$4.z());
   }

   default fkc b(fjy.a $$0, Vector3f $$1) {
      return this.b($$0, $$1.x(), $$1.y(), $$1.z());
   }
}
