import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class auv implements arz {
   private static final Map<ajb<? extends ix<?>>, String> a = Map.of(
      ki.f, "tags/blocks", ki.u, "tags/entity_types", ki.y, "tags/fluids", ki.B, "tags/game_events", ki.F, "tags/items"
   );
   private final iy b;
   private List<auv.a<?>> c = List.of();

   public auv(iy $$0) {
      this.b = $$0;
   }

   public List<auv.a<?>> a() {
      return this.c;
   }

   public static String a(ajb<? extends ix<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(arz.a $$0, asf $$1, bjc $$2, bjc $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends auv.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<auv.a<T>> a(asf $$0, Executor $$1, iy.d<T> $$2) {
      ajb<? extends ix<T>> $$3 = $$2.a();
      ix<T> $$4 = $$2.b();
      auu<il<T>> $$5 = new auu<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new auv.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(ajb<? extends ix<T>> a, Map<ajc, Collection<il<T>>> b) {
   }
}
