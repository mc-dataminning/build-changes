import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhv {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fhi c = fhi.a();
   private final Path d;
   private final fip e;
   private final fms f;
   private final long g;
   private final int h;
   private final fhw i;
   private volatile boolean j;
   @Nullable
   private fhg k;

   public fhv(Path $$0, fip $$1, fms $$2, long $$3, int $$4, fhw $$5) {
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
            fiw $$1 = this.c();
            $$0 = fhu.a(this.d, () -> this.j);
            this.i.d();
            fhg $$2 = new fhg($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fkn $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fhr($$4);
            }

            fkz.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fhr(var11.getMessage());
         } catch (fje var12) {
            throw new fhr(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fhp();
         } finally {
            if ($$0 != null) {
               b.debug("Deleting file {}", $$0.getAbsolutePath());
               $$0.delete();
            }
         }
      }, ae.g());
   }

   public void b() {
      this.j = true;
      if (this.k != null) {
         this.k.b();
         this.k = null;
      }
   }

   private fiw c() throws fje, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fiw $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fhp();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fht();
               }

               return $$1;
            }
         } catch (fjf var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fht();
   }
}
