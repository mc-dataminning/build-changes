import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class adi implements ux<adf> {
   private final byte[] a;
   private final byte[] b;

   public adi(SecretKey $$0, PublicKey $$1, byte[] $$2) throws aqq {
      this.a = aqp.a($$1, $$0.getEncoded());
      this.b = aqp.a($$1, $$2);
   }

   public adi(si $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(adf $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws aqq {
      return aqp.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, aqp.b($$1, this.b));
      } catch (aqq var4) {
         return false;
      }
   }
}
