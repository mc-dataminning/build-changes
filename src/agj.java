import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface agj extends wl {
   Logger a = LogUtils.getLogger();

   @Override
   default void a(zg $$0, Exception $$1) throws z {
      a.error("Failed to handle packet {}, suppressing error", $$0, $$1);
   }
}
