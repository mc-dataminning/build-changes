import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class fcq {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final gai[] e = new gai[9];
   private boolean f;

   public fcq(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new gai();
      }
   }

   private void b() {
      try {
         ty $$0 = ul.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = un.b($$0, 1343);
         $$0 = azc.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = gai.a.parse(um.a, $$0.c(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(gai::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         ty $$0 = un.e(new ty());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            gai $$2 = this.a($$1);
            DataResult<uv> $$3 = gai.a.encodeStart(um.a, $$2);
            $$0.a(String.valueOf($$1), ac.a($$3, IllegalStateException::new));
         }

         ul.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public gai a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
