import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class aqa implements ane {
   private static final Map<aeo<? extends hs<?>>, String> a = Map.of(
      jd.e, "tags/blocks", jd.s, "tags/entity_types", jd.w, "tags/fluids", jd.z, "tags/game_events", jd.D, "tags/items"
   );
   private final ht b;
   private List<aqa.a<?>> c = List.of();

   public aqa(ht $$0) {
      this.b = $$0;
   }

   public List<aqa.a<?>> a() {
      return this.c;
   }

   public static String a(aeo<? extends hs<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(ane.a $$0, ank $$1, bde $$2, bde $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends aqa.a<?>>> $$6 = this.b.b().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<aqa.a<T>> a(ank $$0, Executor $$1, ht.d<T> $$2) {
      aeo<? extends hs<T>> $$3 = $$2.a();
      hs<T> $$4 = $$2.b();
      apz<hf<T>> $$5 = new apz<>($$2x -> $$4.b(aeo.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new aqa.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(aeo<? extends hs<T>> a, Map<aep, Collection<hf<T>>> b) {
   }
}
