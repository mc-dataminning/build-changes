import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajo implements zp<ajl> {
   public static final zg<wf, ajo> a = zp.a(ajo::a, ajo::new);
   private final byte[] b;
   private final byte[] c;

   public ajo(SecretKey $$0, PublicKey $$1, byte[] $$2) throws ayj {
      this.b = ayi.a($$1, $$0.getEncoded());
      this.c = ayi.a($$1, $$2);
   }

   private ajo(wf $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zr<ajo> a() {
      return ajj.h;
   }

   public void a(ajl $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws ayj {
      return ayi.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, ayi.b($$1, this.c));
      } catch (ayj var4) {
         return false;
      }
   }
}
