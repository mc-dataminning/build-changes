import com.google.common.collect.ImmutableList;

public interface flc {
   default void a(flb $$0, xp $$1) {
      this.a($$0, fle.a($$1.getString()));
   }

   default void a(flb $$0, String $$1) {
      this.a($$0, fle.a($$1));
   }

   default void a(flb $$0, xp... $$1) {
      this.a($$0, fle.a(ImmutableList.copyOf($$1)));
   }

   void a(flb var1, fle<?> var2);

   flc a();
}
