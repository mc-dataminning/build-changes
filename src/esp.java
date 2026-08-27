import com.google.common.collect.ImmutableList;

public interface esp {
   default void a(eso $$0, sw $$1) {
      this.a($$0, esr.a($$1.getString()));
   }

   default void a(eso $$0, String $$1) {
      this.a($$0, esr.a($$1));
   }

   default void a(eso $$0, sw... $$1) {
      this.a($$0, esr.a(ImmutableList.copyOf($$1)));
   }

   void a(eso var1, esr<?> var2);

   esp a();
}
