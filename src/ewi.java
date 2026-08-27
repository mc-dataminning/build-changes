import com.google.common.collect.ImmutableList;

public interface ewi {
   default void a(ewh $$0, tm $$1) {
      this.a($$0, ewk.a($$1.getString()));
   }

   default void a(ewh $$0, String $$1) {
      this.a($$0, ewk.a($$1));
   }

   default void a(ewh $$0, tm... $$1) {
      this.a($$0, ewk.a(ImmutableList.copyOf($$1)));
   }

   void a(ewh var1, ewk<?> var2);

   ewi a();
}
