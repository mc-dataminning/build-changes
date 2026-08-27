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

public abstract class anc implements anj {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "vanilla";
   private final aml c;
   private final amn d;
   private final aez e;
   private final egx f;

   public anc(aml $$0, amn $$1, aez $$2, egx $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public void a(Consumer<ane> $$0) {
      ane $$1 = this.a(this.d);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.b($$0);
   }

   @Nullable
   protected abstract ane a(amk var1);

   protected abstract tl a(String var1);

   public amn a() {
      return this.d;
   }

   private void b(Consumer<ane> $$0) {
      Map<String, Function<String, ane>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         ane $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, ane>> $$0) {
      this.d.a(this.c, this.e, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, ane>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            and.a($$0, this.f, true, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            b.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract ane a(String var1, ane.c var2, tl var3);

   protected static ane.c b(final amk $$0) {
      return new ane.c() {
         @Override
         public amk a(String $$0x) {
            return $$0;
         }

         @Override
         public amk a(String $$0x, ane.a $$1) {
            return $$0;
         }
      };
   }
}
