import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class diu extends cym {
   public static final MapCodec<diu> b = b(diu::new);
   public static final djy<dkc> c = djq.bg;
   public static final djr d = djq.x;
   public static final float e = 4.0F;
   protected static final emf f = cwj.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emf g = cwj.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final emf h = cwj.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final emf i = cwj.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final emf j = cwj.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emf k = cwj.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final emf o = cwj.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final emf F = cwj.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final emf G = cwj.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final emf H = cwj.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final emf I = cwj.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final emf J = cwj.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final emf K = cwj.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final emf L = cwj.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final emf M = cwj.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final emf N = cwj.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final emf O = cwj.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final emf P = cwj.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final emf[] Q = a(true);
   private static final emf[] R = a(false);

   @Override
   protected MapCodec<diu> a() {
      return b;
   }

   private static emf[] a(boolean $$0) {
      return Arrays.stream(ic.values()).map($$1 -> a($$1, $$0)).toArray(emf[]::new);
   }

   private static emf a(ic $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return emc.a(k, $$1 ? L : F);
         case b:
            return emc.a(j, $$1 ? K : o);
         case c:
            return emc.a(i, $$1 ? N : H);
         case d:
            return emc.a(h, $$1 ? M : G);
         case e:
            return emc.a(g, $$1 ? P : J);
         case f:
            return emc.a(f, $$1 ? O : I);
      }
   }

   public diu(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.c).a(c, dkc.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dja $$0) {
      return true;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dja $$0, dja $$1) {
      cwj $$2 = $$0.c(c) == dkc.a ? cwl.by : cwl.br;
      return $$1.a($$2) && $$1.c(dit.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dja a(cti $$0, hx $$1, dja $$2, cfb $$3) {
      if (!$$0.B && $$3.fT().d) {
         hx $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         hx $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      dja $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cwl.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if ($$0.a((ctl)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr($$2.c(c) == dkc.b ? cwl.br : cwl.by);
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
