import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dln implements AutoCloseable {
   public static final int d = 1493;
   private final dlp a;
   protected final DataFixer e;
   @Nullable
   private volatile dyj b;

   public dln(Path $$0, DataFixer $$1, boolean $$2) {
      this.e = $$1;
      this.a = new dlp($$0, $$2, "chunk");
   }

   public boolean b(csf $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public sj a(ags<csy> $$0, Supplier<efp> $$1, sj $$2, Optional<ags<Codec<? extends dkm>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = avg.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            dyj $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = avg.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         sy.g($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private dyj a(ags<csy> $$0, Supplier<efp> $$1) {
      dyj $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = dyj.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(sj $$0, ags<csy> $$1, Optional<ags<Codec<? extends dkm>>> $$2) {
      sj $$3 = new sj();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(sj $$0) {
      return sy.b($$0, -1);
   }

   public CompletableFuture<Optional<sj>> e(csf $$0) {
      return this.a.a($$0);
   }

   public void a(csf $$0, sj $$1) {
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

   public dll p() {
      return this.a;
   }
}
