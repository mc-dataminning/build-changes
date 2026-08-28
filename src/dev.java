import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dev extends dit implements dfa, dly {
   public static final MapCodec<dev> a = b(dev::new);
   private static final dsr f = dsq.C;
   private static final int g = 6;
   protected static final ewi b = dex.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ewi c = dex.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ewi d = dex.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ewi e = dex.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   protected dev(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, je.c));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
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
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(f) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsa $$4 = $$1.a_($$3);
      dsa $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(awo.by)) && ($$5.a(this) || $$5.a(dez.sD));
   }

   protected static boolean a(dbx $$0, iz $$1, ent $$2, je $$3) {
      dsa $$4 = dez.sE.o().a(f, Boolean.valueOf($$2.a(enu.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if (($$1 == je.a || $$1 == je.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      Optional<iz> $$3 = l.a($$0, $$1, $$2.b(), je.b, dez.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iz $$4 = $$3.get().c();
         dsa $$5 = $$0.a_($$4);
         return deu.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      Optional<iz> $$4 = l.a($$0, $$2, $$3.b(), je.b, dez.sD);
      if (!$$4.isEmpty()) {
         iz $$5 = $$4.get();
         iz $$6 = $$5.c();
         je $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         deu.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return new cun(dez.sD);
   }
}
