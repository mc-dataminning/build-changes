import com.mojang.serialization.MapCodec;

public class djv extends dch {
   public static final MapCodec<djv> a = b(djv::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ij[] d = ij.values();

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   protected djv(dph.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(czg $$0, id $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dcj.aP.n(), 2);
         $$0.a(null, $$1, auo.yA, aup.e, 1.0F, 1.0F);
      }
   }

   private boolean b(czg $$0, id $$1) {
      return id.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ij $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dpi $$3 = $$0.a_($$2);
            elb $$4 = $$0.b_($$2);
            if (!$$4.a(avj.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dco $$6 && !$$6.a(null, $$0, $$2, $$3).d()) {
                  return true;
               }

               if ($$3.b() instanceof dgw) {
                  $$0.a($$2, dcj.a.n(), 3);
               } else {
                  if (!$$3.a(dcj.mc) && !$$3.a(dcj.md) && !$$3.a(dcj.bw) && !$$3.a(dcj.bx)) {
                     return false;
                  }

                  dmo $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dcj.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
