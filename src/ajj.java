import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajj implements zk<ajg> {
   public static final zb<wa, ajj> a = zk.a(ajj::a, ajj::new);
   private final byte[] b;
   private final byte[] c;

   public ajj(SecretKey $$0, PublicKey $$1, byte[] $$2) throws ayb {
      this.b = aya.a($$1, $$0.getEncoded());
      this.c = aya.a($$1, $$2);
   }

   private ajj(wa $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zm<ajj> a() {
      return aje.h;
   }

   public void a(ajg $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws ayb {
      return aya.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, aya.b($$1, this.c));
      } catch (ayb var4) {
         return false;
      }
   }
}
