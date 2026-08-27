import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dpc implements AutoCloseable {
   public static final int d = 1493;
   private final dpe a;
   protected final DataFixer e;
   @Nullable
   private volatile ecb b;

   public dpc(Path $$0, DataFixer $$1, boolean $$2) {
      this.e = $$1;
      this.a = new dpe($$0, $$2, "chunk");
   }

   public boolean b(cvl $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public sy a(ajb<cwe> $$0, Supplier<eji> $$1, sy $$2, Optional<ajb<Codec<? extends dob>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = axs.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            ecb $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = axs.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         tn.g($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private ecb a(ajb<cwe> $$0, Supplier<eji> $$1) {
      ecb $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = ecb.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(sy $$0, ajb<cwe> $$1, Optional<ajb<Codec<? extends dob>>> $$2) {
      sy $$3 = new sy();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(sy $$0) {
      return tn.b($$0, -1);
   }

   public CompletableFuture<Optional<sy>> e(cvl $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(cvl $$0, sy $$1) {
      this.f($$0);
      return this.a.a($$0, $$1);
   }

   protected void f(cvl $$0) {
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

   public dpa p() {
      return this.a;
   }
}
