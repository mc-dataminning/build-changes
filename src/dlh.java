import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlh extends diy {
   public static final MapCodec<dlh> a = b(dlh::new);
   public static final dxu<jn.a> b = dxn.L;
   public static final dxo c = dxn.a;
   public static final dxo d = dxn.x;

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   protected dlh(dww.d $$0) {
      super($$0);
      this.l(this.m().b(b, jn.a.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new duo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) ? a($$2, dub.k, duo::a) : null;
      }
   }

   public static boolean a(dgi $$0) {
      return $$0.G_().j() && $$0.W();
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if (a($$1)) {
         if ($$0.c(c)) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.gB, awb.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      dwx $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      return c($$8, $$1, $$3);
   }

   private static dwx c(dwx $$0, dgl $$1, ji $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = !$$0.c(c);
      return $$3 && $$4 ? $$0.b(c, Boolean.valueOf(true)) : $$0;
   }

   public static boolean b(dwx $$0, dgl $$1, ji $$2) {
      jn.a $$3 = $$0.c(b);

      for (jn $$4 : $$3.g()) {
         dwx $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(awp.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dgj $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         ji $$3 = $$1.a($$2);
         dwx $$4 = $$0.a_($$3);
         if (!$$4.a(awp.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      return c(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return dqd.b($$0, $$1);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if ($$1.c_($$2) instanceof duo $$5) {
         $$5.a(null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, dga $$3, BiConsumer<cwp, ji> $$4) {
      if ($$1.c_($$2) instanceof duo $$5 && $$3 instanceof dgy $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof cox $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dwx a(dgi $$0, ji $$1, dwx $$2, cox $$3) {
      if ($$0.c_($$1) instanceof duo $$4) {
         $$4.a($$3.dX().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cox $$0, dwx $$1, dgi $$2, ji $$3) {
      if (!$$0.b() && !$$0.Z_() && $$1.c(d) && $$2 instanceof arc $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof duo $$3 ? $$3.d() : 0;
      }
   }
}
