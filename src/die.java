import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class die extends djb {
   public static final MapCodec<die> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtu.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, die::new)
   );
   public static final dsy b = dsx.u;
   public static final dsy c = dsx.w;
   public static final dsy d = dsx.q;
   protected static final ews e = dff.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ews f = dff.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ews g = dff.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ews h = dff.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ews i = dff.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ews j = dff.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ews k = dff.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ews l = dff.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ews m = ewp.a(dff.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dff.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ews n = ewp.a(dff.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dff.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ews o = ewp.a(dff.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dff.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ews F = ewp.a(dff.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dff.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dtu G;

   @Override
   public MapCodec<die> a() {
      return a;
   }

   public die(dtu $$0, dsg.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == jf.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == jf.a.a ? f : e;
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      jf.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected ews b_(dsh $$0, dbj $$1, ja $$2) {
      if ($$0.c(b)) {
         return ewp.a();
      } else {
         return $$0.c(aE).o() == jf.a.c ? k : l;
      }
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      if ($$0.c(b)) {
         return ewp.a();
      } else {
         return $$0.c(aE).o() == jf.a.c ? i : j;
      }
   }

   @Override
   protected ews f(dsh $$0, dbj $$1, ja $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == jf.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == jf.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
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
   public dsh a(cxk $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jf $$4 = $$0.g();
      jf.a $$5 = $$4.o();
      boolean $$6 = $$5 == jf.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == jf.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dsh $$0) {
      return $$0.a(avu.L);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jf $$5 = $$3.cH();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), avg.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dxa.h : dxa.d, $$2);
      return bqd.a($$1.B);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dbv $$3, BiConsumer<cua, ja> $$4) {
      if ($$3.n() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), avg.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dxa.d : dxa.h, $$2, dxa.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), avg.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dxa.h : dxa.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dsh $$0, jf $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
