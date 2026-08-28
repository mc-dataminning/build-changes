import java.util.List;

public interface dfi<T> {
   public interface a<T> extends dfi<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends dfi<T> {
      default T a(jf<czj> $$0) {
         return this.a(new czn($$0));
      }

      default T a(czj $$0) {
         return this.a(new czn($$0));
      }

      T a(czn var1);
   }
}
