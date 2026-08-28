import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djp extends dkl implements dko {
   public static final MapCodec<djp> a = b(djp::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final fcr e = dkl.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final fcr f = dkl.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final fcr g = dkl.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dyt h = dyk.ar;
   public static final dyr<dyg> i = dyk.bl;
   public static final dyt j = dyk.aV;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   public djp(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(h, Integer.valueOf(0)).b(i, dyg.a).b(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean e_(dxu $$0) {
      return true;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      fcr $$4 = $$0.c(i) == dyg.c ? f : e;
      fbx $$5 = $$0.a($$2);
      return $$4.a($$5.d, $$5.e, $$5.f);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      fbx $$4 = $$0.a($$2);
      return g.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a_(dxu $$0, dgm $$1, jh $$2) {
      return false;
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dxu $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axu.ax)) {
            if ($$2.a(dkn.nt)) {
               return this.m().b(h, Integer.valueOf(0));
            } else if ($$2.a(dkn.nu)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.m().b(h, Integer.valueOf($$3));
            } else {
               dxu $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dkn.nu) ? this.m().b(h, $$4.c(h)) : dkn.nt.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dxu $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return $$1.a_($$2.e()).a(axu.ax);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$4 == jm.b && $$6.a(dkn.nu) && $$6.c(h) > $$0.c(h) ? $$0.a(h) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jh $$9 = $$2.b($$4);
         dxu $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dxu $$0, cpw $$1, dgm $$2, jh $$3) {
      return $$1.eZ().h() instanceof czc ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dxu $$0, dhh $$1, jh $$2, bam $$3, int $$4) {
      dxu $$5 = $$1.a_($$2.e());
      jh $$6 = $$2.c(2);
      dxu $$7 = $$1.a_($$6);
      dyg $$8 = dyg.a;
      if ($$4 >= 1) {
         if (!$$5.a(dkn.nu) || $$5.c(i) == dyg.a) {
            $$8 = dyg.b;
         } else if ($$5.a(dkn.nu) && $$5.c(i) != dyg.a) {
            $$8 = dyg.c;
            if ($$7.a(dkn.nu)) {
               $$1.a($$2.e(), $$5.b(i, dyg.b), 3);
               $$1.a($$6, $$7.b(i, dyg.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dkn.nu) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(h, Integer.valueOf($$9)).b(i, $$8).b(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dgm $$0, jh $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dkn.nu)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dgm $$0, jh $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dkn.nu)) {
         $$2++;
      }

      return $$2;
   }
}
