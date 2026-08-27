import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class aqm implements anq {
   private static final Map<aey<? extends hq<?>>, String> a = Map.of(
      jc.e, "tags/blocks", jc.t, "tags/entity_types", jc.x, "tags/fluids", jc.A, "tags/game_events", jc.E, "tags/items"
   );
   private final hr b;
   private List<aqm.a<?>> c = List.of();

   public aqm(hr $$0) {
      this.b = $$0;
   }

   public List<aqm.a<?>> a() {
      return this.c;
   }

   public static String a(aey<? extends hq<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(anq.a $$0, anw $$1, bdv $$2, bdv $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends aqm.a<?>>> $$6 = this.b.b().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<aqm.a<T>> a(anw $$0, Executor $$1, hr.d<T> $$2) {
      aey<? extends hq<T>> $$3 = $$2.a();
      hq<T> $$4 = $$2.b();
      aql<he<T>> $$5 = new aql<>($$2x -> $$4.b(aey.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new aqm.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(aey<? extends hq<T>> a, Map<aez, Collection<he<T>>> b) {
   }
}
