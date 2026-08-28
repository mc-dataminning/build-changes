import com.google.common.collect.ImmutableList;

public interface fsd {
   default void a(fsc $$0, xv $$1) {
      this.a($$0, fsf.a($$1.getString()));
   }

   default void a(fsc $$0, String $$1) {
      this.a($$0, fsf.a($$1));
   }

   default void a(fsc $$0, xv... $$1) {
      this.a($$0, fsf.a(ImmutableList.copyOf($$1)));
   }

   void a(fsc var1, fsf<?> var2);

   fsd a();
}
