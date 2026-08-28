import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpe extends dku implements dsb {
   public static final MapCodec<dpe> a = b(dpe::new);
   public static final dzd b = dzc.m;
   public static final dzd c = dzc.I;
   private static final fdo d = fdl.a(dku.b(4.0, 7.0, 9.0), dku.b(6.0, 0.0, 7.0));
   private static final fdo e = d.a(0.0, 0.0625, 0.0).d();

   @Override
   public MapCodec<dpe> a() {
      return a;
   }

   public dpe(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());

      for (jo $$2 : $$0.f()) {
         if ($$2.o() == jo.a.b) {
            dym $$3 = this.m().b(b, Boolean.valueOf($$2 == jo.b));
            if ($$3.a((dhs)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == euu.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jo $$3 = o($$0).g();
      return dku.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jo o(dym $$0) {
      return $$0.c(b) ? jo.a : jo.b;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(c) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
