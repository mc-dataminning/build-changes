import java.util.List;

public interface dcf<T> {
   public interface a<T> extends dcf<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends dcf<T> {
      default T a(jr<cwj> $$0) {
         return this.a(new cwn($$0));
      }

      default T a(cwj $$0) {
         return this.a(new cwn($$0));
      }

      T a(cwn var1);
   }
}
