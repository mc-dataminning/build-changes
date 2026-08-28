import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class aiz implements zg<aiw> {
   public static final yx<vw, aiz> a = zg.a(aiz::a, aiz::new);
   private final byte[] b;
   private final byte[] c;

   public aiz(SecretKey $$0, PublicKey $$1, byte[] $$2) throws axm {
      this.b = axl.a($$1, $$0.getEncoded());
      this.c = axl.a($$1, $$2);
   }

   private aiz(vw $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zi<aiz> a() {
      return aiu.h;
   }

   public void a(aiw $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws axm {
      return axl.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, axl.b($$1, this.c));
      } catch (axm var4) {
         return false;
      }
   }
}
