import java.util.List;

public interface den<T> {
   public interface a<T> extends den<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends den<T> {
      default T a(je<cyo> $$0) {
         return this.a(new cys($$0));
      }

      default T a(cyo $$0) {
         return this.a(new cys($$0));
      }

      T a(cys var1);
   }
}
