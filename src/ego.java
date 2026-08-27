import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ego {
   private static final Logger b = LogUtils.getLogger();
   private final File c;
   protected final DataFixer a;

   public ego(egl.c $$0, DataFixer $$1) {
      this.a = $$1;
      this.c = $$0.a(egj.c).toFile();
      this.c.mkdirs();
   }

   public void a(cfh $$0) {
      try {
         sn $$1 = $$0.f(new sn());
         Path $$2 = this.c.toPath();
         Path $$3 = Files.createTempFile($$2, $$0.cx() + "-", ".dat");
         ta.a($$1, $$3);
         Path $$4 = $$2.resolve($$0.cx() + ".dat");
         Path $$5 = $$2.resolve($$0.cx() + ".dat_old");
         ac.a($$4, $$3, $$5);
      } catch (Exception var7) {
         b.warn("Failed to save player data for {}", $$0.ad().getString());
      }
   }

   @Nullable
   public sn b(cfh $$0) {
      sn $$1 = null;

      try {
         File $$2 = new File(this.c, $$0.cx() + ".dat");
         if ($$2.exists() && $$2.isFile()) {
            $$1 = ta.a($$2.toPath(), sw.a());
         }
      } catch (Exception var4) {
         b.warn("Failed to load player data for {}", $$0.ad().getString());
      }

      if ($$1 != null) {
         int $$4 = tc.b($$1, -1);
         $$1 = avv.b.a(this.a, $$1, $$4);
         $$0.g($$1);
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
