import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class akf implements aac<akc> {
   public static final zt<ws, akf> a = aac.a(akf::a, akf::new);
   private final byte[] b;
   private final byte[] c;

   public akf(SecretKey $$0, PublicKey $$1, byte[] $$2) throws azd {
      this.b = azc.a($$1, $$0.getEncoded());
      this.c = azc.a($$1, $$2);
   }

   private akf(ws $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public aae<akf> a() {
      return aka.h;
   }

   public void a(akc $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws azd {
      return azc.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, azc.b($$1, this.c));
      } catch (azd var4) {
         return false;
      }
   }
}
