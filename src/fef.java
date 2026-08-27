import com.google.common.collect.ImmutableList;

public interface fef {
   default void a(fee $$0, vs $$1) {
      this.a($$0, feh.a($$1.getString()));
   }

   default void a(fee $$0, String $$1) {
      this.a($$0, feh.a($$1));
   }

   default void a(fee $$0, vs... $$1) {
      this.a($$0, feh.a(ImmutableList.copyOf($$1)));
   }

   void a(fee var1, feh<?> var2);

   fef a();
}
