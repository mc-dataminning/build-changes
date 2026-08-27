import com.google.common.collect.ImmutableList;

public interface fax {
   default void a(faw $$0, vf $$1) {
      this.a($$0, faz.a($$1.getString()));
   }

   default void a(faw $$0, String $$1) {
      this.a($$0, faz.a($$1));
   }

   default void a(faw $$0, vf... $$1) {
      this.a($$0, faz.a(ImmutableList.copyOf($$1)));
   }

   void a(faw var1, faz<?> var2);

   fax a();
}
