import com.mojang.serialization.MapCodec;

public class dnf extends dmr {
   public static final MapCodec<dnf> a = b(dnf::new);
   public static final int b = 6;
   public static final ebt c = ebj.aB;
   public static final int d = b(0);
   private static final ffw[] e = dmr.a(6, $$0 -> dmr.a((double)(1 + $$0 * 2), 0.0, 1.0, 15.0, 8.0, 15.0));

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   protected dnf(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      czj $$7 = $$0.h();
      if ($$0.a(axk.aO) && $$1.c(c) == 0 && dmr.a($$7) instanceof dni $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awn.dv, awo.e, 1.0F, 1.0F);
         $$2.b($$3, dnj.a($$8));
         $$2.a($$4, eft.c, $$3);
         $$4.b(awx.c.b($$7));
         return bug.a;
      } else {
         return bug.f;
      }
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bug.a;
         }

         if ($$3.b(buf.a).f()) {
            return bug.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bug a(djn $$0, iv $$1, eat $$2, crm $$3) {
      if (!$$3.t(false)) {
         return bug.e;
      } else {
         $$3.a(awx.U);
         $$3.gt().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, eft.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, eft.f, $$1);
         }

         return bug.a;
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
