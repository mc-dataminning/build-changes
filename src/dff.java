import java.util.List;

public interface dff<T> {
   public interface a<T> extends dff<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends dff<T> {
      default T a(jf<czg> $$0) {
         return this.a(new czk($$0));
      }

      default T a(czg $$0) {
         return this.a(new czk($$0));
      }

      T a(czk var1);
   }
}
