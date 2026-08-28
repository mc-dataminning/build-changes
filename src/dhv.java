import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhv extends dni implements dnx {
   public static final MapCodec<dhv> a = b(dhv::new);
   public static final dur b = duq.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final eyx e = dgv.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eyx f = dgv.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eyx g = dgv.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dhv> a() {
      return a;
   }

   public dhv(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Boolean.valueOf(false)).b(i, jj.a.b));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
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
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eqc.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(b) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
