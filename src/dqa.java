import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class dqa implements dqz<box> {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "Entities";
   private static final String c = "Position";
   private final apf d;
   private final dqk e;
   private final LongSet f = new LongOpenHashSet();
   private final blw<Runnable> g;

   public dqa(dqk $$0, apf $$1, Executor $$2) {
      this.e = $$0;
      this.d = $$1;
      this.g = blw.a($$2, "entity-deserializer");
   }

   @Override
   public CompletableFuture<dqu<box>> a(cwi $$0) {
      return this.f.contains($$0.a()) ? CompletableFuture.completedFuture(b($$0)) : this.e.a($$0).thenApplyAsync($$1 -> {
         if ($$1.isEmpty()) {
            this.f.add($$0.a());
            return b($$0);
         } else {
            try {
               cwi $$2 = a($$1.get());
               if (!Objects.equals($$0, $$2)) {
                  a.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{$$0, $$0, $$2});
               }
            } catch (Exception var6) {
               a.warn("Failed to parse chunk {} position info", $$0, var6);
            }

            ta $$4 = this.e.a($$1.get(), -1);
            tg $$5 = $$4.c("Entities", 10);
            List<box> $$6 = bpd.a($$5, this.d).collect(ImmutableList.toImmutableList());
            return new dqu<>($$0, $$6);
         }
      }, this.g::a);
   }

   private static cwi a(ta $$0) {
      int[] $$1 = $$0.n("Position");
      return new cwi($$1[0], $$1[1]);
   }

   private static void a(ta $$0, cwi $$1) {
      $$0.a("Position", new te(new int[]{$$1.e, $$1.f}));
   }

   private static dqu<box> b(cwi $$0) {
      return new dqu<>($$0, ImmutableList.of());
   }

   @Override
   public void a(dqu<box> $$0) {
      cwi $$1 = $$0.a();
      if ($$0.c()) {
         if (this.f.add($$1.a())) {
            this.e.a($$1, null);
         }
      } else {
         tg $$2 = new tg();
         $$0.b().forEach($$1x -> {
            ta $$2x = new ta();
            if ($$1x.e($$2x)) {
               $$2.add($$2x);
            }
         });
         ta $$3 = tp.f(new ta());
         $$3.a("Entities", $$2);
         a($$3, $$1);
         this.e.a($$1, $$3).exceptionally($$1x -> {
            a.error("Failed to store chunk {}", $$1, $$1x);
            return null;
         });
         this.f.remove($$1.a());
      }
   }

   @Override
   public void a(boolean $$0) {
      this.e.a($$0).join();
      this.g.a();
   }
}
