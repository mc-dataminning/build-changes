import com.mojang.serialization.MapCodec;

public class czb extends cva implements cxs, cyi {
   public static final MapCodec<czb> a = b(czb::new);
   public static final dig<hz> b = dhy.T;

   @Override
   public MapCodec<czb> a() {
      return a;
   }

   protected czb(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hz.k));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dhi a(cnr $$0) {
      hx $$1 = $$0.k();
      hx $$2;
      if ($$1.o() == hx.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = hx.b;
      }

      return this.o().a(b, hz.a($$1, $$2));
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgd($$0, $$1);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      dfd $$6 = $$1.c_($$2);
      if ($$6 instanceof dgd && $$3.gq()) {
         $$3.a((dgd)$$6);
         return bix.a($$1.B);
      } else {
         return bix.d;
      }
   }

   public static boolean a(ebh.c $$0, ebh.c $$1) {
      hx $$2 = h($$0.b());
      hx $$3 = h($$1.b());
      hx $$4 = n($$0.b());
      hx $$5 = n($$1.b());
      dgd.a $$6 = dgd.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dgd.a.b : dgd.a.a);
      boolean $$7 = $$6 == dgd.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static hx h(dhi $$0) {
      return $$0.c(b).a();
   }

   public static hx n(dhi $$0) {
      return $$0.c(b).b();
   }
}
