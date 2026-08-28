import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgw {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fgj c = fgj.a();
   private final Path d;
   private final fhq e;
   private final flu f;
   private final long g;
   private final int h;
   private final fgx i;
   private volatile boolean j;
   @Nullable
   private fgh k;

   public fgw(Path $$0, fhq $$1, flu $$2, long $$3, int $$4, fgx $$5) {
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
            fhx $$1 = this.c();
            $$0 = fgv.a(this.d, () -> this.j);
            this.i.d();
            fgh $$2 = new fgh($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fjo $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fgs($$4);
            }

            fka.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fgs(var11.getMessage());
         } catch (fif var12) {
            throw new fgs(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fgq();
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

   private fhx c() throws fif, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fhx $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fgq();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fgu();
               }

               return $$1;
            }
         } catch (fig var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fgu();
   }
}
