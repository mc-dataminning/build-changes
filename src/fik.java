import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import java.nio.file.Path;
import org.slf4j.Logger;

public class fik {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 9;
   private final Path c;
   private final DataFixer d;
   private final ggj[] e = new ggj[9];
   private boolean f;

   public fik(Path $$0, DataFixer $$1) {
      this.c = $$0.resolve("hotbar.nbt");
      this.d = $$1;

      for (int $$2 = 0; $$2 < 9; $$2++) {
         this.e[$$2] = new ggj();
      }
   }

   private void b() {
      try {
         ug $$0 = ut.a(this.c);
         if ($$0 == null) {
            return;
         }

         int $$1 = uv.b($$0, 1343);
         $$0 = bao.d.a(this.d, $$0, $$1);

         for (int $$2 = 0; $$2 < 9; $$2++) {
            this.e[$$2] = ggj.a.parse(uu.a, $$0.c(String.valueOf($$2))).resultOrPartial($$0x -> b.warn("Failed to parse hotbar: {}", $$0x)).orElseGet(ggj::new);
         }
      } catch (Exception var4) {
         b.error("Failed to load creative mode options", var4);
      }
   }

   public void a() {
      try {
         ug $$0 = uv.e(new ug());

         for (int $$1 = 0; $$1 < 9; $$1++) {
            ggj $$2 = this.a($$1);
            DataResult<vd> $$3 = ggj.a.encodeStart(uu.a, $$2);
            $$0.a(String.valueOf($$1), (vd)$$3.getOrThrow());
         }

         ut.b($$0, this.c);
      } catch (Exception var5) {
         b.error("Failed to save creative mode options", var5);
      }
   }

   public ggj a(int $$0) {
      if (!this.f) {
         this.b();
         this.f = true;
      }

      return this.e[$$0];
   }
}
