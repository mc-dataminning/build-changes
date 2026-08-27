import com.mojang.serialization.MapCodec;

public class dlp extends dea {
   public static final MapCodec<dlp> a = b(dlp::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final it[] d = it.values();

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   protected dlp(drc.d $$0) {
      super($$0);
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(daz $$0, io $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dec.aP.n(), 2);
         $$0.a(null, $$1, avi.yT, avj.e, 1.0F, 1.0F);
      }
   }

   private boolean b(daz $$0, io $$1) {
      return io.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (it $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            drd $$3 = $$0.a_($$2);
            emw $$4 = $$0.b_($$2);
            if (!$$4.a(awc.a)) {
               return false;
            } else {
               if ($$3.b() instanceof deh $$6 && !$$6.a(null, $$0, $$2, $$3).e()) {
                  return true;
               }

               if ($$3.b() instanceof diq) {
                  $$0.a($$2, dec.a.n(), 3);
               } else {
                  if (!$$3.a(dec.mc) && !$$3.a(dec.md) && !$$3.a(dec.bw) && !$$3.a(dec.bx)) {
                     return false;
                  }

                  doi $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dec.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
