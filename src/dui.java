import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dui extends djm {
   public static final MapCodec<dui> b = b(dui::new);
   public static final dvm<dvq> c = dve.bg;
   public static final dvf d = dve.x;
   public static final float e = 4.0F;
   protected static final ezm f = dhj.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ezm g = dhj.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ezm h = dhj.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ezm i = dhj.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ezm j = dhj.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ezm k = dhj.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ezm o = dhj.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ezm G = dhj.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ezm H = dhj.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ezm I = dhj.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ezm J = dhj.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ezm K = dhj.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ezm L = dhj.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ezm M = dhj.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ezm N = dhj.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ezm O = dhj.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ezm P = dhj.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ezm Q = dhj.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ezm[] R = a(true);
   private static final ezm[] S = a(false);

   @Override
   protected MapCodec<dui> a() {
      return b;
   }

   private static ezm[] a(boolean $$0) {
      return Arrays.stream(jj.values()).map($$1 -> a($$1, $$0)).toArray(ezm[]::new);
   }

   private static ezm a(jj $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ezj.a(k, $$1 ? M : G);
         case b:
            return ezj.a(j, $$1 ? L : o);
         case c:
            return ezj.a(i, $$1 ? O : I);
         case d:
            return ezj.a(h, $$1 ? N : H);
         case e:
            return ezj.a(g, $$1 ? Q : K);
         case f:
            return ezj.a(f, $$1 ? P : J);
      }
   }

   public dui(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jj.c).b(c, dvq.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(duo $$0) {
      return true;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(duo $$0, duo $$1) {
      dhj $$2 = $$0.c(c) == dvq.a ? dhl.by : dhl.br;
      return $$1.a($$2) && $$1.c(duh.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public duo a(deg $$0, je $$1, duo $$2, cnu $$3) {
      if (!$$0.B && $$3.gd().d) {
         je $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         je $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      duo $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dhl.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if ($$0.a((dej)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, ert.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp($$2.c(c) == dvq.b ? dhl.br : dhl.by);
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
