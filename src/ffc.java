import com.google.common.collect.ImmutableList;

public interface ffc {
   default void a(ffb $$0, vu $$1) {
      this.a($$0, ffe.a($$1.getString()));
   }

   default void a(ffb $$0, String $$1) {
      this.a($$0, ffe.a($$1));
   }

   default void a(ffb $$0, vu... $$1) {
      this.a($$0, ffe.a(ImmutableList.copyOf($$1)));
   }

   void a(ffb var1, ffe<?> var2);

   ffc a();
}
