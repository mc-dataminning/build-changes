import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekv extends eiw {
   public static final MapCodec<ekv> d = a(ekv::new);

   public ekv(eiw.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiw.b> a(eiw.a $$0) {
      return a($$0, dyf.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ejo $$0, eiw.a $$1) {
      dbm $$2 = $$1.h();
      dze $$3 = $$1.f();
      ja $$4 = new ja($$2.d(), 90, $$2.e());
      dlu $$5 = dlu.a($$3);
      eku.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ejf<?> e() {
      return ejf.e;
   }
}
