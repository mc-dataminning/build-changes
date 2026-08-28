import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjm {
   private static final Logger a = LogUtils.getLogger();

   public static void a(fof $$0, fxi $$1, fxi $$2, int $$3, fkh $$4, @Nullable fnf $$5) {
      gcj.a($$0, $$1, ($$6, $$7, $$8, $$9) -> {
         Path $$10;
         try {
            $$10 = a($$7, $$8, $$9);
         } catch (IOException var13) {
            a.warn("Failed to create temporary world folder.");
            $$0.a(new flu(ww.c("mco.create.world.failed"), $$2));
            return true;
         }

         fkn $$13 = fkn.a($$8.J(), $$8.J().e(), ab.b().c());
         fjt $$14 = new fjt($$10, $$13, $$0.X(), $$4.a, $$3, fju.f());
         $$0.d(new fwb($$14::b, ww.c("mco.create.world.reset.title"), ww.i(), wv.e, false));
         if ($$5 != null) {
            $$5.run();
         }

         $$14.a().handleAsync(($$5xx, $$6x) -> {
            if ($$6x != null) {
               if ($$6x instanceof CompletionException $$7x) {
                  $$6x = $$7x.getCause();
               }

               if ($$6x instanceof fjn) {
                  $$0.d($$2);
               } else {
                  if ($$6x instanceof fjp $$8x) {
                     a.warn("Failed to create realms world {}", $$8x.a());
                  } else {
                     a.warn("Failed to create realms world {}", $$6x.getMessage());
                  }

                  $$0.d(new flu(ww.c("mco.create.world.failed"), $$2));
               }
            } else {
               if ($$1 instanceof flq $$9x) {
                  $$9x.a($$4.a);
               }

               if ($$5 != null) {
                  fjb.a($$4, $$1, true);
               } else {
                  $$0.d($$1);
               }

               fjb.g();
            }

            return null;
         }, $$0);
         return true;
      });
   }

   private static Path a(jl<aln> $$0, eyf $$1, @Nullable Path $$2) throws IOException {
      Path $$3 = Files.createTempDirectory("minecraft_realms_world_upload");
      if ($$2 != null) {
         Files.move($$2, $$3.resolve("datapacks"));
      }

      tx $$4 = $$1.a($$0.a(), null);
      tx $$5 = new tx();
      $$5.a("Data", $$4);
      Path $$6 = Files.createFile($$3.resolve("level.dat"));
      uk.a($$5, $$6);
      return $$3;
   }
}
