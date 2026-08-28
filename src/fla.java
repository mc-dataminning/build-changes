import com.google.common.collect.ImmutableList;

public interface fla {
   default void a(fkz $$0, xp $$1) {
      this.a($$0, flc.a($$1.getString()));
   }

   default void a(fkz $$0, String $$1) {
      this.a($$0, flc.a($$1));
   }

   default void a(fkz $$0, xp... $$1) {
      this.a($$0, flc.a(ImmutableList.copyOf($$1)));
   }

   void a(fkz var1, flc<?> var2);

   fla a();
}
