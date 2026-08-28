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

public abstract class auh implements aup {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final auj b = auj.a("core");
   private final atq d;
   private final ats e;
   private final alj f;
   private final ezo g;

   public auh(atq $$0, ats $$1, alj $$2, ezo $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<auk> $$0) {
      auk $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract auk a(ato var1);

   protected abstract xj a(String var1);

   public ats a() {
      return this.e;
   }

   private void a(Consumer<auk> $$0) {
      Map<String, Function<String, auk>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         auk $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, auk>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, auk>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            aui.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract auk a(String var1, auk.c var2, xj var3);

   protected static auk.c b(final ato $$0) {
      return new auk.c() {
         @Override
         public ato a(atn $$0x) {
            return $$0;
         }

         @Override
         public ato a(atn $$0x, auk.a $$1) {
            return $$0;
         }
      };
   }
}
