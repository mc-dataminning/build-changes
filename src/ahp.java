import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ahp implements yb<ahm> {
   public static final xs<uu, ahp> a = yb.a(ahp::a, ahp::new);
   private final byte[] b;
   private final byte[] c;

   public ahp(SecretKey $$0, PublicKey $$1, byte[] $$2) throws avv {
      this.b = avu.a($$1, $$0.getEncoded());
      this.c = avu.a($$1, $$2);
   }

   private ahp(uu $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yd<ahp> a() {
      return ahk.h;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws avv {
      return avu.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, avu.b($$1, this.c));
      } catch (avv var4) {
         return false;
      }
   }
}
