import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class diq extends czo {
   public static final MapCodec<diq> a = b(diq::new);
   public static final dnz<dmh> b = dnr.by;

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   public diq(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dmh.a));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Nullable
   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dmb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return $$0 instanceof apf $$3
         ? a($$2, dkk.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().b($$3, $$2x))
         : a($$2, dkk.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x));
   }

   @Override
   public void a(cqm $$0, @Nullable cwh $$1, List<vu> $$2, csd $$3, @Nullable iz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cxt.a($$0, $$2, "spawn_data");
   }
}
