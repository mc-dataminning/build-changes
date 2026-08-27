import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dci extends dac {
   public static final MapCodec<dci> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnq.a.fieldOf("block_set_type").forGetter(dci::b), u()).apply($$0, dci::new)
   );
   public static final dnv b = ddx.aE;
   public static final dns c = dnr.u;
   public static final dnz<dnw> d = dnr.be;
   public static final dns e = dnr.w;
   public static final dnz<dnx> f = dnr.ae;
   protected static final float g = 3.0F;
   protected static final eqm h = dac.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eqm i = dac.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eqm j = dac.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eqm k = dac.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dnq l;

   @Override
   public MapCodec<? extends dci> a() {
      return a;
   }

   protected dci(dnq $$0, dna.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)).a(d, dnw.a).a(e, Boolean.valueOf(false)).a(f, dnx.b));
   }

   public dnq b() {
      return this.l;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      ih $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dnw.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      dnx $$6 = $$0.c(f);
      if ($$1.o() != ih.a.b || $$6 == dnx.b != ($$1 == ih.b)) {
         return $$6 == dnx.b && $$1 == ih.a && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dci && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dae.a.o();
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, cwt $$3, BiConsumer<cqm, ib> $$4) {
      if ($$3.j() == cwt.a.d && $$0.c(f) == dnx.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dnb a(cxb $$0, ib $$1, dnb $$2, ciu $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dck.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return switch ($$3) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      ib $$1 = $$0.a();
      cxb $$2 = $$0.q();
      if ($$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dnx.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      $$0.a($$1.c(), $$2.a(f, dnx.a), 3);
   }

   private dnw b(csu $$0) {
      cwh $$1 = $$0.q();
      ib $$2 = $$0.a();
      ih $$3 = $$0.g();
      ib $$4 = $$2.c();
      ih $$5 = $$3.i();
      ib $$6 = $$2.a($$5);
      dnb $$7 = $$1.a_($$6);
      ib $$8 = $$4.a($$5);
      dnb $$9 = $$1.a_($$8);
      ih $$10 = $$3.h();
      ib $$11 = $$2.a($$10);
      dnb $$12 = $$1.a_($$11);
      ib $$13 = $$4.a($$10);
      dnb $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dnx.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dnx.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ept $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dnw.a : dnw.b;
         } else {
            return dnw.a;
         }
      } else {
         return dnw.b;
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if (!this.l.c()) {
         return bnd.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? drp.h : drp.d, $$2);
         return bnd.a($$1.B);
      }
   }

   public boolean m(dnb $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable box $$0, cxb $$1, dnb $$2, ib $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? drp.h : drp.d, $$3);
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dnx.b ? ih.b : ih.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? drp.h : drp.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ib $$3 = $$2.d();
      dnb $$4 = $$1.a_($$3);
      return $$0.c(f) == dnx.b ? $$4.d($$1, $$3, ih.b) : $$4.a(this);
   }

   private void a(@Nullable box $$0, cxb $$1, ib $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), atz.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$1 == dey.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dnb $$0, ib $$1) {
      return aww.b($$1.u(), $$1.c($$0.c(f) == dnx.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(cxb $$0, ib $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dnb $$0) {
      if ($$0.b() instanceof dci $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
