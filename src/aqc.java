import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class aqc implements ang {
   private static final Map<aeq<? extends hr<?>>, String> a = Map.of(
      jc.e, "tags/blocks", jc.s, "tags/entity_types", jc.w, "tags/fluids", jc.z, "tags/game_events", jc.D, "tags/items"
   );
   private final hs b;
   private List<aqc.a<?>> c = List.of();

   public aqc(hs $$0) {
      this.b = $$0;
   }

   public List<aqc.a<?>> a() {
      return this.c;
   }

   public static String a(aeq<? extends hr<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(ang.a $$0, anm $$1, bdh $$2, bdh $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends aqc.a<?>>> $$6 = this.b.b().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<aqc.a<T>> a(anm $$0, Executor $$1, hs.d<T> $$2) {
      aeq<? extends hr<T>> $$3 = $$2.a();
      hr<T> $$4 = $$2.b();
      aqb<he<T>> $$5 = new aqb<>($$2x -> $$4.b(aeq.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new aqc.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(aeq<? extends hr<T>> a, Map<aer, Collection<he<T>>> b) {
   }
}
