import com.google.common.collect.ImmutableList;

public interface fdj {
   default void a(fdi $$0, vq $$1) {
      this.a($$0, fdl.a($$1.getString()));
   }

   default void a(fdi $$0, String $$1) {
      this.a($$0, fdl.a($$1));
   }

   default void a(fdi $$0, vq... $$1) {
      this.a($$0, fdl.a(ImmutableList.copyOf($$1)));
   }

   void a(fdi var1, fdl<?> var2);

   fdj a();
}
