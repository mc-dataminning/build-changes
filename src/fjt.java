import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjt {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fjg c = fjg.a();
   private final Path d;
   private final fkn e;
   private final fos f;
   private final long g;
   private final int h;
   private final fju i;
   private volatile boolean j;
   @Nullable
   private fje k;

   public fjt(Path $$0, fkn $$1, fos $$2, long $$3, int $$4, fju $$5) {
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
            fku $$1 = this.c();
            $$0 = fjs.a(this.d, () -> this.j);
            this.i.d();
            fje $$2 = new fje($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fml $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fjp($$4);
            }

            fmx.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fjp(var11.getMessage());
         } catch (flc var12) {
            throw new fjp(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fjn();
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

   private fku c() throws flc, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fku $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fjn();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fjr();
               }

               return $$1;
            }
         } catch (fld var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fjr();
   }
}
