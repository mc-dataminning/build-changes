import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class axd implements auf {
   private static final Map<ala<? extends jv<?>>, String> a = Map.of(
      lq.f, "tags/blocks", lq.v, "tags/entity_types", lq.z, "tags/fluids", lq.C, "tags/game_events", lq.G, "tags/items"
   );
   private final jw b;
   private List<axd.a<?>> c = List.of();

   public axd(jw $$0) {
      this.b = $$0;
   }

   public List<axd.a<?>> a() {
      return this.c;
   }

   public static String a(ala<? extends jv<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(auf.a $$0, aul $$1, bnd $$2, bnd $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends axd.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<axd.a<T>> a(aul $$0, Executor $$1, jw.d<T> $$2) {
      ala<? extends jv<T>> $$3 = $$2.a();
      jv<T> $$4 = $$2.b();
      axc<ji<T>> $$5 = new axc<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new axd.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(ala<? extends jv<T>> a, Map<alb, Collection<ji<T>>> b) {
   }
}
