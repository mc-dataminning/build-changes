import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class fgi {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final geb[] e = new geb[9];
   private boolean f;

   public fgi(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new geb();
      }
   }

   private void b() {
      try {
         ub $$0 = uo.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = uq.b($$0, 1343);
         $$0 = azw.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = geb.a.parse(up.a, $$0.c(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(geb::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         ub $$0 = uq.e(new ub());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            geb $$2 = this.a($$1);
            DataResult<uy> $$3 = geb.a.encodeStart(up.a, $$2);
            $$0.a(String.valueOf($$1), (uy)$$3.getOrThrow());
         }

         uo.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public geb a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
