import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class ddu extends ddk {
   public static final MapCodec<ddu> a = b(ddu::new);
   public static final drv b = dhu.aE;
   public static final drz<drp> c = drr.V;
   public static final drs d = drr.w;
   private static final evd f = ddy.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final evd g = ddy.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final evd h = ddy.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final evd i = ddy.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final evd j = eva.a(i, h);
   private static final evd k = eva.a(j, ddy.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final evd l = eva.a(j, ddy.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final evd m = eva.a(j, ddy.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final evd n = eva.a(j, ddy.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final evd o = eva.a(j, ddy.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final evd F = eva.a(j, ddy.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final evd G = eva.a(j, ddy.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public ddu(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, drp.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dax $$0, drb $$1, eug $$2, cmo $$3) {
      bru $$4 = $$3.s();
      clw $$5 = $$4 instanceof clw ? (clw)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bpu.a($$1.B) : bpu.d;
   }

   public boolean a(dax $$0, drb $$1, eug $$2, @Nullable clw $$3, boolean $$4) {
      it $$5 = $$2.b();
      io $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(avr.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(drb $$0, it $$1, double $$2) {
      if ($$1.o() != it.a.b && !($$2 > 0.8124F)) {
         it $$3 = $$0.c(b);
         drp $$4 = $$0.c(c);
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

   public boolean a(dax $$0, io $$1, @Nullable it $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bru $$0, dax $$1, io $$2, @Nullable it $$3) {
      dog $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof doe) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((doe)$$4).a($$3);
         $$1.a(null, $$2, avh.bZ, avi.e, 2.0F, 1.0F);
         $$1.a($$0, dvu.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private evd m(drb $$0) {
      it $$1 = $$0.c(b);
      drp $$2 = $$0.c(c);
      if ($$2 == drp.a) {
         return $$1 != it.c && $$1 != it.d ? g : f;
      } else if ($$2 == drp.b) {
         return G;
      } else if ($$2 == drp.d) {
         return $$1 != it.c && $$1 != it.d ? l : k;
      } else if ($$1 == it.c) {
         return o;
      } else if ($$1 == it.d) {
         return F;
      } else {
         return $$1 == it.f ? n : m;
      }
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.m($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.m($$0);
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      it $$1 = $$0.k();
      io $$2 = $$0.a();
      dax $$3 = $$0.q();
      it.a $$4 = $$1.o();
      if ($$4 == it.a.b) {
         drb $$5 = this.n().a(c, $$1 == it.a ? drp.b : drp.a).a(b, $$0.g());
         if ($$5.a((dba)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == it.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), it.f) && $$3.a_($$2.h()).d($$3, $$2.h(), it.e)
            || $$4 == it.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), it.d) && $$3.a_($$2.f()).d($$3, $$2.f(), it.c);
         drb $$7 = this.n().a(b, $$1.g()).a(c, $$6 ? drp.d : drp.c);
         if ($$7.a((dba)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), it.b);
         $$7 = $$7.a(c, $$8 ? drp.a : drp.b);
         if ($$7.a((dba)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, dap $$3, BiConsumer<cto, io> $$4) {
      if ($$3.j() == dap.a.d && !$$1.x_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      drp $$6 = $$0.c(c);
      it $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != drp.d) {
         return dea.a.n();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == drp.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, drp.c).a(b, $$1.g());
            }

            if ($$6 == drp.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, drp.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      it $$3 = n($$0).g();
      return $$3 == it.b ? ddy.a($$1, $$2.c(), it.a) : dgs.b($$1, $$2, $$3);
   }

   private static it n(drb $$0) {
      switch ((drp)$$0.c(c)) {
         case a:
            return it.b;
         case b:
            return it.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return new doe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return a($$2, doi.E, $$0.B ? doe::a : doe::b);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   @Override
   public drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
