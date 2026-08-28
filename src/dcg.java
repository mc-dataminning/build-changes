import java.util.List;

public interface dcg<T> {
   public interface a<T> extends dcg<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends dcg<T> {
      default T a(jr<cwk> $$0) {
         return this.a(new cwo($$0));
      }

      default T a(cwk $$0) {
         return this.a(new cwo($$0));
      }

      T a(cwo var1);
   }
}
