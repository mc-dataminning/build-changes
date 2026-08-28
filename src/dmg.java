import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmg extends dhj implements dfe, dmc {
   public static final MapCodec<dmg> c = b(dmg::new);
   private static final dsv g = dsu.C;
   public static final dsy d = dsu.R;
   protected static final float e = 6.0F;
   protected static final ewm f = dfb.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmg> a() {
      return c;
   }

   public dmg(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dta.b).a(g, Boolean.valueOf(false)).a(d, je.c));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return f;
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return $$0.a(awp.bx) || $$1.b_($$2.c()).a(eny.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dse $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, btr $$3, cur $$4) {
      if (!$$0.x_()) {
         iz $$5 = $$1.c();
         dse $$6 = dhj.c($$0, $$5, this.o().a(b, dta.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(g) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      if ($$0.c(b) == dta.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iz $$3 = $$2.d();
         dse $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return true;
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      if ($$3.c(dhj.b) == dta.b) {
         iz $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dey.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iz $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float as_() {
      return 0.1F;
   }
}
