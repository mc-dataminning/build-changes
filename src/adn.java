import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class adn implements vd<adk> {
   private final byte[] a;
   private final byte[] b;

   public adn(SecretKey $$0, PublicKey $$1, byte[] $$2) throws aqx {
      this.a = aqw.a($$1, $$0.getEncoded());
      this.b = aqw.a($$1, $$2);
   }

   public adn(so $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(adk $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws aqx {
      return aqw.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, aqw.b($$1, this.b));
      } catch (aqx var4) {
         return false;
      }
   }
}
