import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class awi implements atl {
   private static final Map<akg<? extends jj<?>>, String> a = Map.of(
      le.f, "tags/blocks", le.v, "tags/entity_types", le.z, "tags/fluids", le.C, "tags/game_events", le.G, "tags/items"
   );
   private final jk b;
   private List<awi.a<?>> c = List.of();

   public awi(jk $$0) {
      this.b = $$0;
   }

   public List<awi.a<?>> a() {
      return this.c;
   }

   public static String a(akg<? extends jj<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(atl.a $$0, atr $$1, bma $$2, bma $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends awi.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<awi.a<T>> a(atr $$0, Executor $$1, jk.d<T> $$2) {
      akg<? extends jj<T>> $$3 = $$2.a();
      jj<T> $$4 = $$2.b();
      awh<iw<T>> $$5 = new awh<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new awi.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(akg<? extends jj<T>> a, Map<akh, Collection<iw<T>>> b) {
   }
}
