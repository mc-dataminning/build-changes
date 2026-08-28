import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dhw extends dit {
   public static final MapCodec<dhw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtn.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dhw::new)
   );
   public static final dsr b = dsq.u;
   public static final dsr c = dsq.w;
   public static final dsr d = dsq.q;
   protected static final ewi e = dex.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ewi f = dex.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ewi g = dex.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ewi h = dex.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ewi i = dex.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ewi j = dex.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ewi k = dex.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ewi l = dex.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ewi m = ewf.a(dex.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dex.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ewi n = ewf.a(dex.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dex.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ewi o = ewf.a(dex.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dex.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ewi F = ewf.a(dex.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dex.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dtn G;

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   public dhw(dtn $$0, drz.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == je.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == je.a.a ? f : e;
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      je.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected ewi b_(dsa $$0, dbc $$1, iz $$2) {
      if ($$0.c(b)) {
         return ewf.a();
      } else {
         return $$0.c(aE).o() == je.a.c ? k : l;
      }
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      if ($$0.c(b)) {
         return ewf.a();
      } else {
         return $$0.c(aE).o() == je.a.c ? i : j;
      }
   }

   @Override
   protected ewi f(dsa $$0, dbc $$1, iz $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == je.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == je.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
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
   public dsa a(cxy $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      je $$4 = $$0.g();
      je.a $$5 = $$4.o();
      boolean $$6 = $$5 == je.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == je.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dsa $$0) {
      return $$0.a(awo.L);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         je $$5 = $$3.cH();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), awa.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dwt.h : dwt.d, $$2);
      return bqs.a($$1.B);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dbo $$3, BiConsumer<cun, iz> $$4) {
      if ($$3.j() == dbo.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), awa.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dwt.d : dwt.h, $$2, dwt.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), awa.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dwt.h : dwt.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dsa $$0, je $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
