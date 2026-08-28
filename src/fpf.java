import com.google.common.collect.ImmutableList;

public interface fpf {
   default void a(fpe $$0, xi $$1) {
      this.a($$0, fph.a($$1.getString()));
   }

   default void a(fpe $$0, String $$1) {
      this.a($$0, fph.a($$1));
   }

   default void a(fpe $$0, xi... $$1) {
      this.a($$0, fph.a(ImmutableList.copyOf($$1)));
   }

   void a(fpe var1, fph<?> var2);

   fpf a();
}
