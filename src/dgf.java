import java.util.List;

public interface dgf<T> {
   public interface a<T> extends dgf<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends dgf<T> {
      default T a(jg<dag> $$0) {
         return this.a(new dak($$0));
      }

      default T a(dag $$0) {
         return this.a(new dak($$0));
      }

      T a(dak var1);
   }
}
