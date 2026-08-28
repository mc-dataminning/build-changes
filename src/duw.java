import com.mojang.serialization.MapCodec;

public class duw extends dne {
   public static final MapCodec<duw> a = b(duw::new);
   public static final int b = 2;
   public static final ecg c = ebw.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fgm g = dne.a(14.0, 12.0, 0.0, 16.0);

   @Override
   public MapCodec<duw> a() {
      return a;
   }

   public duw(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c);
   }

   @Override
   public fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return g;
   }

   public int o(ebg $$0) {
      return $$0.c(c);
   }

   private boolean q(ebg $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awr.zC, aws.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awr.zD, aws.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cml $$4 = bxe.bk.a($$1, bxd.e);
         if ($$4 != null) {
            ffs $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azq.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.A_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(egg.i, $$2, egg.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   public static boolean a(djd $$0, iw $$1) {
      return $$0.a_($$1.e()).a(axg.cz);
   }
}
