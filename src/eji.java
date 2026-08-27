import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eji extends ehj {
   public static final MapCodec<eji> d = a(eji::new);

   public eji(ehj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      return a($$0, dwt.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eib $$0, ehj.a $$1) {
      dae $$2 = $$1.h();
      dxs $$3 = $$1.f();
      io $$4 = new io($$2.d(), 90, $$2.e());
      dkl $$5 = dkl.a($$3);
      ejh.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ehs<?> e() {
      return ehs.e;
   }
}
