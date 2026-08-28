import java.util.List;

public interface ddh<T> {
   public interface a<T> extends ddh<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends ddh<T> {
      default T a(jq<cxl> $$0) {
         return this.a(new cxp($$0));
      }

      default T a(cxl $$0) {
         return this.a(new cxp($$0));
      }

      T a(cxp var1);
   }
}
