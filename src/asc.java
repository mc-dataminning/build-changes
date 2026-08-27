import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public record asc(int a, int b) {
   private static final long c = -8552249625308161526L;
   private static final int d = 1229472850;
   private static final int e = 13;

   public static asc a(InputStream $$0) throws IOException {
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
         return new asc($$2, $$3);
      }
   }

   public static asc a(byte[] $$0) throws IOException {
      return a(new ByteArrayInputStream($$0));
   }
}
