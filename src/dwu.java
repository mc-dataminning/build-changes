import com.mojang.serialization.Codec;
import java.util.Optional;

public class dwu extends dvc {
   public static final Codec<dwu> d = a(dwu::new);

   public dwu(dvc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvc.b> a(dvc.a $$0) {
      return a($$0, dkm.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dvu $$0, dvc.a $$1) {
      cpi $$2 = $$1.h();
      dll $$3 = $$1.f();
      gw $$4 = new gw($$2.d(), 90, $$2.e());
      czn $$5 = czn.a($$3);
      dwt.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dvl<?> e() {
      return dvl.e;
   }
}
