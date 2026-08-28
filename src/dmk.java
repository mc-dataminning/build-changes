import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmk extends dfh implements dmi {
   public static final MapCodec<dmk> a = b(dmk::new);
   public static final dti<dts> b = dta.bh;
   public static final dtb c = dta.C;
   protected static final ewy d = dfh.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ewy e = dfh.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dmk> a() {
      return a;
   }

   public dmk(dsj.d $$0) {
      super($$0);
      this.k(this.o().a(b, dts.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsk $$0) {
      return $$0.c(b) != dts.c;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      dts $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ewv.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      ja $$1 = $$0.a();
      dsk $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dts.c).a(c, Boolean.valueOf(false));
      } else {
         eoh $$3 = $$0.q().b_($$1);
         dsk $$4 = this.o().a(b, dts.b).a(c, Boolean.valueOf($$3.a() == eoi.c));
         jf $$5 = $$0.k();
         return $$5 != jf.a && ($$5 == jf.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dts.a);
      }
   }

   @Override
   protected boolean a(dsk $$0, cxm $$1) {
      cuc $$2 = $$1.n();
      dts $$3 = $$0.c(b);
      if ($$3 == dts.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         jf $$5 = $$1.k();
         return $$3 == dts.b ? $$5 == jf.b || $$4 && $$5.o().d() : $$5 == jf.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(c) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dcg $$0, ja $$1, dsk $$2, eoh $$3) {
      return $$2.c(b) != dts.c ? dmi.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cmk $$0, dbl $$1, ja $$2, dsk $$3, eog $$4) {
      return $$3.c(b) != dts.c ? dmi.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(awc.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
