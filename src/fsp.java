import com.google.common.collect.ImmutableList;

public interface fsp {
   default void a(fso $$0, wp $$1) {
      this.a($$0, fsr.a($$1.getString()));
   }

   default void a(fso $$0, String $$1) {
      this.a($$0, fsr.a($$1));
   }

   default void a(fso $$0, wp... $$1) {
      this.a($$0, fsr.a(ImmutableList.copyOf($$1)));
   }

   void a(fso var1, fsr<?> var2);

   fsp a();
}
