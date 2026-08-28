import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlf extends diw {
   public static final MapCodec<dlf> a = b(dlf::new);
   public static final dxs<jn.a> b = dxl.L;
   public static final dxm c = dxl.a;
   public static final dxm d = dxl.x;

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   protected dlf(dwu.d $$0) {
      super($$0);
      this.l(this.m().b(b, jn.a.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dum($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) ? a($$2, dtz.k, dum::a) : null;
      }
   }

   public static boolean a(dgg $$0) {
      return $$0.G_().j() && $$0.W();
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if (a($$1)) {
         if ($$0.c(c)) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), avz.gB, awa.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      dwv $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      return c($$8, $$1, $$3);
   }

   private static dwv c(dwv $$0, dgj $$1, ji $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = !$$0.c(c);
      return $$3 && $$4 ? $$0.b(c, Boolean.valueOf(true)) : $$0;
   }

   public static boolean b(dwv $$0, dgj $$1, ji $$2) {
      jn.a $$3 = $$0.c(b);

      for (jn $$4 : $$3.g()) {
         dwv $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(awo.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dgh $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         ji $$3 = $$1.a($$2);
         dwv $$4 = $$0.a_($$3);
         if (!$$4.a(awo.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      return c(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return dqb.b($$0, $$1);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if ($$1.c_($$2) instanceof dum $$5) {
         $$5.a(null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, dfy $$3, BiConsumer<cwn, ji> $$4) {
      if ($$1.c_($$2) instanceof dum $$5 && $$3 instanceof dgw $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof cov $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dwv a(dgg $$0, ji $$1, dwv $$2, cov $$3) {
      if ($$0.c_($$1) instanceof dum $$4) {
         $$4.a($$3.dX().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cov $$0, dwv $$1, dgg $$2, ji $$3) {
      if (!$$0.b() && !$$0.Z_() && $$1.c(d) && $$2 instanceof arc $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dum $$3 ? $$3.d() : 0;
      }
   }
}
