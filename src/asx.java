import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class asx implements aqb {
   private static final Map<ahf<? extends it<?>>, String> a = Map.of(
      ke.f, "tags/blocks", ke.u, "tags/entity_types", ke.y, "tags/fluids", ke.B, "tags/game_events", ke.F, "tags/items"
   );
   private final iu b;
   private List<asx.a<?>> c = List.of();

   public asx(iu $$0) {
      this.b = $$0;
   }

   public List<asx.a<?>> a() {
      return this.c;
   }

   public static String a(ahf<? extends it<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(aqb.a $$0, aqh $$1, bgr $$2, bgr $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends asx.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<asx.a<T>> a(aqh $$0, Executor $$1, iu.d<T> $$2) {
      ahf<? extends it<T>> $$3 = $$2.a();
      it<T> $$4 = $$2.b();
      asw<ih<T>> $$5 = new asw<>($$2x -> $$4.b(ahf.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new asx.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(ahf<? extends it<T>> a, Map<ahg, Collection<ih<T>>> b) {
   }
}
