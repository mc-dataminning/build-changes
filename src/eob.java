import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eob extends emb {
   public static final MapCodec<eob> d = a(eob::new);

   public eob(emb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      return a($$0, ebj.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(emt $$0, emb.a $$1) {
      del $$2 = $$1.h();
      eci $$3 = $$1.f();
      jh $$4 = new jh($$2.d(), 90, $$2.e());
      dow $$5 = dow.a($$3);
      eoa.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public emk<?> e() {
      return emk.e;
   }
}
