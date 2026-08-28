import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fku {
   private static final Logger a = LogUtils.getLogger();

   public static void a(fpo $$0, fyn $$1, fyn $$2, int $$3, flp $$4, @Nullable fon $$5) {
      gdo.a($$0, $$1, ($$6, $$7, $$8, $$9) -> {
         Path $$10;
         try {
            $$10 = a($$7, $$8, $$9);
         } catch (IOException var13) {
            a.warn("Failed to create temporary world folder.");
            $$0.a(new fnc(wy.c("mco.create.world.failed"), $$2));
            return true;
         }

         flv $$13 = flv.a($$8.J(), $$8.J().e(), ac.b().c());
         flb $$14 = new flb($$10, $$13, $$0.X(), $$4.a, $$3, flc.f());
         $$0.d(new fxg($$14::b, wy.c("mco.create.world.reset.title"), wy.i(), wx.e, false));
         if ($$5 != null) {
            $$5.run();
         }

         $$14.a().handleAsync(($$5xx, $$6x) -> {
            if ($$6x != null) {
               if ($$6x instanceof CompletionException $$7x) {
                  $$6x = $$7x.getCause();
               }

               if ($$6x instanceof fkv) {
                  $$0.d($$2);
               } else {
                  if ($$6x instanceof fkx $$8x) {
                     a.warn("Failed to create realms world {}", $$8x.a());
                  } else {
                     a.warn("Failed to create realms world {}", $$6x.getMessage());
                  }

                  $$0.d(new fnc(wy.c("mco.create.world.failed"), $$2));
               }
            } else {
               if ($$1 instanceof fmy $$9x) {
                  $$9x.a($$4.a);
               }

               if ($$5 != null) {
                  fkj.a($$4, $$1, true);
               } else {
                  $$0.d($$1);
               }

               fkj.g();
            }

            return null;
         }, $$0);
         return true;
      });
   }

   private static Path a(jm<alp> $$0, ezg $$1, @Nullable Path $$2) throws IOException {
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
