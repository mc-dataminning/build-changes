import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhn extends dfh {
   public static final MapCodec<dhn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsz.a.fieldOf("block_set_type").forGetter(dhn::b), u()).apply($$0, dhn::new)
   );
   public static final dte b = djd.aE;
   public static final dtb c = dta.u;
   public static final dti<dtf> d = dta.be;
   public static final dtb e = dta.w;
   public static final dti<dtg> f = dta.ae;
   protected static final float g = 3.0F;
   protected static final ewy h = dfh.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewy i = dfh.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewy j = dfh.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewy k = dfh.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dsz l;

   @Override
   public MapCodec<? extends dhn> a() {
      return a;
   }

   protected dhn(dsz $$0, dsj.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)).a(d, dtf.a).a(e, Boolean.valueOf(false)).a(f, dtg.b));
   }

   public dsz b() {
      return this.l;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      jf $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dtf.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      dtg $$6 = $$0.c(f);
      if ($$1.o() != jf.a.b || $$6 == dtg.b != ($$1 == jf.b)) {
         return $$6 == dtg.b && $$1 == jf.a && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dhn && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dfj.a.o();
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dbx $$3, BiConsumer<cuc, ja> $$4) {
      if ($$3.n() && $$0.c(f) == dtg.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dsk a(dcf $$0, ja $$1, dsk $$2, cmk $$3) {
      if (!$$0.B && ($$3.f() || !$$3.d($$2))) {
         dhp.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      ja $$1 = $$0.a();
      dcf $$2 = $$0.q();
      if ($$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dtg.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, btb $$3, cuc $$4) {
      $$0.a($$1.c(), $$2.a(f, dtg.a), 3);
   }

   private dtf b(cxm $$0) {
      dbl $$1 = $$0.q();
      ja $$2 = $$0.a();
      jf $$3 = $$0.g();
      ja $$4 = $$2.c();
      jf $$5 = $$3.i();
      ja $$6 = $$2.a($$5);
      dsk $$7 = $$1.a_($$6);
      ja $$8 = $$4.a($$5);
      dsk $$9 = $$1.a_($$8);
      jf $$10 = $$3.h();
      ja $$11 = $$2.a($$10);
      dsk $$12 = $$1.a_($$11);
      ja $$13 = $$4.a($$10);
      dsk $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dtg.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dtg.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ewf $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dtf.a : dtf.b;
         } else {
            return dtf.a;
         }
      } else {
         return dtf.b;
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if (!this.l.c()) {
         return bqg.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dxg.h : dxg.d, $$2);
         return bqg.a($$1.B);
      }
   }

   public boolean m(dsk $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bsg $$0, dcf $$1, dsk $$2, ja $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dxg.h : dxg.d, $$3);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dtg.b ? jf.b : jf.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dxg.h : dxg.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.d();
      dsk $$4 = $$1.a_($$3);
      return $$0.c(f) == dtg.b ? $$4.d($$1, $$3, jf.b) : $$4.a(this);
   }

   private void a(@Nullable bsg $$0, dcf $$1, ja $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$1 == dke.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dsk $$0, ja $$1) {
      return ayg.b($$1.u(), $$1.c($$0.c(f) == dtg.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dcf $$0, ja $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dsk $$0) {
      if ($$0.b() instanceof dhn $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
