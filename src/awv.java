import com.mojang.logging.LogUtils;
import java.security.PrivateKey;
import java.security.Signature;
import org.slf4j.Logger;

public interface awv {
   Logger a = LogUtils.getLogger();

   byte[] sign(awt var1);

   default byte[] a(byte[] $$0) {
      return this.sign($$1 -> $$1.update($$0));
   }

   static awv a(PrivateKey $$0, String $$1) {
      return $$2 -> {
         try {
            Signature $$3 = Signature.getInstance($$1);
            $$3.initSign($$0);
            $$2.update($$3::update);
            return $$3.sign();
         } catch (Exception var4) {
            throw new IllegalStateException("Failed to sign message", var4);
         }
      };
   }
}
