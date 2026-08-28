import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajx implements zo<aju> {
   public static final ze<vy, ajx> a = zo.a(ajx::a, ajx::new);
   private final byte[] b;
   private final byte[] c;

   public ajx(SecretKey $$0, PublicKey $$1, byte[] $$2) throws ayw {
      this.b = ayv.a($$1, $$0.getEncoded());
      this.c = ayv.a($$1, $$2);
   }

   private ajx(vy $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zq<ajx> a() {
      return ajs.h;
   }

   public void a(aju $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws ayw {
      return ayv.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, ayv.b($$1, this.c));
      } catch (ayw var4) {
         return false;
      }
   }
}
