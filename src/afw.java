import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class afw implements xg<aft> {
   private final byte[] a;
   private final byte[] b;

   public afw(SecretKey $$0, PublicKey $$1, byte[] $$2) throws ato {
      this.a = atn.a($$1, $$0.getEncoded());
      this.b = atn.a($$1, $$2);
   }

   public afw(uj $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(aft $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws ato {
      return atn.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, atn.b($$1, this.b));
      } catch (ato var4) {
         return false;
      }
   }
}
