import com.mojang.serialization.MapCodec;

public class drj extends dnc implements dpw, dqo {
   public static final MapCodec<drj> a = b(drj::new);
   public static final ecc<jd> b = ebu.W;

   @Override
   public MapCodec<drj> a() {
      return a;
   }

   protected drj(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jd.k));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public ebe a(ddr $$0) {
      jb $$1 = $$0.k();
      jb $$2;
      if ($$1.o() == jb.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jb.b;
      }

      return this.m().b(b, jd.a($$1, $$2));
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzg($$0, $$1);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      dyc $$5 = $$1.c_($$2);
      if ($$5 instanceof dzg && $$3.gG()) {
         $$3.a((dzg)$$5);
         return bur.a;
      } else {
         return bur.e;
      }
   }

   public static boolean a(ewd.a $$0, ewd.a $$1) {
      jb $$2 = o($$0.a().b());
      jb $$3 = o($$1.a().b());
      jb $$4 = p($$0.a().b());
      jb $$5 = p($$1.a().b());
      dzg.a $$6 = $$0.b();
      boolean $$7 = $$6 == dzg.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jb o(ebe $$0) {
      return $$0.c(b).a();
   }

   public static jb p(ebe $$0) {
      return $$0.c(b).b();
   }
}
