import com.mojang.serialization.MapCodec;

public class dih extends dgf {
   public static final MapCodec<dih> d = b(dih::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dih> a() {
      return d;
   }

   public dih(dur.d $$0) {
      super($$0, kl.c);
   }

   @Override
   public boolean d(dus $$0) {
      return false;
   }

   protected static boolean a(dej $$0, dfk.c $$1) {
      if ($$1 == dfk.c.b) {
         return $$0.D_().i() < 0.05F;
      } else {
         return $$1 == dfk.c.c ? $$0.D_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, dfk.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dfk.c.b) {
            $$1.b($$2, dho.fu.n());
            $$1.a(null, dzp.c, $$2);
         } else if ($$3 == dfk.c.c) {
            $$1.b($$2, dho.fw.n());
            $$1.a(null, dzp.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eqs $$0) {
      return true;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, eqs $$3) {
      if ($$3 == equ.c) {
         dus $$4 = dho.fu.n();
         $$1.b($$2, $$4);
         $$1.a(dzp.c, $$2, dzp.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == equ.e) {
         dus $$5 = dho.fv.n();
         $$1.b($$2, $$5);
         $$1.a(dzp.c, $$2, dzp.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
