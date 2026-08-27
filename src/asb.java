import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class asb implements apf {
   private static final Map<agl<? extends is<?>>, String> a = Map.of(
      kd.e, "tags/blocks", kd.t, "tags/entity_types", kd.x, "tags/fluids", kd.A, "tags/game_events", kd.E, "tags/items"
   );
   private final it b;
   private List<asb.a<?>> c = List.of();

   public asb(it $$0) {
      this.b = $$0;
   }

   public List<asb.a<?>> a() {
      return this.c;
   }

   public static String a(agl<? extends is<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(apf.a $$0, apl $$1, bfs $$2, bfs $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends asb.a<?>>> $$6 = this.b.b().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<asb.a<T>> a(apl $$0, Executor $$1, it.d<T> $$2) {
      agl<? extends is<T>> $$3 = $$2.a();
      is<T> $$4 = $$2.b();
      asa<ig<T>> $$5 = new asa<>($$2x -> $$4.b(agl.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new asb.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(agl<? extends is<T>> a, Map<agm, Collection<ig<T>>> b) {
   }
}
