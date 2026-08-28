import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjy {
   private static final Logger a = LogUtils.getLogger();

   public static void a(fos $$0, fxu $$1, fxu $$2, int $$3, fkt $$4, @Nullable fnr $$5) {
      gcv.a($$0, $$1, ($$6, $$7, $$8, $$9) -> {
         Path $$10;
         try {
            $$10 = a($$7, $$8, $$9);
         } catch (IOException var13) {
            a.warn("Failed to create temporary world folder.");
            $$0.a(new fmg(wy.c("mco.create.world.failed"), $$2));
            return true;
         }

         fkz $$13 = fkz.a($$8.J(), $$8.J().e(), ab.b().c());
         fkf $$14 = new fkf($$10, $$13, $$0.X(), $$4.a, $$3, fkg.f());
         $$0.d(new fwn($$14::b, wy.c("mco.create.world.reset.title"), wy.i(), wx.e, false));
         if ($$5 != null) {
            $$5.run();
         }

         $$14.a().handleAsync(($$5xx, $$6x) -> {
            if ($$6x != null) {
               if ($$6x instanceof CompletionException $$7x) {
                  $$6x = $$7x.getCause();
               }

               if ($$6x instanceof fjz) {
                  $$0.d($$2);
               } else {
                  if ($$6x instanceof fkb $$8x) {
                     a.warn("Failed to create realms world {}", $$8x.a());
                  } else {
                     a.warn("Failed to create realms world {}", $$6x.getMessage());
                  }

                  $$0.d(new fmg(wy.c("mco.create.world.failed"), $$2));
               }
            } else {
               if ($$1 instanceof fmc $$9x) {
                  $$9x.a($$4.a);
               }

               if ($$5 != null) {
                  fjn.a($$4, $$1, true);
               } else {
                  $$0.d($$1);
               }

               fjn.g();
            }

            return null;
         }, $$0);
         return true;
      });
   }

   private static Path a(jl<alp> $$0, eyr $$1, @Nullable Path $$2) throws IOException {
      Path $$3 = Files.createTempDirectory("minecraft_realms_world_upload");
      if ($$2 != null) {
         Files.move($$2, $$3.resolve("datapacks"));
      }

      tz $$4 = $$1.a($$0.a(), null);
      tz $$5 = new tz();
      $$5.a("Data", $$4);
      Path $$6 = Files.createFile($$3.resolve("level.dat"));
      um.a($$5, $$6);
      return $$3;
   }
}
