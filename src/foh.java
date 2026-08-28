import com.google.common.collect.ImmutableList;

public interface foh {
   default void a(fog $$0, xd $$1) {
      this.a($$0, foj.a($$1.getString()));
   }

   default void a(fog $$0, String $$1) {
      this.a($$0, foj.a($$1));
   }

   default void a(fog $$0, xd... $$1) {
      this.a($$0, foj.a(ImmutableList.copyOf($$1)));
   }

   void a(fog var1, foj<?> var2);

   foh a();
}
