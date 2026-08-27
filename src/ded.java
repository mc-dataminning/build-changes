import com.mojang.serialization.MapCodec;

public class ded extends cwp {
   public static final MapCodec<ded> a = b(ded::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ic[] d = ic.values();

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   protected ded(djf.d $$0) {
      super($$0);
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cto $$0, hx $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cwr.aP.o(), 2);
         $$0.a(null, $$1, arr.xZ, ars.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cto $$0, hx $$1) {
      return hx.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ic $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            djg $$3 = $$0.a_($$2);
            eeq $$4 = $$0.b_($$2);
            if (!$$4.a(asl.a)) {
               return false;
            } else {
               if ($$3.b() instanceof cww $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof dbe) {
                  $$0.a($$2, cwr.a.o(), 3);
               } else {
                  if (!$$3.a(cwr.mc) && !$$3.a(cwr.md) && !$$3.a(cwr.bw) && !$$3.a(cwr.bx)) {
                     return false;
                  }

                  dgu $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, cwr.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
