import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dep extends dac implements dhc {
   public static final MapCodec<dep> a = b(dep::new);
   public static final int b = 15;
   public static final dob c = dnr.aP;
   public static final dns d = dnr.C;
   public static final ToIntFunction<dnb> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   public dep(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if (!$$1.B && $$3.gw()) {
         $$1.a($$2, $$0.a(c), 2);
         return bnd.a;
      } else {
         return bnd.b;
      }
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return $$3.a(cqp.hB) ? eqj.b() : eqj.a();
   }

   @Override
   protected boolean a_(dnb $$0, cwh $$1, ib $$2) {
      return true;
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.a;
   }

   @Override
   protected float d(dnb $$0, cwh $$1, ib $$2) {
      return 1.0F;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(d) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cqm a(cqm $$0, int $$1) {
      if ($$1 != 15) {
         ta $$2 = new ta();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
