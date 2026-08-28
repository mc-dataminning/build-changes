import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dnc extends dly implements dtx {
   public static final MapCodec<dnc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.D), t()
            )
            .apply($$0, dnc::new)
   );
   public static final ebf b = ebe.u;
   public static final ebf c = ebe.D;
   public static final ebf d = ebe.I;
   public static final ebm<jb> e = ebe.T;
   private static final ffr f = dmm.b(16.0, 0.0, 7.0);
   private static final ffr g = dmm.b(4.0, 0.0, 16.0);
   private static final int h = 5;
   private final boolean i;
   private final int D;

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   public dnc(boolean $$0, int $$1, ean.d $$2) {
      super($$2);
      this.i = $$0;
      this.D = $$1;
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)).b(e, jb.c));
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if ($$2.c_($$3) instanceof dxt $$8) {
         czk $$9 = $$4.b($$5);
         if ($$2.Q().a(dek.h).a($$9)) {
            if ($$2 instanceof arq $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(awx.av);
               return bug.b;
            }

            return bug.c;
         }
      }

      return bug.f;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$0.c(b) && $$3 instanceof bxj) {
         $$3.a($$1.al().b(), (float)this.D);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      dji $$1 = $$0.q();
      iv $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eww.c;
      return this.m().b(d, Boolean.valueOf($$3)).b(c, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(b, Boolean.valueOf(!$$3)).b(e, $$0.g());
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return $$4 == jb.a ? $$0.b(c, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(eao $$0) {
      return $$0.a(dmo.iL);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return f;
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.dM, awo.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ly.ab, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bwi $$0, dji $$1, iv $$2, eao $$3) {
      if ($$1.w_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((djh)$$1, $$2, $$3.c(c), true);
         }
      }

      $$1.a($$0, efo.c, $$2);
   }

   @Override
   public boolean a(dji $$0, iv $$1, eao $$2, ewv $$3) {
      if (!$$2.c(ebe.I) && $$3.a() == eww.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.w_()) {
               $$0.a(null, $$1, awn.kJ, awo.e, 1.0F, 1.0F);
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
   protected void a(djh $$0, eao $$1, fet $$2, cse $$3) {
      iv $$4 = $$2.b();
      if ($$0 instanceof arq $$5 && $$3.bW() && $$3.c($$5, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.b(ebe.u, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(djh $$0, iv $$1, boolean $$2, boolean $$3) {
      azv $$4 = $$0.C_();
      mc $$5 = $$2 ? ly.ax : ly.aw;
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
            ly.ah,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(djh $$0, iv $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iv $$3 = $$1.c($$2);
         eao $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = ffo.c(g, $$4.b($$0, $$1, ffc.a()), ffb.i);
         if ($$5) {
            eao $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(eao $$0) {
      return $$0.b(b) && $$0.a(axc.aX) && $$0.c(b);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(d) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dxt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      if ($$0 instanceof arq $$3) {
         if ($$1.c(b)) {
            dei.a<deu, ddm> $$4 = dei.a(dem.e);
            return a($$2, dxo.H, ($$2x, $$3x, $$4x, $$5) -> dxt.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, dxo.H, dxt::a);
         }
      } else {
         return $$1.c(b) ? a($$2, dxo.H, dxt::b) : null;
      }
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   public static boolean i(eao $$0) {
      return $$0.a(axc.aX, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
