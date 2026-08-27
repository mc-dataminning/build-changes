import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ecj {
   private static final Logger b = LogUtils.getLogger();
   private final File c;
   protected final DataFixer a;

   public ecj(ecg.c $$0, DataFixer $$1) {
      this.a = $$1;
      this.c = $$0.a(ece.c).toFile();
      this.c.mkdirs();
   }

   public void a(cbu $$0) {
      try {
         qx $$1 = $$0.f(new qx());
         File $$2 = File.createTempFile($$0.cx() + "-", ".dat", this.c);
         rh.a($$1, $$2);
         File $$3 = new File(this.c, $$0.cx() + ".dat");
         File $$4 = new File(this.c, $$0.cx() + ".dat_old");
         ac.a($$3, $$2, $$4);
      } catch (Exception var6) {
         b.warn("Failed to save player data for {}", $$0.ac().getString());
      }
   }

   @Nullable
   public qx b(cbu $$0) {
      qx $$1 = null;

      try {
         File $$2 = new File(this.c, $$0.cx() + ".dat");
         if ($$2.exists() && $$2.isFile()) {
            $$1 = rh.a($$2);
         }
      } catch (Exception var4) {
         b.warn("Failed to load player data for {}", $$0.ac().getString());
      }

      if ($$1 != null) {
         int $$4 = rj.b($$1, -1);
         $$0.g(ata.b.a(this.a, $$1, $$4));
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
