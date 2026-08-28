import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkc extends diz implements dqt {
   public static final MapCodec<dkc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, dkc::new)
   );
   protected static final fbv b = djn.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dxp c = dxo.v;
   public static final dxp d = dxo.E;
   public static final dxp e = dxo.J;
   public static final dxv<jn> f = dxo.U;
   private static final fbv g = djn.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   public dkc(boolean $$0, int $$1, dwx.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.F.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jn.c));
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if ($$2.c_($$3) instanceof dug $$8) {
         cwq $$9 = $$4.b($$5);
         if ($$2.Q().a(dbo.h).a($$9)) {
            if ($$2 instanceof ard $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(awk.av);
               return bsl.b;
            }

            return bsl.c;
         }
      }

      return bsl.f;
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if ($$0.c(c) && $$3 instanceof bvi) {
         $$3.a($$1.ak().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dua $$5 = $$1.c_($$2);
         if ($$5 instanceof dug) {
            bsh.a($$1, $$2, ((dug)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dgk $$1 = $$0.q();
      ji $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == etb.c;
      return this.m().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return $$4 == jn.a ? $$0.b(d, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(dwy $$0) {
      return $$0.a(djp.iH);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.dK, awb.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lt.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bum $$0, dgk $$1, ji $$2, dwy $$3) {
      if ($$1.B_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dgj)$$1, $$2, $$3.c(d), true);
         }
      }

      dua $$5 = $$1.c_($$2);
      if ($$5 instanceof dug) {
         ((dug)$$5).d();
      }

      $$1.a($$0, ebu.c, $$2);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dwy $$2, eta $$3) {
      if (!$$2.c(dxo.J) && $$3.a() == etb.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.B_()) {
               $$0.a(null, $$1, awa.kF, awb.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.b(e, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(dgj $$0, dwy $$1, fax $$2, cpr $$3) {
      ji $$4 = $$2.b();
      if ($$0 instanceof ard $$5 && $$3.bY() && $$3.c($$5, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(dxo.v, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dgj $$0, ji $$1, boolean $$2, boolean $$3) {
      azh $$4 = $$0.H_();
      lx $$5 = $$2 ? lt.aw : lt.av;
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
            lt.ag,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dgj $$0, ji $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ji $$3 = $$1.c($$2);
         dwy $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fbs.c(g, $$4.b($$0, $$1, fbg.a()), fbf.i);
         if ($$5) {
            dwy $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dwy $$0) {
      return $$0.b(c) && $$0.a(awp.aX) && $$0.c(c);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(e) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dug($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      if ($$0 instanceof ard $$3) {
         if ($$1.c(c)) {
            dbm.a<dby, daq> $$4 = dbm.a(dbq.e);
            return a($$2, duc.H, ($$2x, $$3x, $$4x, $$5) -> dug.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, duc.H, dug::a);
         }
      } else {
         return $$1.c(c) ? a($$2, duc.H, dug::b) : null;
      }
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   public static boolean i(dwy $$0) {
      return $$0.a(awp.aX, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
