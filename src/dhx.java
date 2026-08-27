import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dhx implements AutoCloseable {
   public static final int c = 1493;
   private final dhz a;
   protected final DataFixer d;
   @Nullable
   private volatile dut b;

   public dhx(Path $$0, DataFixer $$1, boolean $$2) {
      this.d = $$1;
      this.a = new dhz($$0, $$2, "chunk");
   }

   public boolean a(cos $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public qr a(aeq<cpl> $$0, Supplier<ebs> $$1, qr $$2, Optional<aeq<Codec<? extends dgw>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = ass.c.a(this.d, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            dut $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = ass.c.a(this.d, $$2, Math.max(1493, $$4));
      if ($$4 < aa.b().d().c()) {
         rd.g($$2);
      }

      $$2.r("__context");
      return $$2;
   }

   private dut a(aeq<cpl> $$0, Supplier<ebs> $$1) {
      dut $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = dut.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(qr $$0, aeq<cpl> $$1, Optional<aeq<Codec<? extends dgw>>> $$2) {
      qr $$3 = new qr();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   public static int a(qr $$0) {
      return rd.b($$0, -1);
   }

   public CompletableFuture<Optional<qr>> e(cos $$0) {
      return this.a.a($$0);
   }

   public void a(cos $$0, qr $$1) {
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

   public dhv p() {
      return this.a;
   }
}
