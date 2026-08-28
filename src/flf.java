import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class flf {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final gkz[] e = new gkz[9];
   private boolean f;

   public flf(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new gkz();
      }
   }

   private void b() {
      try {
         tq $$0 = ud.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = uf.b($$0, 1343);
         $$0 = ban.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = gkz.a.parse(ue.a, $$0.c(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(gkz::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         tq $$0 = uf.e(new tq());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            gkz $$2 = this.a($$1);
            DataResult<un> $$3 = gkz.a.encodeStart(ue.a, $$2);
            $$0.a(String.valueOf($$1), (un)$$3.getOrThrow());
         }

         ud.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public gkz a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
