import com.mojang.authlib.yggdrasil.ServicesKeyInfo;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.logging.LogUtils;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Collection;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface azp {
   azp a = ($$0, $$1) -> true;
   Logger b = LogUtils.getLogger();

   boolean validate(azo var1, byte[] var2);

   default boolean a(byte[] $$0, byte[] $$1) {
      return this.validate($$1x -> $$1x.update($$0), $$1);
   }

   private static boolean a(azo $$0, byte[] $$1, Signature $$2) throws SignatureException {
      $$0.update($$2::update);
      return $$2.verify($$1);
   }

   static azp a(PublicKey $$0, String $$1) {
      return ($$2, $$3) -> {
         try {
            Signature $$4 = Signature.getInstance($$1);
            $$4.initVerify($$0);
            return a($$2, $$3, $$4);
         } catch (Exception var5) {
            b.error("Failed to verify signature", var5);
            return false;
         }
      };
   }

   @Nullable
   static azp a(ServicesKeySet $$0, ServicesKeyType $$1) {
      Collection<ServicesKeyInfo> $$2 = $$0.keys($$1);
      return $$2.isEmpty() ? null : ($$1x, $$2x) -> $$2.stream().anyMatch($$2xx -> {
            Signature $$3 = $$2xx.signature();

            try {
               return a($$1x, $$2x, $$3);
            } catch (SignatureException var5) {
               b.error("Failed to verify Services signature", var5);
               return false;
            }
         });
   }
}
