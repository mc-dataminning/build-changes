import java.util.List;

public interface dci<T> {
   public interface a<T> extends dci<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends dci<T> {
      default T a(jr<cwm> $$0) {
         return this.a(new cwq($$0));
      }

      default T a(cwm $$0) {
         return this.a(new cwq($$0));
      }

      T a(cwq var1);
   }
}
