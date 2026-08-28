import it.unimi.dsi.fastutil.ints.IntConsumer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableLong;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;

public class flp implements AutoCloseable {
   private final fln.a a;
   @Nullable
   private fln.a b;
   private final flp.a c;

   public flp(fln.a $$0, flp.a $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   private static Vector3f[] a(ByteBuffer $$0, int $$1, flu $$2) {
      int $$3 = $$2.a(flv.b);
      if ($$3 == -1) {
         throw new IllegalArgumentException("Cannot identify quad centers with no position element");
      } else {
         FloatBuffer $$4 = $$0.asFloatBuffer();
         int $$5 = $$2.b() / 4;
         int $$6 = $$5 * 4;
         int $$7 = $$1 / 4;
         Vector3f[] $$8 = new Vector3f[$$7];

         for (int $$9 = 0; $$9 < $$7; $$9++) {
            int $$10 = $$9 * $$6 + $$3;
            int $$11 = $$10 + $$5 * 2;
            float $$12 = $$4.get($$10 + 0);
            float $$13 = $$4.get($$10 + 1);
            float $$14 = $$4.get($$10 + 2);
            float $$15 = $$4.get($$11 + 0);
            float $$16 = $$4.get($$11 + 1);
            float $$17 = $$4.get($$11 + 2);
            $$8[$$9] = new Vector3f(($$12 + $$15) / 2.0F, ($$13 + $$16) / 2.0F, ($$14 + $$17) / 2.0F);
         }

         return $$8;
      }
   }

   public ByteBuffer a() {
      return this.a.a();
   }

   @Nullable
   public ByteBuffer b() {
      return this.b != null ? this.b.a() : null;
   }

   public flp.a c() {
      return this.c;
   }

   @Nullable
   public flp.b a(fln $$0, flx $$1) {
      if (this.c.d() != flu.c.h) {
         return null;
      } else {
         Vector3f[] $$2 = a(this.a.a(), this.c.b(), this.c.a());
         flp.b $$3 = new flp.b($$2, this.c.e());
         this.b = $$3.a($$0, $$1);
         return $$3;
      }
   }

   @Override
   public void close() {
      this.a.close();
      if (this.b != null) {
         this.b.close();
      }
   }

   public static record a(flu a, int b, int c, flu.c d, flu.b e) {
   }

   public static record b(Vector3f[] a, flu.b b) {
      @Nullable
      public fln.a a(fln $$0, flx $$1) {
         int[] $$2 = $$1.sort(this.a);
         long $$3 = $$0.a($$2.length * 6 * this.b.c);
         IntConsumer $$4 = this.a($$3, this.b);

         for (int $$5 : $$2) {
            $$4.accept($$5 * 4 + 0);
            $$4.accept($$5 * 4 + 1);
            $$4.accept($$5 * 4 + 2);
            $$4.accept($$5 * 4 + 2);
            $$4.accept($$5 * 4 + 3);
            $$4.accept($$5 * 4 + 0);
         }

         return $$0.a();
      }

      private IntConsumer a(long $$0, flu.b $$1) {
         MutableLong $$2 = new MutableLong($$0);

         return switch ($$1) {
            case a -> $$1x -> MemoryUtil.memPutShort($$2.getAndAdd(2L), (short)$$1x);
            case b -> $$1x -> MemoryUtil.memPutInt($$2.getAndAdd(4L), $$1x);
         };
      }
   }
}
