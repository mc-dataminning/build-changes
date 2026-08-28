import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doo extends dku implements dsb {
   public static final MapCodec<doo> a = b(doo::new);
   private static final dzd b = dzc.I;
   private static final fdo c = dku.b(12.0, 10.0, 16.0);

   @Override
   public MapCodec<doo> a() {
      return a;
   }

   protected doo(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(b) ? euu.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = super.a($$0);
      if ($$1 != null) {
         eut $$2 = $$0.q().b_($$0.a());
         return $$1.b(b, Boolean.valueOf($$2.a() == euu.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.d();
      dym $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jo.a);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4 == jo.b && !this.a($$0, $$1, $$3)) {
         return dkw.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, euu.c, euu.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
