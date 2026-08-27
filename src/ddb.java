import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class ddb extends ddx {
   public static final MapCodec<ddb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doo.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, ddb::new)
   );
   public static final dns b = dnr.u;
   public static final dns c = dnr.w;
   public static final dns d = dnr.q;
   protected static final eqm e = dac.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eqm f = dac.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final eqm g = dac.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final eqm h = dac.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final eqm i = dac.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eqm j = dac.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eqm k = dac.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eqm l = dac.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eqm m = eqj.a(dac.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dac.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final eqm n = eqj.a(dac.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dac.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final eqm o = eqj.a(dac.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dac.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final eqm F = eqj.a(dac.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dac.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final doo G;

   @Override
   public MapCodec<ddb> a() {
      return a;
   }

   public ddb(doo $$0, dna.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ih.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ih.a.a ? f : e;
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      ih.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected eqm b_(dnb $$0, cwh $$1, ib $$2) {
      if ($$0.c(b)) {
         return eqj.a();
      } else {
         return $$0.c(aE).o() == ih.a.c ? k : l;
      }
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      if ($$0.c(b)) {
         return eqj.a();
      } else {
         return $$0.c(aE).o() == ih.a.c ? i : j;
      }
   }

   @Override
   protected eqm f(dnb $$0, cwh $$1, ib $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ih.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ih.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      switch ($$3) {
         case a:
            return $$0.c(b);
         case b:
            return false;
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public dnb a(csu $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      ih $$4 = $$0.g();
      ih.a $$5 = $$4.o();
      boolean $$6 = $$5 == ih.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == ih.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dnb $$0) {
      return $$0.a(aun.L);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ih $$5 = $$3.cE();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), atz.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? drp.h : drp.d, $$2);
      return bnd.a($$1.B);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, cwt $$3, BiConsumer<cqm, ib> $$4) {
      if ($$3.j() == cwt.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), atz.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? drp.d : drp.h, $$2, drp.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), atz.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? drp.h : drp.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dnb $$0, ih $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
