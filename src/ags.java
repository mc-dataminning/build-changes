import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface ags extends wm {
   Logger a = LogUtils.getLogger();

   @Override
   default void a(zh $$0, Exception $$1) throws aa {
      a.error("Failed to handle packet {}, suppressing error", $$0, $$1);
   }
}
