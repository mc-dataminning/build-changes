import com.mojang.serialization.MapCodec;

public class cuv extends css {
   public static final MapCodec<cuv> d = b(cuv::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<cuv> a() {
      return d;
   }

   public cuv(dga.d $$0) {
      super($$0, iy.c);
   }

   @Override
   public boolean d(dgb $$0) {
      return false;
   }

   protected static boolean a(cqz $$0, crx.c $$1) {
      if ($$1 == crx.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == crx.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, crx.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == crx.c.b) {
            $$1.b($$2, cuc.fu.o());
            $$1.a(null, dkl.c, $$2);
         } else if ($$3 == crx.c.c) {
            $$1.b($$2, cuc.fw.o());
            $$1.a(null, dkl.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ebd $$0) {
      return true;
   }

   @Override
   protected void a(dgb $$0, cqz $$1, ht $$2, ebd $$3) {
      if ($$3 == ebf.c) {
         dgb $$4 = cuc.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dkl.c, $$2, dkl.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == ebf.e) {
         dgb $$5 = cuc.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dkl.c, $$2, dkl.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
