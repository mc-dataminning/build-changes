import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmg extends dnc implements dnf {
   public static final MapCodec<dmg> a = b(dmg::new);
   private static final fgk D = dnc.b(6.0, 0.0, 16.0);
   private static final fgk R = dnc.b(10.0, 0.0, 16.0);
   private static final fgk S = dnc.b(3.0, 0.0, 16.0);
   public static final ece b = ebu.at;
   public static final ecc<ebq> c = ebu.bn;
   public static final ece d = ebu.aX;
   public static final int e = 16;
   public static final int f = 0;
   public static final int g = 1;
   public static final int h = 0;
   public static final int i = 1;

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   public dmg(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, ebq.a).b(d, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected boolean e_(ebe $$0) {
      return true;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      fgk $$4 = $$0.c(c) == ebq.c ? R : D;
      return $$4.a($$0.a($$2));
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return S.a($$0.a($$2));
   }

   @Override
   protected boolean a_(ebe $$0, djb $$1, iv $$2) {
      return false;
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         ebe $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axe.ax)) {
            if ($$2.a(dne.nE)) {
               return this.m().b(b, Integer.valueOf(0));
            } else if ($$2.a(dne.nF)) {
               int $$3 = $$2.c(b) > 0 ? 1 : 0;
               return this.m().b(b, Integer.valueOf($$3));
            } else {
               ebe $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dne.nF) ? this.m().b(b, $$4.c(b)) : dne.nE.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(ebe $$0) {
      return $$0.c(d) == 0;
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$0.c(d) == 0) {
         if ($$3.a(3) == 0 && $$1.v($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return $$1.a_($$2.e()).a(axe.ax);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jb.b && $$6.a(dne.nF) && $$6.c(b) > $$0.c(b) ? $$0.a(b) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(d) != 1;
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         iv $$9 = $$2.b($$4);
         ebe $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(d) == 1 || !$$0.v($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   protected void a(ebe $$0, djx $$1, iv $$2, azx $$3, int $$4) {
      ebe $$5 = $$1.a_($$2.e());
      iv $$6 = $$2.c(2);
      ebe $$7 = $$1.a_($$6);
      ebq $$8 = ebq.a;
      if ($$4 >= 1) {
         if (!$$5.a(dne.nF) || $$5.c(c) == ebq.a) {
            $$8 = ebq.b;
         } else if ($$5.a(dne.nF) && $$5.c(c) != ebq.a) {
            $$8 = ebq.c;
            if ($$7.a(dne.nF)) {
               $$1.a($$2.e(), $$5.b(c, ebq.b), 3);
               $$1.a($$6, $$7.b(c, ebq.a), 3);
            }
         }
      }

      int $$9 = $$0.c(b) != 1 && !$$7.a(dne.nF) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(b, Integer.valueOf($$9)).b(c, $$8).b(d, Integer.valueOf($$10)), 3);
   }

   protected int a(djb $$0, iv $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dne.nF)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(djb $$0, iv $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dne.nF)) {
         $$2++;
      }

      return $$2;
   }
}
