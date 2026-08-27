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

public abstract class arg implements arn {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "vanilla";
   private final aqp c;
   private final aqr d;
   private final aiy e;
   private final eni f;

   public arg(aqp $$0, aqr $$1, aiy $$2, eni $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public void loadPacks(Consumer<ari> $$0) {
      ari $$1 = this.a(this.d);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract ari a(aqo var1);

   protected abstract vq a(String var1);

   public aqr a() {
      return this.d;
   }

   private void a(Consumer<ari> $$0) {
      Map<String, Function<String, ari>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         ari $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, ari>> $$0) {
      this.d.a(this.c, this.e, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, ari>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            arh.a($$0, this.f, true, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            b.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract ari a(String var1, ari.c var2, vq var3);

   protected static ari.c b(final aqo $$0) {
      return new ari.c() {
         @Override
         public aqo a(String $$0x) {
            return $$0;
         }

         @Override
         public aqo a(String $$0x, ari.a $$1) {
            return $$0;
         }
      };
   }
}
