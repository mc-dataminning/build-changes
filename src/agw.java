import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface agw extends xa {
   Logger a = LogUtils.getLogger();

   @Override
   default void a(zv $$0, Exception $$1) throws y {
      a.error("Failed to handle packet {}, suppressing error", $$0, $$1);
   }
}
