import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class aib implements yn<ahy> {
   public static final ye<vg, aib> a = yn.a(aib::a, aib::new);
   private final byte[] b;
   private final byte[] c;

   public aib(SecretKey $$0, PublicKey $$1, byte[] $$2) throws awj {
      this.b = awi.a($$1, $$0.getEncoded());
      this.c = awi.a($$1, $$2);
   }

   private aib(vg $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yp<aib> a() {
      return ahw.h;
   }

   public void a(ahy $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws awj {
      return awi.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, awi.b($$1, this.c));
      } catch (awj var4) {
         return false;
      }
   }
}
