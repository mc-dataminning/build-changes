import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dji extends diy {
   public static final MapCodec<dji> a = b(dji::new);
   public static final dxu<jn> b = dnk.aF;
   public static final dxu<dxl> c = dxn.Y;
   public static final dxo d = dxn.B;
   private static final fbu f = djm.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final fbu g = djm.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final fbu h = djm.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final fbu i = djm.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final fbu j = fbr.a(i, h);
   private static final fbu k = fbr.a(j, djm.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final fbu l = fbr.a(j, djm.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fbu m = fbr.a(j, djm.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final fbu n = fbr.a(j, djm.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fbu o = fbr.a(j, djm.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final fbu G = fbr.a(j, djm.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final fbu H = fbr.a(j, djm.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   public dji(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, dxl.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dgi $$0, dwx $$1, faw $$2, cpq $$3) {
      buk $$4 = $$3.p();
      cox $$5 = $$4 instanceof cox ? (cox)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      return (bsj)(this.a($$1, $$0, $$4, $$3, true) ? bsj.a : bsj.e);
   }

   public boolean a(dgi $$0, dwx $$1, faw $$2, @Nullable cox $$3, boolean $$4) {
      jn $$5 = $$2.c();
      ji $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awk.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dwx $$0, jn $$1, double $$2) {
      if ($$1.o() != jn.a.b && !($$2 > 0.8124F)) {
         jn $$3 = $$0.c(b);
         dxl $$4 = $$0.c(c);
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

   public boolean a(dgi $$0, ji $$1, @Nullable jn $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable buk $$0, dgi $$1, ji $$2, @Nullable jn $$3) {
      dtz $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dtx) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dtx)$$4).a($$3);
         $$1.a(null, $$2, awa.bZ, awb.e, 2.0F, 1.0F);
         $$1.a($$0, ebt.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fbu o(dwx $$0) {
      jn $$1 = $$0.c(b);
      dxl $$2 = $$0.c(c);
      if ($$2 == dxl.a) {
         return $$1 != jn.c && $$1 != jn.d ? g : f;
      } else if ($$2 == dxl.b) {
         return H;
      } else if ($$2 == dxl.d) {
         return $$1 != jn.c && $$1 != jn.d ? l : k;
      } else if ($$1 == jn.c) {
         return o;
      } else if ($$1 == jn.d) {
         return G;
      } else {
         return $$1 == jn.f ? n : m;
      }
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.o($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.o($$0);
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      jn $$1 = $$0.k();
      ji $$2 = $$0.a();
      dgi $$3 = $$0.q();
      jn.a $$4 = $$1.o();
      if ($$4 == jn.a.b) {
         dwx $$5 = this.m().b(c, $$1 == jn.a ? dxl.b : dxl.a).b(b, $$0.g());
         if ($$5.a((dgl)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jn.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jn.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jn.e)
            || $$4 == jn.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jn.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jn.c);
         dwx $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dxl.d : dxl.c);
         if ($$7.a((dgl)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jn.b);
         $$7 = $$7.b(c, $$8 ? dxl.a : dxl.b);
         if ($$7.a((dgl)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, dga $$3, BiConsumer<cwp, ji> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      dxl $$8 = $$0.c(c);
      jn $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != dxl.d) {
         return djo.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == dxl.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, dxl.c).b(b, $$4.g());
            }

            if ($$8 == dxl.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, dxl.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      jn $$3 = q($$0).g();
      return $$3 == jn.b ? djm.a($$1, $$2.d(), jn.a) : dmh.b($$1, $$2, $$3);
   }

   private static jn q(dwx $$0) {
      switch ((dxl)$$0.c(c)) {
         case a:
            return jn.b;
         case b:
            return jn.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dtx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return a($$2, dub.F, $$0.C ? dtx::a : dtx::b);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   @Override
   public dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
