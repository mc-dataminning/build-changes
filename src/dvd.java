import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvd extends dmf {
   public static final MapCodec<dvd> a = b(dvd::new);
   public static final eay b = eax.H;

   @Override
   public MapCodec<dvd> a() {
      return a;
   }

   public dvd(eag.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.D($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if ($$1.D($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public eah a(dja $$0, iu $$1, eah $$2, crc $$3) {
      if (!$$0.w_() && !$$3.gk().d && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arq $$0, iu $$1, dit $$2) {
      cni $$3 = new cni($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.g();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dja $$0, iu $$1) {
      a($$0, $$1, null);
   }

   private static void a(dja $$0, iu $$1, @Nullable bxe $$2) {
      if (!$$0.C) {
         cni $$3 = new cni($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dA(), $$3.dC(), $$3.dG(), awn.AC, awo.e, 1.0F, 1.0F);
         $$0.a($$2, efh.I, $$1);
      }
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if (!$$0.a(czh.pg) && !$$0.a(czh.vg)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dmh.a.m(), 11);
         cyz $$7 = $$0.h();
         if ($$0.a(czh.pg)) {
            $$0.a(1, $$4, bxe.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awx.c.b($$7));
         return bud.a;
      }
   }

   @Override
   protected void a(dja $$0, eah $$1, fem $$2, crx $$3) {
      if ($$0 instanceof arq $$4) {
         iu $$5 = $$2.b();
         bwf $$6 = $$3.q();
         if ($$3.bY() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bxe ? (bxe)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dit $$0) {
      return false;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }
}
