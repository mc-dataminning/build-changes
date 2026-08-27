import com.mojang.serialization.MapCodec;

public class dcp extends cyo implements dbg, dbw {
   public static final MapCodec<dcp> a = b(dcp::new);
   public static final dmd<ih> b = dlv.T;

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   protected dcp(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.k));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dlf a(crg $$0) {
      ie $$1 = $$0.k();
      ie $$2;
      if ($$1.o() == ie.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ie.b;
      }

      return this.o().a(b, ih.a($$1, $$2));
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djt($$0, $$1);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      dit $$5 = $$1.c_($$2);
      if ($$5 instanceof djt && $$3.gq()) {
         $$3.a((djt)$$5);
         return blu.a($$1.B);
      } else {
         return blu.d;
      }
   }

   public static boolean a(efe.c $$0, efe.c $$1) {
      ie $$2 = m($$0.b());
      ie $$3 = m($$1.b());
      ie $$4 = n($$0.b());
      ie $$5 = n($$1.b());
      djt.a $$6 = djt.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? djt.a.b : djt.a.a);
      boolean $$7 = $$6 == djt.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ie m(dlf $$0) {
      return $$0.c(b).a();
   }

   public static ie n(dlf $$0) {
      return $$0.c(b).b();
   }
}
