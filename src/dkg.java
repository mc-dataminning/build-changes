import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dkg implements AutoCloseable {
   public static final int d = 1493;
   private final dki a;
   protected final DataFixer e;
   @Nullable
   private volatile dxc b;

   public dkg(Path $$0, DataFixer $$1, boolean $$2) {
      this.e = $$1;
      this.a = new dki($$0, $$2, "chunk");
   }

   public boolean b(crh $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public rz a(agh<csa> $$0, Supplier<eei> $$1, rz $$2, Optional<agh<Codec<? extends djf>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = aus.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            dxc $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = aus.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         so.g($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private dxc a(agh<csa> $$0, Supplier<eei> $$1) {
      dxc $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = dxc.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(rz $$0, agh<csa> $$1, Optional<agh<Codec<? extends djf>>> $$2) {
      rz $$3 = new rz();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(rz $$0) {
      return so.b($$0, -1);
   }

   public CompletableFuture<Optional<rz>> e(crh $$0) {
      return this.a.a($$0);
   }

   public void a(crh $$0, rz $$1) {
      this.a.a($$0, $$1);
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

   public dke p() {
      return this.a;
   }
}
