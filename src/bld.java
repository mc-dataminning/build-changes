import com.mojang.datafixers.util.Either;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

public interface bld<Msg> extends AutoCloseable {
   String bx();

   void a(Msg var1);

   @Override
   default void close() {
   }

   default <Source> CompletableFuture<Source> b(Function<? super bld<Source>, ? extends Msg> $$0) {
      CompletableFuture<Source> $$1 = new CompletableFuture<>();
      Msg $$2 = (Msg)$$0.apply(a("ask future procesor handle", $$1::complete));
      this.a($$2);
      return $$1;
   }

   default <Source> CompletableFuture<Source> c(Function<? super bld<Either<Source, Exception>>, ? extends Msg> $$0) {
      CompletableFuture<Source> $$1 = new CompletableFuture<>();
      Msg $$2 = (Msg)$$0.apply(a("ask future procesor handle", $$1x -> {
         $$1x.ifLeft($$1::complete);
         $$1x.ifRight($$1::completeExceptionally);
      }));
      this.a($$2);
      return $$1;
   }

   static <Msg> bld<Msg> a(final String $$0, final Consumer<Msg> $$1) {
      return new bld<Msg>() {
         @Override
         public String bx() {
            return $$0;
         }

         @Override
         public void a(Msg $$0x) {
            $$1.accept($$0);
         }

         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
