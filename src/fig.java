import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class fig {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final gge[] e = new gge[9];
   private boolean f;

   public fig(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new gge();
      }
   }

   private void b() {
      try {
         uf $$0 = us.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = uu.b($$0, 1343);
         $$0 = bam.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = gge.a.parse(ut.a, $$0.c(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(gge::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         uf $$0 = uu.e(new uf());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            gge $$2 = this.a($$1);
            DataResult<vc> $$3 = gge.a.encodeStart(ut.a, $$2);
            $$0.a(String.valueOf($$1), (vc)$$3.getOrThrow());
         }

         us.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public gge a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
