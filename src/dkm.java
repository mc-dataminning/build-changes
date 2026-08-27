import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dkm extends dbk {
   public static final MapCodec<dkm> a = b(dkm::new);
   public static final dpx<dof> b = dpp.by;

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   public dkm(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dof.a));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return $$0 instanceof aps $$3
         ? a($$2, dmh.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().b($$3, $$2x))
         : a($$2, dmh.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x));
   }

   @Override
   public void a(crj $$0, @Nullable cyd $$1, List<wg> $$2, csz $$3, @Nullable iz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      czp.a($$0, $$2, "spawn_data");
   }
}
