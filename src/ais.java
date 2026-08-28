import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ais implements zb<aip> {
   public static final ys<vr, ais> a = zb.a(ais::a, ais::new);
   private final byte[] b;
   private final byte[] c;

   public ais(SecretKey $$0, PublicKey $$1, byte[] $$2) throws axc {
      this.b = axb.a($$1, $$0.getEncoded());
      this.c = axb.a($$1, $$2);
   }

   private ais(vr $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<ais> a() {
      return ain.h;
   }

   public void a(aip $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws axc {
      return axb.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, axb.b($$1, this.c));
      } catch (axc var4) {
         return false;
      }
   }
}
