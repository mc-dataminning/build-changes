import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dsl implements AutoCloseable {
   public static final int d = 1493;
   private final dsn a;
   protected final DataFixer e;
   @Nullable
   private volatile efl b;

   public dsl(dsu $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new dsn($$0, $$1, $$3);
   }

   public boolean b(cyn $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public to a(aju<czg> $$0, Supplier<emu> $$1, to $$2, Optional<aju<Codec<? extends drf>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = ays.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            efl $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = ays.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         ud.e($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private efl a(aju<czg> $$0, Supplier<emu> $$1) {
      efl $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = efl.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(to $$0, aju<czg> $$1, Optional<aju<Codec<? extends drf>>> $$2) {
      to $$3 = new to();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(to $$0) {
      return ud.b($$0, -1);
   }

   public CompletableFuture<Optional<to>> e(cyn $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(cyn $$0, to $$1) {
      this.f($$0);
      return this.a.a($$0, $$1);
   }

   protected void f(cyn $$0) {
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

   public dsj p() {
      return this.a;
   }
}
