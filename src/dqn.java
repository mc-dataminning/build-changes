import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dqn extends dhk {
   public static final MapCodec<dqn> a = b(dqn::new);
   public static final dwb<duj> b = dvt.by;
   public static final dvu c = dvt.bA;

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   public dqn(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, duj.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Nullable
   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new duc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return $$0 instanceof arm $$3
         ? a($$2, dsi.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dvt.bA).orElse(false)))
         : a($$2, dsi.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dvt.bA).orElse(false)));
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      super.a($$0, $$1, $$2, $$3);
      dfp.a($$0, $$2, "spawn_data");
   }
}
