import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class aex implements wk<aeu> {
   private final byte[] a;
   private final byte[] b;

   public aex(SecretKey $$0, PublicKey $$1, byte[] $$2) throws asm {
      this.a = asl.a($$1, $$0.getEncoded());
      this.b = asl.a($$1, $$2);
   }

   public aex(tu $$0) {
      this.a = $$0.b();
      this.b = $$0.b();
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(aeu $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws asm {
      return asl.a($$0, this.a);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, asl.b($$1, this.b));
      } catch (asm var4) {
         return false;
      }
   }
}
