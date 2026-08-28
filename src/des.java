import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class des extends diq implements dex, dlv {
   public static final MapCodec<des> a = b(des::new);
   private static final dso f = dsn.C;
   private static final int g = 6;
   protected static final ewf b = deu.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ewf c = deu.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ewf d = deu.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ewf e = deu.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<des> a() {
      return a;
   }

   protected des(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, je.c));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
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
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(f) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.d();
      drx $$4 = $$1.a_($$3);
      drx $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(awl.by)) && ($$5.a(this) || $$5.a(dew.sD));
   }

   protected static boolean a(dbu $$0, iz $$1, enq $$2, je $$3) {
      drx $$4 = dew.sE.n().a(f, Boolean.valueOf($$2.a(enr.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if (($$1 == je.a || $$1 == je.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      Optional<iz> $$3 = l.a($$0, $$1, $$2.b(), je.b, dew.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iz $$4 = $$3.get().c();
         drx $$5 = $$0.a_($$4);
         return der.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      Optional<iz> $$4 = l.a($$0, $$2, $$3.b(), je.b, dew.sD);
      if (!$$4.isEmpty()) {
         iz $$5 = $$4.get();
         iz $$6 = $$5.c();
         je $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         der.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return new cuk(dew.sD);
   }
}
