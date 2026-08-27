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

public abstract class apn implements apu {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "vanilla";
   private final aow c;
   private final aoy d;
   private final ahg e;
   private final eli f;

   public apn(aow $$0, aoy $$1, ahg $$2, eli $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public void loadPacks(Consumer<app> $$0) {
      app $$1 = this.a(this.d);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract app a(aov var1);

   protected abstract vf a(String var1);

   public aoy a() {
      return this.d;
   }

   private void a(Consumer<app> $$0) {
      Map<String, Function<String, app>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         app $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, app>> $$0) {
      this.d.a(this.c, this.e, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, app>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            apo.a($$0, this.f, true, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            b.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract app a(String var1, app.c var2, vf var3);

   protected static app.c b(final aov $$0) {
      return new app.c() {
         @Override
         public aov a(String $$0x) {
            return $$0;
         }

         @Override
         public aov a(String $$0x, app.a $$1) {
            return $$0;
         }
      };
   }
}
