import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface agz extends wx {
   Logger a = LogUtils.getLogger();

   @Override
   default void a(zs $$0, Exception $$1) throws z {
      a.error("Failed to handle packet {}, suppressing error", $$0, $$1);
   }
}
