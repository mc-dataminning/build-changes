import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class aev implements wk<aes> {
   private final byte[] a;
   private final byte[] b;

   public aev(SecretKey $$0, PublicKey $$1, byte[] $$2) throws asi {
      this.a = ash.a($$1, $$0.getEncoded());
      this.b = ash.a($$1, $$2);
   }

   public aev(tu $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws asi {
      return ash.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, ash.b($$1, this.b));
      } catch (asi var4) {
         return false;
      }
   }
}
