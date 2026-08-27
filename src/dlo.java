import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dlo extends ddm {
   public static final MapCodec<dlo> a = b(dlo::new);

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   protected dlo(drc.d $$0) {
      super($$0);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return a($$2, dok.j, $$0.B ? dpw::a : dpw::b);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, ctq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      super.a($$0, $$1, $$2, $$3);
      dbr.a($$0, $$2, "SpawnData");
   }
}
