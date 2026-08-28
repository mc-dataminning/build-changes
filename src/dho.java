import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dho extends dfi {
   public static final MapCodec<dho> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dta.a.fieldOf("block_set_type").forGetter(dho::b), u()).apply($$0, dho::new)
   );
   public static final dtf b = dje.aE;
   public static final dtc c = dtb.u;
   public static final dtj<dtg> d = dtb.be;
   public static final dtc e = dtb.w;
   public static final dtj<dth> f = dtb.ae;
   protected static final float g = 3.0F;
   protected static final exa h = dfi.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final exa i = dfi.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final exa j = dfi.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exa k = dfi.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dta l;

   @Override
   public MapCodec<? extends dho> a() {
      return a;
   }

   protected dho(dta $$0, dsk.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)).a(d, dtg.a).a(e, Boolean.valueOf(false)).a(f, dth.b));
   }

   public dta b() {
      return this.l;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      jf $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dtg.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      dth $$6 = $$0.c(f);
      if ($$1.o() != jf.a.b || $$6 == dth.b != ($$1 == jf.b)) {
         return $$6 == dth.b && $$1 == jf.a && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dho && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dfk.a.o();
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dby $$3, BiConsumer<cud, ja> $$4) {
      if ($$3.n() && $$0.c(f) == dth.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dsl a(dcg $$0, ja $$1, dsl $$2, cml $$3) {
      if (!$$0.B && ($$3.f() || !$$3.d($$2))) {
         dhq.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      ja $$1 = $$0.a();
      dcg $$2 = $$0.q();
      if ($$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dth.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, btc $$3, cud $$4) {
      $$0.a($$1.c(), $$2.a(f, dth.a), 3);
   }

   private dtg b(cxn $$0) {
      dbm $$1 = $$0.q();
      ja $$2 = $$0.a();
      jf $$3 = $$0.g();
      ja $$4 = $$2.c();
      jf $$5 = $$3.i();
      ja $$6 = $$2.a($$5);
      dsl $$7 = $$1.a_($$6);
      ja $$8 = $$4.a($$5);
      dsl $$9 = $$1.a_($$8);
      jf $$10 = $$3.h();
      ja $$11 = $$2.a($$10);
      dsl $$12 = $$1.a_($$11);
      ja $$13 = $$4.a($$10);
      dsl $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dth.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dth.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ewh $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dtg.a : dtg.b;
         } else {
            return dtg.a;
         }
      } else {
         return dtg.b;
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if (!this.l.c()) {
         return bqh.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dxh.h : dxh.d, $$2);
         return bqh.a($$1.B);
      }
   }

   public boolean m(dsl $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bsh $$0, dcg $$1, dsl $$2, ja $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dxh.h : dxh.d, $$3);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dth.b ? jf.b : jf.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dxh.h : dxh.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      ja $$3 = $$2.d();
      dsl $$4 = $$1.a_($$3);
      return $$0.c(f) == dth.b ? $$4.d($$1, $$3, jf.b) : $$4.a(this);
   }

   private void a(@Nullable bsh $$0, dcg $$1, ja $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$1 == dkf.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dsl $$0, ja $$1) {
      return ayg.b($$1.u(), $$1.c($$0.c(f) == dth.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dcg $$0, ja $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dsl $$0) {
      if ($$0.b() instanceof dho $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
