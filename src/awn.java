import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class awn implements atq {
   private static final Map<akl<? extends jk<?>>, String> a = Map.of(
      lf.f, "tags/blocks", lf.v, "tags/entity_types", lf.z, "tags/fluids", lf.C, "tags/game_events", lf.G, "tags/items"
   );
   private final jl b;
   private List<awn.a<?>> c = List.of();

   public awn(jl $$0) {
      this.b = $$0;
   }

   public List<awn.a<?>> a() {
      return this.c;
   }

   public static String a(akl<? extends jk<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(atq.a $$0, atw $$1, bmi $$2, bmi $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends awn.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<awn.a<T>> a(atw $$0, Executor $$1, jl.d<T> $$2) {
      akl<? extends jk<T>> $$3 = $$2.a();
      jk<T> $$4 = $$2.b();
      awm<ix<T>> $$5 = new awm<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new awn.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(akl<? extends jk<T>> a, Map<akm, Collection<ix<T>>> b) {
   }
}
