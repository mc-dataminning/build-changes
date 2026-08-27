import com.google.common.collect.ImmutableList;

public interface eyx {
   default void a(eyw $$0, uv $$1) {
      this.a($$0, eyz.a($$1.getString()));
   }

   default void a(eyw $$0, String $$1) {
      this.a($$0, eyz.a($$1));
   }

   default void a(eyw $$0, uv... $$1) {
      this.a($$0, eyz.a(ImmutableList.copyOf($$1)));
   }

   void a(eyw var1, eyz<?> var2);

   eyx a();
}
