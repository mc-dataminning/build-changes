import com.mojang.serialization.MapCodec;

public class cza extends cxq {
   public static final MapCodec<cza> b = b(cza::new);
   public static final int c = 5;
   private static final ie[] d = ie.values();

   @Override
   public MapCodec<cza> a() {
      return b;
   }

   public cza(dli.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$3.a(5) == 0) {
         ie $$4 = d[$$3.a(d.length)];
         hz $$5 = $$2.a($$4);
         dlj $$6 = $$1.a_($$5);
         cys $$7 = null;
         if (g($$6)) {
            $$7 = cyu.qy;
         } else if ($$6.a(cyu.qy) && $$6.c(cxr.d) == $$4) {
            $$7 = cyu.qx;
         } else if ($$6.a(cyu.qx) && $$6.c(cxr.d) == $$4) {
            $$7 = cyu.qw;
         } else if ($$6.a(cyu.qw) && $$6.c(cxr.d) == $$4) {
            $$7 = cyu.qv;
         }

         if ($$7 != null) {
            dlj $$8 = $$7.o().a(cxr.d, $$4).a(cxr.c, Boolean.valueOf($$6.u().a() == egx.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dlj $$0) {
      return $$0.i() || $$0.a(cyu.G) && $$0.u().e() == 8;
   }
}
