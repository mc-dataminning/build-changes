import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dbl extends czf {
   public static final MapCodec<dbl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmt.a.fieldOf("block_set_type").forGetter(dbl::b), u()).apply($$0, dbl::new)
   );
   public static final dmy b = dda.aE;
   public static final dmv c = dmu.u;
   public static final dnc<dmz> d = dmu.be;
   public static final dmv e = dmu.w;
   public static final dnc<dna> f = dmu.ae;
   protected static final float g = 3.0F;
   protected static final epo h = czf.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final epo i = czf.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final epo j = czf.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final epo k = czf.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dmt l;

   @Override
   public MapCodec<? extends dbl> a() {
      return a;
   }

   protected dbl(dmt $$0, dmd.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)).a(d, dmz.a).a(e, Boolean.valueOf(false)).a(f, dna.b));
   }

   public dmt b() {
      return this.l;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      ih $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dmz.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      dna $$6 = $$0.c(f);
      if ($$1.o() != ih.a.b || $$6 == dna.b != ($$1 == ih.b)) {
         return $$6 == dna.b && $$1 == ih.a && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dbl && $$2.c(f) != $$6 ? $$2.a(f, $$6) : czh.a.o();
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, cvw $$3, BiConsumer<cpq, ib> $$4) {
      if ($$3.j() == cvw.a.d && $$0.c(f) == dna.b && !$$1.y_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dme a(cwe $$0, ib $$1, dme $$2, cia $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dbn.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return switch ($$3) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ib $$1 = $$0.a();
      cwe $$2 = $$0.q();
      if ($$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dna.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      $$0.a($$1.c(), $$2.a(f, dna.a), 3);
   }

   private dmz b(crx $$0) {
      cvk $$1 = $$0.q();
      ib $$2 = $$0.a();
      ih $$3 = $$0.g();
      ib $$4 = $$2.c();
      ih $$5 = $$3.i();
      ib $$6 = $$2.a($$5);
      dme $$7 = $$1.a_($$6);
      ib $$8 = $$4.a($$5);
      dme $$9 = $$1.a_($$8);
      ih $$10 = $$3.h();
      ib $$11 = $$2.a($$10);
      dme $$12 = $$1.a_($$11);
      ib $$13 = $$4.a($$10);
      dme $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dna.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dna.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            eov $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dmz.a : dmz.b;
         } else {
            return dmz.a;
         }
      } else {
         return dmz.b;
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if (!this.l.c()) {
         return bml.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dqr.h : dqr.d, $$2);
         return bml.a($$1.B);
      }
   }

   public boolean m(dme $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bof $$0, cwe $$1, dme $$2, ib $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dqr.h : dqr.d, $$3);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dna.b ? ih.b : ih.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dqr.h : dqr.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.d();
      dme $$4 = $$1.a_($$3);
      return $$0.c(f) == dna.b ? $$4.d($$1, $$3, ih.b) : $$4.a(this);
   }

   private void a(@Nullable bof $$0, cwe $$1, ib $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), atq.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$1 == deb.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dme $$0, ib $$1) {
      return awm.b($$1.u(), $$1.c($$0.c(f) == dna.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(cwe $$0, ib $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dme $$0) {
      if ($$0.b() instanceof dbl $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
