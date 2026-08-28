import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class don extends dmd {
   public static final MapCodec<don> a = b(don::new);
   public static final ebr<jb.a> b = ebj.K;
   public static final ebr<ebn> c = ebj.bD;
   public static final ebk d = ebj.w;

   @Override
   public MapCodec<don> a() {
      return a;
   }

   protected don(eas.d $$0) {
      super($$0);
      this.l(this.m().b(b, jb.a.b).b(c, ebn.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dyh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != ebn.a ? a($$2, dxt.k, dyh::a) : null;
      }
   }

   public static boolean a(djm $$0) {
      return $$0.X();
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if (a($$1)) {
         if ($$0.c(c) != ebn.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.gD, awo.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      $$2.a($$3, this, 1);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      eat $$4 = d($$0, $$1, $$2);
      if ($$4 != $$0) {
         $$1.a($$2, $$4, 3);
      }
   }

   private static eat d(eat $$0, djm $$1, iv $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = $$0.c(c) == ebn.a;
      return $$3 && $$4 ? $$0.b(c, a($$1) ? ebn.c : ebn.b) : $$0;
   }

   public static boolean b(eat $$0, djp $$1, iv $$2) {
      jb.a $$3 = $$0.c(b);

      for (jb $$4 : $$3.g()) {
         eat $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(axc.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(djn $$0, iv $$1) {
      for (jb $$2 : jb.values()) {
         iv $$3 = $$1.a($$2);
         eat $$4 = $$0.a_($$3);
         if (!$$4.a(axc.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      return d(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return dtk.b($$0, $$1);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, djf $$3, BiConsumer<czn, iv> $$4) {
      if ($$1.c_($$2) instanceof dyh $$5 && $$3 instanceof dkc $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof crm $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public eat a(djm $$0, iv $$1, eat $$2, crm $$3) {
      if ($$0.c_($$1) instanceof dyh $$4) {
         $$4.a($$3.dV().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(crm $$0, eat $$1, djm $$2, iv $$3) {
      if (!$$0.gk() && !$$0.V_() && $$1.c(d) && $$2 instanceof arq $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      if ($$0.c(c) == ebn.a) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dyh $$3 ? $$3.d() : 0;
      }
   }
}
