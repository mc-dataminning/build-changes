import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffg {
   private static final Logger a = LogUtils.getLogger();

   public static void a(fjx $$0, frp $$1, frp $$2, fgb $$3, @Nullable fiy $$4) {
      fwn.a($$0, $$1, ($$5, $$6, $$7, $$8) -> {
         Path $$9;
         try {
            $$9 = a($$6, $$7, $$8);
         } catch (IOException var12) {
            a.warn("Failed to create temporary world folder.");
            $$0.a(new fhn(xl.c("mco.create.world.failed"), $$2));
            return true;
         }

         fgg $$12 = fgg.a($$7.J(), ab.b().c());
         ffn $$13 = new ffn($$9, $$12, $$0.X(), $$3.a, $$3.n, ffo.f());
         $$0.d(new fqi($$13::b, xl.c("mco.create.world.reset.title"), xl.i(), xk.e, false));
         if ($$4 != null) {
            $$4.run();
         }

         $$13.a().handleAsync(($$6x, $$7x) -> {
            if ($$7x != null) {
               if ($$7x instanceof CompletionException $$8x) {
                  $$7x = $$8x.getCause();
               }

               if ($$7x instanceof ffh) {
                  $$0.d($$2);
               } else {
                  if ($$7x instanceof ffj $$9x) {
                     a.warn("Failed to create realms world {}", $$9x.a());
                  } else {
                     a.warn("Failed to create realms world {}", $$7x.getMessage());
                  }

                  $$0.d(new fhn(xl.c("mco.create.world.failed"), $$2));
               }
            } else {
               if ($$1 instanceof fhj $$10) {
                  $$10.b($$12);
               }

               if ($$4 != null) {
                  fev.a($$3, $$1);
               } else {
                  $$0.d($$1);
               }
            }

            return null;
         }, $$0);
         return true;
      });
   }

   private static Path a(jx<alu> $$0, ety $$1, @Nullable Path $$2) throws IOException {
      Path $$3 = Files.createTempDirectory("minecraft_realms_world_upload");
      if ($$2 != null) {
         Files.move($$2, $$3.resolve("datapacks"));
      }

      un $$4 = $$1.a($$0.a(), null);
      un $$5 = new un();
      $$5.a("Data", $$4);
      Path $$6 = Files.createFile($$3.resolve("level.dat"));
      va.a($$5, $$6);
      return $$3;
   }
}
