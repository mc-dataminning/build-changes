import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public record ayd(int a, int b) {
   private static final long c = -8552249625308161526L;
   private static final int d = 1229472850;
   private static final int e = 13;

   public static ayd a(InputStream $$0) throws IOException {
      DataInputStream $$1 = new DataInputStream($$0);
      if ($$1.readLong() != -8552249625308161526L) {
         throw new IOException("Bad PNG Signature");
      } else if ($$1.readInt() != 13) {
         throw new IOException("Bad length for IHDR chunk!");
      } else if ($$1.readInt() != 1229472850) {
         throw new IOException("Bad type for IHDR chunk!");
      } else {
         int $$2 = $$1.readInt();
         int $$3 = $$1.readInt();
         return new ayd($$2, $$3);
      }
   }

   public static ayd a(byte[] $$0) throws IOException {
      return a(new ByteArrayInputStream($$0));
   }

   public static void a(ByteBuffer $$0) throws IOException {
      ByteOrder $$1 = $$0.order();
      $$0.order(ByteOrder.BIG_ENDIAN);
      if ($$0.getLong(0) != -8552249625308161526L) {
         throw new IOException("Bad PNG Signature");
      } else if ($$0.getInt(8) != 13) {
         throw new IOException("Bad length for IHDR chunk!");
      } else if ($$0.getInt(12) != 1229472850) {
         throw new IOException("Bad type for IHDR chunk!");
      } else {
         $$0.order($$1);
      }
   }
}
