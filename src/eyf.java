import com.google.common.collect.ImmutableList;

public interface eyf {
   default void a(eye $$0, ur $$1) {
      this.a($$0, eyh.a($$1.getString()));
   }

   default void a(eye $$0, String $$1) {
      this.a($$0, eyh.a($$1));
   }

   default void a(eye $$0, ur... $$1) {
      this.a($$0, eyh.a(ImmutableList.copyOf($$1)));
   }

   void a(eye var1, eyh<?> var2);

   eyf a();
}
