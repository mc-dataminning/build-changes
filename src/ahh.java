import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ahh implements xx<ahe> {
   public static final xo<uq, ahh> a = xx.a(ahh::a, ahh::new);
   private final byte[] b;
   private final byte[] c;

   public ahh(SecretKey $$0, PublicKey $$1, byte[] $$2) throws avg {
      this.b = avf.a($$1, $$0.getEncoded());
      this.c = avf.a($$1, $$2);
   }

   private ahh(uq $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(uq $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public xz<ahh> a() {
      return ahc.h;
   }

   public void a(ahe $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws avg {
      return avf.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, avf.b($$1, this.c));
      } catch (avg var4) {
         return false;
      }
   }
}
