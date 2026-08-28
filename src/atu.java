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
   private final atd d;
   private final atf e;
   private final alf f;
   private final evi g;

   public atu(atd $$0, atf $$1, alf $$2, evi $$3) {
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
   protected abstract atx a(atb var1);

   protected abstract xp a(String var1);

   public atf a() {
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
   protected abstract atx a(String var1, atx.c var2, xp var3);

   protected static atx.c b(final atb $$0) {
      return new atx.c() {
         @Override
         public atb a(ata $$0x) {
            return $$0;
         }

         @Override
         public atb a(ata $$0x, atx.a $$1) {
            return $$0;
         }
      };
   }
}
