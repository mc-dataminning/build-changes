import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxr extends cyo {
   public static final MapCodec<cxr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dij.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), t()).apply($$0, cxr::new)
   );
   public static final dhn b = dhm.u;
   public static final dhn c = dhm.w;
   public static final dhn d = dhm.q;
   protected static final ekb e = cut.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ekb f = cut.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ekb g = cut.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ekb h = cut.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ekb i = cut.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ekb j = cut.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ekb k = cut.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ekb l = cut.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ekb m = ejy.a(cut.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), cut.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ekb n = ejy.a(cut.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), cut.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ekb o = ejy.a(cut.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), cut.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ekb F = ejy.a(cut.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), cut.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dij G;

   @Override
   public MapCodec<cxr> a() {
      return a;
   }

   public cxr(dij $$0, dgv.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == hx.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == hx.a.a ? f : e;
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      hx.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   public ekb b_(dgw $$0, cqy $$1, ht $$2) {
      if ($$0.c(b)) {
         return ejy.a();
      } else {
         return $$0.c(aE).o() == hx.a.c ? k : l;
      }
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      if ($$0.c(b)) {
         return ejy.a();
      } else {
         return $$0.c(aE).o() == hx.a.c ? i : j;
      }
   }

   @Override
   public ekb f(dgw $$0, cqy $$1, ht $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == hx.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == hx.a.a ? n : m;
      }
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
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
   public dgw a(cnj $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      hx $$4 = $$0.g();
      hx.a $$5 = $$4.o();
      boolean $$6 = $$5 == hx.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == hx.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean h(dgw $$0) {
      return $$0.a(arc.L);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         hx $$6 = $$3.cD();
         if ($$0.c(aE) == $$6.g()) {
            $$0 = $$0.a(aE, $$6);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$7 = $$0.c(b);
      $$1.a($$3, $$2, $$7 ? this.G.g() : this.G.f(), aqo.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? dlg.h : dlg.d, $$2);
      return biq.a($$1.B);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), aqo.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dlg.h : dlg.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dgw $$0, hx $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
