import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffn {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final ffa c = ffa.a();
   private final Path d;
   private final fgg e;
   private final fkk f;
   private final long g;
   private final int h;
   private final ffo i;
   private volatile boolean j;
   @Nullable
   private fey k;

   public ffn(Path $$0, fgg $$1, fkk $$2, long $$3, int $$4, ffo $$5) {
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
            fgn $$1 = this.c();
            $$0 = ffm.a(this.d, () -> this.j);
            this.i.d();
            fey $$2 = new fey($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fie $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new ffj($$4);
            }

            fiq.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new ffj(var11.getMessage());
         } catch (fgv var12) {
            throw new ffj(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new ffh();
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

   private fgn c() throws fgv, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fgn $$1 = this.c.i(this.g);
            if (this.j) {
               throw new ffh();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new ffl();
               }

               return $$1;
            }
         } catch (fgw var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new ffl();
   }
}
