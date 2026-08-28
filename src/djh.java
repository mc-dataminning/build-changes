import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djh extends dfa implements dmb {
   public static final MapCodec<djh> a = b(djh::new);
   public static final dsu b = dst.j;
   public static final dsu c = dst.C;
   protected static final ewl d = ewi.a(dfa.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dfa.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ewl e = ewi.a(dfa.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dfa.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());

      for (je $$2 : $$0.f()) {
         if ($$2.o() == je.a.b) {
            dsd $$3 = this.o().a(b, Boolean.valueOf($$2 == je.b));
            if ($$3.a((dcc)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == enx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      je $$3 = m($$0).g();
      return dfa.a($$1, $$2.a($$3), $$3.g());
   }

   protected static je m(dsd $$0) {
      return $$0.c(b) ? je.a : je.b;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(c) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
