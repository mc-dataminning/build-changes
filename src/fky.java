import com.google.common.collect.ImmutableList;

public interface fky {
   default void a(fkx $$0, xo $$1) {
      this.a($$0, fla.a($$1.getString()));
   }

   default void a(fkx $$0, String $$1) {
      this.a($$0, fla.a($$1));
   }

   default void a(fkx $$0, xo... $$1) {
      this.a($$0, fla.a(ImmutableList.copyOf($$1)));
   }

   void a(fkx var1, fla<?> var2);

   fky a();
}
