import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajq implements zj<ajn> {
   public static final za<vy, ajq> a = zj.a(ajq::a, ajq::new);
   private final byte[] b;
   private final byte[] c;

   public ajq(SecretKey $$0, PublicKey $$1, byte[] $$2) throws ayo {
      this.b = ayn.a($$1, $$0.getEncoded());
      this.c = ayn.a($$1, $$2);
   }

   private ajq(vy $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zl<ajq> a() {
      return ajl.h;
   }

   public void a(ajn $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws ayo {
      return ayn.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, ayn.b($$1, this.c));
      } catch (ayo var4) {
         return false;
      }
   }
}
