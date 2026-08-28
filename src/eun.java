import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eun extends esn {
   public static final MapCodec<eun> d = a(eun::new);

   public eun(esn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      return a($$0, ehp.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(etf $$0, esn.a $$1) {
      djo $$2 = $$1.h();
      eio $$3 = $$1.f();
      iw $$4 = new iw($$2.d(), 90, $$2.e());
      dui $$5 = dui.a($$3);
      eum.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public esw<?> e() {
      return esw.e;
   }
}
