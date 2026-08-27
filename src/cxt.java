import com.mojang.serialization.MapCodec;

public class cxt extends cvr {
   public static final MapCodec<cxt> d = b(cxt::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<cxt> a() {
      return d;
   }

   public cxt(djo.d $$0) {
      super($$0, jd.c);
   }

   @Override
   public boolean d(djp $$0) {
      return false;
   }

   protected static boolean a(ctx $$0, cuw.c $$1) {
      if ($$1 == cuw.c.b) {
         return $$0.F_().i() < 0.05F;
      } else {
         return $$1 == cuw.c.c ? $$0.F_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cuw.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cuw.c.b) {
            $$1.b($$2, cxa.fu.o());
            $$1.a(null, dnz.c, $$2);
         } else if ($$3 == cuw.c.c) {
            $$1.b($$2, cxa.fw.o());
            $$1.a(null, dnz.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eey $$0) {
      return true;
   }

   @Override
   protected void a(djp $$0, ctx $$1, hx $$2, eey $$3) {
      if ($$3 == efa.c) {
         djp $$4 = cxa.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dnz.c, $$2, dnz.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == efa.e) {
         djp $$5 = cxa.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dnz.c, $$2, dnz.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
