import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bog {
   private static final Logger a = LogUtils.getLogger();
   private final LongSupplier b;
   private final long c;
   private int d;
   private final File e;
   private bob f = boa.a;

   public bog(LongSupplier $$0, String $$1, long $$2) {
      this.b = $$0;
      this.e = new File("debug", $$1);
      this.c = $$2;
   }

   public bod a() {
      this.f = new bnw(this.b, () -> this.d, false);
      this.d++;
      return this.f;
   }

   public void b() {
      if (this.f != boa.a) {
         boc $$0 = this.f.d();
         this.f = boa.a;
         if ($$0.g() >= this.c) {
            File $$1 = new File(this.e, "tick-results-" + ad.f() + ".txt");
            $$0.a($$1.toPath());
            a.info("Recorded long tick -- wrote info to: {}", $$1.getAbsolutePath());
         }
      }
   }

   @Nullable
   public static bog a(String $$0) {
      return null;
   }

   public static bod a(bod $$0, @Nullable bog $$1) {
      return $$1 != null ? bod.a($$1.a(), $$0) : $$0;
   }
}
