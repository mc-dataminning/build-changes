import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffu {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final ffh c = ffh.a();
   private final Path d;
   private final fgn e;
   private final fkr f;
   private final long g;
   private final int h;
   private final ffv i;
   private volatile boolean j;
   @Nullable
   private fff k;

   public ffu(Path $$0, fgn $$1, fkr $$2, long $$3, int $$4, ffv $$5) {
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
            fgu $$1 = this.c();
            $$0 = fft.a(this.d, () -> this.j);
            this.i.d();
            fff $$2 = new fff($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fil $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new ffq($$4);
            }

            fix.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new ffq(var11.getMessage());
         } catch (fhc var12) {
            throw new ffq(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new ffo();
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

   private fgu c() throws fhc, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fgu $$1 = this.c.i(this.g);
            if (this.j) {
               throw new ffo();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new ffs();
               }

               return $$1;
            }
         } catch (fhd var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new ffs();
   }
}
