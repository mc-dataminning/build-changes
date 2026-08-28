import com.google.common.collect.ImmutableList;

public interface fkz {
   default void a(fky $$0, xo $$1) {
      this.a($$0, flb.a($$1.getString()));
   }

   default void a(fky $$0, String $$1) {
      this.a($$0, flb.a($$1));
   }

   default void a(fky $$0, xo... $$1) {
      this.a($$0, flb.a(ImmutableList.copyOf($$1)));
   }

   void a(fky var1, flb<?> var2);

   fkz a();
}
