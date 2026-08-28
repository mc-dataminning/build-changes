import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djl extends dff implements dmg {
   public static final MapCodec<djl> a = b(djl::new);
   public static final dtb b = djb.aE;
   public static final dsy c = dsx.C;
   protected static final float d = 3.0F;
   protected static final ews e = dff.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ews f = dff.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ews g = dff.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ews h = dff.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   protected djl(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      switch ((jf)$$0.c(b)) {
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

   private boolean a(dbj $$0, ja $$1, jf $$2) {
      dsh $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      jf $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dfh.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eoc.c, eoc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      if (!$$0.c()) {
         dsh $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dsh $$2 = this.o();
      dcg $$3 = $$0.q();
      ja $$4 = $$0.a();
      eob $$5 = $$0.q().b_($$0.a());

      for (jf $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == eoc.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(c) ? eoc.c.a(false) : super.b_($$0);
   }
}
