import com.google.common.collect.ImmutableList;

public interface fhl {
   default void a(fhk $$0, wg $$1) {
      this.a($$0, fhn.a($$1.getString()));
   }

   default void a(fhk $$0, String $$1) {
      this.a($$0, fhn.a($$1));
   }

   default void a(fhk $$0, wg... $$1) {
      this.a($$0, fhn.a(ImmutableList.copyOf($$1)));
   }

   void a(fhk var1, fhn<?> var2);

   fhl a();
}
