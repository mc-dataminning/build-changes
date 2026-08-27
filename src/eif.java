import com.mojang.serialization.Codec;
import java.util.Optional;

public class eif extends egg {
   public static final Codec<eif> d = a(eif::new);

   public eif(egg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egg.b> a(egg.a $$0) {
      return a($$0, dvq.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(egy $$0, egg.a $$1) {
      czb $$2 = $$1.h();
      dwp $$3 = $$1.f();
      im $$4 = new im($$2.d(), 90, $$2.e());
      dji $$5 = dji.a($$3);
      eie.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public egp<?> e() {
      return egp.e;
   }
}
