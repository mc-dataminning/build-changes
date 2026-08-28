import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajk implements zl<ajh> {
   public static final zc<wb, ajk> a = zl.a(ajk::a, ajk::new);
   private final byte[] b;
   private final byte[] c;

   public ajk(SecretKey $$0, PublicKey $$1, byte[] $$2) throws aye {
      this.b = ayd.a($$1, $$0.getEncoded());
      this.c = ayd.a($$1, $$2);
   }

   private ajk(wb $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<ajk> a() {
      return ajf.h;
   }

   public void a(ajh $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws aye {
      return ayd.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, ayd.b($$1, this.c));
      } catch (aye var4) {
         return false;
      }
   }
}
