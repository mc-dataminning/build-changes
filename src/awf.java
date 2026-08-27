import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class awf implements ati {
   private static final Map<ake<? extends ji<?>>, String> a = Map.of(
      ld.f, "tags/blocks", ld.v, "tags/entity_types", ld.z, "tags/fluids", ld.C, "tags/game_events", ld.G, "tags/items"
   );
   private final jj b;
   private List<awf.a<?>> c = List.of();

   public awf(jj $$0) {
      this.b = $$0;
   }

   public List<awf.a<?>> a() {
      return this.c;
   }

   public static String a(ake<? extends ji<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(ati.a $$0, ato $$1, ble $$2, ble $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends awf.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<awf.a<T>> a(ato $$0, Executor $$1, jj.d<T> $$2) {
      ake<? extends ji<T>> $$3 = $$2.a();
      ji<T> $$4 = $$2.b();
      awe<iv<T>> $$5 = new awe<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new awf.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(ake<? extends ji<T>> a, Map<akf, Collection<iv<T>>> b) {
   }
}
