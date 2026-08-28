import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class ffp {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final gdh[] e = new gdh[9];
   private boolean f;

   public ffp(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new gdh();
      }
   }

   private void b() {
      try {
         tx $$0 = uk.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = um.b($$0, 1343);
         $$0 = azo.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = gdh.a.parse(ul.a, $$0.c(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(gdh::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         tx $$0 = um.e(new tx());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            gdh $$2 = this.a($$1);
            DataResult<uu> $$3 = gdh.a.encodeStart(ul.a, $$2);
            $$0.a(String.valueOf($$1), (uu)$$3.getOrThrow());
         }

         uk.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public gdh a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
