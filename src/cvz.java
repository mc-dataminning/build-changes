import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cvz extends cww {
   public static final MapCodec<cvz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgq.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), t()).apply($$0, cvz::new)
   );
   public static final dfu b = dft.u;
   public static final dfu c = dft.w;
   public static final dfu d = dft.q;
   protected static final eia e = ctc.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eia f = ctc.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final eia g = ctc.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final eia h = ctc.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final eia i = ctc.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eia j = ctc.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eia k = ctc.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eia l = ctc.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eia m = ehx.a(ctc.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), ctc.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final eia n = ehx.a(ctc.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), ctc.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final eia o = ehx.a(ctc.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), ctc.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final eia F = ehx.a(ctc.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), ctc.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dgq G;

   @Override
   public MapCodec<cvz> a() {
      return a;
   }

   public cvz(dgq $$0, dfc.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ha.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ha.a.a ? f : e;
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      ha.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   public eia b_(dfd $$0, cph $$1, gw $$2) {
      if ($$0.c(b)) {
         return ehx.a();
      } else {
         return $$0.c(aE).o() == ha.a.c ? k : l;
      }
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      if ($$0.c(b)) {
         return ehx.a();
      } else {
         return $$0.c(aE).o() == ha.a.c ? i : j;
      }
   }

   @Override
   public eia f(dfd $$0, cph $$1, gw $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ha.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ha.a.a ? n : m;
      }
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
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
   public dfd a(clt $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      ha $$4 = $$0.g();
      ha.a $$5 = $$4.o();
      boolean $$6 = $$5 == ha.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == ha.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean h(dfd $$0) {
      return $$0.a(apv.L);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ha $$6 = $$3.cD();
         if ($$0.c(aE) == $$6.g()) {
            $$0 = $$0.a(aE, $$6);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$7 = $$0.c(b);
      $$1.a($$3, $$2, $$7 ? this.G.g() : this.G.f(), aph.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? djn.h : djn.d, $$2);
      return bhe.a($$1.B);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), aph.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? djn.h : djn.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dfd $$0, ha $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
