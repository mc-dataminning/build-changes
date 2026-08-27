import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dhw implements AutoCloseable {
   public static final int c = 1493;
   private final dhy a;
   protected final DataFixer d;
   @Nullable
   private volatile dus b;

   public dhw(Path $$0, DataFixer $$1, boolean $$2) {
      this.d = $$1;
      this.a = new dhy($$0, $$2, "chunk");
   }

   public boolean a(cor $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public qs a(aeo<cpk> $$0, Supplier<ebr> $$1, qs $$2, Optional<aeo<Codec<? extends dgv>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = asq.c.a(this.d, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            dus $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = asq.c.a(this.d, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         re.g($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private dus a(aeo<cpk> $$0, Supplier<ebr> $$1) {
      dus $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = dus.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(qs $$0, aeo<cpk> $$1, Optional<aeo<Codec<? extends dgv>>> $$2) {
      qs $$3 = new qs();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(qs $$0) {
      return re.b($$0, -1);
   }

   public CompletableFuture<Optional<qs>> e(cor $$0) {
      return this.a.a($$0);
   }

   public void a(cor $$0, qs $$1) {
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

   public dhu p() {
      return this.a;
   }
}
