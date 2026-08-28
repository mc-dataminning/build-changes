import com.google.common.collect.ImmutableList;

public interface fkv {
   default void a(fku $$0, xl $$1) {
      this.a($$0, fkx.a($$1.getString()));
   }

   default void a(fku $$0, String $$1) {
      this.a($$0, fkx.a($$1));
   }

   default void a(fku $$0, xl... $$1) {
      this.a($$0, fkx.a(ImmutableList.copyOf($$1)));
   }

   void a(fku var1, fkx<?> var2);

   fkv a();
}
