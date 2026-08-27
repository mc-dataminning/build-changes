import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhg extends dck implements daf, dhc {
   public static final MapCodec<dhg> c = b(dhg::new);
   private static final dns g = dnr.C;
   public static final dnv d = dnr.R;
   protected static final float e = 6.0F;
   protected static final eqm f = dac.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dhg> a() {
      return c;
   }

   public dhg(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dnx.b).a(g, Boolean.valueOf(false)).a(d, ih.c));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return f;
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.a(aun.bx) || $$1.b_($$2.c()).a(eiq.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      dnb $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if (!$$0.x_()) {
         ib $$5 = $$1.c();
         dnb $$6 = dck.c($$0, $$5, this.o().a(b, dnx.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(g) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      if ($$0.c(b) == dnx.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ib $$3 = $$2.d();
         dnb $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return true;
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      if ($$3.c(dck.b) == dnx.b) {
         ib $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         czz.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ib $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float aw_() {
      return 0.1F;
   }
}
