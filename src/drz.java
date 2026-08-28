import com.mojang.serialization.MapCodec;

public class drz extends dtu implements dup {
   public static final MapCodec<drz> b = b(drz::new);
   public static final ebx c = ebw.I;
   public static final ebx d = ebw.A;
   private static final int f = 8;
   public static final int e = 128;
   private static final int g = 200;

   @Override
   public MapCodec<drz> a() {
      return b;
   }

   public drz(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jc.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exr.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(c) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(ebg $$0, djz $$1, iw $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(ebg $$0, djz $$1, iw $$2) {
      jc $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, eyu.a($$1, $$3, null));
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$1.ag() && (long)$$1.A.a(200) <= $$1.ae() % 200L && $$2.v() == $$1.a(ehf.a.b, $$2.u(), $$2.w()) - 1) {
         azu.a($$0.c(a).o(), $$1, $$2, 0.125, lz.aW, bue.a(1, 2));
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      if ($$0.c(d)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }
}
