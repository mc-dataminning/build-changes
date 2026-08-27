import com.mojang.serialization.MapCodec;

public class cwu extends cus {
   public static final MapCodec<cwu> d = b(cwu::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<cwu> a() {
      return d;
   }

   public cwu(dio.d $$0) {
      super($$0, jb.c);
   }

   @Override
   public boolean d(dip $$0) {
      return false;
   }

   protected static boolean a(csy $$0, ctx.c $$1) {
      if ($$1 == ctx.c.b) {
         return $$0.F_().i() < 0.05F;
      } else {
         return $$1 == ctx.c.c ? $$0.F_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, ctx.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == ctx.c.b) {
            $$1.b($$2, cwb.fu.o());
            $$1.a(null, dmz.c, $$2);
         } else if ($$3 == ctx.c.c) {
            $$1.b($$2, cwb.fw.o());
            $$1.a(null, dmz.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(edy $$0) {
      return true;
   }

   @Override
   protected void a(dip $$0, csy $$1, hv $$2, edy $$3) {
      if ($$3 == eea.c) {
         dip $$4 = cwb.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dmz.c, $$2, dmz.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eea.e) {
         dip $$5 = cwb.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dmz.c, $$2, dmz.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
