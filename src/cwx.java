import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwx extends cxu {
   public static final MapCodec<cwx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dho.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), t()).apply($$0, cwx::new)
   );
   public static final dgs b = dgr.u;
   public static final dgs c = dgr.w;
   public static final dgs d = dgr.q;
   protected static final eiy e = cua.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eiy f = cua.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final eiy g = cua.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final eiy h = cua.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final eiy i = cua.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eiy j = cua.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eiy k = cua.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eiy l = cua.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eiy m = eiv.a(cua.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), cua.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final eiy n = eiv.a(cua.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), cua.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final eiy o = eiv.a(cua.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), cua.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final eiy F = eiv.a(cua.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), cua.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dho G;

   @Override
   public MapCodec<cwx> a() {
      return a;
   }

   public cwx(dho $$0, dga.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == hx.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == hx.a.a ? f : e;
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      hx.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   public eiy b_(dgb $$0, cqf $$1, ht $$2) {
      if ($$0.c(b)) {
         return eiv.a();
      } else {
         return $$0.c(aE).o() == hx.a.c ? k : l;
      }
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      if ($$0.c(b)) {
         return eiv.a();
      } else {
         return $$0.c(aE).o() == hx.a.c ? i : j;
      }
   }

   @Override
   public eiy f(dgb $$0, cqf $$1, ht $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == hx.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == hx.a.a ? n : m;
      }
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
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
   public dgb a(cmr $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      hx $$4 = $$0.g();
      hx.a $$5 = $$4.o();
      boolean $$6 = $$5 == hx.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == hx.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean h(dgb $$0) {
      return $$0.a(aqs.L);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
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
      $$1.a($$3, $$2, $$7 ? this.G.g() : this.G.f(), aqe.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? dkl.h : dkl.d, $$2);
      return bib.a($$1.B);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), aqe.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dkl.h : dkl.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dgb $$0, hx $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
