import com.mojang.serialization.MapCodec;

public class dji extends dfc implements dhw, dio {
   public static final MapCodec<dji> a = b(dji::new);
   public static final dua<iy> b = dts.T;

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   protected dji(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iy.k));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dtc a(cyd $$0) {
      iw $$1 = $$0.k();
      iw $$2;
      if ($$1.o() == iw.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = iw.b;
      }

      return this.n().a(b, iy.a($$1, $$2));
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dre($$0, $$1);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      dqc $$5 = $$1.c_($$2);
      if ($$5 instanceof dre && $$3.gK()) {
         $$3.a((dre)$$5);
         return bqa.a($$1.C);
      } else {
         return bqa.d;
      }
   }

   public static boolean a(ent.c $$0, ent.c $$1) {
      iw $$2 = m($$0.b());
      iw $$3 = m($$1.b());
      iw $$4 = n($$0.b());
      iw $$5 = n($$1.b());
      dre.a $$6 = dre.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dre.a.b : dre.a.a);
      boolean $$7 = $$6 == dre.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static iw m(dtc $$0) {
      return $$0.c(b).a();
   }

   public static iw n(dtc $$0) {
      return $$0.c(b).b();
   }
}
