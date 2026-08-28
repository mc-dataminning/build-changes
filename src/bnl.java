import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bnl {
   private static final Logger a = LogUtils.getLogger();
   private final LongSupplier b;
   private final long c;
   private int d;
   private final File e;
   private bng f = bnf.a;

   public bnl(LongSupplier $$0, String $$1, long $$2) {
      this.b = $$0;
      this.e = new File("debug", $$1);
      this.c = $$2;
   }

   public bni a() {
      this.f = new bnb(this.b, () -> this.d, false);
      this.d++;
      return this.f;
   }

   public void b() {
      if (this.f != bnf.a) {
         bnh $$0 = this.f.d();
         this.f = bnf.a;
         if ($$0.g() >= this.c) {
            File $$1 = new File(this.e, "tick-results-" + ac.f() + ".txt");
            $$0.a($$1.toPath());
            a.info("Recorded long tick -- wrote info to: {}", $$1.getAbsolutePath());
         }
      }
   }

   @Nullable
   public static bnl a(String $$0) {
      return null;
   }

   public static bni a(bni $$0, @Nullable bnl $$1) {
      return $$1 != null ? bni.a($$1.a(), $$0) : $$0;
   }
}
