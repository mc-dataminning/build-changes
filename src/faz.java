import com.google.common.collect.ImmutableList;

public interface faz {
   default void a(fay $$0, vf $$1) {
      this.a($$0, fbb.a($$1.getString()));
   }

   default void a(fay $$0, String $$1) {
      this.a($$0, fbb.a($$1));
   }

   default void a(fay $$0, vf... $$1) {
      this.a($$0, fbb.a(ImmutableList.copyOf($$1)));
   }

   void a(fay var1, fbb<?> var2);

   faz a();
}
