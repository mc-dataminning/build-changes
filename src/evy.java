import com.google.common.collect.ImmutableList;

public interface evy {
   default void a(evx $$0, tf $$1) {
      this.a($$0, ewa.a($$1.getString()));
   }

   default void a(evx $$0, String $$1) {
      this.a($$0, ewa.a($$1));
   }

   default void a(evx $$0, tf... $$1) {
      this.a($$0, ewa.a(ImmutableList.copyOf($$1)));
   }

   void a(evx var1, ewa<?> var2);

   evy a();
}
