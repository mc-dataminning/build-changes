import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface euh extends esu, BiFunction<cvl, est, cvl> {
   eui<? extends euh> b();

   static Consumer<cvl> a(BiFunction<cvl, est, cvl> $$0, Consumer<cvl> $$1, est $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      euh b();
   }
}
