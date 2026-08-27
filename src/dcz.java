import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dcz extends ddv {
   public static final MapCodec<dcz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dom.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dcz::new)
   );
   public static final dnq b = dnp.u;
   public static final dnq c = dnp.w;
   public static final dnq d = dnp.q;
   protected static final eqk e = daa.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eqk f = daa.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final eqk g = daa.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final eqk h = daa.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final eqk i = daa.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eqk j = daa.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eqk k = daa.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eqk l = daa.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eqk m = eqh.a(daa.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), daa.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final eqk n = eqh.a(daa.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), daa.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final eqk o = eqh.a(daa.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), daa.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final eqk F = eqh.a(daa.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), daa.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dom G;

   @Override
   public MapCodec<dcz> a() {
      return a;
   }

   public dcz(dom $$0, dmy.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ih.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ih.a.a ? f : e;
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      ih.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected eqk b_(dmz $$0, cwf $$1, ib $$2) {
      if ($$0.c(b)) {
         return eqh.a();
      } else {
         return $$0.c(aE).o() == ih.a.c ? k : l;
      }
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      if ($$0.c(b)) {
         return eqh.a();
      } else {
         return $$0.c(aE).o() == ih.a.c ? i : j;
      }
   }

   @Override
   protected eqk f(dmz $$0, cwf $$1, ib $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ih.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ih.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
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
   public dmz a(css $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      ih $$4 = $$0.g();
      ih.a $$5 = $$4.o();
      boolean $$6 = $$5 == ih.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == ih.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dmz $$0) {
      return $$0.a(aun.L);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
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
      $$1.a($$3, $$6 ? drn.h : drn.d, $$2);
      return bnc.a($$1.B);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, cwr $$3, BiConsumer<cqk, ib> $$4) {
      if ($$3.j() == cwr.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), atz.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? drn.d : drn.h, $$2, drn.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), atz.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? drn.h : drn.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dmz $$0, ih $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
