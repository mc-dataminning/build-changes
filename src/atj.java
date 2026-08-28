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

public abstract class atj implements atr {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final atl b = atl.a("core");
   private final ass d;
   private final asu e;
   private final akr f;
   private final ewq g;

   public atj(ass $$0, asu $$1, akr $$2, ewq $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<atm> $$0) {
      atm $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract atm a(asq var1);

   protected abstract wz a(String var1);

   public asu a() {
      return this.e;
   }

   private void a(Consumer<atm> $$0) {
      Map<String, Function<String, atm>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         atm $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, atm>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, atm>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            atk.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract atm a(String var1, atm.c var2, wz var3);

   protected static atm.c b(final asq $$0) {
      return new atm.c() {
         @Override
         public asq a(asp $$0x) {
            return $$0;
         }

         @Override
         public asq a(asp $$0x, atm.a $$1) {
            return $$0;
         }
      };
   }
}
