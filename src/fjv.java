import com.google.common.collect.ImmutableList;

public interface fjv {
   default void a(fju $$0, wx $$1) {
      this.a($$0, fjx.a($$1.getString()));
   }

   default void a(fju $$0, String $$1) {
      this.a($$0, fjx.a($$1));
   }

   default void a(fju $$0, wx... $$1) {
      this.a($$0, fjx.a(ImmutableList.copyOf($$1)));
   }

   void a(fju var1, fjx<?> var2);

   fjv a();
}
