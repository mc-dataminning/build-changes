import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmq {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fmd c = fmd.a();
   private final Path d;
   private final fnk e;
   private final frp f;
   private final long g;
   private final int h;
   private final fmr i;
   private volatile boolean j;
   @Nullable
   private fmb k;

   public fmq(Path $$0, fnk $$1, frp $$2, long $$3, int $$4, fmr $$5) {
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
            fnr $$1 = this.c();
            $$0 = fmp.a(this.d, () -> this.j);
            this.i.d();
            fmb $$2 = new fmb($$0, this.g, this.h, $$1, this.f, ac.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fpj $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fmm($$4);
            }

            fpv.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fmm(var11.getMessage());
         } catch (fnz var12) {
            throw new fmm(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fmk();
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

   private fnr c() throws fnz, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fnr $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fmk();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fmo();
               }

               return $$1;
            }
         } catch (foa var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fmo();
   }
}
