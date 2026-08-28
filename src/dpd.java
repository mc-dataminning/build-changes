import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dpd extends dku implements dsb {
   public static final MapCodec<dpd> a = b(dpd::new);
   public static final dzk<jo> b = dot.e;
   public static final dzd c = dzc.I;
   public static final Map<jo, fdo> d = fdl.c(dku.c(16.0, 13.0, 16.0));

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   protected dpd(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return d.get($$0.c(b));
   }

   private boolean a(dgv $$0, jj $$1, jo $$2) {
      dym $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jo $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dkw.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, euu.c, euu.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      if (!$$0.c()) {
         dym $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dym $$2 = this.m();
      dhs $$3 = $$0.q();
      jj $$4 = $$0.a();
      eut $$5 = $$0.q().b_($$0.a());

      for (jo $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == euu.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(c) ? euu.c.a(false) : super.b_($$0);
   }
}
