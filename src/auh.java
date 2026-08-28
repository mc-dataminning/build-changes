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
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final String b = "tests";
   public static final auj c = auj.a("core");
   private final atr e;
   private final att f;
   private final alg g;
   private final fdy h;

   public auh(atr $$0, att $$1, alg $$2, fdy $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
   }

   @Override
   public void loadPacks(Consumer<auk> $$0) {
      auk $$1 = this.a(this.f);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract auk a(atp var1);

   protected abstract wy a(String var1);

   public att a() {
      return this.f;
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
      this.f.a(this.e, this.g, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, auk>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            aui.a($$0, this.h, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            d.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract auk a(String var1, auk.c var2, wy var3);

   protected static auk.c b(final atp $$0) {
      return new auk.c() {
         @Override
         public atp a(ato $$0x) {
            return $$0;
         }

         @Override
         public atp a(ato $$0x, auk.a $$1) {
            return $$0;
         }
      };
   }
}
