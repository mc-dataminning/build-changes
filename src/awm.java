import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class awm implements ato {
   private static final Map<akj<? extends jw<?>>, String> a = Map.of(
      lr.f, "tags/blocks", lr.z, "tags/entity_types", lr.D, "tags/fluids", lr.G, "tags/game_events", lr.K, "tags/items"
   );
   private final jx b;
   private List<awm.a<?>> c = List.of();

   public awm(jx $$0) {
      this.b = $$0;
   }

   public List<awm.a<?>> a() {
      return this.c;
   }

   public static String a(akj<? extends jw<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(ato.a $$0, atu $$1, bmr $$2, bmr $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends awm.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<awm.a<T>> a(atu $$0, Executor $$1, jx.d<T> $$2) {
      akj<? extends jw<T>> $$3 = $$2.a();
      jw<T> $$4 = $$2.b();
      awl<jj<T>> $$5 = new awl<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new awm.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(akj<? extends jw<T>> a, Map<akk, Collection<jj<T>>> b) {
   }
}
