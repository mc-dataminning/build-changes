import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class aiy implements zf<aiv> {
   public static final yw<vv, aiy> a = zf.a(aiy::a, aiy::new);
   private final byte[] b;
   private final byte[] c;

   public aiy(SecretKey $$0, PublicKey $$1, byte[] $$2) throws axl {
      this.b = axk.a($$1, $$0.getEncoded());
      this.c = axk.a($$1, $$2);
   }

   private aiy(vv $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<aiy> a() {
      return ait.h;
   }

   public void a(aiv $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws axl {
      return axk.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, axk.b($$1, this.c));
      } catch (axl var4) {
         return false;
      }
   }
}
