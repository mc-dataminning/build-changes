import com.google.common.collect.ImmutableList;

public interface frw {
   default void a(frv $$0, xk $$1) {
      this.a($$0, fry.a($$1.getString()));
   }

   default void a(frv $$0, String $$1) {
      this.a($$0, fry.a($$1));
   }

   default void a(frv $$0, xk... $$1) {
      this.a($$0, fry.a(ImmutableList.copyOf($$1)));
   }

   void a(frv var1, fry<?> var2);

   frw a();
}
