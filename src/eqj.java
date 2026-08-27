import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import org.slf4j.Logger;

public class eqj {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final File c;
   private final DataFixer d;
   private final fmk[] e = new fmk[9];
   private boolean f;

   public eqj(File $$0, DataFixer $$1) {
      this.c = new File($$0, "hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new fmk();
      }
   }

   private void b() {
      try {
         qs $$0 = rc.b(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = re.b($$0, 1343);
         $$0 = asq.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2].a($$0.c(String.valueOf($$2), 10));
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         qs $$0 = re.g(new qs());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            $$0.a(String.valueOf($$1), this.a($$1).a());
         }

         rc.b($$0, this.c);
      } catch (Exception var3) {
         b.error("Failed to save creative mode options", var3);
      }
   }

   public fmk a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
