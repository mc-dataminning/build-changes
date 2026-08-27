import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ael implements wb<aei> {
   private final byte[] a;
   private final byte[] b;

   public ael(SecretKey $$0, PublicKey $$1, byte[] $$2) throws ary {
      this.a = arx.a($$1, $$0.getEncoded());
      this.b = arx.a($$1, $$2);
   }

   public ael(tl $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(aei $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws ary {
      return arx.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, arx.b($$1, this.b));
      } catch (ary var4) {
         return false;
      }
   }
}
