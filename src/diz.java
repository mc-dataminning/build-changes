import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class diz implements AutoCloseable {
   public static final int d = 1493;
   private final djb a;
   protected final DataFixer e;
   @Nullable
   private volatile dvv b;

   public diz(Path $$0, DataFixer $$1, boolean $$2) {
      this.e = $$1;
      this.a = new djb($$0, $$2, "chunk");
   }

   public boolean b(cqg $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public rt a(afv<cqz> $$0, Supplier<ecu> $$1, rt $$2, Optional<afv<Codec<? extends dhy>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = aud.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            dvv $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = aud.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         sg.g($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private dvv a(afv<cqz> $$0, Supplier<ecu> $$1) {
      dvv $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = dvv.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(rt $$0, afv<cqz> $$1, Optional<afv<Codec<? extends dhy>>> $$2) {
      rt $$3 = new rt();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(rt $$0) {
      return sg.b($$0, -1);
   }

   public CompletableFuture<Optional<rt>> e(cqg $$0) {
      return this.a.a($$0);
   }

   public void a(cqg $$0, rt $$1) {
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

   public dix p() {
      return this.a;
   }
}
