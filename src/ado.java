import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ado implements ve<adl> {
   private final byte[] a;
   private final byte[] b;

   public ado(SecretKey $$0, PublicKey $$1, byte[] $$2) throws aqy {
      this.a = aqx.a($$1, $$0.getEncoded());
      this.b = aqx.a($$1, $$2);
   }

   public ado(sp $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(adl $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws aqy {
      return aqx.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, aqx.b($$1, this.b));
      } catch (aqy var4) {
         return false;
      }
   }
}
