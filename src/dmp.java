import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dmp extends ddm {
   public static final MapCodec<dmp> a = b(dmp::new);
   public static final dsb<dqj> b = drt.by;
   public static final dru c = drt.bA;

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dqj.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return new dqc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return $$0 instanceof aqn $$3
         ? a($$2, dok.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(drt.bA).orElse(false)))
         : a($$2, dok.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(drt.bA).orElse(false)));
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      super.a($$0, $$1, $$2, $$3);
      dbr.a($$0, $$2, "spawn_data");
   }
}
