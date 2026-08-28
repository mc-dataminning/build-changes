import com.google.common.collect.ImmutableList;

public interface fsr {
   default void a(fsq $$0, wp $$1) {
      this.a($$0, fst.a($$1.getString()));
   }

   default void a(fsq $$0, String $$1) {
      this.a($$0, fst.a($$1));
   }

   default void a(fsq $$0, wp... $$1) {
      this.a($$0, fst.a(ImmutableList.copyOf($$1)));
   }

   void a(fsq var1, fst<?> var2);

   fsr a();
}
