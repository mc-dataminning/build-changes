import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djh extends ddy {
   public static final MapCodec<djh> a = b(djh::new);
   public static final drz<dsc> b = drr.bf;
   public static final drs c = drr.w;
   public static final dsb d = drr.aR;
   public static final int e = 3;

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsc.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private drb b(day $$0, io $$1, drb $$2) {
      dsc $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dsc $$4 = $$0.a_($$1.d()).A();
         dsc $$5 = $$4.e() ? dsc.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public drb a(cwz $$0) {
      return this.b($$0.q(), $$0.a(), this.n());
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      boolean $$6 = $$1.o() == it.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bru $$0, drb $$1, dax $$2, io $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dvu.H, $$3);
      }
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      return $$0.a(awe.bg) && $$6.b() == it.b ? bpw.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avr.ag);
         return bpu.b;
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, clw $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avr.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(drb $$0, dax $$1, io $$2, int $$3, int $$4) {
      dsc $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(ky.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ix<avg> $$10;
      if ($$5.d()) {
         akm $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ix.a(avg.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, avi.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private akm a(dax $$0, io $$1) {
      return $$0.c_($$1.c()) instanceof dps $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c, d);
   }
}
