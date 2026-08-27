import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cye extends cza {
   public static final MapCodec<cye> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dja.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, cye::new)
   );
   public static final die b = did.u;
   public static final die c = did.w;
   public static final die d = did.q;
   protected static final eks e = cvf.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eks f = cvf.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final eks g = cvf.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final eks h = cvf.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final eks i = cvf.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eks j = cvf.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eks k = cvf.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eks l = cvf.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eks m = ekp.a(cvf.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), cvf.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final eks n = ekp.a(cvf.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), cvf.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final eks o = ekp.a(cvf.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), cvf.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final eks F = ekp.a(cvf.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), cvf.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dja G;

   @Override
   public MapCodec<cye> a() {
      return a;
   }

   public cye(dja $$0, dhm.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ib.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ib.a.a ? f : e;
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      ib.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   public eks b_(dhn $$0, crl $$1, hx $$2) {
      if ($$0.c(b)) {
         return ekp.a();
      } else {
         return $$0.c(aE).o() == ib.a.c ? k : l;
      }
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      if ($$0.c(b)) {
         return ekp.a();
      } else {
         return $$0.c(aE).o() == ib.a.c ? i : j;
      }
   }

   @Override
   public eks f(dhn $$0, crl $$1, hx $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ib.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ib.a.a ? n : m;
      }
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
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
   public dhn a(cnw $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      ib $$4 = $$0.g();
      ib.a $$5 = $$4.o();
      boolean $$6 = $$5 == ib.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == ib.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean h(dhn $$0) {
      return $$0.a(ark.L);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ib $$6 = $$3.cE();
         if ($$0.c(aE) == $$6.g()) {
            $$0 = $$0.a(aE, $$6);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$7 = $$0.c(b);
      $$1.a($$3, $$2, $$7 ? this.G.g() : this.G.f(), aqw.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? dlx.h : dlx.d, $$2);
      return bjb.a($$1.B);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), aqw.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dlx.h : dlx.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dhn $$0, ib $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
