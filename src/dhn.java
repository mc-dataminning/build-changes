import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhn extends czm {
   public static final MapCodec<dhn> a = b(dhn::new);

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   protected dhn(dmy.d $$0) {
      super($$0);
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return a($$2, dki.j, $$0.B ? dlt::a : dlt::b);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, cqk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   public void a(cqk $$0, @Nullable cwf $$1, List<vu> $$2, csb $$3, @Nullable iz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cxr.a($$0, $$2, "SpawnData");
   }
}
