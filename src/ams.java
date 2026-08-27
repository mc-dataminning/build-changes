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

public abstract class ams implements amz {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "vanilla";
   private final amb c;
   private final amd d;
   private final aer e;
   private final egu f;

   public ams(amb $$0, amd $$1, aer $$2, egu $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public void a(Consumer<amu> $$0) {
      amu $$1 = this.a(this.d);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.b($$0);
   }

   @Nullable
   protected abstract amu a(ama var1);

   protected abstract tf a(String var1);

   public amd a() {
      return this.d;
   }

   private void b(Consumer<amu> $$0) {
      Map<String, Function<String, amu>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         amu $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, amu>> $$0) {
      this.d.a(this.c, this.e, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, amu>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            amt.a($$0, this.f, true, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            b.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract amu a(String var1, amu.c var2, tf var3);

   protected static amu.c b(final ama $$0) {
      return new amu.c() {
         @Override
         public ama a(String $$0x) {
            return $$0;
         }

         @Override
         public ama a(String $$0x, amu.a $$1) {
            return $$0;
         }
      };
   }
}
