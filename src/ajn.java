import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajn implements zw<ajk> {
   public static final zn<wm, ajn> a = zw.a(ajn::a, ajn::new);
   private final byte[] b;
   private final byte[] c;

   public ajn(SecretKey $$0, PublicKey $$1, byte[] $$2) throws axx {
      this.b = axw.a($$1, $$0.getEncoded());
      this.c = axw.a($$1, $$2);
   }

   private ajn(wm $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<ajn> a() {
      return aji.h;
   }

   public void a(ajk $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws axx {
      return axw.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, axw.b($$1, this.c));
      } catch (axx var4) {
         return false;
      }
   }
}
