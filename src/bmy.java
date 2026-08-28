import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bmy {
   private static final Logger a = LogUtils.getLogger();
   private final LongSupplier b;
   private final long c;
   private int d;
   private final File e;
   private bmt f = bms.a;

   public bmy(LongSupplier $$0, String $$1, long $$2) {
      this.b = $$0;
      this.e = new File("debug", $$1);
      this.c = $$2;
   }

   public bmv a() {
      this.f = new bmo(this.b, () -> this.d, false);
      this.d++;
      return this.f;
   }

   public void b() {
      if (this.f != bms.a) {
         bmu $$0 = this.f.d();
         this.f = bms.a;
         if ($$0.g() >= this.c) {
            File $$1 = new File(this.e, "tick-results-" + ac.f() + ".txt");
            $$0.a($$1.toPath());
            a.info("Recorded long tick -- wrote info to: {}", $$1.getAbsolutePath());
         }
      }
   }

   @Nullable
   public static bmy a(String $$0) {
      return null;
   }

   public static bmv a(bmv $$0, @Nullable bmy $$1) {
      return $$1 != null ? bmv.a($$1.a(), $$0) : $$0;
   }
}
