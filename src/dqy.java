import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dqy extends dhv {
   public static final MapCodec<dqy> a = b(dqy::new);
   public static final dwl<duu> b = dwe.by;
   public static final dwf c = dwe.bA;

   @Override
   public MapCodec<dqy> a() {
      return a;
   }

   public dqy(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, duu.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Nullable
   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dun($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return $$0 instanceof arq $$3
         ? a($$2, dst.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dwe.bA).orElse(false)))
         : a($$2, dst.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dwe.bA).orElse(false)));
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      super.a($$0, $$1, $$2, $$3);
      dga.a($$0, $$2, "spawn_data");
   }
}
