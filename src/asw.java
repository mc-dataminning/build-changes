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

public abstract class asw implements ate {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final asy b = asy.a("core");
   private final asf d;
   private final ash e;
   private final akh f;
   private final etf g;

   public asw(asf $$0, ash $$1, akh $$2, etf $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<asz> $$0) {
      asz $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract asz a(asd var1);

   protected abstract wu a(String var1);

   public ash a() {
      return this.e;
   }

   private void a(Consumer<asz> $$0) {
      Map<String, Function<String, asz>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         asz $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, asz>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, asz>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            asx.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract asz a(String var1, asz.c var2, wu var3);

   protected static asz.c b(final asd $$0) {
      return new asz.c() {
         @Override
         public asd a(asc $$0x) {
            return $$0;
         }

         @Override
         public asd a(asc $$0x, asz.a $$1) {
            return $$0;
         }
      };
   }
}
