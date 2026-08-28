import com.mojang.serialization.MapCodec;

public class djl extends dhj {
   public static final MapCodec<djl> d = b(djl::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<djl> a() {
      return d;
   }

   public djl(dvu.d $$0) {
      super($$0, kn.c);
   }

   @Override
   public boolean d(dvv $$0) {
      return false;
   }

   protected static boolean a(dfm $$0, dgo.c $$1) {
      if ($$1 == dgo.c.b) {
         return $$0.G_().i() < 0.05F;
      } else {
         return $$1 == dgo.c.c ? $$0.G_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, dgo.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dgo.c.b) {
            $$1.b($$2, dis.fu.m());
            $$1.a(null, ear.c, $$2);
         } else if ($$3 == dgo.c.c) {
            $$1.b($$2, dis.fw.m());
            $$1.a(null, ear.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eru $$0) {
      return true;
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, eru $$3) {
      if ($$3 == erw.c) {
         dvv $$4 = dis.fu.m();
         $$1.b($$2, $$4);
         $$1.a(ear.c, $$2, ear.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == erw.e) {
         dvv $$5 = dis.fv.m();
         $$1.b($$2, $$5);
         $$1.a(ear.c, $$2, ear.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
