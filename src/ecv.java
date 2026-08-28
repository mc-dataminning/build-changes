import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ecv implements AutoCloseable {
   public static final int d = 1493;
   private final ecx a;
   protected final DataFixer e;
   @Nullable
   private volatile eqd b;

   public ecv(ede $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new ecx($$0, $$1, $$3);
   }

   public boolean b(dhw $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public tx a(ald<dip> $$0, Supplier<exv> $$1, tx $$2, Optional<ald<MapCodec<? extends ebm>>> $$3) {
      int $$4 = a($$2);
      if ($$4 == ab.b().d().c()) {
         return $$2;
      } else {
         try {
            if ($$4 < 1493) {
               $$2 = baz.c.a(this.e, $$2, $$4, 1493);
               if ($$2.p("Level").q("hasLegacyStructureData")) {
                  eqd $$5 = this.a($$0, $$1);
                  $$2 = $$5.a($$2);
               }
            }

            a($$2, $$0, $$3);
            $$2 = baz.c.a(this.e, $$2, Math.max(1493, $$4));
            b($$2);
            um.e($$2);
            return $$2;
         } catch (Exception var9) {
            o $$7 = o.a(var9, "Updated chunk");
            p $$8 = $$7.a("Updated chunk details");
            $$8.a("Data version", $$4);
            throw new z($$7);
         }
      }
   }

   private eqd a(ald<dip> $$0, Supplier<exv> $$1) {
      eqd $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = eqd.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(tx $$0, ald<dip> $$1, Optional<ald<MapCodec<? extends ebm>>> $$2) {
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

   public CompletableFuture<Optional<tx>> d(dhw $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dhw $$0, Supplier<tx> $$1) {
      this.e($$0);
      return this.a.a($$0, $$1);
   }

   protected void e(dhw $$0) {
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

   public ecu p() {
      return this.a;
   }

   protected ede q() {
      return this.a.a();
   }
}
