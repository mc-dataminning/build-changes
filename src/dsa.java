import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsa extends djm {
   public static final MapCodec<dsa> a = b(dsa::new);
   public static final dxo b = dxn.I;

   @Override
   public MapCodec<dsa> a() {
      return a;
   }

   public dsa(dww.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dwx a(dgi $$0, ji $$1, dwx $$2, cox $$3) {
      if (!$$0.B_() && !$$3.b() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ard $$0, ji $$1, dga $$2) {
      cld $$3 = new cld($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.m();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dgi $$0, ji $$1) {
      a($$0, $$1, null);
   }

   private static void a(dgi $$0, ji $$1, @Nullable bvh $$2) {
      if (!$$0.C) {
         cld $$3 = new cld($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dA(), $$3.dC(), $$3.dG(), awa.Am, awb.e, 1.0F, 1.0F);
         $$0.a($$2, ebt.I, $$1);
      }
   }

   @Override
   protected bsk a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsj $$5, faw $$6) {
      if (!$$0.a(cwt.oX) && !$$0.a(cwt.uV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, djo.a.m(), 11);
         cwl $$7 = $$0.h();
         if ($$0.a(cwt.oX)) {
            $$0.a(1, $$4, bvh.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awk.c.b($$7));
         return bsk.a;
      }
   }

   @Override
   protected void a(dgi $$0, dwx $$1, faw $$2, cpq $$3) {
      if ($$0 instanceof ard $$4) {
         ji $$5 = $$2.b();
         bul $$6 = $$3.p();
         if ($$3.bY() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bvh ? (bvh)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dga $$0) {
      return false;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }
}
