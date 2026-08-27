import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzb {
   private static final Logger b = LogUtils.getLogger();
   private final File c;
   protected final DataFixer a;

   public dzb(dyy.c $$0, DataFixer $$1) {
      this.a = $$1;
      this.c = $$0.a(dyw.c).toFile();
      this.c.mkdirs();
   }

   public void a(byo $$0) {
      try {
         qr $$1 = $$0.f(new qr());
         File $$2 = File.createTempFile($$0.cu() + "-", ".dat", this.c);
         rb.a($$1, $$2);
         File $$3 = new File(this.c, $$0.cu() + ".dat");
         File $$4 = new File(this.c, $$0.cu() + ".dat_old");
         ac.a($$3, $$2, $$4);
      } catch (Exception var6) {
         b.warn("Failed to save player data for {}", $$0.Z().getString());
      }
   }

   @Nullable
   public qr b(byo $$0) {
      qr $$1 = null;

      try {
         File $$2 = new File(this.c, $$0.cu() + ".dat");
         if ($$2.exists() && $$2.isFile()) {
            $$1 = rb.a($$2);
         }
      } catch (Exception var4) {
         b.warn("Failed to load player data for {}", $$0.Z().getString());
      }

      if ($$1 != null) {
         int $$4 = rd.b($$1, -1);
         $$0.g(aqc.b.a(this.a, $$1, $$4));
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
