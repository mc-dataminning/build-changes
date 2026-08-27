import com.mojang.serialization.Codec;
import java.util.Optional;

public class dzg extends dxh {
   public static final Codec<dzg> d = a(dzg::new);

   public dzg(dxh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxh.b> a(dxh.a $$0) {
      return a($$0, dmr.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dxz $$0, dxh.a $$1) {
      crh $$2 = $$1.h();
      dnq $$3 = $$1.f();
      ht $$4 = new ht($$2.d(), 90, $$2.e());
      dbm $$5 = dbm.a($$3);
      dzf.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dxq<?> e() {
      return dxq.e;
   }
}
