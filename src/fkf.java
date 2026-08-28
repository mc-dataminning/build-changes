import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkf {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fjs c = fjs.a();
   private final Path d;
   private final fkz e;
   private final fpe f;
   private final long g;
   private final int h;
   private final fkg i;
   private volatile boolean j;
   @Nullable
   private fjq k;

   public fkf(Path $$0, fkz $$1, fpe $$2, long $$3, int $$4, fkg $$5) {
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
            flg $$1 = this.c();
            $$0 = fke.a(this.d, () -> this.j);
            this.i.d();
            fjq $$2 = new fjq($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fmx $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fkb($$4);
            }

            fnj.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fkb(var11.getMessage());
         } catch (flo var12) {
            throw new fkb(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fjz();
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

   private flg c() throws flo, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            flg $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fjz();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fkd();
               }

               return $$1;
            }
         } catch (flp var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fkd();
   }
}
