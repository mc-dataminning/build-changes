import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class eql {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract ub a(ub var1, jo.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean d() {
      return this.b;
   }

   public void a(File $$0, jo.a $$1) {
      if (this.d()) {
         ub $$2 = new ub();
         $$2.a("data", this.a(new ub(), $$1));
         uq.e($$2);

         try {
            uo.a($$2, $$0.toPath());
         } catch (IOException var5) {
            a.error("Could not save data {}", this, var5);
         }

         this.a(false);
      }
   }

   public static record a<T extends eql>(Supplier<T> a, BiFunction<ub, jo.a, T> b, azw c) {
   }
}
