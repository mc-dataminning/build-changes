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

public abstract class ana implements anh {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "vanilla";
   private final amj c;
   private final aml d;
   private final aex e;
   private final ehd f;

   public ana(amj $$0, aml $$1, aex $$2, ehd $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public void a(Consumer<anc> $$0) {
      anc $$1 = this.a(this.d);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.b($$0);
   }

   @Nullable
   protected abstract anc a(ami var1);

   protected abstract tl a(String var1);

   public aml a() {
      return this.d;
   }

   private void b(Consumer<anc> $$0) {
      Map<String, Function<String, anc>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         anc $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, anc>> $$0) {
      this.d.a(this.c, this.e, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, anc>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            anb.a($$0, this.f, true, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            b.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract anc a(String var1, anc.c var2, tl var3);

   protected static anc.c b(final ami $$0) {
      return new anc.c() {
         @Override
         public ami a(String $$0x) {
            return $$0;
         }

         @Override
         public ami a(String $$0x, anc.a $$1) {
            return $$0;
         }
      };
   }
}
