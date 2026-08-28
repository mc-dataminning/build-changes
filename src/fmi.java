import com.google.common.collect.ImmutableList;

public interface fmi {
   default void a(fmh $$0, wz $$1) {
      this.a($$0, fmk.a($$1.getString()));
   }

   default void a(fmh $$0, String $$1) {
      this.a($$0, fmk.a($$1));
   }

   default void a(fmh $$0, wz... $$1) {
      this.a($$0, fmk.a(ImmutableList.copyOf($$1)));
   }

   void a(fmh var1, fmk<?> var2);

   fmi a();
}
