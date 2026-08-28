import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fho {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final fhb c = fhb.a();
   private final Path d;
   private final fii e;
   private final fml f;
   private final long g;
   private final int h;
   private final fhp i;
   private volatile boolean j;
   @Nullable
   private fgz k;

   public fho(Path $$0, fii $$1, fml $$2, long $$3, int $$4, fhp $$5) {
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
            fip $$1 = this.c();
            $$0 = fhn.a(this.d, () -> this.j);
            this.i.d();
            fgz $$2 = new fgz($$0, this.g, this.h, $$1, this.f, ab.b().c(), this.e.i, this.i.b());
            this.k = $$2;
            fkg $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fhk($$4);
            }

            fks.b(this.g);
            this.c.a(this.g, this.h, this.e);
         } catch (IOException var11) {
            throw new fhk(var11.getMessage());
         } catch (fix var12) {
            throw new fhk(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new fhi();
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

   private fip c() throws fix, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fip $$1 = this.c.i(this.g);
            if (this.j) {
               throw new fhi();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fhm();
               }

               return $$1;
            }
         } catch (fiy var3) {
            Thread.sleep((long)var3.c * 1000L);
         }
      }

      throw new fhm();
   }
}
