import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhh extends dfb {
   public static final MapCodec<dhh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dst.a.fieldOf("block_set_type").forGetter(dhh::b), u()).apply($$0, dhh::new)
   );
   public static final dsy b = dix.aE;
   public static final dsv c = dsu.u;
   public static final dtc<dsz> d = dsu.be;
   public static final dsv e = dsu.w;
   public static final dtc<dta> f = dsu.ae;
   protected static final float g = 3.0F;
   protected static final ewm h = dfb.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewm i = dfb.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewm j = dfb.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewm k = dfb.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dst l;

   @Override
   public MapCodec<? extends dhh> a() {
      return a;
   }

   protected dhh(dst $$0, dsd.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, dsz.a).a(e, Boolean.valueOf(false)).a(f, dta.b));
   }

   public dst b() {
      return this.l;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      je $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dsz.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      dta $$6 = $$0.c(f);
      if ($$1.o() != je.a.b || $$6 == dta.b != ($$1 == je.b)) {
         return $$6 == dta.b && $$1 == je.a && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dhh && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dfd.a.o();
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dbs $$3, BiConsumer<cur, iz> $$4) {
      if ($$3.j() == dbs.a.d && $$0.c(f) == dta.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dse a(dca $$0, iz $$1, dse $$2, cmz $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dhj.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      iz $$1 = $$0.a();
      dca $$2 = $$0.q();
      if ($$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dta.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, btr $$3, cur $$4) {
      $$0.a($$1.c(), $$2.a(f, dta.a), 3);
   }

   private dsz b(cyc $$0) {
      dbg $$1 = $$0.q();
      iz $$2 = $$0.a();
      je $$3 = $$0.g();
      iz $$4 = $$2.c();
      je $$5 = $$3.i();
      iz $$6 = $$2.a($$5);
      dse $$7 = $$1.a_($$6);
      iz $$8 = $$4.a($$5);
      dse $$9 = $$1.a_($$8);
      je $$10 = $$3.h();
      iz $$11 = $$2.a($$10);
      dse $$12 = $$1.a_($$11);
      iz $$13 = $$4.a($$10);
      dse $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dta.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dta.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            evt $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dsz.a : dsz.b;
         } else {
            return dsz.a;
         }
      } else {
         return dsz.b;
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if (!this.l.c()) {
         return bqw.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dwx.h : dwx.d, $$2);
         return bqw.a($$1.B);
      }
   }

   public boolean m(dse $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bsw $$0, dca $$1, dse $$2, iz $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dwx.h : dwx.d, $$3);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dta.b ? je.b : je.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dwx.h : dwx.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      iz $$3 = $$2.d();
      dse $$4 = $$1.a_($$3);
      return $$0.c(f) == dta.b ? $$4.d($$1, $$3, je.b) : $$4.a(this);
   }

   private void a(@Nullable bsw $$0, dca $$1, iz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awb.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$1 == djy.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dse $$0, iz $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(f) == dta.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dca $$0, iz $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dse $$0) {
      if ($$0.b() instanceof dhh $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
