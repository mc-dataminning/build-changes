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

public abstract class auj implements aur {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final String b = "tests";
   public static final aul c = aul.a("core");
   private final att e;
   private final atv f;
   private final ali g;
   private final ffg h;

   public auj(att $$0, atv $$1, ali $$2, ffg $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
   }

   @Override
   public void loadPacks(Consumer<aum> $$0) {
      aum $$1 = this.a(this.f);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract aum a(atr var1);

   protected abstract xa a(String var1);

   public atv a() {
      return this.f;
   }

   private void a(Consumer<aum> $$0) {
      Map<String, Function<String, aum>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         aum $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, aum>> $$0) {
      this.f.a(this.e, this.g, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, aum>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            auk.a($$0, this.h, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            d.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract aum a(String var1, aum.c var2, xa var3);

   protected static aum.c b(final atr $$0) {
      return new aum.c() {
         @Override
         public atr a(atq $$0x) {
            return $$0;
         }

         @Override
         public atr a(atq $$0x, aum.a $$1) {
            return $$0;
         }
      };
   }
}
