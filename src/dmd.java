import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmd extends dhg implements dfb, dlz {
   public static final MapCodec<dmd> c = b(dmd::new);
   private static final dss g = dsr.C;
   public static final dsv d = dsr.R;
   protected static final float e = 6.0F;
   protected static final ewj f = dey.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmd> a() {
      return c;
   }

   public dmd(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsx.b).a(g, Boolean.valueOf(false)).a(d, je.c));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return f;
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.a(awo.bx) || $$1.b_($$2.c()).a(env.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, bto $$3, cuo $$4) {
      if (!$$0.x_()) {
         iz $$5 = $$1.c();
         dsb $$6 = dhg.c($$0, $$5, this.o().a(b, dsx.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(g) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      if ($$0.c(b) == dsx.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iz $$3 = $$2.d();
         dsb $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return true;
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      if ($$3.c(dhg.b) == dsx.b) {
         iz $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dev.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iz $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float as_() {
      return 0.1F;
   }
}
