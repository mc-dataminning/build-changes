import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djh extends dfb implements dmc {
   public static final MapCodec<djh> a = b(djh::new);
   public static final dsy b = dix.aE;
   public static final dsv c = dsu.C;
   protected static final float d = 3.0F;
   protected static final ewm e = dfb.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewm f = dfb.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewm g = dfb.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewm h = dfb.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   protected djh(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      switch ((je)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(dbg $$0, iz $$1, je $$2) {
      dse $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      je $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dfd.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eny.c, eny.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      if (!$$0.c()) {
         dse $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dse $$2 = this.o();
      dcd $$3 = $$0.q();
      iz $$4 = $$0.a();
      enx $$5 = $$0.q().b_($$0.a());

      for (je $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == eny.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(c) ? eny.c.a(false) : super.b_($$0);
   }
}
