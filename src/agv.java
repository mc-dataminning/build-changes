import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface agv extends wt {
   Logger a = LogUtils.getLogger();

   @Override
   default void a(zo $$0, Exception $$1) throws z {
      a.error("Failed to handle packet {}, suppressing error", $$0, $$1);
   }
}
