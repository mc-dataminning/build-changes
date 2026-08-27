import com.google.common.collect.ImmutableList;

public interface faa {
   default void a(ezz $$0, vb $$1) {
      this.a($$0, fac.a($$1.getString()));
   }

   default void a(ezz $$0, String $$1) {
      this.a($$0, fac.a($$1));
   }

   default void a(ezz $$0, vb... $$1) {
      this.a($$0, fac.a(ImmutableList.copyOf($$1)));
   }

   void a(ezz var1, fac<?> var2);

   faa a();
}
