import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eeq {
   private static final Logger b = LogUtils.getLogger();
   private final File c;
   protected final DataFixer a;

   public eeq(een.c $$0, DataFixer $$1) {
      this.a = $$1;
      this.c = $$0.a(eel.c).toFile();
      this.c.mkdirs();
   }

   public void a(cdu $$0) {
      try {
         rz $$1 = $$0.f(new rz());
         File $$2 = File.createTempFile($$0.cx() + "-", ".dat", this.c);
         sm.a($$1, $$2);
         File $$3 = new File(this.c, $$0.cx() + ".dat");
         File $$4 = new File(this.c, $$0.cx() + ".dat_old");
         ac.a($$3, $$2, $$4);
      } catch (Exception var6) {
         b.warn("Failed to save player data for {}", $$0.ad().getString());
      }
   }

   @Nullable
   public rz b(cdu $$0) {
      rz $$1 = null;

      try {
         File $$2 = new File(this.c, $$0.cx() + ".dat");
         if ($$2.exists() && $$2.isFile()) {
            $$1 = sm.a($$2, si.a());
         }
      } catch (Exception var4) {
         b.warn("Failed to load player data for {}", $$0.ad().getString());
      }

      if ($$1 != null) {
         int $$4 = so.b($$1, -1);
         $$0.g(aus.b.a(this.a, $$1, $$4));
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
