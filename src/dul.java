import com.mojang.serialization.MapCodec;

public class dul extends dno implements duz {
   public static final MapCodec<dul> a = b(dul::new);
   private static final int f = 1;
   private static final fgw g = fgt.a(dno.b(16.0, 14.0, 16.0), fgt.c(dno.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(fgt.a(), fgt::a));
   private static final fgw h = dno.b(16.0, 0.0, 2.0);
   private static final fgw i = fgt.a(g, h, fgt.c(dno.a(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(fgt.a(), fgt::a));
   private static final fgw D = fgt.b().a(0.0, -1.0, 0.0).d();
   public static final int b = 7;
   public static final ecq c = ecg.aZ;
   public static final ech d = ecg.I;
   public static final ech e = ecg.d;

   @Override
   public MapCodec<dul> a() {
      return a;
   }

   protected dul(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      if (!$$3.a($$0.b().h())) {
         return $$0.c(e) ? i : g;
      } else {
         return fgt.b();
      }
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2) {
      return fgt.b();
   }

   @Override
   protected boolean a(ebq $$0, ded $$1) {
      return $$1.n().a(this.h());
   }

   @Override
   public ebq a(ded $$0) {
      iw $$1 = $$0.a();
      dkj $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == eyb.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      if (!$$1.A_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      int $$4 = a($$1, $$2);
      ebq $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            com.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      if ($$3.c()) {
         return fgt.a();
      } else if ($$3.a(fgt.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(D, $$2, true) ? h : fgt.a();
      }
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(d) ? eyb.c.a(false) : super.b_($$0);
   }

   private boolean a(djn $$0, iw $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(djn $$0, iw $$1) {
      iw.a $$2 = $$1.k().c(jc.a);
      ebq $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dnq.oy)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jc.b)) {
         return 0;
      }

      for (jc $$5 : jc.c.a) {
         ebq $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dnq.oy)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }
}
