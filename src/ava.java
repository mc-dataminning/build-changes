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

public abstract class ava implements avi {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "vanilla";
   public static final avc b = avc.a("core");
   private final aui d;
   private final auk e;
   private final alz f;
   private final fbi g;

   public ava(aui $$0, auk $$1, alz $$2, fbi $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void loadPacks(Consumer<avd> $$0) {
      avd $$1 = this.a(this.e);
      if ($$1 != null) {
         $$0.accept($$1);
      }

      this.a($$0);
   }

   @Nullable
   protected abstract avd a(aug var1);

   protected abstract xv a(String var1);

   public auk a() {
      return this.e;
   }

   private void a(Consumer<avd> $$0) {
      Map<String, Function<String, avd>> $$1 = new HashMap<>();
      this.a($$1::put);
      $$1.forEach(($$1x, $$2) -> {
         avd $$3 = $$2.apply($$1x);
         if ($$3 != null) {
            $$0.accept($$3);
         }
      });
   }

   protected void a(BiConsumer<String, Function<String, avd>> $$0) {
      this.e.a(this.d, this.f, $$1 -> this.a($$1, $$0));
   }

   protected void a(@Nullable Path $$0, BiConsumer<String, Function<String, avd>> $$1) {
      if ($$0 != null && Files.isDirectory($$0)) {
         try {
            avb.a($$0, this.g, ($$1x, $$2) -> $$1.accept(a($$1x), $$1xx -> this.a($$1xx, $$2, this.a($$1xx))));
         } catch (IOException var4) {
            c.warn("Failed to discover packs in {}", $$0, var4);
         }
      }
   }

   private static String a(Path $$0) {
      return StringUtils.removeEnd($$0.getFileName().toString(), ".zip");
   }

   @Nullable
   protected abstract avd a(String var1, avd.c var2, xv var3);

   protected static avd.c b(final aug $$0) {
      return new avd.c() {
         @Override
         public aug a(auf $$0x) {
            return $$0;
         }

         @Override
         public aug a(auf $$0x, avd.a $$1) {
            return $$0;
         }
      };
   }
}
