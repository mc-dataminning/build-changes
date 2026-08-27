import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dwf implements AutoCloseable {
   public static final int d = 1493;
   private final dwh a;
   protected final DataFixer e;
   @Nullable
   private volatile ejo b;

   public dwf(dwo $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new dwh($$0, $$1, $$3);
   }

   public boolean b(dbh $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public uk a(aks<dca> $$0, Supplier<eqz> $$1, uk $$2, Optional<aks<Codec<? extends duz>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = azs.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            ejo $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = azs.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < ab.b().d().c()) {
         uz.e($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private ejo a(aks<dca> $$0, Supplier<eqz> $$1) {
      ejo $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = ejo.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(uk $$0, aks<dca> $$1, Optional<aks<Codec<? extends duz>>> $$2) {
      uk $$3 = new uk();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(uk $$0) {
      return uz.b($$0, -1);
   }

   public CompletableFuture<Optional<uk>> e(dbh $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dbh $$0, uk $$1) {
      this.f($$0);
      return this.a.a($$0, $$1);
   }

   protected void f(dbh $$0) {
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

   public dwd p() {
      return this.a;
   }
}
