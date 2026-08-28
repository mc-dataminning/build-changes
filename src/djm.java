import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djm extends dff implements dmg {
   public static final MapCodec<djm> a = b(djm::new);
   public static final dsy b = dsx.j;
   public static final dsy c = dsx.C;
   protected static final ews d = ewp.a(dff.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dff.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ews e = ewp.a(dff.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dff.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<djm> a() {
      return a;
   }

   public djm(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());

      for (jf $$2 : $$0.f()) {
         if ($$2.o() == jf.a.b) {
            dsh $$3 = this.o().a(b, Boolean.valueOf($$2 == jf.b));
            if ($$3.a((dcg)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == eoc.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      jf $$3 = m($$0).g();
      return dff.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jf m(dsh $$0) {
      return $$0.c(b) ? jf.a : jf.b;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(c) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
