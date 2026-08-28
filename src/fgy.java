import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgy {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fgl c = fgl.a();
   private final Path d;
   private final fhs e;
   private final flw f;
   private final long g;
   private final int h;
   private final fgz i;
   private volatile boolean j;
   @Nullable
   private fgj k;

   public fgy(Path $$0, fhs $$1, flw $$2, long $$3, int $$4, fgz $$5) {
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
            fhz $$1 = this.c();
            $$0 = fgx.a(this.d, () -> this.j);
            this.i.d();
            fgj $$2 = new fgj($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fjq $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fgu($$4);
            }

            fkc.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fgu(var11.getMessage());
         } catch (fih var12) {
            throw new fgu(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fgs();
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

   private fhz c() throws fih, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fhz $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fgs();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fgw();
               }

               return $$1;
            }
         } catch (fii var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fgw();
   }
}
