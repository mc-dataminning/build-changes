import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dfg extends dje implements dfl, dmj {
   public static final MapCodec<dfg> a = b(dfg::new);
   private static final dtc f = dtb.C;
   private static final int g = 6;
   protected static final exa b = dfi.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final exa c = dfi.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final exa d = dfi.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final exa e = dfi.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   protected dfg(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, jf.c));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
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
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(f) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      ja $$3 = $$2.d();
      dsl $$4 = $$1.a_($$3);
      dsl $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(avw.by)) && ($$5.a(this) || $$5.a(dfk.sD));
   }

   protected static boolean a(dch $$0, ja $$1, eoj $$2, jf $$3) {
      dsl $$4 = dfk.sE.o().a(f, Boolean.valueOf($$2.a(eok.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if (($$1 == jf.a || $$1 == jf.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      Optional<ja> $$3 = l.a($$0, $$1, $$2.b(), jf.b, dfk.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ja $$4 = $$3.get().c();
         dsl $$5 = $$0.a_($$4);
         return dff.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      Optional<ja> $$4 = l.a($$0, $$2, $$3.b(), jf.b, dfk.sD);
      if (!$$4.isEmpty()) {
         ja $$5 = $$4.get();
         ja $$6 = $$5.c();
         jf $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dff.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud(dfk.sD);
   }
}
