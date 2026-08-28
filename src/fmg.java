import com.google.common.collect.ImmutableList;

public interface fmg {
   default void a(fmf $$0, wz $$1) {
      this.a($$0, fmi.a($$1.getString()));
   }

   default void a(fmf $$0, String $$1) {
      this.a($$0, fmi.a($$1));
   }

   default void a(fmf $$0, wz... $$1) {
      this.a($$0, fmi.a(ImmutableList.copyOf($$1)));
   }

   void a(fmf var1, fmi<?> var2);

   fmg a();
}
