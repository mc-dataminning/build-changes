import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class eze {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final fww[] e = new fww[9];
   private boolean f;

   public eze(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new fww();
      }
   }

   private void b() {
      try {
         ta $$0 = tn.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = tp.b($$0, 1343);
         $$0 = ayc.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = fww.a.parse(to.a, $$0.c(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(fww::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         ta $$0 = tp.f(new ta());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            fww $$2 = this.a($$1);
            DataResult<tx> $$3 = fww.a.encodeStart(to.a, $$2);
            $$0.a(String.valueOf($$1), ac.a($$3, IllegalStateException::new));
         }

         tn.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public fww a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
