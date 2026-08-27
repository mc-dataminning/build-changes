import com.google.common.collect.ImmutableList;

public interface fjw {
   default void a(fjv $$0, wx $$1) {
      this.a($$0, fjy.a($$1.getString()));
   }

   default void a(fjv $$0, String $$1) {
      this.a($$0, fjy.a($$1));
   }

   default void a(fjv $$0, wx... $$1) {
      this.a($$0, fjy.a(ImmutableList.copyOf($$1)));
   }

   void a(fjv var1, fjy<?> var2);

   fjw a();
}
