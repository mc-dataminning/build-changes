import com.mojang.serialization.MapCodec;

public class ddz extends dbx {
   public static final MapCodec<ddz> d = b(ddz::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<ddz> a() {
      return d;
   }

   public ddz(dqg.d $$0) {
      super($$0, jt.c);
   }

   @Override
   public boolean d(dqh $$0) {
      return false;
   }

   protected static boolean a(dad $$0, dbc.c $$1) {
      if ($$1 == dbc.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dbc.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, dbc.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dbc.c.b) {
            $$1.b($$2, ddg.fu.n());
            $$1.a(null, dva.c, $$2);
         } else if ($$3 == dbc.c.c) {
            $$1.b($$2, ddg.fw.n());
            $$1.a(null, dva.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(elz $$0) {
      return true;
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, elz $$3) {
      if ($$3 == emb.c) {
         dqh $$4 = ddg.fu.n();
         $$1.b($$2, $$4);
         $$1.a(dva.c, $$2, dva.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == emb.e) {
         dqh $$5 = ddg.fv.n();
         $$1.b($$2, $$5);
         $$1.a(dva.c, $$2, dva.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
