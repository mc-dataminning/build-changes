import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class afs implements xd<afp> {
   private final byte[] a;
   private final byte[] b;

   public afs(SecretKey $$0, PublicKey $$1, byte[] $$2) throws ath {
      this.a = atg.a($$1, $$0.getEncoded());
      this.b = atg.a($$1, $$2);
   }

   public afs(ug $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(afp $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws ath {
      return atg.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, atg.b($$1, this.b));
      } catch (ath var4) {
         return false;
      }
   }
}
