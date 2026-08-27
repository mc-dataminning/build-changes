import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.nio.file.Path;
import org.slf4j.Logger;

public class ete {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final fqd[] e = new fqd[9];
   private boolean f;

   public ete(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new fqd();
      }
   }

   private void b() {
      try {
         sd $$0 = sq.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = ss.b($$0, 1343);
         $$0 = auw.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2].a($$0.c(String.valueOf($$2), 10));
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         sd $$0 = ss.g(new sd());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            $$0.a(String.valueOf($$1), this.a($$1).a());
         }

         sq.b($$0, this.c);
      } catch (Exception var3) {
         b.error("Failed to save creative mode options", var3);
      }
   }

   public fqd a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
