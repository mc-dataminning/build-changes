import java.util.List;

public interface ddp<T> {
   public interface a<T> extends ddp<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends ddp<T> {
      default T a(js<cxu> $$0) {
         return this.a(new cxy($$0));
      }

      default T a(cxu $$0) {
         return this.a(new cxy($$0));
      }

      T a(cxy var1);
   }
}
