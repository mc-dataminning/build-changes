import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface agr extends wp {
   Logger a = LogUtils.getLogger();

   @Override
   default void a(zk $$0, Exception $$1) throws z {
      a.error("Failed to handle packet {}, suppressing error", $$0, $$1);
   }
}
