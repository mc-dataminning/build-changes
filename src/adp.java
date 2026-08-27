import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class adp implements vf<adm> {
   private final byte[] a;
   private final byte[] b;

   public adp(SecretKey $$0, PublicKey $$1, byte[] $$2) throws aqz {
      this.a = aqy.a($$1, $$0.getEncoded());
      this.b = aqy.a($$1, $$2);
   }

   public adp(sq $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(adm $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws aqz {
      return aqy.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, aqy.b($$1, this.b));
      } catch (aqz var4) {
         return false;
      }
   }
}
