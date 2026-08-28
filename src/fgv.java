import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgv {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fgi c = fgi.a();
   private final Path d;
   private final fhp e;
   private final flt f;
   private final long g;
   private final int h;
   private final fgw i;
   private volatile boolean j;
   @Nullable
   private fgg k;

   public fgv(Path $$0, fhp $$1, flt $$2, long $$3, int $$4, fgw $$5) {
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
            fhw $$1 = this.c();
            $$0 = fgu.a(this.d, () -> this.j);
            this.i.d();
            fgg $$2 = new fgg($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fjn $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fgr($$4);
            }

            fjz.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fgr(var11.getMessage());
         } catch (fie var12) {
            throw new fgr(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fgp();
         } finally {
            if ($$0 != null) {
               b.debug("Deleting file {}", $$0.getAbsolutePath());
               $$0.delete();
            }
         }
      }, af.g());
   }

   public void b() {
      this.j = true;
      if (this.k != null) {
         this.k.b();
         this.k = null;
      }
   }

   private fhw c() throws fie, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fhw $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fgp();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fgt();
               }

               return $$1;
            }
         } catch (fif var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fgt();
   }
}
