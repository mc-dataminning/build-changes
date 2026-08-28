import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flw {
   private static final Logger a = LogUtils.getLogger();

   public static void a(fqq $$0, fzq $$1, fzq $$2, int $$3, fmr $$4, @Nullable fpq $$5) {
      ger.a($$0, $$1, ($$6, $$7, $$8, $$9) -> {
         Path $$10;
         try {
            $$10 = a($$7, $$8, $$9);
         } catch (IOException var13) {
            a.warn("Failed to create temporary world folder.");
            $$0.a(new foe(xg.c("mco.create.world.failed"), $$2));
            return true;
         }

         fmx $$13 = fmx.a($$8.J(), $$8.J().e(), ac.b().c());
         fmd $$14 = new fmd($$10, $$13, $$0.X(), $$4.a, $$3, fme.f());
         $$0.d(new fyj($$14::b, xg.c("mco.create.world.reset.title"), xg.i(), xf.e, false));
         if ($$5 != null) {
            $$5.run();
         }

         $$14.a().handleAsync(($$5xx, $$6x) -> {
            if ($$6x != null) {
               if ($$6x instanceof CompletionException $$7x) {
                  $$6x = $$7x.getCause();
               }

               if ($$6x instanceof flx) {
                  $$0.d($$2);
               } else {
                  if ($$6x instanceof flz $$8x) {
                     a.warn("Failed to create realms world {}", $$8x.a());
                  } else {
                     a.warn("Failed to create realms world {}", $$6x.getMessage());
                  }

                  $$0.d(new foe(xg.c("mco.create.world.failed"), $$2));
               }
            } else {
               if ($$1 instanceof foa $$9x) {
                  $$9x.a($$4.a);
               }

               if ($$5 != null) {
                  fll.a($$4, $$1, true);
               } else {
                  $$0.d($$1);
               }

               fll.g();
            }

            return null;
         }, $$0);
         return true;
      });
   }

   private static Path a(jn<ama> $$0, fal $$1, @Nullable Path $$2) throws IOException {
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
