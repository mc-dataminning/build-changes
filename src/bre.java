import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bre {
   private static final Logger a = LogUtils.getLogger();
   private final LongSupplier b;
   private final long c;
   private int d;
   private final File e;
   private bqy f = bqx.a;

   public bre(LongSupplier $$0, String $$1, long $$2) {
      this.b = $$0;
      this.e = new File("debug", $$1);
      this.c = $$2;
   }

   public brb a() {
      this.f = new bqt(this.b, () -> this.d, () -> true);
      this.d++;
      return this.f;
   }

   public void b() {
      if (this.f != bqx.a) {
         bqz $$0 = this.f.d();
         this.f = bqx.a;
         if ($$0.g() >= this.c) {
            File $$1 = new File(this.e, "tick-results-" + ag.f() + ".txt");
            $$0.a($$1.toPath());
            a.info("Recorded long tick -- wrote info to: {}", $$1.getAbsolutePath());
         }
      }
   }

   @Nullable
   public static bre a(String $$0) {
      return null;
   }

   public static brb a(brb $$0, @Nullable bre $$1) {
      return $$1 != null ? brb.a($$1.a(), $$0) : $$0;
   }
}
