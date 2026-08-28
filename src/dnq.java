import com.mojang.serialization.MapCodec;

public class dnq extends dne {
   public static final MapCodec<dnq> a = b(dnq::new);
   public static final ecg b = ebw.az;
   public static final int c = 15;
   private static final fgm d = dne.b(14.0, 0.0, 16.0);
   private static final fgm e = dne.b(14.0, 0.0, 15.0);
   private static final int f = 3;
   private static final int g = 8;
   private static final double h = 0.1;
   private static final double i = 0.25;

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   protected dnq(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      iw $$4 = $$2.d();
      if ($$1.v($$4)) {
         int $$5 = 1;
         int $$6 = $$0.c(b);

         while ($$1.a_($$2.c($$5)).a(this)) {
            if (++$$5 == 3 && $$6 == 15) {
               return;
            }
         }

         if ($$6 == 8 && this.a(this.m(), $$1, $$2.d())) {
            double $$7 = $$5 >= 3 ? 0.25 : 0.1;
            if ($$3.j() <= $$7) {
               $$1.b($$4, dng.eh.m());
            }
         } else if ($$6 == 15 && $$5 < 3) {
            $$1.b($$4, this.m());
            ebg $$8 = $$0.b(b, Integer.valueOf(0));
            $$1.a($$2, $$8, 260);
            $$1.a($$8, $$4, this, null, false);
         }

         if ($$6 < 15) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 260);
         }
      }
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return d;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      for (jc $$3 : jc.c.a) {
         ebg $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(axl.b)) {
            return false;
         }
      }

      ebg $$5 = $$1.a_($$2.e());
      return ($$5.a(dng.eg) || $$5.a(axg.J)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      $$3.a($$1.al().k(), 1.0F);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
