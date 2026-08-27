import com.mojang.serialization.Codec;
import java.util.Optional;

public class eio extends egp {
   public static final Codec<eio> d = a(eio::new);

   public eio(egp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egp.b> a(egp.a $$0) {
      return a($$0, dvz.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ehh $$0, egp.a $$1) {
      czk $$2 = $$1.h();
      dwy $$3 = $$1.f();
      in $$4 = new in($$2.d(), 90, $$2.e());
      djr $$5 = djr.a($$3);
      ein.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public egy<?> e() {
      return egy.e;
   }
}
