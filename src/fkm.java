import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkm {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fjz c = fjz.a();
   private final Path d;
   private final flg e;
   private final fpl f;
   private final long g;
   private final int h;
   private final fkn i;
   private volatile boolean j;
   @Nullable
   private fjx k;

   public fkm(Path $$0, flg $$1, fpl $$2, long $$3, int $$4, fkn $$5) {
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
            fln $$1 = this.c();
            $$0 = fkl.a(this.d, () -> this.j);
            this.i.d();
            fjx $$2 = new fjx($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fne $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fki($$4);
            }

            fnq.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fki(var11.getMessage());
         } catch (flv var12) {
            throw new fki(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fkg();
         } finally {
            if ($$0 != null) {
               b.debug("Deleting file {}", $$0.getAbsolutePath());
               $$0.delete();
            }
         }
      }, af.h());
   }

   public void b() {
      this.j = true;
      if (this.k != null) {
         this.k.b();
         this.k = null;
      }
   }

   private fln c() throws flv, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fln $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fkg();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fkk();
               }

               return $$1;
            }
         } catch (flw var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fkk();
   }
}
