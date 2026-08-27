import com.mojang.serialization.Codec;
import java.util.Optional;

public class dzl extends dxm {
   public static final Codec<dzl> d = a(dzl::new);

   public dzl(dxm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      return a($$0, dmw.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dye $$0, dxm.a $$1) {
      crm $$2 = $$1.h();
      dnv $$3 = $$1.f();
      hx $$4 = new hx($$2.d(), 90, $$2.e());
      dbr $$5 = dbr.a($$3);
      dzk.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dxv<?> e() {
      return dxv.e;
   }
}
