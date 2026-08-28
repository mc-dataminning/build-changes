import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajv implements zr<ajs> {
   public static final zi<wh, ajv> a = zr.a(ajv::a, ajv::new);
   private final byte[] b;
   private final byte[] c;

   public ajv(SecretKey $$0, PublicKey $$1, byte[] $$2) throws ayt {
      this.b = ays.a($$1, $$0.getEncoded());
      this.c = ays.a($$1, $$2);
   }

   private ajv(wh $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zt<ajv> a() {
      return ajq.h;
   }

   public void a(ajs $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws ayt {
      return ays.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, ays.b($$1, this.c));
      } catch (ayt var4) {
         return false;
      }
   }
}
