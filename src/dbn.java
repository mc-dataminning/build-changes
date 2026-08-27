import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dbn extends dcj {
   public static final MapCodec<dbn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dms.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dbn::new)
   );
   public static final dlw b = dlv.u;
   public static final dlw c = dlv.w;
   public static final dlw d = dlv.q;
   protected static final eol e = cyo.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eol f = cyo.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final eol g = cyo.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final eol h = cyo.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final eol i = cyo.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eol j = cyo.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eol k = cyo.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eol l = cyo.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eol m = eoi.a(cyo.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), cyo.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final eol n = eoi.a(cyo.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), cyo.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final eol o = eoi.a(cyo.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), cyo.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final eol F = eoi.a(cyo.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), cyo.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dms G;

   @Override
   public MapCodec<dbn> a() {
      return a;
   }

   public dbn(dms $$0, dle.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ie.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ie.a.a ? f : e;
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      ie.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected eol b_(dlf $$0, cut $$1, hz $$2) {
      if ($$0.c(b)) {
         return eoi.a();
      } else {
         return $$0.c(aE).o() == ie.a.c ? k : l;
      }
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      if ($$0.c(b)) {
         return eoi.a();
      } else {
         return $$0.c(aE).o() == ie.a.c ? i : j;
      }
   }

   @Override
   protected eol f(dlf $$0, cut $$1, hz $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ie.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ie.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
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
   public dlf a(crg $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      ie $$4 = $$0.g();
      ie.a $$5 = $$4.o();
      boolean $$6 = $$5 == ie.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == ie.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dlf $$0) {
      return $$0.a(atz.L);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ie $$5 = $$3.cE();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), atl.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dpp.h : dpp.d, $$2);
      return blu.a($$1.B);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cvf $$3, BiConsumer<coz, hz> $$4) {
      if ($$3.j() == cvf.a.d && !$$1.y_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), atl.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dpp.d : dpp.h, $$2, dpp.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), atl.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dpp.h : dpp.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dlf $$0, ie $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
