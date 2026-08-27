import com.google.common.collect.ImmutableList;

public interface fdc {
   default void a(fdb $$0, vq $$1) {
      this.a($$0, fde.a($$1.getString()));
   }

   default void a(fdb $$0, String $$1) {
      this.a($$0, fde.a($$1));
   }

   default void a(fdb $$0, vq... $$1) {
      this.a($$0, fde.a(ImmutableList.copyOf($$1)));
   }

   void a(fdb var1, fde<?> var2);

   fdc a();
}
