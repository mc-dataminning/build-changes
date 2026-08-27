import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class czx extends dat {
   public static final MapCodec<czx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlc.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, czx::new)
   );
   public static final dkg b = dkf.u;
   public static final dkg c = dkf.w;
   public static final dkg d = dkf.q;
   protected static final emv e = cwy.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final emv f = cwy.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final emv g = cwy.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final emv h = cwy.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final emv i = cwy.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final emv j = cwy.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final emv k = cwy.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final emv l = cwy.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final emv m = ems.a(cwy.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), cwy.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final emv n = ems.a(cwy.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), cwy.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final emv o = ems.a(cwy.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), cwy.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final emv F = ems.a(cwy.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), cwy.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dlc G;

   @Override
   public MapCodec<czx> a() {
      return a;
   }

   public czx(dlc $$0, djo.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ic.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ic.a.a ? f : e;
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      ic.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   public emv b_(djp $$0, ctd $$1, hx $$2) {
      if ($$0.c(b)) {
         return ems.a();
      } else {
         return $$0.c(aE).o() == ic.a.c ? k : l;
      }
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      if ($$0.c(b)) {
         return ems.a();
      } else {
         return $$0.c(aE).o() == ic.a.c ? i : j;
      }
   }

   @Override
   public emv f(djp $$0, ctd $$1, hx $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ic.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ic.a.a ? n : m;
      }
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
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
   public djp a(cpp $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      ic $$4 = $$0.g();
      ic.a $$5 = $$4.o();
      boolean $$6 = $$5 == ic.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == ic.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean h(djp $$0) {
      return $$0.a(asi.L);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ic $$5 = $$3.cE();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), aru.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dnz.h : dnz.d, $$2);
      return bkc.a($$1.B);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, ctp $$3, BiConsumer<cng, hx> $$4) {
      if ($$3.j() == ctp.a.d && !$$1.y_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), aru.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dnz.d : dnz.h, $$2, dnz.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), aru.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dnz.h : dnz.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(djp $$0, ic $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
