import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fht {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fhg c = fhg.a();
   private final Path d;
   private final fin e;
   private final fmq f;
   private final long g;
   private final int h;
   private final fhu i;
   private volatile boolean j;
   @Nullable
   private fhe k;

   public fht(Path $$0, fin $$1, fmq $$2, long $$3, int $$4, fhu $$5) {
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
            fiu $$1 = this.c();
            $$0 = fhs.a(this.d, () -> this.j);
            this.i.d();
            fhe $$2 = new fhe($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fkl $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fhp($$4);
            }

            fkx.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fhp(var11.getMessage());
         } catch (fjc var12) {
            throw new fhp(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fhn();
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

   private fiu c() throws fjc, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fiu $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fhn();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fhr();
               }

               return $$1;
            }
         } catch (fjd var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fhr();
   }
}
