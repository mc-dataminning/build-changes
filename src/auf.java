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

public abstract class auf implements aun {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final String b = "tests";
   public static final auh c = auh.a("core");
   private final atp e;
   private final atr f;
   private final ale g;
   private final fdm h;

   public auf(atp $$0, atr $$1, ale $$2, fdm $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
   }

   @Override
   public void loadPacks(Consumer<aui> $$0) {
      aui $$1 = this.a(this.f);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract aui a(atn var1);

   protected abstract ww a(String var1);

   public atr a() {
      return this.f;
   }

   private void a(Consumer<aui> $$0) {
      Map<String, Function<String, aui>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         aui $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, aui>> $$0) {
      this.f.a(this.e, this.g, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, aui>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            aug.a($$0, this.h, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            d.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract aui a(String var1, aui.c var2, ww var3);

   protected static aui.c b(final atn $$0) {
      return new aui.c() {
         @Override
         public atn a(atm $$0x) {
            return $$0;
         }

         @Override
         public atn a(atm $$0x, aui.a $$1) {
            return $$0;
         }
      };
   }
}
