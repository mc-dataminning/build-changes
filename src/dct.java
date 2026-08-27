import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dct extends cyo implements dfo {
   public static final MapCodec<dct> a = b(dct::new);
   public static final dlz b = dcj.aE;
   public static final dlw c = dlv.C;
   protected static final float d = 3.0F;
   protected static final eol e = cyo.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eol f = cyo.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eol g = cyo.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eol h = cyo.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dct> a() {
      return a;
   }

   protected dct(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      switch ((ie)$$0.c(b)) {
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

   private boolean a(cut $$0, hz $$1, ie $$2) {
      dlf $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      ie $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return cyq.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, egq.c, egq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      if (!$$0.c()) {
         dlf $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dlf $$2 = this.o();
      cvq $$3 = $$0.q();
      hz $$4 = $$0.a();
      egp $$5 = $$0.q().b_($$0.a());

      for (ie $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == egq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(c) ? egq.c.a(false) : super.c_($$0);
   }
}
