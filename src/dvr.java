import com.mojang.serialization.MapCodec;

public class dvr extends dwq implements dnh {
   public static final MapCodec<dvr> a = b(dvr::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final ecg c = ebw.av;
   private static final fgm e = dne.b(10.0, 0.0, 8.0);
   private static final fgm f = dne.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dvr> a() {
      return a;
   }

   public dvr(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa(dae.xG);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return switch ($$0.c(c)) {
         case 0 -> e;
         case 3 -> fgj.b();
         default -> f;
      };
   }

   @Override
   protected boolean f(ebg $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         ebg $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(egg.c, $$2, egg.a.a($$5));
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if ($$3 instanceof bxw && $$3.an() != bxe.ab && $$3.an() != bxe.m) {
         $$3.a($$0, new ffs(0.8F, 0.75, 0.8F));
         if ($$1 instanceof aru $$5 && $$0.c(c) != 0) {
            ffs $$7 = $$3.P_() ? $$3.ae() : $$3.bA().d($$3.dt());
            if ($$7.j() > 0.0) {
               double $$8 = Math.abs($$7.a());
               double $$9 = Math.abs($$7.c());
               if ($$8 >= 0.003F || $$9 >= 0.003F) {
                  $$3.a($$5, $$1.al().u(), 1.0F);
               }
            }

            return;
         }
      }
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (but)(!$$8 && $$0.a(dae.sG) ? but.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new daa(dae.xG, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awr.Aw, aws.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         ebg $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(egg.c, $$2, egg.a.a($$3, $$8));
         return but.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
