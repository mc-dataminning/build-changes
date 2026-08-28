import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dij extends dnw implements dol {
   public static final MapCodec<dij> a = b(dij::new);
   public static final dvf b = dve.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ezm e = dhj.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ezm f = dhj.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ezm g = dhj.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dij> a() {
      return a;
   }

   public dij(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(i, jj.a.b));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      switch ((jj.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
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
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(b) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
