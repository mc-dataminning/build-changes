import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djn extends dfc implements dmr {
   public static final MapCodec<djn> a = b(djn::new);
   public static final dtt b = dts.j;
   public static final dtt c = dts.C;
   protected static final exn d = exk.a(dfc.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dfc.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final exn e = exk.a(dfc.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dfc.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   public djn(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());

      for (iw $$2 : $$0.f()) {
         if ($$2.o() == iw.a.b) {
            dtc $$3 = this.n().a(b, Boolean.valueOf($$2 == iw.b));
            if ($$3.a((dcd)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == epf.c));
            }
         }
      }

      return null;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      iw $$3 = m($$0).g();
      return dfc.a($$1, $$2.a($$3), $$3.g());
   }

   protected static iw m(dtc $$0) {
      return $$0.c(b) ? iw.a : iw.b;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
