import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class eeb implements efb<bwi> {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "Entities";
   private static final String c = "Position";
   private final arq d;
   private final eem e;
   private final LongSet f = new LongOpenHashSet();
   private final bsv g;

   public eeb(eem $$0, arq $$1, Executor $$2) {
      this.e = $$0;
      this.d = $$1;
      this.g = new bsv($$2, "entity-deserializer");
   }

   @Override
   public CompletableFuture<eew<bwi>> a(dir $$0) {
      if (this.f.contains($$0.a())) {
         return CompletableFuture.completedFuture(b($$0));
      } else {
         CompletableFuture<Optional<tz>> $$1 = this.e.a($$0);
         this.b($$1, $$0);
         return $$1.thenApplyAsync($$1x -> {
            if ($$1x.isEmpty()) {
               this.f.add($$0.a());
               return b($$0);
            } else {
               try {
                  dir $$2 = ((tz)$$1x.get()).<dir>a("Position", dir.a).orElseThrow();
                  if (!Objects.equals($$0, $$2)) {
                     a.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{$$0, $$0, $$2});
                     this.d.p().a($$2, $$0, this.e.a());
                  }
               } catch (Exception var6) {
                  a.warn("Failed to parse chunk {} position info", $$0, var6);
                  this.d.p().a(var6, this.e.a(), $$0);
               }

               tz $$4 = this.e.a((tz)$$1x.get(), -1);
               uf $$5 = $$4.d("Entities", 10);
               List<bwi> $$6 = bwr.a($$5, this.d, bwq.r).collect(ImmutableList.toImmutableList());
               return new eew<>($$0, $$6);
            }
         }, this.g::a_);
      }
   }

   private static eew<bwi> b(dir $$0) {
      return new eew<>($$0, ImmutableList.of());
   }

   @Override
   public void a(eew<bwi> $$0) {
      dir $$1 = $$0.a();
      if ($$0.c()) {
         if (this.f.add($$1.a())) {
            this.a(this.e.a($$1, null), $$1);
         }
      } else {
         uf $$2 = new uf();
         $$0.b().forEach($$1x -> {
            tz $$2x = new tz();
            if ($$1x.e($$2x)) {
               $$2.add($$2x);
            }
         });
         tz $$3 = uo.e(new tz());
         $$3.a("Entities", $$2);
         $$3.a("Position", dir.a, $$1);
         this.a(this.e.a($$1, $$3), $$1);
         this.f.remove($$1.a());
      }
   }

   private void a(CompletableFuture<?> $$0, dir $$1) {
      $$0.exceptionally($$1x -> {
         a.error("Failed to store entity chunk {}", $$1, $$1x);
         this.d.p().b($$1x, this.e.a(), $$1);
         return null;
      });
   }

   private void b(CompletableFuture<?> $$0, dir $$1) {
      $$0.exceptionally($$1x -> {
         a.error("Failed to load entity chunk {}", $$1, $$1x);
         this.d.p().a($$1x, this.e.a(), $$1);
         return null;
      });
   }

   @Override
   public void a(boolean $$0) {
      this.e.a($$0).join();
      this.g.a();
   }

   @Override
   public void close() throws IOException {
      this.e.close();
   }
}
