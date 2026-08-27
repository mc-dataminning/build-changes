import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dic implements AutoCloseable {
   public static final int c = 1493;
   private final die a;
   protected final DataFixer d;
   @Nullable
   private volatile duy b;

   public dic(Path $$0, DataFixer $$1, boolean $$2) {
      this.d = $$1;
      this.a = new die($$0, $$2, "chunk");
   }

   public boolean b(cox $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public qu a(aet<cpq> $$0, Supplier<ebx> $$1, qu $$2, Optional<aet<Codec<? extends dhb>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = asv.c.a(this.d, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            duy $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = asv.c.a(this.d, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         rg.g($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private duy a(aet<cpq> $$0, Supplier<ebx> $$1) {
      duy $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = duy.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(qu $$0, aet<cpq> $$1, Optional<aet<Codec<? extends dhb>>> $$2) {
      qu $$3 = new qu();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(qu $$0) {
      return rg.b($$0, -1);
   }

   public CompletableFuture<Optional<qu>> e(cox $$0) {
      return this.a.a($$0);
   }

   public void a(cox $$0, qu $$1) {
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

   public dia p() {
      return this.a;
   }
}
