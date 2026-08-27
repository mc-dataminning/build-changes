import com.mojang.serialization.Codec;
import java.util.Optional;

public class dwp extends dux {
   public static final Codec<dwp> d = a(dwp::new);

   public dwp(dux.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      return a($$0, dkh.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dvp $$0, dux.a $$1) {
      cor $$2 = $$1.h();
      dlg $$3 = $$1.f();
      gv $$4 = new gv($$2.d(), 90, $$2.e());
      cyw $$5 = cyw.a($$3);
      dwo.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dvg<?> e() {
      return dvg.e;
   }
}
