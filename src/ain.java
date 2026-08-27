import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ain implements yz<aik> {
   public static final yq<vs, ain> a = yz.a(ain::a, ain::new);
   private final byte[] b;
   private final byte[] c;

   public ain(SecretKey $$0, PublicKey $$1, byte[] $$2) throws awv {
      this.b = awu.a($$1, $$0.getEncoded());
      this.c = awu.a($$1, $$2);
   }

   private ain(vs $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zb<ain> a() {
      return aii.h;
   }

   public void a(aik $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws awv {
      return awu.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, awu.b($$1, this.c));
      } catch (awv var4) {
         return false;
      }
   }
}
