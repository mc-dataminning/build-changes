import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dvd implements AutoCloseable {
   public static final int d = 1493;
   private final dvf a;
   protected final DataFixer e;
   @Nullable
   private volatile eid b;

   public dvd(dvm $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new dvf($$0, $$1, $$3);
   }

   public boolean b(dbd $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public ur a(ald<dbw> $$0, Supplier<epo> $$1, ur $$2, Optional<ald<MapCodec<? extends dtx>>> $$3) {
      int $$4 = a($$2);

      try {
         if ($$4 < 1493) {
            $$2 = bae.c.a(this.e, $$2, $$4, 1493);
            if ($$2.p("Level").q("hasLegacyStructureData")) {
               eid $$5 = this.a($$0, $$1);
               $$2 = $$5.a($$2);
            }
         }

         a($$2, $$0, $$3);
         $$2 = bae.c.a(this.e, $$2, Math.max(1493, $$4));
         if ($$4 < aa.b().d().c()) {
            vg.e($$2);
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

   private eid a(ald<dbw> $$0, Supplier<epo> $$1) {
      eid $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = eid.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(ur $$0, ald<dbw> $$1, Optional<ald<MapCodec<? extends dtx>>> $$2) {
      ur $$3 = new ur();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(ur $$0) {
      return vg.b($$0, -1);
   }

   public CompletableFuture<Optional<ur>> e(dbd $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dbd $$0, ur $$1) {
      this.f($$0);
      return this.a.a($$0, $$1);
   }

   protected void f(dbd $$0) {
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

   public dvb p() {
      return this.a;
   }
}
