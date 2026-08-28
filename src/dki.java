import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dki extends djy {
   public static final MapCodec<dki> a = b(dki::new);
   public static final dys<jm> b = dok.aF;
   public static final dys<dyj> c = dyl.W;
   public static final dym d = dyl.x;
   private static final fcs f = dkm.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final fcs g = dkm.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final fcs h = dkm.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final fcs i = dkm.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final fcs j = fcp.a(i, h);
   private static final fcs k = fcp.a(j, dkm.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final fcs l = fcp.a(j, dkm.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fcs m = fcp.a(j, dkm.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final fcs n = fcp.a(j, dkm.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fcs o = fcp.a(j, dkm.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final fcs G = fcp.a(j, dkm.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final fcs H = fcp.a(j, dkm.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public dki(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dyj.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dhi $$0, dxv $$1, fbu $$2, cqq $$3) {
      bvk $$4 = $$3.p();
      cpx $$5 = $$4 instanceof cpx ? (cpx)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      return (btj)(this.a($$1, $$0, $$4, $$3, true) ? btj.a : btj.e);
   }

   public boolean a(dhi $$0, dxv $$1, fbu $$2, @Nullable cpx $$3, boolean $$4) {
      jm $$5 = $$2.c();
      jh $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(axp.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dxv $$0, jm $$1, double $$2) {
      if ($$1.o() != jm.a.b && !($$2 > 0.8124F)) {
         jm $$3 = $$0.c(b);
         dyj $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dhi $$0, jh $$1, @Nullable jm $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bvk $$0, dhi $$1, jh $$2, @Nullable jm $$3) {
      dux $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof duv) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((duv)$$4).a($$3);
         $$1.a(null, $$2, axf.bZ, axg.e, 2.0F, 1.0F);
         $$1.a($$0, ecr.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fcs o(dxv $$0) {
      jm $$1 = $$0.c(b);
      dyj $$2 = $$0.c(c);
      if ($$2 == dyj.a) {
         return $$1 != jm.c && $$1 != jm.d ? g : f;
      } else if ($$2 == dyj.b) {
         return H;
      } else if ($$2 == dyj.d) {
         return $$1 != jm.c && $$1 != jm.d ? l : k;
      } else if ($$1 == jm.c) {
         return o;
      } else if ($$1 == jm.d) {
         return G;
      } else {
         return $$1 == jm.f ? n : m;
      }
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.o($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.o($$0);
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      dhi $$3 = $$0.q();
      jm.a $$4 = $$1.o();
      if ($$4 == jm.a.b) {
         dxv $$5 = this.m().b(c, $$1 == jm.a ? dyj.b : dyj.a).b(b, $$0.g());
         if ($$5.a((dhl)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jm.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jm.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jm.e)
            || $$4 == jm.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jm.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jm.c);
         dxv $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dyj.d : dyj.c);
         if ($$7.a((dhl)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jm.b);
         $$7 = $$7.b(c, $$8 ? dyj.a : dyj.b);
         if ($$7.a((dhl)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, dha $$3, BiConsumer<cxp, jh> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      dyj $$8 = $$0.c(c);
      jm $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != dyj.d) {
         return dko.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == dyj.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, dyj.c).b(b, $$4.g());
            }

            if ($$8 == dyj.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, dyj.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jm $$3 = q($$0).g();
      return $$3 == jm.b ? dkm.a($$1, $$2.d(), jm.a) : dnh.b($$1, $$2, $$3);
   }

   private static jm q(dxv $$0) {
      switch ((dyj)$$0.c(c)) {
         case a:
            return jm.b;
         case b:
            return jm.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dux a(jh $$0, dxv $$1) {
      return new duv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return a($$2, duz.F, $$0.C ? duv::a : duv::b);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   @Override
   public dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
