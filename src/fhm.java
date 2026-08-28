import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhm {
   private static final Logger a = LogUtils.getLogger();

   public static void a(fme $$0, ftw $$1, ftw $$2, int $$3, fih $$4, @Nullable flf $$5) {
      fyv.a($$0, $$1, ($$6, $$7, $$8, $$9) -> {
         Path $$10;
         try {
            $$10 = a($$7, $$8, $$9);
         } catch (IOException var13) {
            a.warn("Failed to create temporary world folder.");
            $$0.a(new fju(xv.c("mco.create.world.failed"), $$2));
            return true;
         }

         fin $$13 = fin.a($$8.J(), ab.b().c());
         fht $$14 = new fht($$10, $$13, $$0.X(), $$4.a, $$3, fhu.f());
         $$0.d(new fsp($$14::b, xv.c("mco.create.world.reset.title"), xv.i(), xu.e, false));
         if ($$5 != null) {
            $$5.run();
         }

         $$14.a().handleAsync(($$5xx, $$6x) -> {
            if ($$6x != null) {
               if ($$6x instanceof CompletionException $$7x) {
                  $$6x = $$7x.getCause();
               }

               if ($$6x instanceof fhn) {
                  $$0.d($$2);
               } else {
                  if ($$6x instanceof fhp $$8x) {
                     a.warn("Failed to create realms world {}", $$8x.a());
                  } else {
                     a.warn("Failed to create realms world {}", $$6x.getMessage());
                  }

                  $$0.d(new fju(xv.c("mco.create.world.failed"), $$2));
               }
            } else {
               if ($$1 instanceof fjq $$9x) {
                  $$9x.a($$4.a);
               }

               if ($$5 != null) {
                  fhb.a($$4, $$1, true);
               } else {
                  $$0.d($$1);
               }

               fhb.g();
            }

            return null;
         }, $$0);
         return true;
      });
   }

   private static Path a(jx<ami> $$0, ewg $$1, @Nullable Path $$2) throws IOException {
      Path $$3 = Files.createTempDirectory("minecraft_realms_world_upload");
      if ($$2 != null) {
         Files.move($$2, $$3.resolve("datapacks"));
      }

      ux $$4 = $$1.a($$0.a(), null);
      ux $$5 = new ux();
      $$5.a("Data", $$4);
      Path $$6 = Files.createFile($$3.resolve("level.dat"));
      vk.a($$5, $$6);
      return $$3;
   }
}
