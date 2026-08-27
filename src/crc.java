import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface crc {
   void f(@Nullable cdz var1);

   @Nullable
   cdz gf();

   cre gh();

   void a(cre var1);

   void a(crd var1);

   void l(clo var1);

   int w();

   void t(int var1);

   boolean gi();

   aqu gj();

   default boolean gr() {
      return false;
   }

   default void a(cdz $$0, uv $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bjk(($$0x, $$1x, $$2x) -> new cia($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cre $$4 = this.gh();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.w(), this.gi(), this.gr());
         }
      }
   }

   boolean gn();
}
