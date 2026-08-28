import java.util.List;

public interface dfv<T> {
   public interface a<T> extends dfv<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends dfv<T> {
      default T a(jg<czw> $$0) {
         return this.a(new daa($$0));
      }

      default T a(czw $$0) {
         return this.a(new daa($$0));
      }

      T a(daa var1);
   }
}
