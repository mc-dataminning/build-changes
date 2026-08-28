import com.google.common.collect.ImmutableList;

public interface fmc {
   default void a(fmb $$0, wy $$1) {
      this.a($$0, fme.a($$1.getString()));
   }

   default void a(fmb $$0, String $$1) {
      this.a($$0, fme.a($$1));
   }

   default void a(fmb $$0, wy... $$1) {
      this.a($$0, fme.a(ImmutableList.copyOf($$1)));
   }

   void a(fmb var1, fme<?> var2);

   fmc a();
}
