import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends djy {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final dys<jm.a> b = dyl.J;
   public static final dys<dmi.a> c = dyl.bB;

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   protected dmi(dxu.d $$0) {
      super($$0);
      this.l(this.m().b(b, jm.a.b).b(c, dmi.a.a));
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != dmi.a.a ? a($$2, duz.k, dvm::a) : null;
      }
   }

   public static boolean a(dhi $$0) {
      return $$0.G_().j() && $$0.V();
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if (a($$1)) {
         if ($$0.c(c) != dmi.a.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), axf.gA, axg.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      dxv $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      return c($$8, $$1, $$3);
   }

   private static dxv c(dxv $$0, dhl $$1, jh $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      dmi.a $$4 = $$0.c(c);
      return $$3 && $$4 == dmi.a.a ? $$0.b(c, dmi.a.b) : $$0;
   }

   public static boolean b(dxv $$0, dhl $$1, jh $$2) {
      jm.a $$3 = $$0.c(b);

      for (jm $$4 : $$3.g()) {
         dxv $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(axu.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dhj $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         jh $$3 = $$1.a($$2);
         dxv $$4 = $$0.a_($$3);
         if (!$$4.a(axu.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      return c(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return drb.b($$0, $$1);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if ($$1.c_($$2) instanceof dvm $$5) {
         $$5.a(null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dxv a(dhi $$0, jh $$1, dxv $$2, cpx $$3) {
      if ($$0.c_($$1) instanceof dvm $$4) {
         $$4.a($$3.dX().a($$3));
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      if ($$0.c(c) != dmi.a.c) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dvm $$3 ? $$3.d() : 0;
      }
   }

   public static enum a implements bba {
      a("disabled"),
      b("dormant"),
      c("active");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
