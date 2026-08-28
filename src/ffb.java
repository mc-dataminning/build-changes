import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class ffb {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final gcs[] e = new gcs[9];
   private boolean f;

   public ffb(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new gcs();
      }
   }

   private void b() {
      try {
         us $$0 = vf.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = vh.b($$0, 1343);
         $$0 = bag.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = gcs.a.parse(vg.a, $$0.c(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(gcs::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         us $$0 = vh.e(new us());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            gcs $$2 = this.a($$1);
            DataResult<vp> $$3 = gcs.a.encodeStart(vg.a, $$2);
            $$0.a(String.valueOf($$1), (vp)$$3.getOrThrow());
         }

         vf.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public gcs a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
