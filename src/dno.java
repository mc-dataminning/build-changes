import com.mojang.serialization.MapCodec;

public class dno extends dfy {
   public static final MapCodec<dno> a = b(dno::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ji[] d = ji.values();

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   protected dno(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dcw $$0, jd $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dga.aP.o(), 2);
         $$0.a(null, $$1, avp.yW, avq.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dcw $$0, jd $$1) {
      return jd.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ji $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dtc $$3 = $$0.a_($$2);
            epc $$4 = $$0.b_($$2);
            if (!$$4.a(awk.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dgf $$6 && !$$6.a(null, $$0, $$2, $$3).e()) {
                  return true;
               }

               if ($$3.b() instanceof dko) {
                  $$0.a($$2, dga.a.o(), 3);
               } else {
                  if (!$$3.a(dga.mc) && !$$3.a(dga.md) && !$$3.a(dga.bw) && !$$3.a(dga.bx)) {
                     return false;
                  }

                  dqh $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dga.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
