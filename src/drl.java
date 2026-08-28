import com.mojang.serialization.MapCodec;

public class drl extends dne implements dpy, dqq {
   public static final MapCodec<drl> a = b(drl::new);
   public static final ece<je> b = ebw.W;

   @Override
   public MapCodec<drl> a() {
      return a;
   }

   protected drl(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, je.k));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public ebg a(ddt $$0) {
      jc $$1 = $$0.k();
      jc $$2;
      if ($$1.o() == jc.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jc.b;
      }

      return this.m().b(b, je.a($$1, $$2));
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzi($$0, $$1);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      dye $$5 = $$1.c_($$2);
      if ($$5 instanceof dzi && $$3.gG()) {
         $$3.a((dzi)$$5);
         return but.a;
      } else {
         return but.e;
      }
   }

   public static boolean a(ewf.a $$0, ewf.a $$1) {
      jc $$2 = o($$0.a().b());
      jc $$3 = o($$1.a().b());
      jc $$4 = p($$0.a().b());
      jc $$5 = p($$1.a().b());
      dzi.a $$6 = $$0.b();
      boolean $$7 = $$6 == dzi.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jc o(ebg $$0) {
      return $$0.c(b).a();
   }

   public static jc p(ebg $$0) {
      return $$0.c(b).b();
   }
}
