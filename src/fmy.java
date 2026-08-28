import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class fmy {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final gmy[] e = new gmy[9];
   private boolean f;

   public fmy(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new gmy();
      }
   }

   private void b() {
      try {
         tw $$0 = uj.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = ul.b($$0, 1343);
         $$0 = bax.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = gmy.a.parse(uk.a, $$0.c(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(gmy::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         tw $$0 = ul.e(new tw());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            gmy $$2 = this.a($$1);
            DataResult<ut> $$3 = gmy.a.encodeStart(uk.a, $$2);
            $$0.a(String.valueOf($$1), (ut)$$3.getOrThrow());
         }

         uj.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public gmy a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
