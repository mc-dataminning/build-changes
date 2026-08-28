import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dub extends dov implements dmp, dtx {
   public static final MapCodec<dub> c = b(dub::new);
   private static final ebf e = ebe.I;
   public static final ebm<jb> d = ebe.T;
   private static final ffr f = dmm.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dub> a() {
      return c;
   }

   public dub(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ebk.b).b(e, Boolean.valueOf(false)).b(d, jb.c));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return f;
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.a(axc.bA) || $$1.b_($$2.d()).a(eww.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      eao $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, bxj $$3, czk $$4) {
      if (!$$0.w_()) {
         iv $$5 = $$1.d();
         eao $$6 = dov.b($$0, $$5, this.m().b(b, ebk.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(e) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      if ($$0.c(b) == ebk.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iv $$3 = $$2.e();
         eao $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, e, d);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return true;
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      if ($$3.c(dov.b) == ebk.b) {
         iv $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dmj.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iv $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float aq_() {
      return 0.1F;
   }
}
