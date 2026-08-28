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

public abstract class aui implements auq {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final auk b = auk.a("core");
   private final atr d;
   private final att e;
   private final all f;
   private final ezh g;

   public aui(atr $$0, att $$1, all $$2, ezh $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<aul> $$0) {
      aul $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract aul a(atp var1);

   protected abstract xl a(String var1);

   public att a() {
      return this.e;
   }

   private void a(Consumer<aul> $$0) {
      Map<String, Function<String, aul>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         aul $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, aul>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, aul>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            auj.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract aul a(String var1, aul.c var2, xl var3);

   protected static aul.c b(final atp $$0) {
      return new aul.c() {
         @Override
         public atp a(ato $$0x) {
            return $$0;
         }

         @Override
         public atp a(ato $$0x, aul.a $$1) {
            return $$0;
         }
      };
   }
}
