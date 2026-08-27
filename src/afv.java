import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class afv implements xf<afs> {
   private final byte[] a;
   private final byte[] b;

   public afv(SecretKey $$0, PublicKey $$1, byte[] $$2) throws atm {
      this.a = atl.a($$1, $$0.getEncoded());
      this.b = atl.a($$1, $$2);
   }

   public afv(ui $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(afs $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws atm {
      return atl.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, atl.b($$1, this.b));
      } catch (atm var4) {
         return false;
      }
   }
}
