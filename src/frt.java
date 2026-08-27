import com.mojang.logging.LogUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Optional;
import org.slf4j.Logger;

@FunctionalInterface
public interface frt {
   Logger a = LogUtils.getLogger();
   frt b = $$0 -> {
      try {
         InetAddress $$1 = InetAddress.getByName($$0.a());
         return Optional.of(frr.a(new InetSocketAddress($$1, $$0.b())));
      } catch (UnknownHostException var2) {
         a.debug("Couldn't resolve server {} address", $$0.a(), var2);
         return Optional.empty();
      }
   };

   Optional<frr> resolve(frs var1);
}
