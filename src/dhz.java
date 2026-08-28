import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dhz extends diw {
   public static final MapCodec<dhz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtq.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dhz::new)
   );
   public static final dsu b = dst.u;
   public static final dsu c = dst.w;
   public static final dsu d = dst.q;
   protected static final ewl e = dfa.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ewl f = dfa.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ewl g = dfa.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ewl h = dfa.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ewl i = dfa.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ewl j = dfa.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ewl k = dfa.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ewl l = dfa.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ewl m = ewi.a(dfa.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dfa.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ewl n = ewi.a(dfa.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dfa.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ewl o = ewi.a(dfa.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dfa.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ewl F = ewi.a(dfa.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dfa.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dtq G;

   @Override
   public MapCodec<dhz> a() {
      return a;
   }

   public dhz(dtq $$0, dsc.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == je.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == je.a.a ? f : e;
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      je.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected ewl b_(dsd $$0, dbf $$1, iz $$2) {
      if ($$0.c(b)) {
         return ewi.a();
      } else {
         return $$0.c(aE).o() == je.a.c ? k : l;
      }
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      if ($$0.c(b)) {
         return ewi.a();
      } else {
         return $$0.c(aE).o() == je.a.c ? i : j;
      }
   }

   @Override
   protected ewl f(dsd $$0, dbf $$1, iz $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == je.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == je.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
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
   public dsd a(cyb $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      je $$4 = $$0.g();
      je.a $$5 = $$4.o();
      boolean $$6 = $$5 == je.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == je.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dsd $$0) {
      return $$0.a(awp.L);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
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
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), awb.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dww.h : dww.d, $$2);
      return bqv.a($$1.B);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dbr $$3, BiConsumer<cuq, iz> $$4) {
      if ($$3.j() == dbr.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), awb.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dww.d : dww.h, $$2, dww.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), awb.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dww.h : dww.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dsd $$0, je $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
