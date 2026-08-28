import java.util.List;

public interface dcz<T> {
   public interface a<T> extends dcz<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends dcz<T> {
      default T a(jr<cxd> $$0) {
         return this.a(new cxh($$0));
      }

      default T a(cxd $$0) {
         return this.a(new cxh($$0));
      }

      T a(cxh var1);
   }
}
