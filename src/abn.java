import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class abn implements uo<abk> {
   private final byte[] a;
   private final byte[] b;

   public abn(SecretKey $$0, PublicKey $$1, byte[] $$2) throws aoa {
      this.a = anz.a($$1, $$0.getEncoded());
      this.b = anz.a($$1, $$2);
   }

   public abn(sf $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws aoa {
      return anz.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, anz.b($$1, this.b));
      } catch (aoa var4) {
         return false;
      }
   }
}
