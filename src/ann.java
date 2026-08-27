import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class ann implements akr {
   private static final Map<acp<? extends hr<?>>, String> a = Map.of(
      jc.e, "tags/blocks", jc.s, "tags/entity_types", jc.w, "tags/fluids", jc.z, "tags/game_events", jc.D, "tags/items"
   );
   private final hs b;
   private List<ann.a<?>> c = List.of();

   public ann(hs $$0) {
      this.b = $$0;
   }

   public List<ann.a<?>> a() {
      return this.c;
   }

   public static String a(acp<? extends hr<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(akr.a $$0, akx $$1, ban $$2, ban $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends ann.a<?>>> $$6 = this.b.b().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<ann.a<T>> a(akx $$0, Executor $$1, hs.d<T> $$2) {
      acp<? extends hr<T>> $$3 = $$2.a();
      hr<T> $$4 = $$2.b();
      anm<he<T>> $$5 = new anm<>($$2x -> $$4.b(acp.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new ann.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(acp<? extends hr<T>> a, Map<acq, Collection<he<T>>> b) {
   }
}
