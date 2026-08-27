import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class arj implements aon {
   private static final Map<afv<? extends io<?>>, String> a = Map.of(
      jz.e, "tags/blocks", jz.t, "tags/entity_types", jz.x, "tags/fluids", jz.A, "tags/game_events", jz.E, "tags/items"
   );
   private final ip b;
   private List<arj.a<?>> c = List.of();

   public arj(ip $$0) {
      this.b = $$0;
   }

   public List<arj.a<?>> a() {
      return this.c;
   }

   public static String a(afv<? extends io<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(aon.a $$0, aot $$1, bes $$2, bes $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends arj.a<?>>> $$6 = this.b.b().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<arj.a<T>> a(aot $$0, Executor $$1, ip.d<T> $$2) {
      afv<? extends io<T>> $$3 = $$2.a();
      io<T> $$4 = $$2.b();
      ari<ib<T>> $$5 = new ari<>($$2x -> $$4.b(afv.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new arj.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(afv<? extends io<T>> a, Map<afw, Collection<ib<T>>> b) {
   }
}
