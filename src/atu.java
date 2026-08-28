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

public abstract class atu implements auc {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final atw b = atw.a("core");
   private final ate d;
   private final atg e;
   private final akv f;
   private final far g;

   public atu(ate $$0, atg $$1, akv $$2, far $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<atx> $$0) {
      atx $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract atx a(atc var1);

   protected abstract wp a(String var1);

   public atg a() {
      return this.e;
   }

   private void a(Consumer<atx> $$0) {
      Map<String, Function<String, atx>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         atx $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, atx>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, atx>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            atv.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract atx a(String var1, atx.c var2, wp var3);

   protected static atx.c b(final atc $$0) {
      return new atx.c() {
         @Override
         public atc a(atb $$0x) {
            return $$0;
         }

         @Override
         public atc a(atb $$0x, atx.a $$1) {
            return $$0;
         }
      };
   }
}
