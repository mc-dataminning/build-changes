import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class doy extends dmo {
   public static final MapCodec<doy> a = b(doy::new);
   public static final ecc<jb.a> b = ebu.K;
   public static final ecc<eby> c = ebu.bD;
   public static final ebv d = ebu.w;

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   protected doy(ebd.d $$0) {
      super($$0);
      this.l(this.m().b(b, jb.a.b).b(c, eby.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dys($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != eby.a ? a($$2, dye.k, dys::a) : null;
      }
   }

   public static boolean a(djx $$0) {
      return $$0.X();
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if (a($$1)) {
         if ($$0.c(c) != eby.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awp.gD, awq.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      $$2.a($$3, this, 1);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      ebe $$4 = d($$0, $$1, $$2);
      if ($$4 != $$0) {
         $$1.a($$2, $$4, 3);
      }
   }

   private static ebe d(ebe $$0, djx $$1, iv $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = $$0.c(c) == eby.a;
      return $$3 && $$4 ? $$0.b(c, a($$1) ? eby.c : eby.b) : $$0;
   }

   public static boolean b(ebe $$0, dka $$1, iv $$2) {
      jb.a $$3 = $$0.c(b);

      for (jb $$4 : $$3.g()) {
         ebe $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(axe.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(djy $$0, iv $$1) {
      for (jb $$2 : jb.values()) {
         iv $$3 = $$1.a($$2);
         ebe $$4 = $$0.a_($$3);
         if (!$$4.a(axe.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      return d(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return dtv.b($$0, $$1);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      bun.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, djq $$3, BiConsumer<czy, iv> $$4) {
      if ($$1.c_($$2) instanceof dys $$5 && $$3 instanceof dkn $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof crx $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ebe a(djx $$0, iv $$1, ebe $$2, crx $$3) {
      if ($$0.c_($$1) instanceof dys $$4) {
         $$4.a($$3.dW().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(crx $$0, ebe $$1, djx $$2, iv $$3) {
      if (!$$0.gl() && !$$0.Z_() && $$1.c(d) && $$2 instanceof ars $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      if ($$0.c(c) == eby.a) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dys $$3 ? $$3.d() : 0;
      }
   }
}
