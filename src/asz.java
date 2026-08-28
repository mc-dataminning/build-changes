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

public abstract class asz implements ath {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final atb b = atb.a("core");
   private final asi d;
   private final ask e;
   private final akk f;
   private final evp g;

   public asz(asi $$0, ask $$1, akk $$2, evp $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<atc> $$0) {
      atc $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract atc a(asg var1);

   protected abstract wu a(String var1);

   public ask a() {
      return this.e;
   }

   private void a(Consumer<atc> $$0) {
      Map<String, Function<String, atc>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         atc $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, atc>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, atc>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            ata.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract atc a(String var1, atc.c var2, wu var3);

   protected static atc.c b(final asg $$0) {
      return new atc.c() {
         @Override
         public asg a(asf $$0x) {
            return $$0;
         }

         @Override
         public asg a(asf $$0x, atc.a $$1) {
            return $$0;
         }
      };
   }
}
