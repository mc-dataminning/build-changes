import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.nio.file.Path;
import org.slf4j.Logger;

public class exd {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final fuq[] e = new fuq[9];
   private boolean f;

   public exd(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new fuq();
      }
   }

   private void b() {
      try {
         sw $$0 = tj.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = tl.b($$0, 1343);
         $$0 = axo.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2].a($$0.c(String.valueOf($$2), 10));
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         sw $$0 = tl.g(new sw());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            $$0.a(String.valueOf($$1), this.a($$1).a());
         }

         tj.b($$0, this.c);
      } catch (Exception var3) {
         b.error("Failed to save creative mode options", var3);
      }
   }

   public fuq a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
