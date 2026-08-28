import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmd {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final flq c = flq.a();
   private final Path d;
   private final fmx e;
   private final frc f;
   private final long g;
   private final int h;
   private final fme i;
   private volatile boolean j;
   @Nullable
   private flo k;

   public fmd(Path $$0, fmx $$1, frc $$2, long $$3, int $$4, fme $$5) {
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
            fne $$1 = this.c();
            $$0 = fmc.a(this.d, () -> this.j);
            this.i.d();
            flo $$2 = new flo($$0, this.g, this.h, $$1, this.f, ac.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fow $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new flz($$4);
            }

            fpi.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new flz(var11.getMessage());
         } catch (fnm var12) {
            throw new flz(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new flx();
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

   private fne c() throws fnm, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fne $$1 = this.c.i(this.g);
            if (this.j) {
               throw new flx();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fmb();
               }

               return $$1;
            }
         } catch (fnn var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fmb();
   }
}
