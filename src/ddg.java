import java.util.List;

public interface ddg<T> {
   public interface a<T> extends ddg<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends ddg<T> {
      default T a(jq<cxk> $$0) {
         return this.a(new cxo($$0));
      }

      default T a(cxk $$0) {
         return this.a(new cxo($$0));
      }

      T a(cxo var1);
   }
}
