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

public abstract class arl implements ars {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "vanilla";
   private final aqu c;
   private final aqw d;
   private final ajc e;
   private final eol f;

   public arl(aqu $$0, aqw $$1, ajc $$2, eol $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public void loadPacks(Consumer<arn> $$0) {
      arn $$1 = this.a(this.d);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract arn a(aqt var1);

   protected abstract vs a(String var1);

   public aqw a() {
      return this.d;
   }

   private void a(Consumer<arn> $$0) {
      Map<String, Function<String, arn>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         arn $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, arn>> $$0) {
      this.d.a(this.c, this.e, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, arn>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            arm.a($$0, this.f, true, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            b.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract arn a(String var1, arn.c var2, vs var3);

   protected static arn.c b(final aqt $$0) {
      return new arn.c() {
         @Override
         public aqt a(String $$0x) {
            return $$0;
         }

         @Override
         public aqt a(String $$0x, arn.a $$1) {
            return $$0;
         }
      };
   }
}
