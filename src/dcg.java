import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dcg extends daa {
   public static final MapCodec<dcg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dno.a.fieldOf("block_set_type").forGetter(dcg::b), u()).apply($$0, dcg::new)
   );
   public static final dnt b = ddv.aE;
   public static final dnq c = dnp.u;
   public static final dnx<dnu> d = dnp.be;
   public static final dnq e = dnp.w;
   public static final dnx<dnv> f = dnp.ae;
   protected static final float g = 3.0F;
   protected static final eqk h = daa.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eqk i = daa.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eqk j = daa.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eqk k = daa.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dno l;

   @Override
   public MapCodec<? extends dcg> a() {
      return a;
   }

   protected dcg(dno $$0, dmy.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)).a(d, dnu.a).a(e, Boolean.valueOf(false)).a(f, dnv.b));
   }

   public dno b() {
      return this.l;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      ih $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dnu.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      dnv $$6 = $$0.c(f);
      if ($$1.o() != ih.a.b || $$6 == dnv.b != ($$1 == ih.b)) {
         return $$6 == dnv.b && $$1 == ih.a && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dcg && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dac.a.o();
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, cwr $$3, BiConsumer<cqk, ib> $$4) {
      if ($$3.j() == cwr.a.d && $$0.c(f) == dnv.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dmz a(cwz $$0, ib $$1, dmz $$2, cis $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dci.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return switch ($$3) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ib $$1 = $$0.a();
      cwz $$2 = $$0.q();
      if ($$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dnv.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      $$0.a($$1.c(), $$2.a(f, dnv.a), 3);
   }

   private dnu b(css $$0) {
      cwf $$1 = $$0.q();
      ib $$2 = $$0.a();
      ih $$3 = $$0.g();
      ib $$4 = $$2.c();
      ih $$5 = $$3.i();
      ib $$6 = $$2.a($$5);
      dmz $$7 = $$1.a_($$6);
      ib $$8 = $$4.a($$5);
      dmz $$9 = $$1.a_($$8);
      ih $$10 = $$3.h();
      ib $$11 = $$2.a($$10);
      dmz $$12 = $$1.a_($$11);
      ib $$13 = $$4.a($$10);
      dmz $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dnv.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dnv.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            epr $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dnu.a : dnu.b;
         } else {
            return dnu.a;
         }
      } else {
         return dnu.b;
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if (!this.l.c()) {
         return bnc.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? drn.h : drn.d, $$2);
         return bnc.a($$1.B);
      }
   }

   public boolean m(dmz $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bow $$0, cwz $$1, dmz $$2, ib $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? drn.h : drn.d, $$3);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dnv.b ? ih.b : ih.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? drn.h : drn.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.d();
      dmz $$4 = $$1.a_($$3);
      return $$0.c(f) == dnv.b ? $$4.d($$1, $$3, ih.b) : $$4.a(this);
   }

   private void a(@Nullable bow $$0, cwz $$1, ib $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), atz.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$1 == dew.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dmz $$0, ib $$1) {
      return aww.b($$1.u(), $$1.c($$0.c(f) == dnv.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(cwz $$0, ib $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dmz $$0) {
      if ($$0.b() instanceof dcg $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
