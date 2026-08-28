import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajp implements zq<ajm> {
   public static final zh<wg, ajp> a = zq.a(ajp::a, ajp::new);
   private final byte[] b;
   private final byte[] c;

   public ajp(SecretKey $$0, PublicKey $$1, byte[] $$2) throws ayl {
      this.b = ayk.a($$1, $$0.getEncoded());
      this.c = ayk.a($$1, $$2);
   }

   private ajp(wg $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zs<ajp> a() {
      return ajk.h;
   }

   public void a(ajm $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws ayl {
      return ayk.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, ayk.b($$1, this.c));
      } catch (ayl var4) {
         return false;
      }
   }
}
