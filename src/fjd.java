import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class fjd {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final ghf[] e = new ghf[9];
   private boolean f;

   public fjd(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new ghf();
      }
   }

   private void b() {
      try {
         uk $$0 = ux.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = uz.b($$0, 1343);
         $$0 = bat.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = ghf.a.parse(uy.a, $$0.c(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(ghf::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         uk $$0 = uz.e(new uk());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            ghf $$2 = this.a($$1);
            DataResult<vh> $$3 = ghf.a.encodeStart(uy.a, $$2);
            $$0.a(String.valueOf($$1), (vh)$$3.getOrThrow());
         }

         ux.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public ghf a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
