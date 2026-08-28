import com.google.common.collect.ImmutableList;

public interface flb {
   default void a(fla $$0, xp $$1) {
      this.a($$0, fld.a($$1.getString()));
   }

   default void a(fla $$0, String $$1) {
      this.a($$0, fld.a($$1));
   }

   default void a(fla $$0, xp... $$1) {
      this.a($$0, fld.a(ImmutableList.copyOf($$1)));
   }

   void a(fla var1, fld<?> var2);

   flb a();
}
