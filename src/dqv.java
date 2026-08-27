import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dqv extends dgb {
   public static final MapCodec<dqv> b = b(dqv::new);
   public static final drz<dsd> c = drr.bg;
   public static final drs d = drr.x;
   public static final float e = 4.0F;
   protected static final evd f = ddy.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final evd g = ddy.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final evd h = ddy.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final evd i = ddy.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final evd j = ddy.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final evd k = ddy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final evd o = ddy.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final evd F = ddy.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final evd G = ddy.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final evd H = ddy.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final evd I = ddy.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final evd J = ddy.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final evd K = ddy.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final evd L = ddy.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final evd M = ddy.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final evd N = ddy.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final evd O = ddy.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final evd P = ddy.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final evd[] Q = a(true);
   private static final evd[] R = a(false);

   @Override
   protected MapCodec<dqv> a() {
      return b;
   }

   private static evd[] a(boolean $$0) {
      return Arrays.stream(it.values()).map($$1 -> a($$1, $$0)).toArray(evd[]::new);
   }

   private static evd a(it $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return eva.a(k, $$1 ? L : F);
         case b:
            return eva.a(j, $$1 ? K : o);
         case c:
            return eva.a(i, $$1 ? N : H);
         case d:
            return eva.a(h, $$1 ? M : G);
         case e:
            return eva.a(g, $$1 ? P : J);
         case f:
            return eva.a(f, $$1 ? O : I);
      }
   }

   public dqv(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, it.c).a(c, dsd.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(drb $$0) {
      return true;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(drb $$0, drb $$1) {
      ddy $$2 = $$0.c(c) == dsd.a ? dea.by : dea.br;
      return $$1.a($$2) && $$1.c(dqu.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public drb a(dax $$0, io $$1, drb $$2, clw $$3) {
      if (!$$0.B && $$3.gd().d) {
         io $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         io $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      drb $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dea.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if ($$0.a((dba)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto($$2.c(c) == dsd.b ? dea.br : dea.by);
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
