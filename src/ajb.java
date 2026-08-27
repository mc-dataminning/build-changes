import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class ajb implements zl<aiy> {
   public static final zc<we, ajb> a = zl.a(ajb::a, ajb::new);
   private final byte[] b;
   private final byte[] c;

   public ajb(SecretKey $$0, PublicKey $$1, byte[] $$2) throws axl {
      this.b = axk.a($$1, $$0.getEncoded());
      this.c = axk.a($$1, $$2);
   }

   private ajb(we $$0) {
      this.b = $$0.b();
      this.c = $$0.b();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<ajb> a() {
      return aiw.h;
   }

   public void a(aiy $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws axl {
      return axk.a($$0, this.b);
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      try {
         return Arrays.equals($$0, axk.b($$1, this.c));
      } catch (axl var4) {
         return false;
      }
   }
}
