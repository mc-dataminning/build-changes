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

public abstract class aue implements aum {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final aug b = aug.a("core");
   private final atn d;
   private final atp e;
   private final alh f;
   private final eyx g;

   public aue(atn $$0, atp $$1, alh $$2, eyx $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<auh> $$0) {
      auh $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract auh a(atl var1);

   protected abstract xh a(String var1);

   public atp a() {
      return this.e;
   }

   private void a(Consumer<auh> $$0) {
      Map<String, Function<String, auh>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         auh $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, auh>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, auh>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            auf.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract auh a(String var1, auh.c var2, xh var3);

   protected static auh.c b(final atl $$0) {
      return new auh.c() {
         @Override
         public atl a(atk $$0x) {
            return $$0;
         }

         @Override
         public atl a(atk $$0x, auh.a $$1) {
            return $$0;
         }
      };
   }
}
