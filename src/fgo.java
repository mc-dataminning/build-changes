import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgo {
   private static final Logger a = LogUtils.getLogger();

   public static void a(flh $$0, fui $$1, fui $$2, int $$3, fhj $$4, @Nullable fkh $$5) {
      fzh.a($$0, $$1, ($$6, $$7, $$8, $$9) -> {
         Path $$10;
         try {
            $$10 = a($$7, $$8, $$9);
         } catch (IOException var13) {
            a.warn("Failed to create temporary world folder.");
            $$0.a(new fiw(wo.c("mco.create.world.failed"), $$2));
            return true;
         }

         fhp $$13 = fhp.a($$8.J(), ab.b().c());
         fgv $$14 = new fgv($$10, $$13, $$0.X(), $$4.a, $$3, fgw.f());
         $$0.d(new ftb($$14::b, wo.c("mco.create.world.reset.title"), wo.i(), wn.e, false));
         if ($$5 != null) {
            $$5.run();
         }

         $$14.a().handleAsync(($$5xx, $$6x) -> {
            if ($$6x != null) {
               if ($$6x instanceof CompletionException $$7x) {
                  $$6x = $$7x.getCause();
               }

               if ($$6x instanceof fgp) {
                  $$0.d($$2);
               } else {
                  if ($$6x instanceof fgr $$8x) {
                     a.warn("Failed to create realms world {}", $$8x.a());
                  } else {
                     a.warn("Failed to create realms world {}", $$6x.getMessage());
                  }

                  $$0.d(new fiw(wo.c("mco.create.world.failed"), $$2));
               }
            } else {
               if ($$1 instanceof fis $$9x) {
                  $$9x.a($$4.a);
               }

               if ($$5 != null) {
                  fgd.a($$4, $$1, true);
               } else {
                  $$0.d($$1);
               }

               fgd.g();
            }

            return null;
         }, $$0);
         return true;
      });
   }

   private static Path a(jy<ald> $$0, evh $$1, @Nullable Path $$2) throws IOException {
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
