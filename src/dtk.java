import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dtk implements AutoCloseable {
   public static final int d = 1493;
   private final dtm a;
   protected final DataFixer e;
   @Nullable
   private volatile egk b;

   public dtk(dtt $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new dtm($$0, $$1, $$3);
   }

   public boolean b(czk $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public ua a(akg<dad> $$0, Supplier<env> $$1, ua $$2, Optional<akg<Codec<? extends dse>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = azf.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            egk $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = azf.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         up.e($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private egk a(akg<dad> $$0, Supplier<env> $$1) {
      egk $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = egk.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(ua $$0, akg<dad> $$1, Optional<akg<Codec<? extends dse>>> $$2) {
      ua $$3 = new ua();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(ua $$0) {
      return up.b($$0, -1);
   }

   public CompletableFuture<Optional<ua>> e(czk $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(czk $$0, ua $$1) {
      this.f($$0);
      return this.a.a($$0, $$1);
   }

   protected void f(czk $$0) {
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

   public dti p() {
      return this.a;
   }
}
