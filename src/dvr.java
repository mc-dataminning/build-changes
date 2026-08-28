import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dvr implements AutoCloseable {
   public static final int d = 1493;
   private final dvt a;
   protected final DataFixer e;
   @Nullable
   private volatile eis b;

   public dvr(dwa $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new dvt($$0, $$1, $$3);
   }

   public boolean b(dbn $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public tx a(akj<dcg> $$0, Supplier<eqe> $$1, tx $$2, Optional<akj<MapCodec<? extends dui>>> $$3) {
      int $$4 = a($$2);
      if ($$4 == aa.b().d().c()) {
         return $$2;
      } else {
         try {
            if ($$4 < 1493) {
               $$2 = azo.c.a(this.e, $$2, $$4, 1493);
               if ($$2.p("Level").q("hasLegacyStructureData")) {
                  eis $$5 = this.a($$0, $$1);
                  $$2 = $$5.a($$2);
               }
            }

            a($$2, $$0, $$3);
            $$2 = azo.c.a(this.e, $$2, Math.max(1493, $$4));
            b($$2);
            um.e($$2);
            return $$2;
         } catch (Exception var9) {
            o $$7 = o.a(var9, "Updated chunk");
            p $$8 = $$7.a("Updated chunk details");
            $$8.a("Data version", $$4);
            throw new y($$7);
         }
      }
   }

   private eis a(akj<dcg> $$0, Supplier<eqe> $$1) {
      eis $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = eis.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(tx $$0, akj<dcg> $$1, Optional<akj<MapCodec<? extends dui>>> $$2) {
      tx $$3 = new tx();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   private static void b(tx $$0) {
      $$0.r("__context");
   }

   public static int a(tx $$0) {
      return um.b($$0, -1);
   }

   public CompletableFuture<Optional<tx>> d(dbn $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dbn $$0, tx $$1) {
      this.e($$0);
      return this.a.a($$0, $$1);
   }

   protected void e(dbn $$0) {
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

   public dvp p() {
      return this.a;
   }
}
