import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class din extends dde {
   public static final MapCodec<din> a = b(din::new);
   public static final drf<dri> b = dqx.bf;
   public static final dqy c = dqx.w;
   public static final drh d = dqx.aR;
   public static final int e = 3;

   @Override
   public MapCodec<din> a() {
      return a;
   }

   public din(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dri.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dqh b(dae $$0, in $$1, dqh $$2) {
      dri $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dri $$4 = $$0.a_($$1.d()).A();
         dri $$5 = $$4.e() ? dri.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dqh a(cwi $$0) {
      return this.b($$0.q(), $$0.a(), this.n());
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      boolean $$6 = $$1.o() == is.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable brh $$0, dqh $$1, dad $$2, in $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dva.H, $$3);
      }
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      return $$0.a(avz.bg) && $$6.b() == is.b ? bpo.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avm.ag);
         return bpm.b;
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, clh $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avm.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dqh $$0, dad $$1, in $$2, int $$3, int $$4) {
      dri $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(kx.X, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      iw<avb> $$10;
      if ($$5.d()) {
         akh $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = iw.a(avb.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, avd.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private akh a(dad $$0, in $$1) {
      return $$0.c_($$1.c()) instanceof doy $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c, d);
   }
}
