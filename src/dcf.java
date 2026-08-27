import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcf extends cyo implements dfo {
   public static final MapCodec<dcf> a = b(dcf::new);
   private static final dlw c = dlv.C;
   protected static final eol b = cyo.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dcf> a() {
      return a;
   }

   protected dcf(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(c) ? egq.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = super.a($$0);
      if ($$1 != null) {
         egp $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == egq.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.c();
      dlf $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ie.a);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == ie.b && !this.a($$0, $$3, $$4)) {
         return cyq.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, egq.c, egq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
