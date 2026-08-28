import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmf extends dhj implements dol {
   public static final MapCodec<dmf> a = b(dmf::new);
   public static final dvf b = dve.C;

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   protected dmf(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(duo $$0, duo $$1, jj $$2) {
      return $$1.a(dhl.ac) && $$2.o() == jj.a.b;
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eqq.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(b) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }
}
