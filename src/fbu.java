import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class fbu {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final fzm[] e = new fzm[9];
   private boolean f;

   public fbu(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new fzm();
      }
   }

   private void b() {
      try {
         to $$0 = ub.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = ud.b($$0, 1343);
         $$0 = ays.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = fzm.a.parse(uc.a, $$0.c(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(fzm::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         to $$0 = ud.e(new to());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            fzm $$2 = this.a($$1);
            DataResult<ul> $$3 = fzm.a.encodeStart(uc.a, $$2);
            $$0.a(String.valueOf($$1), ac.a($$3, IllegalStateException::new));
         }

         ub.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public fzm a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
