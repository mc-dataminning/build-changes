import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dfg extends dgc {
   public static final MapCodec<dfg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqv.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dfg::new)
   );
   public static final dpz b = dpy.u;
   public static final dpz c = dpy.w;
   public static final dpz d = dpy.q;
   protected static final etc e = dch.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final etc f = dch.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final etc g = dch.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final etc h = dch.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final etc i = dch.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final etc j = dch.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final etc k = dch.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final etc l = dch.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final etc m = esz.a(dch.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dch.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final etc n = esz.a(dch.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dch.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final etc o = esz.a(dch.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dch.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final etc F = esz.a(dch.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dch.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dqv G;

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   public dfg(dqv $$0, dph.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ij.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ij.a.a ? f : e;
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      ij.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected etc b_(dpi $$0, cym $$1, id $$2) {
      if ($$0.c(b)) {
         return esz.a();
      } else {
         return $$0.c(aE).o() == ij.a.c ? k : l;
      }
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      if ($$0.c(b)) {
         return esz.a();
      } else {
         return $$0.c(aE).o() == ij.a.c ? i : j;
      }
   }

   @Override
   protected etc f(dpi $$0, cym $$1, id $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ij.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ij.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
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
   public dpi a(cux $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      ij $$4 = $$0.g();
      ij.a $$5 = $$4.o();
      boolean $$6 = $$5 == ij.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == ij.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.n().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dpi $$0) {
      return $$0.a(ave.L);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ij $$5 = $$3.cE();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), aup.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dub.h : dub.d, $$2);
      return bof.a($$1.B);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, cyy $$3, BiConsumer<crs, id> $$4) {
      if ($$3.j() == cyy.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), aup.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dub.d : dub.h, $$2, dub.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), aup.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dub.h : dub.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dpi $$0, ij $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
