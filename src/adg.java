import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class adg implements uw<add> {
   private final byte[] a;
   private final byte[] b;

   public adg(SecretKey $$0, PublicKey $$1, byte[] $$2) throws aqo {
      this.a = aqn.a($$1, $$0.getEncoded());
      this.b = aqn.a($$1, $$2);
   }

   public adg(sh $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(add $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws aqo {
      return aqn.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, aqn.b($$1, this.b));
      } catch (aqo var4) {
         return false;
      }
   }
}
