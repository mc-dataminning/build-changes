import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ebt implements AutoCloseable {
   public static final int d = 1493;
   private final ebv a;
   protected final DataFixer e;
   @Nullable
   private volatile epb b;

   public ebt(ecc $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new ebv($$0, $$1, $$3);
   }

   public boolean b(dgw $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public tw a(alc<dhp> $$0, Supplier<ewt> $$1, tw $$2, Optional<alc<MapCodec<? extends eak>>> $$3) {
      int $$4 = a($$2);
      if ($$4 == ab.b().d().c()) {
         return $$2;
      } else {
         try {
            if ($$4 < 1493) {
               $$2 = bax.c.a(this.e, $$2, $$4, 1493);
               if ($$2.p("Level").q("hasLegacyStructureData")) {
                  epb $$5 = this.a($$0, $$1);
                  $$2 = $$5.a($$2);
               }
            }

            a($$2, $$0, $$3);
            $$2 = bax.c.a(this.e, $$2, Math.max(1493, $$4));
            b($$2);
            ul.e($$2);
            return $$2;
         } catch (Exception var9) {
            o $$7 = o.a(var9, "Updated chunk");
            p $$8 = $$7.a("Updated chunk details");
            $$8.a("Data version", $$4);
            throw new z($$7);
         }
      }
   }

   private epb a(alc<dhp> $$0, Supplier<ewt> $$1) {
      epb $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = epb.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(tw $$0, alc<dhp> $$1, Optional<alc<MapCodec<? extends eak>>> $$2) {
      tw $$3 = new tw();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   private static void b(tw $$0) {
      $$0.r("__context");
   }

   public static int a(tw $$0) {
      return ul.b($$0, -1);
   }

   public CompletableFuture<Optional<tw>> d(dgw $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dgw $$0, Supplier<tw> $$1) {
      this.e($$0);
      return this.a.a($$0, $$1);
   }

   protected void e(dgw $$0) {
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

   public ebs p() {
      return this.a;
   }

   protected ecc q() {
      return this.a.a();
   }
}
