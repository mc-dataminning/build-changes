import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ecl {
   private static final Logger b = LogUtils.getLogger();
   private final File c;
   protected final DataFixer a;

   public ecl(eci.c $$0, DataFixer $$1) {
      this.a = $$1;
      this.c = $$0.a(ecg.c).toFile();
      this.c.mkdirs();
   }

   public void a(cbw $$0) {
      try {
         qy $$1 = $$0.f(new qy());
         File $$2 = File.createTempFile($$0.cw() + "-", ".dat", this.c);
         rj.a($$1, $$2);
         File $$3 = new File(this.c, $$0.cw() + ".dat");
         File $$4 = new File(this.c, $$0.cw() + ".dat_old");
         ac.a($$3, $$2, $$4);
      } catch (Exception var6) {
         b.warn("Failed to save player data for {}", $$0.ab().getString());
      }
   }

   @Nullable
   public qy b(cbw $$0) {
      qy $$1 = null;

      try {
         File $$2 = new File(this.c, $$0.cw() + ".dat");
         if ($$2.exists() && $$2.isFile()) {
            $$1 = rj.a($$2);
         }
      } catch (Exception var4) {
         b.warn("Failed to load player data for {}", $$0.ab().getString());
      }

      if ($$1 != null) {
         int $$4 = rl.b($$1, -1);
         $$0.g(atc.b.a(this.a, $$1, $$4));
      }

      return $$1;
   }

   public String[] a() {
      String[] $$0 = this.c.list();
      if ($$0 == null) {
         $$0 = new String[0];
      }

      for (int $$1 = 0; $$1 < $$0.length; $$1++) {
         if ($$0[$$1].endsWith(".dat")) {
            $$0[$$1] = $$0[$$1].substring(0, $$0[$$1].length() - 4);
         }
      }

      return $$0;
   }
}
