import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dpc extends dek {
   public static final MapCodec<dpc> b = b(dpc::new);
   public static final dqg<dqk> c = dpy.bg;
   public static final dpz d = dpy.x;
   public static final float e = 4.0F;
   protected static final etc f = dch.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final etc g = dch.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final etc h = dch.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final etc i = dch.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final etc j = dch.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final etc k = dch.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final etc o = dch.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final etc F = dch.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final etc G = dch.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final etc H = dch.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final etc I = dch.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final etc J = dch.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final etc K = dch.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final etc L = dch.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final etc M = dch.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final etc N = dch.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final etc O = dch.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final etc P = dch.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final etc[] Q = a(true);
   private static final etc[] R = a(false);

   @Override
   protected MapCodec<dpc> a() {
      return b;
   }

   private static etc[] a(boolean $$0) {
      return Arrays.stream(ij.values()).map($$1 -> a($$1, $$0)).toArray(etc[]::new);
   }

   private static etc a(ij $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return esz.a(k, $$1 ? L : F);
         case b:
            return esz.a(j, $$1 ? K : o);
         case c:
            return esz.a(i, $$1 ? N : H);
         case d:
            return esz.a(h, $$1 ? M : G);
         case e:
            return esz.a(g, $$1 ? P : J);
         case f:
            return esz.a(f, $$1 ? O : I);
      }
   }

   public dpc(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ij.c).a(c, dqk.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dpi $$0) {
      return true;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dpi $$0, dpi $$1) {
      dch $$2 = $$0.c(c) == dqk.a ? dcj.by : dcj.br;
      return $$1.a($$2) && $$1.c(dpb.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dpi a(czg $$0, id $$1, dpi $$2, cka $$3) {
      if (!$$0.B && $$3.ga().d) {
         id $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         id $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      dpi $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dcj.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if ($$0.a((czj)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return new crs($$2.c(c) == dqk.b ? dcj.br : dcj.by);
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
