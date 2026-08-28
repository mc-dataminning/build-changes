import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlg extends dix {
   public static final MapCodec<dlg> a = b(dlg::new);
   public static final dxt<jn.a> b = dxm.L;
   public static final dxn c = dxm.a;
   public static final dxn d = dxm.x;

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   protected dlg(dwv.d $$0) {
      super($$0);
      this.l(this.m().b(b, jn.a.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dun($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) ? a($$2, dua.k, dun::a) : null;
      }
   }

   public static boolean a(dgh $$0) {
      return $$0.G_().j() && $$0.W();
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      if (a($$1)) {
         if ($$0.c(c)) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.gB, awb.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      dww $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      return c($$8, $$1, $$3);
   }

   private static dww c(dww $$0, dgk $$1, ji $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = !$$0.c(c);
      return $$3 && $$4 ? $$0.b(c, Boolean.valueOf(true)) : $$0;
   }

   public static boolean b(dww $$0, dgk $$1, ji $$2) {
      jn.a $$3 = $$0.c(b);

      for (jn $$4 : $$3.g()) {
         dww $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(awp.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dgi $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         ji $$3 = $$1.a($$2);
         dww $$4 = $$0.a_($$3);
         if (!$$4.a(awp.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      return c(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return dqc.b($$0, $$1);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if ($$1.c_($$2) instanceof dun $$5) {
         $$5.a(null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, dfz $$3, BiConsumer<cwo, ji> $$4) {
      if ($$1.c_($$2) instanceof dun $$5 && $$3 instanceof dgx $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof cow $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dww a(dgh $$0, ji $$1, dww $$2, cow $$3) {
      if ($$0.c_($$1) instanceof dun $$4) {
         $$4.a($$3.dW().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cow $$0, dww $$1, dgh $$2, ji $$3) {
      if (!$$0.b() && !$$0.Z_() && $$1.c(d) && $$2 instanceof ard $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dun $$3 ? $$3.d() : 0;
      }
   }
}
