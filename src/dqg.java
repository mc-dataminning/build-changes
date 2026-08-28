import com.mojang.serialization.MapCodec;

public class dqg extends dma implements dot, dpl {
   public static final MapCodec<dqg> a = b(dqg::new);
   public static final eax<jc> b = eap.W;

   @Override
   public MapCodec<dqg> a() {
      return a;
   }

   protected dqg(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jc.k));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dzz a(dcr $$0) {
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
   public dwx a(iu $$0, dzz $$1) {
      return new dyb($$0, $$1);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      dwx $$5 = $$1.c_($$2);
      if ($$5 instanceof dyb && $$3.gF()) {
         $$3.a((dyb)$$5);
         return bub.a;
      } else {
         return bub.e;
      }
   }

   public static boolean a(euv.a $$0, euv.a $$1) {
      ja $$2 = o($$0.a().b());
      ja $$3 = o($$1.a().b());
      ja $$4 = p($$0.a().b());
      ja $$5 = p($$1.a().b());
      dyb.a $$6 = $$0.b();
      boolean $$7 = $$6 == dyb.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static ja o(dzz $$0) {
      return $$0.c(b).a();
   }

   public static ja p(dzz $$0) {
      return $$0.c(b).b();
   }
}
