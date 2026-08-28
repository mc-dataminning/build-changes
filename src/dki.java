import com.mojang.serialization.MapCodec;

public class dki extends dif {
   public static final MapCodec<dki> d = b(dki::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dki> a() {
      return d;
   }

   public dki(dww.d $$0) {
      super($$0, ko.c);
   }

   @Override
   public boolean d(dwx $$0) {
      return false;
   }

   protected static boolean a(dgi $$0, dhk.c $$1) {
      if ($$1 == dhk.c.b) {
         return $$0.H_().i() < 0.05F;
      } else {
         return $$1 == dhk.c.c ? $$0.H_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, dhk.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dhk.c.b) {
            $$1.b($$2, djo.fP.m());
            $$1.a(null, ebt.c, $$2);
         } else if ($$3 == dhk.c.c) {
            $$1.b($$2, djo.fR.m());
            $$1.a(null, ebt.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(esy $$0) {
      return true;
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, esy $$3) {
      if ($$3 == eta.c) {
         dwx $$4 = djo.fP.m();
         $$1.b($$2, $$4);
         $$1.a(ebt.c, $$2, ebt.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eta.e) {
         dwx $$5 = djo.fQ.m();
         $$1.b($$2, $$5);
         $$1.a(ebt.c, $$2, ebt.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
