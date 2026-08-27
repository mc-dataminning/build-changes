import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class avv implements asy {
   private static final Map<aju<? extends ja<?>>, String> a = Map.of(
      ku.f, "tags/blocks", ku.v, "tags/entity_types", ku.z, "tags/fluids", ku.C, "tags/game_events", ku.G, "tags/items"
   );
   private final jb b;
   private List<avv.a<?>> c = List.of();

   public avv(jb $$0) {
      this.b = $$0;
   }

   public List<avv.a<?>> a() {
      return this.c;
   }

   public static String a(aju<? extends ja<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(asy.a $$0, ate $$1, bkt $$2, bkt $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends avv.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<avv.a<T>> a(ate $$0, Executor $$1, jb.d<T> $$2) {
      aju<? extends ja<T>> $$3 = $$2.a();
      ja<T> $$4 = $$2.b();
      avu<in<T>> $$5 = new avu<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new avv.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(aju<? extends ja<T>> a, Map<ajv, Collection<in<T>>> b) {
   }
}
