import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class afi implements wu<aff> {
   private final byte[] a;
   private final byte[] b;

   public afi(SecretKey $$0, PublicKey $$1, byte[] $$2) throws asx {
      this.a = asw.a($$1, $$0.getEncoded());
      this.b = asw.a($$1, $$2);
   }

   public afi(ue $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(aff $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws asx {
      return asw.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, asw.b($$1, this.b));
      } catch (asx var4) {
         return false;
      }
   }
}
