import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flb {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fko c = fko.a();
   private final Path d;
   private final flv e;
   private final fqa f;
   private final long g;
   private final int h;
   private final flc i;
   private volatile boolean j;
   @Nullable
   private fkm k;

   public flb(Path $$0, flv $$1, fqa $$2, long $$3, int $$4, flc $$5) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }

   public CompletableFuture<?> a() {
      return CompletableFuture.runAsync(() -> {
         File $$0 = null;

         try {
            fmc $$1 = this.c();
            $$0 = fla.a(this.d, () -> this.j);
            this.i.d();
            fkm $$2 = new fkm($$0, this.g, this.h, $$1, this.f, ac.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fnt $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fkx($$4);
            }

            fof.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fkx(var11.getMessage());
         } catch (fmk var12) {
            throw new fkx(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fkv();
         } finally {
            if ($$0 != null) {
               b.debug("Deleting file {}", $$0.getAbsolutePath());
               $$0.delete();
            }
         }
      }, ag.h());
   }

   public void b() {
      this.j = true;
      if (this.k != null) {
         this.k.b();
         this.k = null;
      }
   }

   private fmc c() throws fmk, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fmc $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fkv();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fkz();
               }

               return $$1;
            }
         } catch (fml var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fkz();
   }
}
