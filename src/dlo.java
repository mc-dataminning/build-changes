import com.mojang.serialization.MapCodec;

public class dlo extends dhm implements dke, dku {
   public static final MapCodec<dlo> a = b(dlo::new);
   public static final dvq<jm> b = dvi.T;

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   protected dlo(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.k));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dus a(czn $$0) {
      jk $$1 = $$0.k();
      jk $$2;
      if ($$1.o() == jk.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jk.b;
      }

      return this.n().b(b, jm.a($$1, $$2));
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsx($$0, $$1);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      drv $$5 = $$1.c_($$2);
      if ($$5 instanceof dsx && $$3.gA()) {
         $$3.a((dsx)$$5);
         return brs.a;
      } else {
         return brs.e;
      }
   }

   public static boolean a(epi.c $$0, epi.c $$1) {
      jk $$2 = o($$0.b());
      jk $$3 = o($$1.b());
      jk $$4 = p($$0.b());
      jk $$5 = p($$1.b());
      dsx.a $$6 = dsx.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dsx.a.b : dsx.a.a);
      boolean $$7 = $$6 == dsx.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static jk o(dus $$0) {
      return $$0.c(b).a();
   }

   public static jk p(dus $$0) {
      return $$0.c(b).b();
   }
}
