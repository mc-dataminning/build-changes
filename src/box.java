import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class box {
   private static final Logger a = LogUtils.getLogger();
   private final LongSupplier b;
   private final long c;
   private int d;
   private final File e;
   private bor f = boq.a;

   public box(LongSupplier $$0, String $$1, long $$2) {
      this.b = $$0;
      this.e = new File("debug", $$1);
      this.c = $$2;
   }

   public bou a() {
      this.f = new bom(this.b, () -> this.d, false);
      this.d++;
      return this.f;
   }

   public void b() {
      if (this.f != boq.a) {
         bos $$0 = this.f.d();
         this.f = boq.a;
         if ($$0.g() >= this.c) {
            File $$1 = new File(this.e, "tick-results-" + ae.f() + ".txt");
            $$0.a($$1.toPath());
            a.info("Recorded long tick -- wrote info to: {}", $$1.getAbsolutePath());
         }
      }
   }

   @Nullable
   public static box a(String $$0) {
      return null;
   }

   public static bou a(bou $$0, @Nullable box $$1) {
      return $$1 != null ? bou.a($$1.a(), $$0) : $$0;
   }
}
