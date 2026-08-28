import com.google.common.collect.ImmutableList;

public interface fsn {
   default void a(fsm $$0, wo $$1) {
      this.a($$0, fsp.a($$1.getString()));
   }

   default void a(fsm $$0, String $$1) {
      this.a($$0, fsp.a($$1));
   }

   default void a(fsm $$0, wo... $$1) {
      this.a($$0, fsp.a(ImmutableList.copyOf($$1)));
   }

   void a(fsm var1, fsp<?> var2);

   fsn a();
}
