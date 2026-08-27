import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class avt implements asw {
   private static final Map<ajs<? extends iy<?>>, String> a = Map.of(
      ks.f, "tags/blocks", ks.u, "tags/entity_types", ks.y, "tags/fluids", ks.B, "tags/game_events", ks.F, "tags/items"
   );
   private final iz b;
   private List<avt.a<?>> c = List.of();

   public avt(iz $$0) {
      this.b = $$0;
   }

   public List<avt.a<?>> a() {
      return this.c;
   }

   public static String a(ajs<? extends iy<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(asw.a $$0, atc $$1, bko $$2, bko $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends avt.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<avt.a<T>> a(atc $$0, Executor $$1, iz.d<T> $$2) {
      ajs<? extends iy<T>> $$3 = $$2.a();
      iy<T> $$4 = $$2.b();
      avs<il<T>> $$5 = new avs<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new avt.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(ajs<? extends iy<T>> a, Map<ajt, Collection<il<T>>> b) {
   }
}
