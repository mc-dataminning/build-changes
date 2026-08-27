import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class djb extends cyt {
   public static final MapCodec<djb> b = b(djb::new);
   public static final dkf<dkj> c = djx.bg;
   public static final djy d = djx.x;
   public static final float e = 4.0F;
   protected static final emm f = cwq.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emm g = cwq.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final emm h = cwq.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final emm i = cwq.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final emm j = cwq.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emm k = cwq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final emm o = cwq.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final emm F = cwq.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final emm G = cwq.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final emm H = cwq.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final emm I = cwq.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final emm J = cwq.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final emm K = cwq.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final emm L = cwq.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final emm M = cwq.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final emm N = cwq.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final emm O = cwq.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final emm P = cwq.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final emm[] Q = a(true);
   private static final emm[] R = a(false);

   @Override
   protected MapCodec<djb> a() {
      return b;
   }

   private static emm[] a(boolean $$0) {
      return Arrays.stream(ic.values()).map($$1 -> a($$1, $$0)).toArray(emm[]::new);
   }

   private static emm a(ic $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return emj.a(k, $$1 ? L : F);
         case b:
            return emj.a(j, $$1 ? K : o);
         case c:
            return emj.a(i, $$1 ? N : H);
         case d:
            return emj.a(h, $$1 ? M : G);
         case e:
            return emj.a(g, $$1 ? P : J);
         case f:
            return emj.a(f, $$1 ? O : I);
      }
   }

   public djb(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.c).a(c, dkj.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(djh $$0) {
      return true;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(djh $$0, djh $$1) {
      cwq $$2 = $$0.c(c) == dkj.a ? cws.by : cws.br;
      return $$1.a($$2) && $$1.c(dja.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public djh a(ctp $$0, hx $$1, djh $$2, cfi $$3) {
      if (!$$0.B && $$3.fT().d) {
         hx $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         hx $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      djh $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cws.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      if ($$0.a((cts)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return new cmy($$2.c(c) == dkj.b ? cws.br : cws.by);
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
