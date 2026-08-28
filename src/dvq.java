import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dvq implements AutoCloseable {
   public static final int d = 1493;
   private final dvs a;
   protected final DataFixer e;
   @Nullable
   private volatile eir b;

   public dvq(dvz $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new dvs($$0, $$1, $$3);
   }

   public boolean b(dbm $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public tx a(akj<dcf> $$0, Supplier<eqc> $$1, tx $$2, Optional<akj<MapCodec<? extends duh>>> $$3) {
      int $$4 = a($$2);

      try {
         if ($$4 < 1493) {
            $$2 = azo.c.a(this.e, $$2, $$4, 1493);
            if ($$2.p("Level").q("hasLegacyStructureData")) {
               eir $$5 = this.a($$0, $$1);
               $$2 = $$5.a($$2);
            }
         }

         a($$2, $$0, $$3);
         $$2 = azo.c.a(this.e, $$2, Math.max(1493, $$4));
         if ($$4 < aa.b().d().c()) {
            um.e($$2);
         }

         $$2.r("__context");
         return $$2;
      } catch (Exception var9) {
         o $$7 = o.a(var9, "Updated chunk");
         p $$8 = $$7.a("Updated chunk details");
         $$8.a("Data version", $$4);
         throw new y($$7);
      }
   }

   private eir a(akj<dcf> $$0, Supplier<eqc> $$1) {
      eir $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = eir.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(tx $$0, akj<dcf> $$1, Optional<akj<MapCodec<? extends duh>>> $$2) {
      tx $$3 = new tx();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(tx $$0) {
      return um.b($$0, -1);
   }

   public CompletableFuture<Optional<tx>> d(dbm $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dbm $$0, tx $$1) {
      this.e($$0);
      return this.a.a($$0, $$1);
   }

   protected void e(dbm $$0) {
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

   public dvo p() {
      return this.a;
   }
}
