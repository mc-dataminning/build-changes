import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class djj extends czb {
   public static final MapCodec<djj> b = b(djj::new);
   public static final dkn<dkr> c = dkf.bg;
   public static final dkg d = dkf.x;
   public static final float e = 4.0F;
   protected static final emv f = cwy.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emv g = cwy.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final emv h = cwy.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final emv i = cwy.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final emv j = cwy.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emv k = cwy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final emv o = cwy.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final emv F = cwy.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final emv G = cwy.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final emv H = cwy.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final emv I = cwy.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final emv J = cwy.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final emv K = cwy.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final emv L = cwy.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final emv M = cwy.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final emv N = cwy.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final emv O = cwy.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final emv P = cwy.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final emv[] Q = a(true);
   private static final emv[] R = a(false);

   @Override
   protected MapCodec<djj> a() {
      return b;
   }

   private static emv[] a(boolean $$0) {
      return Arrays.stream(ic.values()).map($$1 -> a($$1, $$0)).toArray(emv[]::new);
   }

   private static emv a(ic $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ems.a(k, $$1 ? L : F);
         case b:
            return ems.a(j, $$1 ? K : o);
         case c:
            return ems.a(i, $$1 ? N : H);
         case d:
            return ems.a(h, $$1 ? M : G);
         case e:
            return ems.a(g, $$1 ? P : J);
         case f:
            return ems.a(f, $$1 ? O : I);
      }
   }

   public djj(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.c).a(c, dkr.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(djp $$0) {
      return true;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(djp $$0, djp $$1) {
      cwy $$2 = $$0.c(c) == dkr.a ? cxa.by : cxa.br;
      return $$1.a($$2) && $$1.c(dji.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public djp a(ctx $$0, hx $$1, djp $$2, cfq $$3) {
      if (!$$0.B && $$3.fT().d) {
         hx $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         hx $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      djp $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cxa.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if ($$0.a((cua)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return new cng($$2.c(c) == dkr.b ? cxa.br : cxa.by);
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
