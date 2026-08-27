import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dmn extends ddk {
   public static final MapCodec<dmn> a = b(dmn::new);
   public static final drz<dqh> b = drr.by;
   public static final drs c = drr.bA;

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   public dmn(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dqh.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return new dqa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return $$0 instanceof aqm $$3
         ? a($$2, doi.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(drr.bA).orElse(false)))
         : a($$2, doi.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(drr.bA).orElse(false)));
   }

   @Override
   public void a(cto $$0, @Nullable dad $$1, List<wx> $$2, cvh $$3, @Nullable jl $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dbp.a($$0, $$2, "spawn_data");
   }
}
