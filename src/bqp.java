import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqp {
   private static final Logger a = LogUtils.getLogger();
   private final LongSupplier b;
   private final long c;
   private int d;
   private final File e;
   private bqj f = bqi.a;

   public bqp(LongSupplier $$0, String $$1, long $$2) {
      this.b = $$0;
      this.e = new File("debug", $$1);
      this.c = $$2;
   }

   public bqm a() {
      this.f = new bqe(this.b, () -> this.d, () -> true);
      this.d++;
      return this.f;
   }

   public void b() {
      if (this.f != bqi.a) {
         bqk $$0 = this.f.d();
         this.f = bqi.a;
         if ($$0.g() >= this.c) {
            File $$1 = new File(this.e, "tick-results-" + af.f() + ".txt");
            $$0.a($$1.toPath());
            a.info("Recorded long tick -- wrote info to: {}", $$1.getAbsolutePath());
         }
      }
   }

   @Nullable
   public static bqp a(String $$0) {
      return null;
   }

   public static bqm a(bqm $$0, @Nullable bqp $$1) {
      return $$1 != null ? bqm.a($$1.a(), $$0) : $$0;
   }
}
