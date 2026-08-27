import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ddy extends dhw implements ded, dlb {
   public static final MapCodec<ddy> a = b(ddy::new);
   private static final dru f = drt.C;
   private static final int g = 6;
   protected static final evf b = dea.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final evf c = dea.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final evf d = dea.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final evf e = dea.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<ddy> a() {
      return a;
   }

   protected ddy(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, it.c));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      switch ((it)$$0.c(aE)) {
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
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(f) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.d();
      drd $$4 = $$1.a_($$3);
      drd $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(avx.by)) && ($$5.a(this) || $$5.a(dec.sD));
   }

   protected static boolean a(dba $$0, io $$1, emw $$2, it $$3) {
      drd $$4 = dec.sE.n().a(f, Boolean.valueOf($$2.a(emx.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if (($$1 == it.a || $$1 == it.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      Optional<io> $$3 = l.a($$0, $$1, $$2.b(), it.b, dec.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         io $$4 = $$3.get().c();
         drd $$5 = $$0.a_($$4);
         return ddx.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      Optional<io> $$4 = l.a($$0, $$2, $$3.b(), it.b, dec.sD);
      if (!$$4.isEmpty()) {
         io $$5 = $$4.get();
         io $$6 = $$5.c();
         it $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         ddx.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq(dec.sD);
   }
}
