import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class asz implements aqd {
   private static final Map<ahg<? extends it<?>>, String> a = Map.of(
      ke.f, "tags/blocks", ke.u, "tags/entity_types", ke.y, "tags/fluids", ke.B, "tags/game_events", ke.F, "tags/items"
   );
   private final iu b;
   private List<asz.a<?>> c = List.of();

   public asz(iu $$0) {
      this.b = $$0;
   }

   public List<asz.a<?>> a() {
      return this.c;
   }

   public static String a(ahg<? extends it<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(aqd.a $$0, aqj $$1, bgt $$2, bgt $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends asz.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<asz.a<T>> a(aqj $$0, Executor $$1, iu.d<T> $$2) {
      ahg<? extends it<T>> $$3 = $$2.a();
      it<T> $$4 = $$2.b();
      asy<ih<T>> $$5 = new asy<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new asz.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(ahg<? extends it<T>> a, Map<ahh, Collection<ih<T>>> b) {
   }
}
