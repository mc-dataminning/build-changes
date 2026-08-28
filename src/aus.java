import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public abstract class aus implements avb {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final String b = "tests";
   public static final auu c = auu.a("core");
   private final auc e;
   private final aue f;
   private final alr g;
   private final ffs h;

   public aus(auc $$0, aue $$1, alr $$2, ffs $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
   }

   @Override
   public void loadPacks(Consumer<auv> $$0) {
      auv $$1 = this.a(this.f);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract auv a(aua var1);

   protected abstract xg a(String var1);

   public aue a() {
      return this.f;
   }

   private void a(Consumer<auv> $$0) {
      Map<String, Function<String, auv>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         auv $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, auv>> $$0) {
      this.f.a(this.e, this.g, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, auv>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            aut.a($$0, this.h, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            d.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract auv a(String var1, auv.c var2, xg var3);

   protected static auv.c b(final aua $$0) {
      return new auv.c() {
         @Override
         public aua a(atz $$0x) {
            return $$0;
         }

         @Override
         public aua a(atz $$0x, auv.a $$1) {
            return $$0;
         }
      };
   }
}
