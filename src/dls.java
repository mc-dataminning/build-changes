import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dls extends dhm implements doo {
   public static final MapCodec<dls> a = b(dls::new);
   public static final dvm b = dli.aF;
   public static final dvj c = dvi.C;
   protected static final float d = 3.0F;
   protected static final ezq e = dhm.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ezq f = dhm.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ezq g = dhm.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ezq h = dhm.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   protected dls(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      switch ((jk)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(ddo $$0, jf $$1, jk $$2) {
      dus $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jk $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dho.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, equ.c, equ.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      if (!$$0.c()) {
         dus $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dus $$2 = this.n();
      dem $$3 = $$0.q();
      jf $$4 = $$0.a();
      eqt $$5 = $$0.q().b_($$0.a());

      for (jk $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == equ.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(c) ? equ.c.a(false) : super.b_($$0);
   }
}
