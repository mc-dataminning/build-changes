import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhp extends czo {
   public static final MapCodec<dhp> a = b(dhp::new);

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   protected dhp(dna.d $$0) {
      super($$0);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return a($$2, dkk.j, $$0.B ? dlv::a : dlv::b);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, cqm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   public void a(cqm $$0, @Nullable cwh $$1, List<vu> $$2, csd $$3, @Nullable iz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cxt.a($$0, $$2, "SpawnData");
   }
}
