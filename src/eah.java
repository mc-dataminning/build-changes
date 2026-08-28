import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class eah extends doq {
   public static final MapCodec<eah> b = b(eah::new);
   public static final ebm<ebq> c = ebe.bj;
   public static final ebf d = ebe.B;
   public static final int e = 4;
   private static final ffr f = dmm.c(16.0, 0.0, 4.0);
   private static final Map<jb, ffr> g = ffo.d(ffo.a(f, dmm.c(4.0, 4.0, 16.0)));
   private static final Map<jb, ffr> h = ffo.d(ffo.a(f, dmm.c(4.0, 4.0, 20.0)));

   @Override
   protected MapCodec<eah> a() {
      return b;
   }

   public eah(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jb.c).b(c, ebq.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(eao $$0) {
      return true;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return ($$0.c(d) ? g : h).get($$0.c(a));
   }

   private boolean a(eao $$0, eao $$1) {
      dmm $$2 = $$0.c(c) == ebq.a ? dmo.bI : dmo.by;
      return $$1.a($$2) && $$1.c(eag.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public eao a(djh $$0, iv $$1, eao $$2, crj $$3) {
      if (!$$0.C && $$3.gk()) {
         iv $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      iv $$4 = $$2.a($$0.c(a).g());
      if (this.a($$0, $$1.a_($$4))) {
         $$1.b($$4, true);
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      eao $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dmo.ca) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if ($$0.a((djk)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, exz.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk($$2.c(c) == ebq.b ? dmo.by : dmo.bI);
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
