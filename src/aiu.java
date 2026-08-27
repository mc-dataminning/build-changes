import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class aiu implements ze<air> {
   public static final yv<vx, aiu> a = ze.a(aiu::a, aiu::new);
   private final byte[] b;
   private final byte[] c;

   public aiu(SecretKey $$0, PublicKey $$1, byte[] $$2) throws axd {
      this.b = axc.a($$1, $$0.getEncoded());
      this.c = axc.a($$1, $$2);
   }

   private aiu(vx $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zg<aiu> a() {
      return aip.h;
   }

   public void a(air $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws axd {
      return axc.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, axc.b($$1, this.c));
      } catch (axd var4) {
         return false;
      }
   }
}
