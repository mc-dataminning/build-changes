import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bfv {
   private static final Logger a = LogUtils.getLogger();
   private final LongSupplier b;
   private final long c;
   private int d;
   private final File e;
   private bfq f = bfp.a;

   public bfv(LongSupplier $$0, String $$1, long $$2) {
      this.b = $$0;
      this.e = new File("debug", $$1);
      this.c = $$2;
   }

   public bfs a() {
      this.f = new bfl(this.b, () -> this.d, false);
      this.d++;
      return this.f;
   }

   public void b() {
      if (this.f != bfp.a) {
         bfr $$0 = this.f.d();
         this.f = bfp.a;
         if ($$0.g() >= this.c) {
            File $$1 = new File(this.e, "tick-results-" + ac.e() + ".txt");
            $$0.a($$1.toPath());
            a.info("Recorded long tick -- wrote info to: {}", $$1.getAbsolutePath());
         }
      }
   }

   @Nullable
   public static bfv a(String $$0) {
      return null;
   }

   public static bfs a(bfs $$0, @Nullable bfv $$1) {
      return $$1 != null ? bfs.a($$1.a(), $$0) : $$0;
   }
}
