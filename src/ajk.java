import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajk implements zd<ajh> {
   public static final yu<vs, ajk> a = zd.a(ajk::a, ajk::new);
   private final byte[] b;
   private final byte[] c;

   public ajk(SecretKey $$0, PublicKey $$1, byte[] $$2) throws ayi {
      this.b = ayh.a($$1, $$0.getEncoded());
      this.c = ayh.a($$1, $$2);
   }

   private ajk(vs $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zf<ajk> a() {
      return ajf.h;
   }

   public void a(ajh $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws ayi {
      return ayh.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, ayh.b($$1, this.c));
      } catch (ayi var4) {
         return false;
      }
   }
}
