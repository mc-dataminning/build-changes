import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkm extends dgv implements dnx {
   public static final MapCodec<dkm> a = b(dkm::new);
   private static final dur c = duq.C;
   protected static final eyx b = dgv.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   protected dkm(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(c) ? eqc.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      dua $$1 = super.a($$0);
      if ($$1 != null) {
         eqb $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == eqc.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.d();
      dua $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jj.a);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 == jj.b && !this.a($$0, $$3, $$4)) {
         return dgx.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eqc.c, eqc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
