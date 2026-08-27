import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dig extends dea implements dlb {
   public static final MapCodec<dig> a = b(dig::new);
   public static final drx b = dhw.aE;
   public static final dru c = drt.C;
   protected static final float d = 3.0F;
   protected static final evf e = dea.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final evf f = dea.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final evf g = dea.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final evf h = dea.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dig> a() {
      return a;
   }

   protected dig(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      switch ((it)$$0.c(b)) {
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

   private boolean a(daf $$0, io $$1, it $$2) {
      drd $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      it $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dec.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, emx.c, emx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      if (!$$0.c()) {
         drd $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      drd $$2 = this.n();
      dbc $$3 = $$0.q();
      io $$4 = $$0.a();
      emw $$5 = $$0.q().b_($$0.a());

      for (it $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == emx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(c) ? emx.c.a(false) : super.b_($$0);
   }
}
