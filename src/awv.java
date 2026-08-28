import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class awv implements atx {
   private final ka a;
   private List<awv.a<?>> b = List.of();

   public awv(ka $$0) {
      this.a = $$0;
   }

   public List<awv.a<?>> a() {
      return this.b;
   }

   @Override
   public CompletableFuture<Void> a(atx.a $$0, aud $$1, bne $$2, bne $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends awv.a<?>>> $$6 = this.a.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.b = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<awv.a<T>> a(aud $$0, Executor $$1, ka.d<T> $$2) {
      akp<? extends jz<T>> $$3 = $$2.a();
      jz<T> $$4 = $$2.b();
      awu<jm<T>> $$5 = new awu<>($$4::c, lu.d($$3));
      return CompletableFuture.supplyAsync(() -> new awv.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(akp<? extends jz<T>> a, Map<akq, Collection<jm<T>>> b) {
   }
}
