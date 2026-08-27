import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhy extends dac {
   public static final MapCodec<dhy> a = b(dhy::new);
   private static final vu d = vu.c("container.stonecutter");
   public static final dnv b = ddx.aE;
   protected static final eqm c = dac.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dhy> a() {
      return a;
   }

   public dhy(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aui.ay);
         return bnd.b;
      }
   }

   @Nullable
   @Override
   protected bnh b(dnb $$0, cxb $$1, ib $$2) {
      return new bnn(($$2x, $$3, $$4) -> new cnp($$2x, $$3, cmb.a($$1, $$2)), d);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }

   @Override
   protected boolean g_(dnb $$0) {
      return true;
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
