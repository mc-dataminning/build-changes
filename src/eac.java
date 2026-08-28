import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eac implements AutoCloseable {
   public static final int d = 1493;
   private final eae a;
   protected final DataFixer e;
   @Nullable
   private volatile enh b;

   public eac(eal $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new eae($$0, $$1, $$3);
   }

   public boolean b(dfo $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public tq a(akt<dgi> $$0, Supplier<euz> $$1, tq $$2, Optional<akt<MapCodec<? extends dyt>>> $$3) {
      int $$4 = a($$2);
      if ($$4 == ab.b().d().c()) {
         return $$2;
      } else {
         try {
            if ($$4 < 1493) {
               $$2 = ban.c.a(this.e, $$2, $$4, 1493);
               if ($$2.p("Level").q("hasLegacyStructureData")) {
                  enh $$5 = this.a($$0, $$1);
                  $$2 = $$5.a($$2);
               }
            }

            a($$2, $$0, $$3);
            $$2 = ban.c.a(this.e, $$2, Math.max(1493, $$4));
            b($$2);
            uf.e($$2);
            return $$2;
         } catch (Exception var9) {
            o $$7 = o.a(var9, "Updated chunk");
            p $$8 = $$7.a("Updated chunk details");
            $$8.a("Data version", $$4);
            throw new z($$7);
         }
      }
   }

   private enh a(akt<dgi> $$0, Supplier<euz> $$1) {
      enh $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = enh.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(tq $$0, akt<dgi> $$1, Optional<akt<MapCodec<? extends dyt>>> $$2) {
      tq $$3 = new tq();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   private static void b(tq $$0) {
      $$0.r("__context");
   }

   public static int a(tq $$0) {
      return uf.b($$0, -1);
   }

   public CompletableFuture<Optional<tq>> d(dfo $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dfo $$0, Supplier<tq> $$1) {
      this.e($$0);
      return this.a.a($$0, $$1);
   }

   protected void e(dfo $$0) {
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

   public eab p() {
      return this.a;
   }

   protected eal q() {
      return this.a.a();
   }
}
