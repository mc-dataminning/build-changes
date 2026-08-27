import com.mojang.serialization.MapCodec;

public class ddd extends dbt {
   public static final MapCodec<ddd> b = b(ddd::new);
   public static final int c = 5;
   private static final ir[] d = ir.values();

   @Override
   public MapCodec<ddd> a() {
      return b;
   }

   public ddd(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$3.a(5) == 0) {
         ir $$4 = d[$$3.a(d.length)];
         im $$5 = $$2.a($$4);
         dpy $$6 = $$1.a_($$5);
         dcv $$7 = null;
         if (g($$6)) {
            $$7 = dcx.qy;
         } else if ($$6.a(dcx.qy) && $$6.c(dbu.d) == $$4) {
            $$7 = dcx.qx;
         } else if ($$6.a(dcx.qx) && $$6.c(dbu.d) == $$4) {
            $$7 = dcx.qw;
         } else if ($$6.a(dcx.qw) && $$6.c(dbu.d) == $$4) {
            $$7 = dcx.qv;
         }

         if ($$7 != null) {
            dpy $$8 = $$7.n().a(dbu.d, $$4).a(dbu.c, Boolean.valueOf($$6.u().a() == els.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dpy $$0) {
      return $$0.i() || $$0.a(dcx.G) && $$0.u().e() == 8;
   }
}
