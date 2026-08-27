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

public abstract class atc implements atk {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final ate b = ate.a("core");
   private final asl d;
   private final asn e;
   private final akn f;
   private final euc g;

   public atc(asl $$0, asn $$1, akn $$2, euc $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<atf> $$0) {
      atf $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract atf a(asj var1);

   protected abstract wx a(String var1);

   public asn a() {
      return this.e;
   }

   private void a(Consumer<atf> $$0) {
      Map<String, Function<String, atf>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         atf $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, atf>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, atf>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            atd.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract atf a(String var1, atf.c var2, wx var3);

   protected static atf.c b(final asj $$0) {
      return new atf.c() {
         @Override
         public asj a(asi $$0x) {
            return $$0;
         }

         @Override
         public asj a(asi $$0x, atf.a $$1) {
            return $$0;
         }
      };
   }
}
