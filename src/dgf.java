import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgf extends dlr implements dmg {
   public static final MapCodec<dgf> a = b(dgf::new);
   public static final dsy b = dsx.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ews e = dff.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ews f = dff.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ews g = dff.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dgf> a() {
      return a;
   }

   public dgf(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, jf.a.b));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      switch ((jf.a)$$0.c(i)) {
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
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eoc.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(b) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
