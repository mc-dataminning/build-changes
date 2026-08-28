import com.google.common.collect.ImmutableList;

public interface fnx {
   default void a(fnw $$0, xd $$1) {
      this.a($$0, fnz.a($$1.getString()));
   }

   default void a(fnw $$0, String $$1) {
      this.a($$0, fnz.a($$1));
   }

   default void a(fnw $$0, xd... $$1) {
      this.a($$0, fnz.a(ImmutableList.copyOf($$1)));
   }

   void a(fnw var1, fnz<?> var2);

   fnx a();
}
