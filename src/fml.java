import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fml {
   private static final Logger a = LogUtils.getLogger();

   public static void a(frf $$0, gaf $$1, gaf $$2, int $$3, fng $$4, @Nullable fqf $$5) {
      gfg.a($$0, $$1, ($$6, $$7, $$8, $$9) -> {
         Path $$10;
         try {
            $$10 = a($$7, $$8, $$9);
         } catch (IOException var13) {
            a.warn("Failed to create temporary world folder.");
            $$0.a(new fou(xc.c("mco.create.world.failed"), $$2));
            return true;
         }

         fnm $$13 = fnm.a($$8.J(), $$8.J().e(), ac.b().c());
         fms $$14 = new fms($$10, $$13, $$0.X(), $$4.a, $$3, fmt.f());
         $$0.d(new fyy($$14::b, xc.c("mco.create.world.reset.title"), xc.i(), xb.e, false));
         if ($$5 != null) {
            $$5.run();
         }

         $$14.a().handleAsync(($$5xx, $$6x) -> {
            if ($$6x != null) {
               if ($$6x instanceof CompletionException $$7x) {
                  $$6x = $$7x.getCause();
               }

               if ($$6x instanceof fmm) {
                  $$0.d($$2);
               } else {
                  if ($$6x instanceof fmo $$8x) {
                     a.warn("Failed to create realms world {}", $$8x.a());
                  } else {
                     a.warn("Failed to create realms world {}", $$6x.getMessage());
                  }

                  $$0.d(new fou(xc.c("mco.create.world.failed"), $$2));
               }
            } else {
               if ($$1 instanceof fop $$9x) {
                  $$9x.a($$4.a);
               }

               if ($$5 != null) {
                  fma.a($$4, $$1, true);
               } else {
                  $$0.d($$1);
               }

               fma.g();
            }

            return null;
         }, $$0);
         return true;
      });
   }

   private static Path a(jn<alt> $$0, fab $$1, @Nullable Path $$2) throws IOException {
      Path $$3 = Files.createTempDirectory("minecraft_realms_world_upload");
      if ($$2 != null) {
         Files.move($$2, $$3.resolve("datapacks"));
      }

      ua $$4 = $$1.a($$0.a(), null);
      ua $$5 = new ua();
      $$5.a("Data", $$4);
      Path $$6 = Files.createFile($$3.resolve("level.dat"));
      un.a($$5, $$6);
      return $$3;
   }
}
