import com.mojang.serialization.Codec;
import java.util.Optional;

public class dyu extends dwv {
   public static final Codec<dyu> d = a(dyu::new);

   public dyu(dwv.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      return a($$0, dmf.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dxn $$0, dwv.a $$1) {
      cqz $$2 = $$1.h();
      dne $$3 = $$1.f();
      ht $$4 = new ht($$2.d(), 90, $$2.e());
      dbf $$5 = dbf.a($$3);
      dyt.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dxe<?> e() {
      return dxe.e;
   }
}
