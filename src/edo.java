import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class edo implements AutoCloseable {
   public static final int d = 1493;
   private final edq a;
   protected final DataFixer e;
   @Nullable
   private volatile eqw b;

   public edo(edx $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new edq($$0, $$1, $$3);
   }

   public boolean b(dih $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public tz a(alf<dja> $$0, Supplier<eyp> $$1, tz $$2, Optional<alf<MapCodec<? extends ecf>>> $$3) {
      int $$4 = a($$2);
      if ($$4 == ab.b().d().c()) {
         return $$2;
      } else {
         try {
            if ($$4 < 1493) {
               $$2 = bbb.c.a(this.e, $$2, $$4, 1493);
               if ($$2.p("Level").q("hasLegacyStructureData")) {
                  eqw $$5 = this.a($$0, $$1);
                  $$2 = $$5.a($$2);
               }
            }

            a($$2, $$0, $$3);
            $$2 = bbb.c.a(this.e, $$2, Math.max(1493, $$4));
            b($$2);
            uo.e($$2);
            return $$2;
         } catch (Exception var9) {
            o $$7 = o.a(var9, "Updated chunk");
            p $$8 = $$7.a("Updated chunk details");
            $$8.a("Data version", $$4);
            throw new z($$7);
         }
      }
   }

   private eqw a(alf<dja> $$0, Supplier<eyp> $$1) {
      eqw $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = eqw.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(tz $$0, alf<dja> $$1, Optional<alf<MapCodec<? extends ecf>>> $$2) {
      tz $$3 = new tz();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   private static void b(tz $$0) {
      $$0.r("__context");
   }

   public static int a(tz $$0) {
      return uo.b($$0, -1);
   }

   public CompletableFuture<Optional<tz>> d(dih $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dih $$0, Supplier<tz> $$1) {
      this.e($$0);
      return this.a.a($$0, $$1);
   }

   protected void e(dih $$0) {
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

   public edn p() {
      return this.a;
   }

   protected edx q() {
      return this.a.a();
   }
}
