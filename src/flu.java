import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class flu {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final gke[] e = new gke[9];
   private boolean f;

   public flu(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new gke();
      }
   }

   private void b() {
      try {
         um $$0 = uz.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = vb.b($$0, 1343);
         $$0 = bbi.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = gke.a.parse(va.a, $$0.c(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(gke::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         um $$0 = vb.e(new um());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            gke $$2 = this.a($$1);
            DataResult<vj> $$3 = gke.a.encodeStart(va.a, $$2);
            $$0.a(String.valueOf($$1), (vj)$$3.getOrThrow());
         }

         uz.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public gke a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
