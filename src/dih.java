import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dih extends dea implements dlb {
   public static final MapCodec<dih> a = b(dih::new);
   public static final dru b = drt.j;
   public static final dru c = drt.C;
   protected static final evf d = evc.a(dea.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dea.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final evf e = evc.a(dea.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dea.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dih> a() {
      return a;
   }

   public dih(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());

      for (it $$2 : $$0.f()) {
         if ($$2.o() == it.a.b) {
            drd $$3 = this.n().a(b, Boolean.valueOf($$2 == it.b));
            if ($$3.a((dbc)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == emx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      it $$3 = m($$0).g();
      return dea.a($$1, $$2.a($$3), $$3.g());
   }

   protected static it m(drd $$0) {
      return $$0.c(b) ? it.a : it.b;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(c) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
