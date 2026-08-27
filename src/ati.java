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

public abstract class ati implements atq {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final atk b = atk.a("core");
   private final asr d;
   private final ast e;
   private final akt f;
   private final ewk g;

   public ati(asr $$0, ast $$1, akt $$2, ewk $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<atl> $$0) {
      atl $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract atl a(asp var1);

   protected abstract xe a(String var1);

   public ast a() {
      return this.e;
   }

   private void a(Consumer<atl> $$0) {
      Map<String, Function<String, atl>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         atl $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, atl>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, atl>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            atj.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract atl a(String var1, atl.c var2, xe var3);

   protected static atl.c b(final asp $$0) {
      return new atl.c() {
         @Override
         public asp a(aso $$0x) {
            return $$0;
         }

         @Override
         public asp a(aso $$0x, atl.a $$1) {
            return $$0;
         }
      };
   }
}
