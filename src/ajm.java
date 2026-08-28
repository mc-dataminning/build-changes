import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajm implements zv<ajj> {
   public static final zm<wl, ajm> a = zv.a(ajm::a, ajm::new);
   private final byte[] b;
   private final byte[] c;

   public ajm(SecretKey $$0, PublicKey $$1, byte[] $$2) throws axw {
      this.b = axv.a($$1, $$0.getEncoded());
      this.c = axv.a($$1, $$2);
   }

   private ajm(wl $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zx<ajm> a() {
      return ajh.h;
   }

   public void a(ajj $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws axw {
      return axv.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, axv.b($$1, this.c));
      } catch (axw var4) {
         return false;
      }
   }
}
