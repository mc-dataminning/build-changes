import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class fqy {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final grb[] e = new grb[9];
   private boolean f;

   public fqy(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new grb();
      }
   }

   private void b() {
      try {
         tz $$0 = um.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = uo.b($$0, 1343);
         $$0 = bbd.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = grb.a.parse(un.a, $$0.a(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(grb::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         tz $$0 = uo.e(new tz());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            grb $$2 = this.a($$1);
            DataResult<uy> $$3 = grb.a.encodeStart(un.a, $$2);
            $$0.a(String.valueOf($$1), (uy)$$3.getOrThrow());
         }

         um.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public grb a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
