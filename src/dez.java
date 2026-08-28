import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dez extends dix implements dfe, dmc {
   public static final MapCodec<dez> a = b(dez::new);
   private static final dsv f = dsu.C;
   private static final int g = 6;
   protected static final ewm b = dfb.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ewm c = dfb.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ewm d = dfb.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ewm e = dfb.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dez> a() {
      return a;
   }

   protected dez(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, je.c));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      switch ((je)$$0.c(aE)) {
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
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(f) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      iz $$3 = $$2.d();
      dse $$4 = $$1.a_($$3);
      dse $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(awp.by)) && ($$5.a(this) || $$5.a(dfd.sD));
   }

   protected static boolean a(dcb $$0, iz $$1, enx $$2, je $$3) {
      dse $$4 = dfd.sE.o().a(f, Boolean.valueOf($$2.a(eny.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if (($$1 == je.a || $$1 == je.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      Optional<iz> $$3 = l.a($$0, $$1, $$2.b(), je.b, dfd.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iz $$4 = $$3.get().c();
         dse $$5 = $$0.a_($$4);
         return dey.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      Optional<iz> $$4 = l.a($$0, $$2, $$3.b(), je.b, dfd.sD);
      if (!$$4.isEmpty()) {
         iz $$5 = $$4.get();
         iz $$6 = $$5.c();
         je $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dey.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return new cur(dfd.sD);
   }
}
