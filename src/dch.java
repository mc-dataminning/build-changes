import java.util.List;

public interface dch<T> {
   public interface a<T> extends dch<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends dch<T> {
      default T a(jr<cwl> $$0) {
         return this.a(new cwp($$0));
      }

      default T a(cwl $$0) {
         return this.a(new cwp($$0));
      }

      T a(cwp var1);
   }
}
