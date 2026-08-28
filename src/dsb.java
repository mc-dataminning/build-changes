import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsb extends djn {
   public static final MapCodec<dsb> a = b(dsb::new);
   public static final dxp b = dxo.I;

   @Override
   public MapCodec<dsb> a() {
      return a;
   }

   public dsb(dwx.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dwy a(dgj $$0, ji $$1, dwy $$2, coy $$3) {
      if (!$$0.B_() && !$$3.b() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ard $$0, ji $$1, dgb $$2) {
      cle $$3 = new cle($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.m();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dgj $$0, ji $$1) {
      a($$0, $$1, null);
   }

   private static void a(dgj $$0, ji $$1, @Nullable bvi $$2) {
      if (!$$0.C) {
         cle $$3 = new cle($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dA(), $$3.dC(), $$3.dG(), awa.Am, awb.e, 1.0F, 1.0F);
         $$0.a($$2, ebu.I, $$1);
      }
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if (!$$0.a(cwu.oX) && !$$0.a(cwu.uV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, djp.a.m(), 11);
         cwm $$7 = $$0.h();
         if ($$0.a(cwu.oX)) {
            $$0.a(1, $$4, bvi.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awk.c.b($$7));
         return bsl.a;
      }
   }

   @Override
   protected void a(dgj $$0, dwy $$1, fax $$2, cpr $$3) {
      if ($$0 instanceof ard $$4) {
         ji $$5 = $$2.b();
         bum $$6 = $$3.p();
         if ($$3.bY() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bvi ? (bvi)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dgb $$0) {
      return false;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }
}
