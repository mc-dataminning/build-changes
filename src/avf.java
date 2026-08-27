import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class avf implements asi {
   private static final Map<ajg<? extends iy<?>>, String> a = Map.of(
      kj.f, "tags/blocks", kj.u, "tags/entity_types", kj.y, "tags/fluids", kj.B, "tags/game_events", kj.F, "tags/items"
   );
   private final iz b;
   private List<avf.a<?>> c = List.of();

   public avf(iz $$0) {
      this.b = $$0;
   }

   public List<avf.a<?>> a() {
      return this.c;
   }

   public static String a(ajg<? extends iy<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(asi.a $$0, aso $$1, bjr $$2, bjr $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends avf.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<avf.a<T>> a(aso $$0, Executor $$1, iz.d<T> $$2) {
      ajg<? extends iy<T>> $$3 = $$2.a();
      iy<T> $$4 = $$2.b();
      ave<il<T>> $$5 = new ave<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new avf.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(ajg<? extends iy<T>> a, Map<ajh, Collection<il<T>>> b) {
   }
}
