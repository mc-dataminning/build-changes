import com.mojang.serialization.MapCodec;

public class ddv extends dch {
   public static final MapCodec<ddv> a = b(ddv::new);
   public static final dpz b = dpy.w;
   public static final dpz c = dpy.r;

   @Override
   protected MapCodec<? extends ddv> a() {
      return a;
   }

   public ddv(dph.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof apu $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if ($$1 instanceof apu $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dpi $$0, apu $$1, id $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dpi $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? auo.fB : auo.fC, aup.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
