import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dls extends dly {
   public static final MapCodec<dls> a = b(dls::new);
   public static final ebm<jb> b = ebe.R;
   public static final ebf c = ebe.y;

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$1 instanceof arq $$5 && $$1.c_($$2) instanceof dxe $$6) {
         $$3.a($$6);
         $$3.a(awx.ar);
         cpz.a($$5, $$3, true);
      }

      return bug.a;
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      dxm $$4 = $$1.c_($$2);
      if ($$4 instanceof dxe) {
         ((dxe)$$4).k();
      }
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dxe($$0, $$1);
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return cvc.a($$1.c_($$2));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
