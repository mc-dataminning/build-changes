import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dnm extends dej {
   public static final MapCodec<dnm> a = b(dnm::new);
   public static final dsy<drg> b = dsq.by;
   public static final dsr c = dsq.bA;

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   public dnm(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drg.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Nullable
   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return $$0 instanceof are $$3
         ? a($$2, dph.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dsq.bA).orElse(false)))
         : a($$2, dph.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dsq.bA).orElse(false)));
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      super.a($$0, $$1, $$2, $$3);
      dco.a($$0, $$2, "spawn_data");
   }
}
