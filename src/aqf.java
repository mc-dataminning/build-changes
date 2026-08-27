import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class aqf implements anj {
   private static final Map<aet<? extends ht<?>>, String> a = Map.of(
      je.e, "tags/blocks", je.s, "tags/entity_types", je.w, "tags/fluids", je.z, "tags/game_events", je.D, "tags/items"
   );
   private final hu b;
   private List<aqf.a<?>> c = List.of();

   public aqf(hu $$0) {
      this.b = $$0;
   }

   public List<aqf.a<?>> a() {
      return this.c;
   }

   public static String a(aet<? extends ht<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(anj.a $$0, anp $$1, bdk $$2, bdk $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends aqf.a<?>>> $$6 = this.b.b().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<aqf.a<T>> a(anp $$0, Executor $$1, hu.d<T> $$2) {
      aet<? extends ht<T>> $$3 = $$2.a();
      ht<T> $$4 = $$2.b();
      aqe<hg<T>> $$5 = new aqe<>($$2x -> $$4.b(aet.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new aqf.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(aet<? extends ht<T>> a, Map<aeu, Collection<hg<T>>> b) {
   }
}
