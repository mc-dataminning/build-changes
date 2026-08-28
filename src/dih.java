import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dih extends dje {
   public static final MapCodec<dih> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dty.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dih::new)
   );
   public static final dtc b = dtb.u;
   public static final dtc c = dtb.w;
   public static final dtc d = dtb.q;
   protected static final exa e = dfi.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final exa f = dfi.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final exa g = dfi.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final exa h = dfi.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final exa i = dfi.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final exa j = dfi.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final exa k = dfi.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final exa l = dfi.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final exa m = ewx.a(dfi.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dfi.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final exa n = ewx.a(dfi.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dfi.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final exa o = ewx.a(dfi.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dfi.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final exa F = ewx.a(dfi.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dfi.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dty G;

   @Override
   public MapCodec<dih> a() {
      return a;
   }

   public dih(dty $$0, dsk.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == jf.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == jf.a.a ? f : e;
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      jf.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected exa b_(dsl $$0, dbm $$1, ja $$2) {
      if ($$0.c(b)) {
         return ewx.a();
      } else {
         return $$0.c(aE).o() == jf.a.c ? k : l;
      }
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      if ($$0.c(b)) {
         return ewx.a();
      } else {
         return $$0.c(aE).o() == jf.a.c ? i : j;
      }
   }

   @Override
   protected exa f(dsl $$0, dbm $$1, ja $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == jf.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == jf.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
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
   public dsl a(cxn $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jf $$4 = $$0.g();
      jf.a $$5 = $$4.o();
      boolean $$6 = $$5 == jf.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == jf.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dsl $$0) {
      return $$0.a(avw.L);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jf $$5 = $$3.cJ();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dxh.h : dxh.d, $$2);
      return bqh.a($$1.B);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dby $$3, BiConsumer<cud, ja> $$4) {
      if ($$3.n() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dxh.d : dxh.h, $$2, dxh.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dxh.h : dxh.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dsl $$0, jf $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
