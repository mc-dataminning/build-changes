import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhj extends dfc {
   public static final MapCodec<dhj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtr.a.fieldOf("block_set_type").forGetter(dhj::b), u()).apply($$0, dhj::new)
   );
   public static final dtw b = djc.aE;
   public static final dtt c = dts.u;
   public static final dua<dtx> d = dts.be;
   public static final dtt e = dts.w;
   public static final dua<dty> f = dts.ae;
   protected static final float g = 3.0F;
   protected static final exn h = dfc.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final exn i = dfc.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final exn j = dfc.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exn k = dfc.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dtr l;

   public static boolean a(dca $$0, ir $$1) {
      return $$0.C($$1) || $$0.C($$1.c());
   }

   @Override
   public MapCodec<? extends dhj> a() {
      return a;
   }

   protected dhj(dtr $$0, dtb.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, iw.c).a(c, Boolean.valueOf(false)).a(d, dtx.a).a(e, Boolean.valueOf(false)).a(f, dty.b));
   }

   public dtr b() {
      return this.l;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      iw $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dtx.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      dty $$6 = $$0.c(f);
      if ($$1.o() != iw.a.b || $$6 == dty.b != ($$1 == iw.b)) {
         return $$6 == dty.b && $$1 == iw.a && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dhj && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dfe.a.n();
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dbs $$3, BiConsumer<cuh, ir> $$4) {
      if ($$3.j() == dbs.a.d && $$0.c(f) == dty.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dtc a(dca $$0, ir $$1, dtc $$2, cly $$3) {
      if (!$$0.C && ($$3.f() || !$$3.e($$2))) {
         dhl.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      ir $$1 = $$0.a();
      dca $$2 = $$0.q();
      if ($$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = a($$2, $$1);
         return this.n().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dty.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, bso $$3, cuh $$4) {
      $$0.a($$1.c(), $$2.a(f, dty.a), 3);
   }

   private dtx b(cyd $$0) {
      dbg $$1 = $$0.q();
      ir $$2 = $$0.a();
      iw $$3 = $$0.g();
      ir $$4 = $$2.c();
      iw $$5 = $$3.i();
      ir $$6 = $$2.a($$5);
      dtc $$7 = $$1.a_($$6);
      ir $$8 = $$4.a($$5);
      dtc $$9 = $$1.a_($$8);
      iw $$10 = $$3.h();
      ir $$11 = $$2.a($$10);
      dtc $$12 = $$1.a_($$11);
      ir $$13 = $$4.a($$10);
      dtc $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dty.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dty.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ewu $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dtx.a : dtx.b;
         } else {
            return dtx.a;
         }
      } else {
         return dtx.b;
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if (!this.l.c()) {
         return bqa.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dxv.h : dxv.d, $$2);
         return bqa.a($$1.C);
      }
   }

   public boolean m(dtc $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable brv $$0, dca $$1, dtc $$2, ir $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dxv.h : dxv.d, $$3);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dty.b ? iw.b : iw.a));
      if (!this.n().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dxv.h : dxv.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.d();
      dtc $$4 = $$1.a_($$3);
      return $$0.c(f) == dty.b ? $$4.d($$1, $$3, iw.b) : $$4.a(this);
   }

   private void a(@Nullable brv $$0, dca $$1, ir $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), avq.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$1 == dke.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dtc $$0, ir $$1) {
      return aym.b($$1.u(), $$1.c($$0.c(f) == dty.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean b(dca $$0, ir $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dtc $$0) {
      if ($$0.b() instanceof dhj $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
