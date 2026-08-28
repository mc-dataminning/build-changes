import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlc extends dgv implements dnx {
   public static final MapCodec<dlc> a = b(dlc::new);
   public static final dur b = duq.j;
   public static final dur c = duq.C;
   protected static final eyx d = eyu.a(dgv.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dgv.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eyx e = eyu.a(dgv.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dgv.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   public dlc(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());

      for (jj $$2 : $$0.f()) {
         if ($$2.o() == jj.a.b) {
            dua $$3 = this.o().b(b, Boolean.valueOf($$2 == jj.b));
            if ($$3.a((ddv)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == eqc.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      jj $$3 = o($$0).g();
      return dgv.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jj o(dua $$0) {
      return $$0.c(b) ? jj.a : jj.b;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return o($$0).g() == $$1 && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(c) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
