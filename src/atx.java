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

public abstract class atx implements auf {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final atz b = atz.a("core");
   private final atg d;
   private final ati e;
   private final alb f;
   private final exu g;

   public atx(atg $$0, ati $$1, alb $$2, exu $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<aua> $$0) {
      aua $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract aua a(ate var1);

   protected abstract xd a(String var1);

   public ati a() {
      return this.e;
   }

   private void a(Consumer<aua> $$0) {
      Map<String, Function<String, aua>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         aua $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, aua>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, aua>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            aty.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract aua a(String var1, aua.c var2, xd var3);

   protected static aua.c b(final ate $$0) {
      return new aua.c() {
         @Override
         public ate a(atd $$0x) {
            return $$0;
         }

         @Override
         public ate a(atd $$0x, aua.a $$1) {
            return $$0;
         }
      };
   }
}
