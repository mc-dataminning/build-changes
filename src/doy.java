import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class doy extends dgv {
   public static final MapCodec<doy> a = b(doy::new);

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   protected doy(dun.d $$0) {
      super($$0);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dti($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return a($$2, dru.j, $$0.B ? dti::a : dti::b);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, cvp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      super.a($$0, $$1, $$2, $$3);
      dfa.a($$0, $$2, "SpawnData");
   }
}
