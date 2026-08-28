import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface agx extends xb {
   Logger a = LogUtils.getLogger();

   @Override
   default void a(zw $$0, Exception $$1) throws y {
      a.error("Failed to handle packet {}, suppressing error", $$0, $$1);
   }
}
