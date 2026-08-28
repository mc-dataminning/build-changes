import com.google.common.collect.ImmutableList;

public interface fox {
   default void a(fow $$0, xh $$1) {
      this.a($$0, foz.a($$1.getString()));
   }

   default void a(fow $$0, String $$1) {
      this.a($$0, foz.a($$1));
   }

   default void a(fow $$0, xh... $$1) {
      this.a($$0, foz.a(ImmutableList.copyOf($$1)));
   }

   void a(fow var1, foz<?> var2);

   fox a();
}
