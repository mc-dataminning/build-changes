import com.google.common.collect.ImmutableList;

public interface fli {
   default void a(flh $$0, wu $$1) {
      this.a($$0, flk.a($$1.getString()));
   }

   default void a(flh $$0, String $$1) {
      this.a($$0, flk.a($$1));
   }

   default void a(flh $$0, wu... $$1) {
      this.a($$0, flk.a(ImmutableList.copyOf($$1)));
   }

   void a(flh var1, flk<?> var2);

   fli a();
}
