import com.google.common.collect.ImmutableList;

public interface flq {
   default void a(flp $$0, wu $$1) {
      this.a($$0, fls.a($$1.getString()));
   }

   default void a(flp $$0, String $$1) {
      this.a($$0, fls.a($$1));
   }

   default void a(flp $$0, wu... $$1) {
      this.a($$0, fls.a(ImmutableList.copyOf($$1)));
   }

   void a(flp var1, fls<?> var2);

   flq a();
}
