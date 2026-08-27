import com.mojang.serialization.Codec;
import java.util.Optional;

public class dxa extends dvi {
   public static final Codec<dxa> d = a(dxa::new);

   public dxa(dvi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      return a($$0, dks.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dwa $$0, dvi.a $$1) {
      cpc $$2 = $$1.h();
      dlr $$3 = $$1.f();
      gw $$4 = new gw($$2.d(), 90, $$2.e());
      czh $$5 = czh.a($$3);
      dwz.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dvr<?> e() {
      return dvr.e;
   }
}
