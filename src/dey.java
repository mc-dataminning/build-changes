import java.util.List;

public interface dey<T> {
   public interface a<T> extends dey<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends dey<T> {
      default T a(je<cyz> $$0) {
         return this.a(new czd($$0));
      }

      default T a(cyz $$0) {
         return this.a(new czd($$0));
      }

      T a(czd var1);
   }
}
