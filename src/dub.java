import com.mojang.serialization.MapCodec;

public class dub extends dne implements dup {
   public static final MapCodec<dub> a = b(dub::new);
   private static final int f = 1;
   private static final fgm g = fgj.a(dne.b(16.0, 14.0, 16.0), fgj.c(dne.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(fgj.a(), fgj::a));
   private static final fgm h = dne.b(16.0, 0.0, 2.0);
   private static final fgm i = fgj.a(g, h, fgj.c(dne.a(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(fgj.a(), fgj::a));
   private static final fgm D = fgj.b().a(0.0, -1.0, 0.0).d();
   public static final int b = 7;
   public static final ecg c = ebw.aZ;
   public static final ebx d = ebw.I;
   public static final ebx e = ebw.d;

   @Override
   public MapCodec<dub> a() {
      return a;
   }

   protected dub(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      if (!$$3.a($$0.b().h())) {
         return $$0.c(e) ? i : g;
      } else {
         return fgj.b();
      }
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2) {
      return fgj.b();
   }

   @Override
   protected boolean a(ebg $$0, ddt $$1) {
      return $$1.n().a(this.h());
   }

   @Override
   public ebg a(ddt $$0) {
      iw $$1 = $$0.a();
      djz $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == exr.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      if (!$$1.A_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      int $$4 = a($$1, $$2);
      ebg $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cod.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      if ($$3.c()) {
         return fgj.a();
      } else if ($$3.a(fgj.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(D, $$2, true) ? h : fgj.a();
      }
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(d) ? exr.c.a(false) : super.b_($$0);
   }

   private boolean a(djd $$0, iw $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(djd $$0, iw $$1) {
      iw.a $$2 = $$1.k().c(jc.a);
      ebg $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dng.oy)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jc.b)) {
         return 0;
      }

      for (jc $$5 : jc.c.a) {
         ebg $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dng.oy)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }
}
