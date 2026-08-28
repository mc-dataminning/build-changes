import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmc extends dhf implements dfa, dly {
   public static final MapCodec<dmc> c = b(dmc::new);
   private static final dsr g = dsq.C;
   public static final dsu d = dsq.R;
   protected static final float e = 6.0F;
   protected static final ewi f = dex.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmc> a() {
      return c;
   }

   public dmc(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsw.b).a(g, Boolean.valueOf(false)).a(d, je.c));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return f;
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return $$0.a(awo.bx) || $$1.b_($$2.c()).a(enu.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, btn $$3, cun $$4) {
      if (!$$0.x_()) {
         iz $$5 = $$1.c();
         dsa $$6 = dhf.c($$0, $$5, this.o().a(b, dsw.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(g) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      if ($$0.c(b) == dsw.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iz $$3 = $$2.d();
         dsa $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return true;
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      if ($$3.c(dhf.b) == dsw.b) {
         iz $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         deu.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iz $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
