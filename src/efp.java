import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.Function;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class efp {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract sl a(sl var1);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean d() {
      return this.b;
   }

   public void a(File $$0) {
      if (this.d()) {
         sl $$1 = new sl();
         $$1.a("data", this.a(new sl()));
         ta.g($$1);

         try {
            sy.a($$1, $$0.toPath());
         } catch (IOException var4) {
            a.error("Could not save data {}", this, var4);
         }

         this.a(false);
      }
   }

   public static record a<T extends efp>(Supplier<T> a, Function<sl, T> b, avq c) {
   }
}
