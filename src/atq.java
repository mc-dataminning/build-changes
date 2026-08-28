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

public abstract class atq implements aty {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final ats b = ats.a("core");
   private final asz d;
   private final atb e;
   private final alb f;
   private final evc g;

   public atq(asz $$0, atb $$1, alb $$2, evc $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<att> $$0) {
      att $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract att a(asx var1);

   protected abstract xl a(String var1);

   public atb a() {
      return this.e;
   }

   private void a(Consumer<att> $$0) {
      Map<String, Function<String, att>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         att $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, att>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, att>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            atr.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract att a(String var1, att.c var2, xl var3);

   protected static att.c b(final asx $$0) {
      return new att.c() {
         @Override
         public asx a(asw $$0x) {
            return $$0;
         }

         @Override
         public asx a(asw $$0x, att.a $$1) {
            return $$0;
         }
      };
   }
}
