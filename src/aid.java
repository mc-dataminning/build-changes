import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class aid implements yp<aia> {
   public static final yg<vi, aid> a = yp.a(aid::a, aid::new);
   private final byte[] b;
   private final byte[] c;

   public aid(SecretKey $$0, PublicKey $$1, byte[] $$2) throws awl {
      this.b = awk.a($$1, $$0.getEncoded());
      this.c = awk.a($$1, $$2);
   }

   private aid(vi $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yr<aid> a() {
      return ahy.h;
   }

   public void a(aia $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws awl {
      return awk.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, awk.b($$1, this.c));
      } catch (awl var4) {
         return false;
      }
   }
}
