import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dly implements AutoCloseable {
   public static final int d = 1493;
   private final dma a;
   protected final DataFixer e;
   @Nullable
   private volatile dyu b;

   public dly(Path $$0, DataFixer $$1, boolean $$2) {
      this.e = $$1;
      this.a = new dma($$0, $$2, "chunk");
   }

   public boolean b(csp $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public sl a(ahc<cti> $$0, Supplier<ega> $$1, sl $$2, Optional<ahc<Codec<? extends dkx>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = avq.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            dyu $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = avq.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         ta.g($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private dyu a(ahc<cti> $$0, Supplier<ega> $$1) {
      dyu $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = dyu.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(sl $$0, ahc<cti> $$1, Optional<ahc<Codec<? extends dkx>>> $$2) {
      sl $$3 = new sl();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(sl $$0) {
      return ta.b($$0, -1);
   }

   public CompletableFuture<Optional<sl>> e(csp $$0) {
      return this.a.a($$0);
   }

   public void a(csp $$0, sl $$1) {
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

   public dlw p() {
      return this.a;
   }
}
