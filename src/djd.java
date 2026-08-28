import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djd extends dex implements dly {
   public static final MapCodec<djd> a = b(djd::new);
   public static final dsu b = dit.aE;
   public static final dsr c = dsq.C;
   protected static final float d = 3.0F;
   protected static final ewi e = dex.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewi f = dex.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewi g = dex.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewi h = dex.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   protected djd(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
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

   private boolean a(dbc $$0, iz $$1, je $$2) {
      dsa $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      je $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dez.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, enu.c, enu.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      if (!$$0.c()) {
         dsa $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dsa $$2 = this.o();
      dbz $$3 = $$0.q();
      iz $$4 = $$0.a();
      ent $$5 = $$0.q().b_($$0.a());

      for (je $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == enu.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(c) ? enu.c.a(false) : super.b_($$0);
   }
}
