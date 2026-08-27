import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class asi implements apm {
   private static final Map<ags<? extends ir<?>>, String> a = Map.of(
      kc.f, "tags/blocks", kc.u, "tags/entity_types", kc.y, "tags/fluids", kc.B, "tags/game_events", kc.F, "tags/items"
   );
   private final is b;
   private List<asi.a<?>> c = List.of();

   public asi(is $$0) {
      this.b = $$0;
   }

   public List<asi.a<?>> a() {
      return this.c;
   }

   public static String a(ags<? extends ir<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(apm.a $$0, aps $$1, bgc $$2, bgc $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends asi.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<asi.a<T>> a(aps $$0, Executor $$1, is.d<T> $$2) {
      ags<? extends ir<T>> $$3 = $$2.a();
      ir<T> $$4 = $$2.b();
      ash<ie<T>> $$5 = new ash<>($$2x -> $$4.b(ags.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new asi.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(ags<? extends ir<T>> a, Map<agt, Collection<ie<T>>> b) {
   }
}
