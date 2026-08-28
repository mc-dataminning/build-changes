import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dla extends dhj implements dol {
   public static final MapCodec<dla> a = b(dla::new);
   private static final dvf c = dve.C;
   protected static final ezm b = dhj.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   protected dla(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(c) ? eqq.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = super.a($$0);
      if ($$1 != null) {
         eqp $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == eqq.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.d();
      duo $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jj.a);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == jj.b && !this.a($$0, $$3, $$4)) {
         return dhl.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eqq.c, eqq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
