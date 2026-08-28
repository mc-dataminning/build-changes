import java.util.List;

public interface dft<T> {
   public interface a<T> extends dft<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends dft<T> {
      default T a(jf<czu> $$0) {
         return this.a(new czy($$0));
      }

      default T a(czu $$0) {
         return this.a(new czy($$0));
      }

      T a(czy var1);
   }
}
