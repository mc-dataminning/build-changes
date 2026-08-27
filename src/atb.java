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

public abstract class atb implements atj {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final atd b = atd.a("core");
   private final ask d;
   private final asm e;
   private final akm f;
   private final eua g;

   public atb(ask $$0, asm $$1, akm $$2, eua $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<ate> $$0) {
      ate $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract ate a(asi var1);

   protected abstract wx a(String var1);

   public asm a() {
      return this.e;
   }

   private void a(Consumer<ate> $$0) {
      Map<String, Function<String, ate>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         ate $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, ate>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, ate>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            atc.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract ate a(String var1, ate.c var2, wx var3);

   protected static ate.c b(final asi $$0) {
      return new ate.c() {
         @Override
         public asi a(ash $$0x) {
            return $$0;
         }

         @Override
         public asi a(ash $$0x, ate.a $$1) {
            return $$0;
         }
      };
   }
}
