import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flg {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fkt c = fkt.a();
   private final Path d;
   private final fma e;
   private final fqf f;
   private final long g;
   private final int h;
   private final flh i;
   private volatile boolean j;
   @Nullable
   private fkr k;

   public flg(Path $$0, fma $$1, fqf $$2, long $$3, int $$4, flh $$5) {
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
            fmh $$1 = this.c();
            $$0 = flf.a(this.d, () -> this.j);
            this.i.d();
            fkr $$2 = new fkr($$0, this.g, this.h, $$1, this.f, ac.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fny $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new flc($$4);
            }

            fok.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new flc(var11.getMessage());
         } catch (fmp var12) {
            throw new flc(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fla();
         } finally {
            if ($$0 != null) {
               b.debug("Deleting file {}", $$0.getAbsolutePath());
               $$0.delete();
            }
         }
      }, ag.h());
   }

   public void b() {
      this.j = true;
      if (this.k != null) {
         this.k.b();
         this.k = null;
      }
   }

   private fmh c() throws fmp, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fmh $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fla();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fle();
               }

               return $$1;
            }
         } catch (fmq var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fle();
   }
}
