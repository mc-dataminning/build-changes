import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dqx extends dgd {
   public static final MapCodec<dqx> b = b(dqx::new);
   public static final dsb<dsf> c = drt.bg;
   public static final dru d = drt.x;
   public static final float e = 4.0F;
   protected static final evf f = dea.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final evf g = dea.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final evf h = dea.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final evf i = dea.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final evf j = dea.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final evf k = dea.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final evf o = dea.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final evf F = dea.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final evf G = dea.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final evf H = dea.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final evf I = dea.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final evf J = dea.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final evf K = dea.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final evf L = dea.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final evf M = dea.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final evf N = dea.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final evf O = dea.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final evf P = dea.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final evf[] Q = a(true);
   private static final evf[] R = a(false);

   @Override
   protected MapCodec<dqx> a() {
      return b;
   }

   private static evf[] a(boolean $$0) {
      return Arrays.stream(it.values()).map($$1 -> a($$1, $$0)).toArray(evf[]::new);
   }

   private static evf a(it $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return evc.a(k, $$1 ? L : F);
         case b:
            return evc.a(j, $$1 ? K : o);
         case c:
            return evc.a(i, $$1 ? N : H);
         case d:
            return evc.a(h, $$1 ? M : G);
         case e:
            return evc.a(g, $$1 ? P : J);
         case f:
            return evc.a(f, $$1 ? O : I);
      }
   }

   public dqx(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, it.c).a(c, dsf.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(drd $$0) {
      return true;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(drd $$0, drd $$1) {
      dea $$2 = $$0.c(c) == dsf.a ? dec.by : dec.br;
      return $$1.a($$2) && $$1.c(dqw.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public drd a(daz $$0, io $$1, drd $$2, cly $$3) {
      if (!$$0.B && $$3.gd().d) {
         io $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         io $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      drd $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dec.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if ($$0.a((dbc)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq($$2.c(c) == dsf.b ? dec.br : dec.by);
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
