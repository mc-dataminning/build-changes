import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dex extends div implements dfc, dma {
   public static final MapCodec<dex> a = b(dex::new);
   private static final dst f = dss.C;
   private static final int g = 6;
   protected static final ewk b = dez.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ewk c = dez.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ewk d = dez.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ewk e = dez.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   protected dex(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, je.c));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
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
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(f) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsc $$4 = $$1.a_($$3);
      dsc $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(awp.by)) && ($$5.a(this) || $$5.a(dfb.sD));
   }

   protected static boolean a(dbz $$0, iz $$1, env $$2, je $$3) {
      dsc $$4 = dfb.sE.o().a(f, Boolean.valueOf($$2.a(enw.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if (($$1 == je.a || $$1 == je.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      Optional<iz> $$3 = l.a($$0, $$1, $$2.b(), je.b, dfb.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iz $$4 = $$3.get().c();
         dsc $$5 = $$0.a_($$4);
         return dew.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      Optional<iz> $$4 = l.a($$0, $$2, $$3.b(), je.b, dfb.sD);
      if (!$$4.isEmpty()) {
         iz $$5 = $$4.get();
         iz $$6 = $$5.c();
         je $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dew.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup(dfb.sD);
   }
}
