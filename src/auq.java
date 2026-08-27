import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class auq implements aru {
   private static final Map<aix<? extends iv<?>>, String> a = Map.of(
      kg.f, "tags/blocks", kg.u, "tags/entity_types", kg.y, "tags/fluids", kg.B, "tags/game_events", kg.F, "tags/items"
   );
   private final iw b;
   private List<auq.a<?>> c = List.of();

   public auq(iw $$0) {
      this.b = $$0;
   }

   public List<auq.a<?>> a() {
      return this.c;
   }

   public static String a(aix<? extends iv<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(aru.a $$0, asa $$1, bil $$2, bil $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends auq.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<auq.a<T>> a(asa $$0, Executor $$1, iw.d<T> $$2) {
      aix<? extends iv<T>> $$3 = $$2.a();
      iv<T> $$4 = $$2.b();
      aup<ij<T>> $$5 = new aup<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new auq.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(aix<? extends iv<T>> a, Map<aiy, Collection<ij<T>>> b) {
   }
}
