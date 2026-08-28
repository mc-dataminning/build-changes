import com.google.common.collect.ImmutableList;

public interface fsq {
   default void a(fsp $$0, wp $$1) {
      this.a($$0, fss.a($$1.getString()));
   }

   default void a(fsp $$0, String $$1) {
      this.a($$0, fss.a($$1));
   }

   default void a(fsp $$0, wp... $$1) {
      this.a($$0, fss.a(ImmutableList.copyOf($$1)));
   }

   void a(fsp var1, fss<?> var2);

   fsq a();
}
