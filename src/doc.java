import com.mojang.serialization.MapCodec;

public class doc extends dno {
   public static final MapCodec<doc> a = b(doc::new);
   public static final int b = 6;
   public static final ecq c = ecg.aB;
   public static final int d = b(0);
   private static final fgw[] e = dno.a(6, $$0 -> dno.a((double)(1 + $$0 * 2), 0.0, 1.0, 15.0, 8.0, 15.0));

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   protected doc(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      dag $$7 = $$0.h();
      if ($$0.a(axv.aP) && $$1.c(c) == 0 && dno.a($$7) instanceof dof $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awy.dv, awz.e, 1.0F, 1.0F);
         $$2.b($$3, dog.a($$8));
         $$2.a($$4, egq.c, $$3);
         $$4.b(axi.c.b($$7));
         return bvc.a;
      } else {
         return bvc.f;
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bvc.a;
         }

         if ($$3.b(bvb.a).f()) {
            return bvc.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bvc a(dkk $$0, iw $$1, ebq $$2, csi $$3) {
      if (!$$3.t(false)) {
         return bvc.e;
      } else {
         $$3.a(axi.U);
         $$3.gu().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, egq.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, egq.f, $$1);
         }

         return bvc.a;
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4 == jc.a && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
