import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class aip implements zb<aim> {
   public static final ys<vu, aip> a = zb.a(aip::a, aip::new);
   private final byte[] b;
   private final byte[] c;

   public aip(SecretKey $$0, PublicKey $$1, byte[] $$2) throws awy {
      this.b = awx.a($$1, $$0.getEncoded());
      this.c = awx.a($$1, $$2);
   }

   private aip(vu $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<aip> a() {
      return aik.h;
   }

   public void a(aim $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws awy {
      return awx.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, awx.b($$1, this.c));
      } catch (awy var4) {
         return false;
      }
   }
}
