import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fms {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fmf c = fmf.a();
   private final Path d;
   private final fnm e;
   private final frr f;
   private final long g;
   private final int h;
   private final fmt i;
   private volatile boolean j;
   @Nullable
   private fmd k;

   public fms(Path $$0, fnm $$1, frr $$2, long $$3, int $$4, fmt $$5) {
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
            fnt $$1 = this.c();
            $$0 = fmr.a(this.d, () -> this.j);
            this.i.d();
            fmd $$2 = new fmd($$0, this.g, this.h, $$1, this.f, ac.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fpl $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fmo($$4);
            }

            fpx.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fmo(var11.getMessage());
         } catch (fob var12) {
            throw new fmo(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fmm();
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

   private fnt c() throws fob, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fnt $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fmm();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fmq();
               }

               return $$1;
            }
         } catch (foc var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fmq();
   }
}
