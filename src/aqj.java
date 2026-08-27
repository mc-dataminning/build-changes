import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class aqj implements ann {
   private static final Map<aev<? extends hq<?>>, String> a = Map.of(
      jc.e, "tags/blocks", jc.s, "tags/entity_types", jc.w, "tags/fluids", jc.z, "tags/game_events", jc.D, "tags/items"
   );
   private final hr b;
   private List<aqj.a<?>> c = List.of();

   public aqj(hr $$0) {
      this.b = $$0;
   }

   public List<aqj.a<?>> a() {
      return this.c;
   }

   public static String a(aev<? extends hq<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(ann.a $$0, ant $$1, bdp $$2, bdp $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends aqj.a<?>>> $$6 = this.b.b().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<aqj.a<T>> a(ant $$0, Executor $$1, hr.d<T> $$2) {
      aev<? extends hq<T>> $$3 = $$2.a();
      hq<T> $$4 = $$2.b();
      aqi<he<T>> $$5 = new aqi<>($$2x -> $$4.b(aev.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new aqj.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(aev<? extends hq<T>> a, Map<aew, Collection<he<T>>> b) {
   }
}
