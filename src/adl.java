import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class adl implements va<adi> {
   private final byte[] a;
   private final byte[] b;

   public adl(SecretKey $$0, PublicKey $$1, byte[] $$2) throws aqt {
      this.a = aqs.a($$1, $$0.getEncoded());
      this.b = aqs.a($$1, $$2);
   }

   public adl(sl $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(adi $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws aqt {
      return aqs.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, aqs.b($$1, this.b));
      } catch (aqt var4) {
         return false;
      }
   }
}
