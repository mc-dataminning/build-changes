import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgr {
   private static final Logger a = LogUtils.getLogger();

   public static void a(flk $$0, fum $$1, fum $$2, int $$3, fhm $$4, @Nullable fkk $$5) {
      fzl.a($$0, $$1, ($$6, $$7, $$8, $$9) -> {
         Path $$10;
         try {
            $$10 = a($$7, $$8, $$9);
         } catch (IOException var13) {
            a.warn("Failed to create temporary world folder.");
            $$0.a(new fiz(wp.c("mco.create.world.failed"), $$2));
            return true;
         }

         fhs $$13 = fhs.a($$8.J(), ab.b().c());
         fgy $$14 = new fgy($$10, $$13, $$0.X(), $$4.a, $$3, fgz.f());
         $$0.d(new ftf($$14::b, wp.c("mco.create.world.reset.title"), wp.i(), wo.e, false));
         if ($$5 != null) {
            $$5.run();
         }

         $$14.a().handleAsync(($$5xx, $$6x) -> {
            if ($$6x != null) {
               if ($$6x instanceof CompletionException $$7x) {
                  $$6x = $$7x.getCause();
               }

               if ($$6x instanceof fgs) {
                  $$0.d($$2);
               } else {
                  if ($$6x instanceof fgu $$8x) {
                     a.warn("Failed to create realms world {}", $$8x.a());
                  } else {
                     a.warn("Failed to create realms world {}", $$6x.getMessage());
                  }

                  $$0.d(new fiz(wp.c("mco.create.world.failed"), $$2));
               }
            } else {
               if ($$1 instanceof fiv $$9x) {
                  $$9x.a($$4.a);
               }

               if ($$5 != null) {
                  fgg.a($$4, $$1, true);
               } else {
                  $$0.d($$1);
               }

               fgg.g();
            }

            return null;
         }, $$0);
         return true;
      });
   }

   private static Path a(jy<ale> $$0, evk $$1, @Nullable Path $$2) throws IOException {
      Path $$3 = Files.createTempDirectory("minecraft_realms_world_upload");
      if ($$2 != null) {
         Files.move($$2, $$3.resolve("datapacks"));
      }

      tq $$4 = $$1.a($$0.a(), null);
      tq $$5 = new tq();
      $$5.a("Data", $$4);
      Path $$6 = Files.createFile($$3.resolve("level.dat"));
      ud.a($$5, $$6);
      return $$3;
   }
}
