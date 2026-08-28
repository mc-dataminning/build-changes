import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class axg implements aui {
   private static final Map<ald<? extends jv<?>>, String> a = Map.of(
      lq.f, "tags/blocks", lq.v, "tags/entity_types", lq.z, "tags/fluids", lq.C, "tags/game_events", lq.G, "tags/items"
   );
   private final jw b;
   private List<axg.a<?>> c = List.of();

   public axg(jw $$0) {
      this.b = $$0;
   }

   public List<axg.a<?>> a() {
      return this.c;
   }

   public static String a(ald<? extends jv<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(aui.a $$0, auo $$1, bnh $$2, bnh $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends axg.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<axg.a<T>> a(auo $$0, Executor $$1, jw.d<T> $$2) {
      ald<? extends jv<T>> $$3 = $$2.a();
      jv<T> $$4 = $$2.b();
      axf<ji<T>> $$5 = new axf<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new axg.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(ald<? extends jv<T>> a, Map<ale, Collection<ji<T>>> b) {
   }
}
