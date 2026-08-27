import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dsc implements AutoCloseable {
   public static final int d = 1493;
   private final dse a;
   protected final DataFixer e;
   @Nullable
   private volatile efc b;

   public dsc(dsl $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new dse($$0, $$1, $$3);
   }

   public boolean b(cye $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public tm a(ajs<cyx> $$0, Supplier<eml> $$1, tm $$2, Optional<ajs<Codec<? extends dqw>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = ayq.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            efc $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = ayq.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         ub.f($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private efc a(ajs<cyx> $$0, Supplier<eml> $$1) {
      efc $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = efc.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(tm $$0, ajs<cyx> $$1, Optional<ajs<Codec<? extends dqw>>> $$2) {
      tm $$3 = new tm();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(tm $$0) {
      return ub.b($$0, -1);
   }

   public CompletableFuture<Optional<tm>> e(cye $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(cye $$0, tm $$1) {
      this.f($$0);
      return this.a.a($$0, $$1);
   }

   protected void f(cye $$0) {
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

   public dsa p() {
      return this.a;
   }
}
