import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dtb implements AutoCloseable {
   public static final int d = 1493;
   private final dtd a;
   protected final DataFixer e;
   @Nullable
   private volatile egb b;

   public dtb(dtk $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new dtd($$0, $$1, $$3);
   }

   public boolean b(czb $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public ty a(ake<czu> $$0, Supplier<enk> $$1, ty $$2, Optional<ake<Codec<? extends drv>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = azc.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            egb $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = azc.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         un.e($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private egb a(ake<czu> $$0, Supplier<enk> $$1) {
      egb $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = egb.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(ty $$0, ake<czu> $$1, Optional<ake<Codec<? extends drv>>> $$2) {
      ty $$3 = new ty();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(ty $$0) {
      return un.b($$0, -1);
   }

   public CompletableFuture<Optional<ty>> e(czb $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(czb $$0, ty $$1) {
      this.f($$0);
      return this.a.a($$0, $$1);
   }

   protected void f(czb $$0) {
      if (this.b != null) {
         this.b.a($$0.a());
      }
   }

   public void o() {
      this.a.a(true).join();
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public dsz p() {
      return this.a;
   }
}
