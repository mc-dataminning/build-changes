import java.util.List;

public interface dcy<T> {
   public interface a<T> extends dcy<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends dcy<T> {
      default T a(jq<cxc> $$0) {
         return this.a(new cxg($$0));
      }

      default T a(cxc $$0) {
         return this.a(new cxg($$0));
      }

      T a(cxg var1);
   }
}
