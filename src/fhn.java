import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhn {
   private static final Logger a = LogUtils.getLogger();

   public static void a(fmf $$0, ftx $$1, ftx $$2, int $$3, fii $$4, @Nullable flg $$5) {
      fyw.a($$0, $$1, ($$6, $$7, $$8, $$9) -> {
         Path $$10;
         try {
            $$10 = a($$7, $$8, $$9);
         } catch (IOException var13) {
            a.warn("Failed to create temporary world folder.");
            $$0.a(new fjv(xv.c("mco.create.world.failed"), $$2));
            return true;
         }

         fio $$13 = fio.a($$8.J(), ab.b().c());
         fhu $$14 = new fhu($$10, $$13, $$0.X(), $$4.a, $$3, fhv.f());
         $$0.d(new fsq($$14::b, xv.c("mco.create.world.reset.title"), xv.i(), xu.e, false));
         if ($$5 != null) {
            $$5.run();
         }

         $$14.a().handleAsync(($$5xx, $$6x) -> {
            if ($$6x != null) {
               if ($$6x instanceof CompletionException $$7x) {
                  $$6x = $$7x.getCause();
               }

               if ($$6x instanceof fho) {
                  $$0.d($$2);
               } else {
                  if ($$6x instanceof fhq $$8x) {
                     a.warn("Failed to create realms world {}", $$8x.a());
                  } else {
                     a.warn("Failed to create realms world {}", $$6x.getMessage());
                  }

                  $$0.d(new fjv(xv.c("mco.create.world.failed"), $$2));
               }
            } else {
               if ($$1 instanceof fjr $$9x) {
                  $$9x.a($$4.a);
               }

               if ($$5 != null) {
                  fhc.a($$4, $$1, true);
               } else {
                  $$0.d($$1);
               }

               fhc.g();
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
