import com.mojang.logging.LogUtils;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aky extends PrintStream {
   private static final Logger b = LogUtils.getLogger();
   protected final String a;

   public aky(String $$0, OutputStream $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void println(@Nullable String $$0) {
      this.a($$0);
   }

   @Override
   public void println(Object $$0) {
      this.a(String.valueOf($$0));
   }

   protected void a(@Nullable String $$0) {
      b.info("[{}]: {}", this.a, $$0);
   }
}
