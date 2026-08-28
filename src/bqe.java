import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqe {
   private static final Logger a = LogUtils.getLogger();
   private final LongSupplier b;
   private final long c;
   private int d;
   private final File e;
   private bpy f = bpx.a;

   public bqe(LongSupplier $$0, String $$1, long $$2) {
      this.b = $$0;
      this.e = new File("debug", $$1);
      this.c = $$2;
   }

   public bqb a() {
      this.f = new bpt(this.b, () -> this.d, () -> true);
      this.d++;
      return this.f;
   }

   public void b() {
      if (this.f != bpx.a) {
         bpz $$0 = this.f.d();
         this.f = bpx.a;
         if ($$0.g() >= this.c) {
            File $$1 = new File(this.e, "tick-results-" + af.f() + ".txt");
            $$0.a($$1.toPath());
            a.info("Recorded long tick -- wrote info to: {}", $$1.getAbsolutePath());
         }
      }
   }

   @Nullable
   public static bqe a(String $$0) {
      return null;
   }

   public static bqb a(bqb $$0, @Nullable bqe $$1) {
      return $$1 != null ? bqb.a($$1.a(), $$0) : $$0;
   }
}
