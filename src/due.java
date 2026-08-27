import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class due implements AutoCloseable {
   public static final int d = 1493;
   private final dug a;
   protected final DataFixer e;
   @Nullable
   private volatile ehe b;

   public due(dun $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new dug($$0, $$1, $$3);
   }

   public boolean b(dae $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public ud a(akl<dax> $$0, Supplier<eop> $$1, ud $$2, Optional<akl<MapCodec<? extends dsy>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = azj.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            ehe $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = azj.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         us.e($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private ehe a(akl<dax> $$0, Supplier<eop> $$1) {
      ehe $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = ehe.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(ud $$0, akl<dax> $$1, Optional<akl<MapCodec<? extends dsy>>> $$2) {
      ud $$3 = new ud();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(ud $$0) {
      return us.b($$0, -1);
   }

   public CompletableFuture<Optional<ud>> e(dae $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dae $$0, ud $$1) {
      this.f($$0);
      return this.a.a($$0, $$1);
   }

   protected void f(dae $$0) {
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

   public duc p() {
      return this.a;
   }
}
