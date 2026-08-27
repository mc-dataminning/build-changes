import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dgq extends cwv {
   public static final MapCodec<dgq> b = b(dgq::new);
   public static final dhu<dhy> c = dhm.bg;
   public static final dhn d = dhm.x;
   public static final float e = 4.0F;
   protected static final ekb f = cut.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ekb g = cut.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ekb h = cut.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ekb i = cut.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ekb j = cut.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ekb k = cut.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ekb o = cut.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ekb F = cut.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ekb G = cut.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ekb H = cut.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ekb I = cut.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ekb J = cut.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ekb K = cut.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ekb L = cut.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ekb M = cut.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ekb N = cut.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ekb O = cut.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ekb P = cut.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ekb[] Q = a(true);
   private static final ekb[] R = a(false);

   @Override
   protected MapCodec<dgq> a() {
      return b;
   }

   private static ekb[] a(boolean $$0) {
      return Arrays.stream(hx.values()).map($$1 -> a($$1, $$0)).toArray(ekb[]::new);
   }

   private static ekb a(hx $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ejy.a(k, $$1 ? L : F);
         case b:
            return ejy.a(j, $$1 ? K : o);
         case c:
            return ejy.a(i, $$1 ? N : H);
         case d:
            return ejy.a(h, $$1 ? M : G);
         case e:
            return ejy.a(g, $$1 ? P : J);
         case f:
            return ejy.a(f, $$1 ? O : I);
      }
   }

   public dgq(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, hx.c).a(c, dhy.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dgw $$0) {
      return true;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dgw $$0, dgw $$1) {
      cut $$2 = $$0.c(c) == dhy.a ? cuv.by : cuv.br;
      return $$1.a($$2) && $$1.c(dgp.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dgw a(crs $$0, ht $$1, dgw $$2, cdm $$3) {
      if (!$$0.B && $$3.fT().d) {
         ht $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ht $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      dgw $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cuv.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      if ($$0.a((crv)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return new clb($$2.c(c) == dhy.b ? cuv.br : cuv.by);
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
