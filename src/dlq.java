import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlq extends dhj implements dol {
   public static final MapCodec<dlq> a = b(dlq::new);
   public static final dvf b = dve.j;
   public static final dvf c = dve.C;
   protected static final ezm d = ezj.a(dhj.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dhj.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ezm e = ezj.a(dhj.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dhj.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   public dlq(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());

      for (jj $$2 : $$0.f()) {
         if ($$2.o() == jj.a.b) {
            duo $$3 = this.o().b(b, Boolean.valueOf($$2 == jj.b));
            if ($$3.a((dej)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == eqq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      jj $$3 = o($$0).g();
      return dhj.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jj o(duo $$0) {
      return $$0.c(b) ? jj.a : jj.b;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return o($$0).g() == $$1 && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(c) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
