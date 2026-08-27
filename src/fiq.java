import com.google.common.collect.ImmutableList;

public interface fiq {
   default void a(fip $$0, ws $$1) {
      this.a($$0, fis.a($$1.getString()));
   }

   default void a(fip $$0, String $$1) {
      this.a($$0, fis.a($$1));
   }

   default void a(fip $$0, ws... $$1) {
      this.a($$0, fis.a(ImmutableList.copyOf($$1)));
   }

   void a(fip var1, fis<?> var2);

   fiq a();
}
