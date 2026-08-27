import com.google.common.collect.ImmutableList;

public interface far {
   default void a(faq $$0, vd $$1) {
      this.a($$0, fat.a($$1.getString()));
   }

   default void a(faq $$0, String $$1) {
      this.a($$0, fat.a($$1));
   }

   default void a(faq $$0, vd... $$1) {
      this.a($$0, fat.a(ImmutableList.copyOf($$1)));
   }

   void a(faq var1, fat<?> var2);

   far a();
}
