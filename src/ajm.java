import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajm implements zf<ajj> {
   public static final yw<vu, ajm> a = zf.a(ajm::a, ajm::new);
   private final byte[] b;
   private final byte[] c;

   public ajm(SecretKey $$0, PublicKey $$1, byte[] $$2) throws ayk {
      this.b = ayj.a($$1, $$0.getEncoded());
      this.c = ayj.a($$1, $$2);
   }

   private ajm(vu $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<ajm> a() {
      return ajh.h;
   }

   public void a(ajj $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws ayk {
      return ayj.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, ayj.b($$1, this.c));
      } catch (ayk var4) {
         return false;
      }
   }
}
