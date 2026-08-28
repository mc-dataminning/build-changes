import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajo implements zh<ajl> {
   public static final yy<vw, ajo> a = zh.a(ajo::a, ajo::new);
   private final byte[] b;
   private final byte[] c;

   public ajo(SecretKey $$0, PublicKey $$1, byte[] $$2) throws aym {
      this.b = ayl.a($$1, $$0.getEncoded());
      this.c = ayl.a($$1, $$2);
   }

   private ajo(vw $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zj<ajo> a() {
      return ajj.h;
   }

   public void a(ajl $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws aym {
      return ayl.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, ayl.b($$1, this.c));
      } catch (aym var4) {
         return false;
      }
   }
}
