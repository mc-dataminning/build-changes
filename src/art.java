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

public abstract class art implements asb {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final arv b = arv.a("core");
   private final arc d;
   private final are e;
   private final ajh f;
   private final eph g;

   public art(arc $$0, are $$1, ajh $$2, eph $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<arw> $$0) {
      arw $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract arw a(ara var1);

   protected abstract vu a(String var1);

   public are a() {
      return this.e;
   }

   private void a(Consumer<arw> $$0) {
      Map<String, Function<String, arw>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         arw $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, arw>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, arw>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            aru.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract arw a(String var1, arw.c var2, vu var3);

   protected static arw.c b(final ara $$0) {
      return new arw.c() {
         @Override
         public ara a(aqz $$0x) {
            return $$0;
         }

         @Override
         public ara a(aqz $$0x, arw.a $$1) {
            return $$0;
         }
      };
   }
}
