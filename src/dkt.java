import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkt extends djq implements drl {
   public static final MapCodec<dkt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.C), t()
            )
            .apply($$0, dkt::new)
   );
   public static final dyh b = dyg.u;
   public static final dyh c = dyg.D;
   public static final dyh d = dyg.I;
   public static final dyo<jn> e = dyg.T;
   private static final fcr f = dke.b(16.0, 0.0, 7.0);
   private static final fcr g = dke.b(4.0, 0.0, 16.0);
   private static final int h = 5;
   private final boolean i;
   private final int C;

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   public dkt(boolean $$0, int $$1, dxp.d $$2) {
      super($$2);
      this.i = $$0;
      this.C = $$1;
      this.l(this.B.b().b(b, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)).b(e, jn.c));
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if ($$2.c_($$3) instanceof duy $$8) {
         cxh $$9 = $$4.b($$5);
         if ($$2.Q().a(dce.h).a($$9)) {
            if ($$2 instanceof ard $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(awk.av);
               return bsy.b;
            }

            return bsy.c;
         }
      }

      return bsy.f;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if ($$0.c(b) && $$3 instanceof bvy) {
         $$3.a($$1.al().b(), (float)this.C);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dha $$1 = $$0.q();
      ji $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == etx.c;
      return this.m().b(d, Boolean.valueOf($$3)).b(c, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(b, Boolean.valueOf(!$$3)).b(e, $$0.g());
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4 == jn.a ? $$0.b(c, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(dxq $$0) {
      return $$0.a(dkg.iH);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return f;
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.dK, awb.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lt.ab, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bva $$0, dha $$1, ji $$2, dxq $$3) {
      if ($$1.w_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dgz)$$1, $$2, $$3.c(c), true);
         }
      }

      dus $$5 = $$1.c_($$2);
      if ($$5 instanceof duy) {
         ((duy)$$5).d();
      }

      $$1.a($$0, ecp.c, $$2);
   }

   @Override
   public boolean a(dha $$0, ji $$1, dxq $$2, etw $$3) {
      if (!$$2.c(dyg.I) && $$3.a() == etx.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.w_()) {
               $$0.a(null, $$1, awa.kF, awb.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)).b(b, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(dgz $$0, dxq $$1, fbt $$2, cqk $$3) {
      ji $$4 = $$2.b();
      if ($$0 instanceof ard $$5 && $$3.bX() && $$3.c($$5, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.b(dyg.u, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dgz $$0, ji $$1, boolean $$2, boolean $$3) {
      azh $$4 = $$0.C_();
      lx $$5 = $$2 ? lt.ax : lt.aw;
      $$0.a(
         $$5,
         true,
         (double)$$1.u() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1),
         (double)$$1.v() + $$4.j() + $$4.j(),
         (double)$$1.w() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1),
         0.0,
         0.07,
         0.0
      );
      if ($$3) {
         $$0.a(
            lt.ah,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dgz $$0, ji $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ji $$3 = $$1.c($$2);
         dxq $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fco.c(g, $$4.b($$0, $$1, fcc.a()), fcb.i);
         if ($$5) {
            dxq $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dxq $$0) {
      return $$0.b(b) && $$0.a(awp.aX) && $$0.c(b);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(d) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new duy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      if ($$0 instanceof ard $$3) {
         if ($$1.c(b)) {
            dcc.a<dco, dbg> $$4 = dcc.a(dcg.e);
            return a($$2, duu.H, ($$2x, $$3x, $$4x, $$5) -> duy.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, duu.H, duy::a);
         }
      } else {
         return $$1.c(b) ? a($$2, duu.H, duy::b) : null;
      }
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   public static boolean i(dxq $$0) {
      return $$0.a(awp.aX, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
