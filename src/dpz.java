import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dpz implements AutoCloseable {
   public static final int d = 1493;
   private final dqb a;
   protected final DataFixer e;
   @Nullable
   private volatile ecz b;

   public dpz(dqi $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new dqb($$0, $$1, $$3);
   }

   public boolean b(cwi $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public ta a(ajg<cxb> $$0, Supplier<ekg> $$1, ta $$2, Optional<ajg<Codec<? extends doy>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = ayc.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            ecz $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = ayc.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         tp.f($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private ecz a(ajg<cxb> $$0, Supplier<ekg> $$1) {
      ecz $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = ecz.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(ta $$0, ajg<cxb> $$1, Optional<ajg<Codec<? extends doy>>> $$2) {
      ta $$3 = new ta();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(ta $$0) {
      return tp.b($$0, -1);
   }

   public CompletableFuture<Optional<ta>> e(cwi $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(cwi $$0, ta $$1) {
      this.f($$0);
      return this.a.a($$0, $$1);
   }

   protected void f(cwi $$0) {
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

   public dpx p() {
      return this.a;
   }
}
