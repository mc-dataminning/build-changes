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

public abstract class ash implements asp {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final asj b = asj.a("core");
   private final arq d;
   private final ars e;
   private final ajt f;
   private final erq g;

   public ash(arq $$0, ars $$1, ajt $$2, erq $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<ask> $$0) {
      ask $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract ask a(aro var1);

   protected abstract wg a(String var1);

   public ars a() {
      return this.e;
   }

   private void a(Consumer<ask> $$0) {
      Map<String, Function<String, ask>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         ask $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, ask>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, ask>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            asi.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract ask a(String var1, ask.c var2, wg var3);

   protected static ask.c b(final aro $$0) {
      return new ask.c() {
         @Override
         public aro a(arn $$0x) {
            return $$0;
         }

         @Override
         public aro a(arn $$0x, ask.a $$1) {
            return $$0;
         }
      };
   }
}
