import com.google.common.collect.ImmutableList;

public interface eys {
   default void a(eyr $$0, ur $$1) {
      this.a($$0, eyu.a($$1.getString()));
   }

   default void a(eyr $$0, String $$1) {
      this.a($$0, eyu.a($$1));
   }

   default void a(eyr $$0, ur... $$1) {
      this.a($$0, eyu.a(ImmutableList.copyOf($$1)));
   }

   void a(eyr var1, eyu<?> var2);

   eys a();
}
