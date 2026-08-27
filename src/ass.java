import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class ass implements apw {
   private static final Map<ahc<? extends it<?>>, String> a = Map.of(
      ke.f, "tags/blocks", ke.u, "tags/entity_types", ke.y, "tags/fluids", ke.B, "tags/game_events", ke.F, "tags/items"
   );
   private final iu b;
   private List<ass.a<?>> c = List.of();

   public ass(iu $$0) {
      this.b = $$0;
   }

   public List<ass.a<?>> a() {
      return this.c;
   }

   public static String a(ahc<? extends it<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(apw.a $$0, aqc $$1, bgm $$2, bgm $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends ass.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<ass.a<T>> a(aqc $$0, Executor $$1, iu.d<T> $$2) {
      ahc<? extends it<T>> $$3 = $$2.a();
      it<T> $$4 = $$2.b();
      asr<ih<T>> $$5 = new asr<>($$2x -> $$4.b(ahc.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new ass.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(ahc<? extends it<T>> a, Map<ahd, Collection<ih<T>>> b) {
   }
}
