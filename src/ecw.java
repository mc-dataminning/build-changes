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

public class ecw implements edw<bwa> {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "Entities";
   private static final String c = "Position";
   private final aro d;
   private final edh e;
   private final LongSet f = new LongOpenHashSet();
   private final bso g;

   public ecw(edh $$0, aro $$1, Executor $$2) {
      this.e = $$0;
      this.d = $$1;
      this.g = new bso($$2, "entity-deserializer");
   }

   @Override
   public CompletableFuture<edr<bwa>> a(dhw $$0) {
      if (this.f.contains($$0.a())) {
         return CompletableFuture.completedFuture(b($$0));
      } else {
         CompletableFuture<Optional<tx>> $$1 = this.e.a($$0);
         this.b($$1, $$0);
         return $$1.thenApplyAsync($$1x -> {
            if ($$1x.isEmpty()) {
               this.f.add($$0.a());
               return b($$0);
            } else {
               try {
                  dhw $$2 = a((tx)$$1x.get());
                  if (!Objects.equals($$0, $$2)) {
                     a.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{$$0, $$0, $$2});
                     this.d.p().a($$2, $$0, this.e.a());
                  }
               } catch (Exception var6) {
                  a.warn("Failed to parse chunk {} position info", $$0, var6);
                  this.d.p().a(var6, this.e.a(), $$0);
               }

               tx $$4 = this.e.a((tx)$$1x.get(), -1);
               ud $$5 = $$4.c("Entities", 10);
               List<bwa> $$6 = bwj.a($$5, this.d, bwi.r).collect(ImmutableList.toImmutableList());
               return new edr<>($$0, $$6);
            }
         }, this.g::a_);
      }
   }

   private static dhw a(tx $$0) {
      int[] $$1 = $$0.n("Position");
      return new dhw($$1[0], $$1[1]);
   }

   private static void a(tx $$0, dhw $$1) {
      $$0.a("Position", new ub(new int[]{$$1.h, $$1.i}));
   }

   private static edr<bwa> b(dhw $$0) {
      return new edr<>($$0, ImmutableList.of());
   }

   @Override
   public void a(edr<bwa> $$0) {
      dhw $$1 = $$0.a();
      if ($$0.c()) {
         if (this.f.add($$1.a())) {
            this.a(this.e.a($$1, null), $$1);
         }
      } else {
         ud $$2 = new ud();
         $$0.b().forEach($$1x -> {
            tx $$2x = new tx();
            if ($$1x.e($$2x)) {
               $$2.add($$2x);
            }
         });
         tx $$3 = um.e(new tx());
         $$3.a("Entities", $$2);
         a($$3, $$1);
         this.a(this.e.a($$1, $$3), $$1);
         this.f.remove($$1.a());
      }
   }

   private void a(CompletableFuture<?> $$0, dhw $$1) {
      $$0.exceptionally($$1x -> {
         a.error("Failed to store entity chunk {}", $$1, $$1x);
         this.d.p().b($$1x, this.e.a(), $$1);
         return null;
      });
   }

   private void b(CompletableFuture<?> $$0, dhw $$1) {
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
