import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dfd extends djb implements dfi, dmg {
   public static final MapCodec<dfd> a = b(dfd::new);
   private static final dsy f = dsx.C;
   private static final int g = 6;
   protected static final ews b = dff.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ews c = dff.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ews d = dff.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ews e = dff.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dfd> a() {
      return a;
   }

   protected dfd(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, jf.c));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      switch ((jf)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(f) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.d();
      dsh $$4 = $$1.a_($$3);
      dsh $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(avu.by)) && ($$5.a(this) || $$5.a(dfh.sD));
   }

   protected static boolean a(dce $$0, ja $$1, eob $$2, jf $$3) {
      dsh $$4 = dfh.sE.o().a(f, Boolean.valueOf($$2.a(eoc.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if (($$1 == jf.a || $$1 == jf.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      Optional<ja> $$3 = l.a($$0, $$1, $$2.b(), jf.b, dfh.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ja $$4 = $$3.get().c();
         dsh $$5 = $$0.a_($$4);
         return dfc.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      Optional<ja> $$4 = l.a($$0, $$2, $$3.b(), jf.b, dfh.sD);
      if (!$$4.isEmpty()) {
         ja $$5 = $$4.get();
         ja $$6 = $$5.c();
         jf $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dfc.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua(dfh.sD);
   }
}
