import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffn {
   private static final Logger a = LogUtils.getLogger();

   public static void a(fke $$0, frw $$1, frw $$2, int $$3, fgi $$4, @Nullable fjf $$5) {
      fwv.a($$0, $$1, ($$6, $$7, $$8, $$9) -> {
         Path $$10;
         try {
            $$10 = a($$7, $$8, $$9);
         } catch (IOException var13) {
            a.warn("Failed to create temporary world folder.");
            $$0.a(new fhu(xj.c("mco.create.world.failed"), $$2));
            return true;
         }

         fgn $$13 = fgn.a($$8.J(), ab.b().c());
         ffu $$14 = new ffu($$10, $$13, $$0.X(), $$4.a, $$3, ffv.f());
         $$0.d(new fqp($$14::b, xj.c("mco.create.world.reset.title"), xj.i(), xi.e, false));
         if ($$5 != null) {
            $$5.run();
         }

         $$14.a().handleAsync(($$5xx, $$6x) -> {
            if ($$6x != null) {
               if ($$6x instanceof CompletionException $$7x) {
                  $$6x = $$7x.getCause();
               }

               if ($$6x instanceof ffo) {
                  $$0.d($$2);
               } else {
                  if ($$6x instanceof ffq $$8x) {
                     a.warn("Failed to create realms world {}", $$8x.a());
                  } else {
                     a.warn("Failed to create realms world {}", $$6x.getMessage());
                  }

                  $$0.d(new fhu(xj.c("mco.create.world.failed"), $$2));
               }
            } else {
               if ($$1 instanceof fhq $$9x) {
                  $$9x.a($$4.a);
               }

               if ($$5 != null) {
                  ffc.a($$4, $$1, true);
               } else {
                  $$0.d($$1);
               }
            }

            return null;
         }, $$0);
         return true;
      });
   }

   private static Path a(jx<als> $$0, euf $$1, @Nullable Path $$2) throws IOException {
      Path $$3 = Files.createTempDirectory("minecraft_realms_world_upload");
      if ($$2 != null) {
         Files.move($$2, $$3.resolve("datapacks"));
      }

      ul $$4 = $$1.a($$0.a(), null);
      ul $$5 = new ul();
      $$5.a("Data", $$4);
      Path $$6 = Files.createFile($$3.resolve("level.dat"));
      uy.a($$5, $$6);
      return $$3;
   }
}
