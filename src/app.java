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

public abstract class app implements apw {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "vanilla";
   private final aoy c;
   private final apa d;
   private final ahh e;
   private final els f;

   public app(aoy $$0, apa $$1, ahh $$2, els $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public void loadPacks(Consumer<apr> $$0) {
      apr $$1 = this.a(this.d);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract apr a(aox var1);

   protected abstract vg a(String var1);

   public apa a() {
      return this.d;
   }

   private void a(Consumer<apr> $$0) {
      Map<String, Function<String, apr>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         apr $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, apr>> $$0) {
      this.d.a(this.c, this.e, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, apr>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            apq.a($$0, this.f, true, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            b.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract apr a(String var1, apr.c var2, vg var3);

   protected static apr.c b(final aox $$0) {
      return new apr.c() {
         @Override
         public aox a(String $$0x) {
            return $$0;
         }

         @Override
         public aox a(String $$0x, apr.a $$1) {
            return $$0;
         }
      };
   }
}
