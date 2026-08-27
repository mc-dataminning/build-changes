import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class aql implements anp {
   private static final Map<aex<? extends ht<?>>, String> a = Map.of(
      je.e, "tags/blocks", je.s, "tags/entity_types", je.w, "tags/fluids", je.z, "tags/game_events", je.D, "tags/items"
   );
   private final hu b;
   private List<aql.a<?>> c = List.of();

   public aql(hu $$0) {
      this.b = $$0;
   }

   public List<aql.a<?>> a() {
      return this.c;
   }

   public static String a(aex<? extends ht<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(anp.a $$0, anv $$1, bdr $$2, bdr $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends aql.a<?>>> $$6 = this.b.b().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<aql.a<T>> a(anv $$0, Executor $$1, hu.d<T> $$2) {
      aex<? extends ht<T>> $$3 = $$2.a();
      ht<T> $$4 = $$2.b();
      aqk<hg<T>> $$5 = new aqk<>($$2x -> $$4.b(aex.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new aql.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(aex<? extends ht<T>> a, Map<aey, Collection<hg<T>>> b) {
   }
}
