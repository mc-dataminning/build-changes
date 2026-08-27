import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class czi extends dae {
   public static final MapCodec<czi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dkn.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, czi::new)
   );
   public static final djr b = djq.u;
   public static final djr c = djq.w;
   public static final djr d = djq.q;
   protected static final emf e = cwj.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final emf f = cwj.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final emf g = cwj.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final emf h = cwj.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final emf i = cwj.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final emf j = cwj.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final emf k = cwj.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final emf l = cwj.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final emf m = emc.a(cwj.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), cwj.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final emf n = emc.a(cwj.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), cwj.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final emf o = emc.a(cwj.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), cwj.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final emf F = emc.a(cwj.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), cwj.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dkn G;

   @Override
   public MapCodec<czi> a() {
      return a;
   }

   public czi(dkn $$0, diz.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ic.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ic.a.a ? f : e;
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      ic.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   public emf b_(dja $$0, cso $$1, hx $$2) {
      if ($$0.c(b)) {
         return emc.a();
      } else {
         return $$0.c(aE).o() == ic.a.c ? k : l;
      }
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      if ($$0.c(b)) {
         return emc.a();
      } else {
         return $$0.c(aE).o() == ic.a.c ? i : j;
      }
   }

   @Override
   public emf f(dja $$0, cso $$1, hx $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ic.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ic.a.a ? n : m;
      }
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
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
   public dja a(cpa $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      ic $$4 = $$0.g();
      ic.a $$5 = $$4.o();
      boolean $$6 = $$5 == ic.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == ic.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean h(dja $$0) {
      return $$0.a(asb.L);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ic $$6 = $$3.cE();
         if ($$0.c(aE) == $$6.g()) {
            $$0 = $$0.a(aE, $$6);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$7 = $$0.c(b);
      $$1.a($$3, $$2, $$7 ? this.G.g() : this.G.f(), arn.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? dnk.h : dnk.d, $$2);
      return bjv.a($$1.B);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cta $$3, BiConsumer<cmr, hx> $$4) {
      if ($$3.j() == cta.a.d && !$$1.y_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), arn.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dnk.d : dnk.h, $$2, dnk.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), arn.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dnk.h : dnk.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dja $$0, ic $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
