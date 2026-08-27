import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dod implements AutoCloseable {
   public static final int d = 1493;
   private final dof a;
   protected final DataFixer e;
   @Nullable
   private volatile eaz b;

   public dod(Path $$0, DataFixer $$1, boolean $$2) {
      this.e = $$1;
      this.a = new dof($$0, $$2, "chunk");
   }

   public boolean b(cuu $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public sw a(aix<cvn> $$0, Supplier<eif> $$1, sw $$2, Optional<aix<Codec<? extends dnc>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = axo.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            eaz $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = axo.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         tl.g($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private eaz a(aix<cvn> $$0, Supplier<eif> $$1) {
      eaz $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = eaz.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(sw $$0, aix<cvn> $$1, Optional<aix<Codec<? extends dnc>>> $$2) {
      sw $$3 = new sw();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(sw $$0) {
      return tl.b($$0, -1);
   }

   public CompletableFuture<Optional<sw>> e(cuu $$0) {
      return this.a.a($$0);
   }

   public void a(cuu $$0, sw $$1) {
      this.a.a($$0, $$1);
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

   public dob p() {
      return this.a;
   }
}
