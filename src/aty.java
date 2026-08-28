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

public abstract class aty implements aug {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final aua b = aua.a("core");
   private final ath d;
   private final atj e;
   private final alc f;
   private final eyi g;

   public aty(ath $$0, atj $$1, alc $$2, eyi $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<aub> $$0) {
      aub $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract aub a(atf var1);

   protected abstract xd a(String var1);

   public atj a() {
      return this.e;
   }

   private void a(Consumer<aub> $$0) {
      Map<String, Function<String, aub>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         aub $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, aub>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, aub>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            atz.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract aub a(String var1, aub.c var2, xd var3);

   protected static aub.c b(final atf $$0) {
      return new aub.c() {
         @Override
         public atf a(ate $$0x) {
            return $$0;
         }

         @Override
         public atf a(ate $$0x, aub.a $$1) {
            return $$0;
         }
      };
   }
}
