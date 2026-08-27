import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ahl implements xz<ahi> {
   public static final xq<us, ahl> a = xz.a(ahl::a, ahl::new);
   private final byte[] b;
   private final byte[] c;

   public ahl(SecretKey $$0, PublicKey $$1, byte[] $$2) throws avl {
      this.b = avk.a($$1, $$0.getEncoded());
      this.c = avk.a($$1, $$2);
   }

   private ahl(us $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(us $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yb<ahl> a() {
      return ahg.h;
   }

   public void a(ahi $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws avl {
      return avk.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, avk.b($$1, this.c));
      } catch (avl var4) {
         return false;
      }
   }
}
