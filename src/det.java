import java.util.List;

public interface det<T> {
   public interface a<T> extends det<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends det<T> {
      default T a(je<cyu> $$0) {
         return this.a(new cyy($$0));
      }

      default T a(cyu $$0) {
         return this.a(new cyy($$0));
      }

      T a(cyy var1);
   }
}
