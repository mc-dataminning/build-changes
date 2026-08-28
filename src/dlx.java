import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dlx extends dhj implements dol {
   public static final MapCodec<dlx> a = b(dlx::new);
   public static final int b = 15;
   public static final dvo c = dve.aP;
   public static final dvf d = dve.C;
   public static final ToIntFunction<duo> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   public dlx(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B && $$3.gz()) {
         $$1.a($$2, $$0.a(c), 2);
         return brp.b;
      } else {
         return brp.c;
      }
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return $$3.a(cvt.hC) ? ezj.b() : ezj.a();
   }

   @Override
   protected boolean e_(duo $$0) {
      return $$0.y().c();
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.a;
   }

   @Override
   protected float c(duo $$0, ddl $$1, je $$2) {
      return 1.0F;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(d) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cvp a(cvp $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(kr.ah, cxx.a.a(c, $$1));
      }

      return $$0;
   }
}
