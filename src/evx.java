import com.google.common.collect.ImmutableList;

public interface evx {
   default void a(evw $$0, tf $$1) {
      this.a($$0, evz.a($$1.getString()));
   }

   default void a(evw $$0, String $$1) {
      this.a($$0, evz.a($$1));
   }

   default void a(evw $$0, tf... $$1) {
      this.a($$0, evz.a(ImmutableList.copyOf($$1)));
   }

   void a(evw var1, evz<?> var2);

   evx a();
}
