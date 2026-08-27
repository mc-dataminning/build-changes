import com.google.common.collect.ImmutableList;

public interface fmj {
   default void a(fmi $$0, xe $$1) {
      this.a($$0, fml.a($$1.getString()));
   }

   default void a(fmi $$0, String $$1) {
      this.a($$0, fml.a($$1));
   }

   default void a(fmi $$0, xe... $$1) {
      this.a($$0, fml.a(ImmutableList.copyOf($$1)));
   }

   void a(fmi var1, fml<?> var2);

   fmj a();
}
