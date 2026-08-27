import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.nio.file.Path;
import org.slf4j.Logger;

public class eve {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final fsl[] e = new fsl[9];
   private boolean f;

   public eve(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new fsl();
      }
   }

   private void b() {
      try {
         sn $$0 = ta.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = tc.b($$0, 1343);
         $$0 = avw.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2].a($$0.c(String.valueOf($$2), 10));
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         sn $$0 = tc.g(new sn());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            $$0.a(String.valueOf($$1), this.a($$1).a());
         }

         ta.b($$0, this.c);
      } catch (Exception var3) {
         b.error("Failed to save creative mode options", var3);
      }
   }

   public fsl a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
