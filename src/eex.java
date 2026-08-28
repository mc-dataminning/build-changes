import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eex implements AutoCloseable {
   public static final int d = 1493;
   private final eez a;
   protected final DataFixer e;
   @Nullable
   private volatile esi b;

   public eex(efg $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new eez($$0, $$1, $$3);
   }

   public boolean b(djo $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public ua a(alq<dkj> $$0, Supplier<fab> $$1, ua $$2, Optional<alq<MapCodec<? extends edo>>> $$3) {
      int $$4 = a($$2);
      if ($$4 == ac.b().d().c()) {
         return $$2;
      } else {
         try {
            if ($$4 < 1493) {
               $$2 = bbo.c.a(this.e, $$2, $$4, 1493);
               if ($$2.m("Level").flatMap($$0x -> $$0x.q("hasLegacyStructureData")).orElse(false)) {
                  esi $$5 = this.a($$0, $$1);
                  $$2 = $$5.a($$2);
               }
            }

            a($$2, $$0, $$3);
            $$2 = bbo.c.a(this.e, $$2, Math.max(1493, $$4));
            b($$2);
            up.e($$2);
            return $$2;
         } catch (Exception var9) {
            p $$7 = p.a(var9, "Updated chunk");
            q $$8 = $$7.a("Updated chunk details");
            $$8.a("Data version", $$4);
            throw new aa($$7);
         }
      }
   }

   private esi a(alq<dkj> $$0, Supplier<fab> $$1) {
      esi $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = esi.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(ua $$0, alq<dkj> $$1, Optional<alq<MapCodec<? extends edo>>> $$2) {
      ua $$3 = new ua();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   private static void b(ua $$0) {
      $$0.r("__context");
   }

   public static int a(ua $$0) {
      return up.b($$0, -1);
   }

   public CompletableFuture<Optional<ua>> d(djo $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(djo $$0, Supplier<ua> $$1) {
      this.e($$0);
      return this.a.a($$0, $$1);
   }

   protected void e(djo $$0) {
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

   public eew p() {
      return this.a;
   }

   protected efg q() {
      return this.a.a();
   }
}
