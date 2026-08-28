import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class brg {
   private static final Logger a = LogUtils.getLogger();
   private final LongSupplier b;
   private final long c;
   private int d;
   private final File e;
   private bra f = bqz.a;

   public brg(LongSupplier $$0, String $$1, long $$2) {
      this.b = $$0;
      this.e = new File("debug", $$1);
      this.c = $$2;
   }

   public brd a() {
      this.f = new bqv(this.b, () -> this.d, () -> true);
      this.d++;
      return this.f;
   }

   public void b() {
      if (this.f != bqz.a) {
         brb $$0 = this.f.d();
         this.f = bqz.a;
         if ($$0.g() >= this.c) {
            File $$1 = new File(this.e, "tick-results-" + ag.f() + ".txt");
            $$0.a($$1.toPath());
            a.info("Recorded long tick -- wrote info to: {}", $$1.getAbsolutePath());
         }
      }
   }

   @Nullable
   public static brg a(String $$0) {
      return null;
   }

   public static brd a(brd $$0, @Nullable brg $$1) {
      return $$1 != null ? brd.a($$1.a(), $$0) : $$0;
   }
}
