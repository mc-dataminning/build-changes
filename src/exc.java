import com.google.common.collect.ImmutableList;

public interface exc {
   default void a(exb $$0, ui $$1) {
      this.a($$0, exe.a($$1.getString()));
   }

   default void a(exb $$0, String $$1) {
      this.a($$0, exe.a($$1));
   }

   default void a(exb $$0, ui... $$1) {
      this.a($$0, exe.a(ImmutableList.copyOf($$1)));
   }

   void a(exb var1, exe<?> var2);

   exc a();
}
