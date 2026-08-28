import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmh extends djx {
   public static final MapCodec<dmh> a = b(dmh::new);
   public static final dyr<jm.a> b = dyk.J;
   public static final dyr<dmh.a> c = dyk.bB;

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   protected dmh(dxt.d $$0) {
      super($$0);
      this.l(this.m().b(b, jm.a.b).b(c, dmh.a.a));
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != dmh.a.a ? a($$2, duy.k, dvl::a) : null;
      }
   }

   public static boolean a(dhh $$0) {
      return $$0.G_().j() && $$0.V();
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if (a($$1)) {
         if ($$0.c(c) != dmh.a.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), axf.gA, axg.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      dxu $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      return c($$8, $$1, $$3);
   }

   private static dxu c(dxu $$0, dhk $$1, jh $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      dmh.a $$4 = $$0.c(c);
      return $$3 && $$4 == dmh.a.a ? $$0.b(c, dmh.a.b) : $$0;
   }

   public static boolean b(dxu $$0, dhk $$1, jh $$2) {
      jm.a $$3 = $$0.c(b);

      for (jm $$4 : $$3.g()) {
         dxu $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(axu.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dhi $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         jh $$3 = $$1.a($$2);
         dxu $$4 = $$0.a_($$3);
         if (!$$4.a(axu.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      return c(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return dra.b($$0, $$1);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if ($$1.c_($$2) instanceof dvl $$5) {
         $$5.a(null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dxu a(dhh $$0, jh $$1, dxu $$2, cpw $$3) {
      if ($$0.c_($$1) instanceof dvl $$4) {
         $$4.a($$3.dW().a($$3));
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      if ($$0.c(c) != dmh.a.c) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dvl $$3 ? $$3.d() : 0;
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
