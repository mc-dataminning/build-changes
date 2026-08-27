import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dex extends dft {
   public static final MapCodec<dex> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqm.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dex::new)
   );
   public static final dpq b = dpp.u;
   public static final dpq c = dpp.w;
   public static final dpq d = dpp.q;
   protected static final est e = dby.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final est f = dby.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final est g = dby.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final est h = dby.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final est i = dby.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final est j = dby.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final est k = dby.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final est l = dby.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final est m = esq.a(dby.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dby.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final est n = esq.a(dby.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dby.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final est o = esq.a(dby.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dby.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final est F = esq.a(dby.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dby.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dqm G;

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   public dex(dqm $$0, doy.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ih.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ih.a.a ? f : e;
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      ih.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected est b_(doz $$0, cyd $$1, ib $$2) {
      if ($$0.c(b)) {
         return esq.a();
      } else {
         return $$0.c(aE).o() == ih.a.c ? k : l;
      }
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      if ($$0.c(b)) {
         return esq.a();
      } else {
         return $$0.c(aE).o() == ih.a.c ? i : j;
      }
   }

   @Override
   protected est f(doz $$0, cyd $$1, ib $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ih.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ih.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      switch ($$1) {
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
   public doz a(cuo $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      ih $$4 = $$0.g();
      ih.a $$5 = $$4.o();
      boolean $$6 = $$5 == ih.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == ih.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.n().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(doz $$0) {
      return $$0.a(avc.L);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
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
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), aun.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dts.h : dts.d, $$2);
      return boa.a($$1.B);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, cyp $$3, BiConsumer<crj, ib> $$4) {
      if ($$3.j() == cyp.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), aun.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dts.d : dts.h, $$2, dts.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), aun.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dts.h : dts.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(doz $$0, ih $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
