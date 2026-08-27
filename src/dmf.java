import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dmf implements AutoCloseable {
   public static final int d = 1493;
   private final dmh a;
   protected final DataFixer e;
   @Nullable
   private volatile dzb b;

   public dmf(Path $$0, DataFixer $$1, boolean $$2) {
      this.e = $$1;
      this.a = new dmh($$0, $$2, "chunk");
   }

   public boolean b(csw $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public sn a(ahf<ctp> $$0, Supplier<egh> $$1, sn $$2, Optional<ahf<Codec<? extends dle>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = avw.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            dzb $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = avw.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         tc.g($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private dzb a(ahf<ctp> $$0, Supplier<egh> $$1) {
      dzb $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = dzb.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(sn $$0, ahf<ctp> $$1, Optional<ahf<Codec<? extends dle>>> $$2) {
      sn $$3 = new sn();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(sn $$0) {
      return tc.b($$0, -1);
   }

   public CompletableFuture<Optional<sn>> e(csw $$0) {
      return this.a.a($$0);
   }

   public void a(csw $$0, sn $$1) {
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

   public dmd p() {
      return this.a;
   }
}
