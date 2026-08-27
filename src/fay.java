import com.google.common.collect.ImmutableList;

public interface fay {
   default void a(fax $$0, vf $$1) {
      this.a($$0, fba.a($$1.getString()));
   }

   default void a(fax $$0, String $$1) {
      this.a($$0, fba.a($$1));
   }

   default void a(fax $$0, vf... $$1) {
      this.a($$0, fba.a(ImmutableList.copyOf($$1)));
   }

   void a(fax var1, fba<?> var2);

   fay a();
}
