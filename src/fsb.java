import com.google.common.collect.ImmutableList;

public interface fsb {
   default void a(fsa $$0, xv $$1) {
      this.a($$0, fsd.a($$1.getString()));
   }

   default void a(fsa $$0, String $$1) {
      this.a($$0, fsd.a($$1));
   }

   default void a(fsa $$0, xv... $$1) {
      this.a($$0, fsd.a(ImmutableList.copyOf($$1)));
   }

   void a(fsa var1, fsd<?> var2);

   fsb a();
}
