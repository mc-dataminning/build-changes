import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class fql {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final gqo[] e = new gqo[9];
   private boolean f;

   public fql(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new gqo();
      }
   }

   private void b() {
      try {
         ua $$0 = un.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = up.b($$0, 1343);
         $$0 = bbo.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = gqo.a.parse(uo.a, $$0.a(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(gqo::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         ua $$0 = up.e(new ua());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            gqo $$2 = this.a($$1);
            DataResult<va> $$3 = gqo.a.encodeStart(uo.a, $$2);
            $$0.a(String.valueOf($$1), (va)$$3.getOrThrow());
         }

         un.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public gqo a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
