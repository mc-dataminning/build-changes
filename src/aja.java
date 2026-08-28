import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class aja implements yw<aix> {
   public static final yn<vl, aja> a = yw.a(aja::a, aja::new);
   private final byte[] b;
   private final byte[] c;

   public aja(SecretKey $$0, PublicKey $$1, byte[] $$2) throws axy {
      this.b = axx.a($$1, $$0.getEncoded());
      this.c = axx.a($$1, $$2);
   }

   private aja(vl $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yy<aja> a() {
      return aiv.h;
   }

   public void a(aix $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws axy {
      return axx.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, axx.b($$1, this.c));
      } catch (axy var4) {
         return false;
      }
   }
}
