import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dum extends djp {
   public static final MapCodec<dum> b = b(dum::new);
   public static final dvq<dvu> c = dvi.bg;
   public static final dvj d = dvi.x;
   public static final float e = 4.0F;
   protected static final ezq f = dhm.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ezq g = dhm.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ezq h = dhm.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ezq i = dhm.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ezq j = dhm.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ezq k = dhm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ezq o = dhm.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ezq G = dhm.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ezq H = dhm.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ezq I = dhm.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ezq J = dhm.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ezq K = dhm.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ezq L = dhm.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ezq M = dhm.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ezq N = dhm.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ezq O = dhm.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ezq P = dhm.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ezq Q = dhm.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ezq[] R = a(true);
   private static final ezq[] S = a(false);

   @Override
   protected MapCodec<dum> a() {
      return b;
   }

   private static ezq[] a(boolean $$0) {
      return Arrays.stream(jk.values()).map($$1 -> a($$1, $$0)).toArray(ezq[]::new);
   }

   private static ezq a(jk $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ezn.a(k, $$1 ? M : G);
         case b:
            return ezn.a(j, $$1 ? L : o);
         case c:
            return ezn.a(i, $$1 ? O : I);
         case d:
            return ezn.a(h, $$1 ? N : H);
         case e:
            return ezn.a(g, $$1 ? Q : K);
         case f:
            return ezn.a(f, $$1 ? P : J);
      }
   }

   public dum(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jk.c).b(c, dvu.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dus $$0) {
      return true;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dus $$0, dus $$1) {
      dhm $$2 = $$0.c(c) == dvu.a ? dho.by : dho.br;
      return $$1.a($$2) && $$1.c(dul.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dus a(dej $$0, jf $$1, dus $$2, cnx $$3) {
      if (!$$0.B && $$3.ge().d) {
         jf $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         jf $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      dus $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dho.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if ($$0.a((dem)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, erx.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs($$2.c(c) == dvu.b ? dho.br : dho.by);
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
