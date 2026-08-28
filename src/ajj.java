import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajj implements zs<ajg> {
   public static final zj<wl, ajj> a = zs.a(ajj::a, ajj::new);
   private final byte[] b;
   private final byte[] c;

   public ajj(SecretKey $$0, PublicKey $$1, byte[] $$2) throws axt {
      this.b = axs.a($$1, $$0.getEncoded());
      this.c = axs.a($$1, $$2);
   }

   private ajj(wl $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<ajj> a() {
      return aje.h;
   }

   public void a(ajg $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws axt {
      return axs.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, axs.b($$1, this.c));
      } catch (axt var4) {
         return false;
      }
   }
}
