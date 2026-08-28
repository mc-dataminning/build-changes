import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhu {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fhh c = fhh.a();
   private final Path d;
   private final fio e;
   private final fmr f;
   private final long g;
   private final int h;
   private final fhv i;
   private volatile boolean j;
   @Nullable
   private fhf k;

   public fhu(Path $$0, fio $$1, fmr $$2, long $$3, int $$4, fhv $$5) {
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
            fiv $$1 = this.c();
            $$0 = fht.a(this.d, () -> this.j);
            this.i.d();
            fhf $$2 = new fhf($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fkm $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fhq($$4);
            }

            fky.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fhq(var11.getMessage());
         } catch (fjd var12) {
            throw new fhq(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fho();
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

   private fiv c() throws fjd, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fiv $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fho();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fhs();
               }

               return $$1;
            }
         } catch (fje var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fhs();
   }
}
