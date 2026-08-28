import com.google.common.collect.ImmutableList;

public interface fol {
   default void a(fok $$0, xe $$1) {
      this.a($$0, fon.a($$1.getString()));
   }

   default void a(fok $$0, String $$1) {
      this.a($$0, fon.a($$1));
   }

   default void a(fok $$0, xe... $$1) {
      this.a($$0, fon.a(ImmutableList.copyOf($$1)));
   }

   void a(fok var1, fon<?> var2);

   fol a();
}
