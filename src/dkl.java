import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dkl implements AutoCloseable {
   public static final int d = 1493;
   private final dkn a;
   protected final DataFixer e;
   @Nullable
   private volatile dxh b;

   public dkl(Path $$0, DataFixer $$1, boolean $$2) {
      this.e = $$1;
      this.a = new dkn($$0, $$2, "chunk");
   }

   public boolean b(crm $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public sd a(agl<csf> $$0, Supplier<een> $$1, sd $$2, Optional<agl<Codec<? extends djk>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = auw.c.a(this.e, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            dxh $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = auw.c.a(this.e, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         ss.g($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private dxh a(agl<csf> $$0, Supplier<een> $$1) {
      dxh $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = dxh.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(sd $$0, agl<csf> $$1, Optional<agl<Codec<? extends djk>>> $$2) {
      sd $$3 = new sd();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(sd $$0) {
      return ss.b($$0, -1);
   }

   public CompletableFuture<Optional<sd>> e(crm $$0) {
      return this.a.a($$0);
   }

   public void a(crm $$0, sd $$1) {
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

   public dkj p() {
      return this.a;
   }
}
