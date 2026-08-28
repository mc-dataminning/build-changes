import com.mojang.serialization.MapCodec;

public class dqm extends dmf implements doz, dpr {
   public static final MapCodec<dqm> a = b(dqm::new);
   public static final ebf<jc> b = eax.W;

   @Override
   public MapCodec<dqm> a() {
      return a;
   }

   protected dqm(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.k));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public eah a(dcw $$0) {
      ja $$1 = $$0.k();
      ja $$2;
      if ($$1.o() == ja.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ja.b;
      }

      return this.m().b(b, jc.a($$1, $$2));
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyj($$0, $$1);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      dxf $$5 = $$1.c_($$2);
      if ($$5 instanceof dyj && $$3.gG()) {
         $$3.a((dyj)$$5);
         return bud.a;
      } else {
         return bud.e;
      }
   }

   public static boolean a(evd.a $$0, evd.a $$1) {
      ja $$2 = o($$0.a().b());
      ja $$3 = o($$1.a().b());
      ja $$4 = p($$0.a().b());
      ja $$5 = p($$1.a().b());
      dyj.a $$6 = $$0.b();
      boolean $$7 = $$6 == dyj.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static ja o(eah $$0) {
      return $$0.c(b).a();
   }

   public static ja p(eah $$0) {
      return $$0.c(b).b();
   }
}
