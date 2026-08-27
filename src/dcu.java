import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcu extends cyo implements dfo {
   public static final MapCodec<dcu> a = b(dcu::new);
   public static final dlw b = dlv.j;
   public static final dlw c = dlv.C;
   protected static final eol d = eoi.a(cyo.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cyo.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eol e = eoi.a(cyo.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cyo.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dcu> a() {
      return a;
   }

   public dcu(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());

      for (ie $$2 : $$0.f()) {
         if ($$2.o() == ie.a.b) {
            dlf $$3 = this.o().a(b, Boolean.valueOf($$2 == ie.b));
            if ($$3.a((cvq)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == egq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      ie $$3 = m($$0).g();
      return cyo.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ie m(dlf $$0) {
      return $$0.c(b) ? ie.a : ie.b;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(c) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
