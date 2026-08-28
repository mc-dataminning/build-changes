import com.mojang.serialization.MapCodec;

public class dft extends ddr {
   public static final MapCodec<dft> d = b(dft::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<dft> a() {
      return d;
   }

   public dft(dsa.d $$0) {
      super($$0, kf.c);
   }

   @Override
   public boolean d(dsb $$0) {
      return false;
   }

   protected static boolean a(dbx $$0, dcw.c $$1) {
      if ($$1 == dcw.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dcw.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, dcw.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dcw.c.b) {
            $$1.b($$2, dfa.fu.o());
            $$1.a(null, dwu.c, $$2);
         } else if ($$3 == dcw.c.c) {
            $$1.b($$2, dfa.fw.o());
            $$1.a(null, dwu.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(ent $$0) {
      return true;
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, ent $$3) {
      if ($$3 == env.c) {
         dsb $$4 = dfa.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dwu.c, $$2, dwu.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == env.e) {
         dsb $$5 = dfa.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dwu.c, $$2, dwu.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
