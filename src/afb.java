import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class afb implements wo<aey> {
   private final byte[] a;
   private final byte[] b;

   public afb(SecretKey $$0, PublicKey $$1, byte[] $$2) throws asq {
      this.a = asp.a($$1, $$0.getEncoded());
      this.b = asp.a($$1, $$2);
   }

   public afb(ty $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(aey $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws asq {
      return asp.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, asp.b($$1, this.b));
      } catch (asq var4) {
         return false;
      }
   }
}
