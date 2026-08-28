import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dvp extends dkt {
   public static final MapCodec<dvp> b = b(dvp::new);
   public static final dws<dww> c = dwl.bg;
   public static final dwm d = dwl.x;
   public static final float e = 4.0F;
   protected static final fas f = diq.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fas g = diq.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final fas h = diq.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final fas i = diq.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final fas j = diq.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fas k = diq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final fas o = diq.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fas G = diq.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final fas H = diq.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final fas I = diq.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final fas J = diq.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fas K = diq.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final fas L = diq.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fas M = diq.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fas N = diq.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final fas O = diq.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final fas P = diq.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fas Q = diq.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final fas[] R = a(true);
   private static final fas[] S = a(false);

   @Override
   protected MapCodec<dvp> a() {
      return b;
   }

   private static fas[] a(boolean $$0) {
      return Arrays.stream(jm.values()).map($$1 -> a($$1, $$0)).toArray(fas[]::new);
   }

   private static fas a(jm $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return fap.a(k, $$1 ? M : G);
         case b:
            return fap.a(j, $$1 ? L : o);
         case c:
            return fap.a(i, $$1 ? O : I);
         case d:
            return fap.a(h, $$1 ? N : H);
         case e:
            return fap.a(g, $$1 ? Q : K);
         case f:
            return fap.a(f, $$1 ? P : J);
      }
   }

   public dvp(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(c, dww.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dvv $$0) {
      return true;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dvv $$0, dvv $$1) {
      diq $$2 = $$0.c(c) == dww.a ? dis.by : dis.br;
      return $$1.a($$2) && $$1.c(dvo.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dvv a(dfm $$0, jh $$1, dvv $$2, cou $$3) {
      if (!$$0.C && $$3.gh().d) {
         jh $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         jh $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      dvv $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dis.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if ($$0.a((dfp)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, esz.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm($$2.c(c) == dww.b ? dis.br : dis.by);
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
