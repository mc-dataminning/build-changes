import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgx {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fgk c = fgk.a();
   private final Path d;
   private final fhr e;
   private final flv f;
   private final long g;
   private final int h;
   private final fgy i;
   private volatile boolean j;
   @Nullable
   private fgi k;

   public fgx(Path $$0, fhr $$1, flv $$2, long $$3, int $$4, fgy $$5) {
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
            fhy $$1 = this.c();
            $$0 = fgw.a(this.d, () -> this.j);
            this.i.d();
            fgi $$2 = new fgi($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fjp $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fgt($$4);
            }

            fkb.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fgt(var11.getMessage());
         } catch (fig var12) {
            throw new fgt(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fgr();
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

   private fhy c() throws fig, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fhy $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fgr();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fgv();
               }

               return $$1;
            }
         } catch (fih var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fgv();
   }
}
