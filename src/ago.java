import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface ago extends wi {
   Logger a = LogUtils.getLogger();

   @Override
   default void a(zd $$0, Exception $$1) throws z {
      a.error("Failed to handle packet {}, suppressing error", $$0, $$1);
   }
}
