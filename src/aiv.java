import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class aiv implements ze<ais> {
   public static final yv<vx, aiv> a = ze.a(aiv::a, aiv::new);
   private final byte[] b;
   private final byte[] c;

   public aiv(SecretKey $$0, PublicKey $$1, byte[] $$2) throws axe {
      this.b = axd.a($$1, $$0.getEncoded());
      this.c = axd.a($$1, $$2);
   }

   private aiv(vx $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zg<aiv> a() {
      return aiq.h;
   }

   public void a(ais $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws axe {
      return axd.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, axd.b($$1, this.c));
      } catch (axe var4) {
         return false;
      }
   }
}
