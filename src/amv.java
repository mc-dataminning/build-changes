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

public abstract class amv implements anc {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "vanilla";
   private final ame c;
   private final amg d;
   private final aeu e;
   private final egy f;

   public amv(ame $$0, amg $$1, aeu $$2, egy $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public void a(Consumer<amx> $$0) {
      amx $$1 = this.a(this.d);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.b($$0);
   }

   @Nullable
   protected abstract amx a(amd var1);

   protected abstract ti a(String var1);

   public amg a() {
      return this.d;
   }

   private void b(Consumer<amx> $$0) {
      Map<String, Function<String, amx>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         amx $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, amx>> $$0) {
      this.d.a(this.c, this.e, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, amx>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            amw.a($$0, this.f, true, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            b.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract amx a(String var1, amx.c var2, ti var3);

   protected static amx.c b(final amd $$0) {
      return new amx.c() {
         @Override
         public amd a(String $$0x) {
            return $$0;
         }

         @Override
         public amd a(String $$0x, amx.a $$1) {
            return $$0;
         }
      };
   }
}
