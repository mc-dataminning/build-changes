import com.mojang.serialization.MapCodec;

public class cvo extends ctl {
   public static final MapCodec<cvo> d = b(cvo::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<cvo> a() {
      return d;
   }

   public cvo(dgv.d $$0) {
      super($$0, iy.c);
   }

   @Override
   public boolean d(dgw $$0) {
      return false;
   }

   protected static boolean a(crs $$0, csq.c $$1) {
      if ($$1 == csq.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == csq.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, csq.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == csq.c.b) {
            $$1.b($$2, cuv.fu.o());
            $$1.a(null, dlg.c, $$2);
         } else if ($$3 == csq.c.c) {
            $$1.b($$2, cuv.fw.o());
            $$1.a(null, dlg.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ecf $$0) {
      return true;
   }

   @Override
   protected void a(dgw $$0, crs $$1, ht $$2, ecf $$3) {
      if ($$3 == ech.c) {
         dgw $$4 = cuv.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dlg.c, $$2, dlg.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == ech.e) {
         dgw $$5 = cuv.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dlg.c, $$2, dlg.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
