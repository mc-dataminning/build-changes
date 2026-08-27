import com.mojang.serialization.MapCodec;

public class dcp extends dbf {
   public static final MapCodec<dcp> b = b(dcp::new);
   public static final int c = 5;
   private static final ij[] d = ij.values();

   @Override
   public MapCodec<dcp> a() {
      return b;
   }

   public dcp(dph.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$3.a(5) == 0) {
         ij $$4 = d[$$3.a(d.length)];
         id $$5 = $$2.a($$4);
         dpi $$6 = $$1.a_($$5);
         dch $$7 = null;
         if (g($$6)) {
            $$7 = dcj.qy;
         } else if ($$6.a(dcj.qy) && $$6.c(dbg.d) == $$4) {
            $$7 = dcj.qx;
         } else if ($$6.a(dcj.qx) && $$6.c(dbg.d) == $$4) {
            $$7 = dcj.qw;
         } else if ($$6.a(dcj.qw) && $$6.c(dbg.d) == $$4) {
            $$7 = dcj.qv;
         }

         if ($$7 != null) {
            dpi $$8 = $$7.n().a(dbg.d, $$4).a(dbg.c, Boolean.valueOf($$6.u().a() == elc.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dpi $$0) {
      return $$0.i() || $$0.a(dcj.G) && $$0.u().e() == 8;
   }
}
