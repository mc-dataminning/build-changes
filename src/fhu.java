import com.google.common.collect.ImmutableList;

public interface fhu {
   default void a(fht $$0, wi $$1) {
      this.a($$0, fhw.a($$1.getString()));
   }

   default void a(fht $$0, String $$1) {
      this.a($$0, fhw.a($$1));
   }

   default void a(fht $$0, wi... $$1) {
      this.a($$0, fhw.a(ImmutableList.copyOf($$1)));
   }

   void a(fht var1, fhw<?> var2);

   fhu a();
}
