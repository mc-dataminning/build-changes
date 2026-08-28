import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfy extends dlk implements dlz {
   public static final MapCodec<dfy> a = b(dfy::new);
   public static final dss b = dsr.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ewj e = dey.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ewj f = dey.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ewj g = dey.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<dfy> a() {
      return a;
   }

   public dfy(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, je.a.b));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      switch ((je.a)$$0.c(i)) {
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
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == env.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(b) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
