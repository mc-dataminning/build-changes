import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfq extends den implements dmr {
   public static final MapCodec<dfq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.j), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.k), u()
            )
            .apply($$0, dfq::new)
   );
   protected static final exn b = dfc.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   protected static final exn c = dfc.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final dtt d = dts.r;
   public static final dtt e = dts.y;
   public static final dtt f = dts.C;
   public static final dtw g = dts.R;
   private static final exn h = dfc.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int i = 5;
   private final boolean j;
   private final int k;

   @Override
   public MapCodec<dfq> a() {
      return a;
   }

   public dfq(boolean $$0, int $$1, dtb.d $$2) {
      super($$2);
      this.j = $$0;
      this.k = $$1;
      this.k(this.E.b().a(d, Boolean.valueOf(true)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)).a(g, iw.c));
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if ($$2.c_($$3) instanceof dqi $$8) {
         cuh $$9 = $$4.b($$5);
         Optional<czc<cym>> $$10 = $$8.a($$9);
         if ($$10.isPresent()) {
            if (!$$2.C && $$8.a($$4, $$4.fY() ? $$9.r() : $$9, $$10.get().b().d())) {
               $$4.a(avz.aw);
               return bqc.a;
            }

            return bqc.b;
         }
      }

      return bqc.d;
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if ($$0.c(d) && $$3 instanceof bso && !dae.j((bso)$$3)) {
         $$3.a($$1.aj().a(), (float)this.k);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dqc $$5 = $$1.c_($$2);
         if ($$5 instanceof dqi) {
            bpw.a($$1, $$2, ((dqi)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dcb $$1 = $$0.q();
      ir $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == epf.c;
      return this.n().a(f, Boolean.valueOf($$3)).a(e, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(d, Boolean.valueOf(!$$3)).a(g, $$0.g());
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$1 == iw.a ? $$0.a(e, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dtc $$0) {
      return $$0.a(dfe.jd);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return $$0.a(dfe.ph) ? c : b;
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$0.c(d)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avo.dN, avq.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.j && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lb.W, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable brv $$0, dcb $$1, ir $$2, dtc $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dca)$$1, $$2, $$3.c(e), true);
         }
      }

      dqc $$5 = $$1.c_($$2);
      if ($$5 instanceof dqi) {
         ((dqi)$$5).d();
      }

      $$1.a($$0, dxv.c, $$2);
   }

   @Override
   public boolean a(dcb $$0, ir $$1, dtc $$2, epe $$3) {
      if (!$$2.c(dts.C) && $$3.a() == epf.c) {
         boolean $$4 = $$2.c(d);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, avo.ks, avq.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.a(f, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(dca $$0, dtc $$1, ewq $$2, cms $$3) {
      ir $$4 = $$2.a();
      if (!$$0.C && $$3.bV() && $$3.a($$0, $$4) && !$$1.c(d) && !$$1.c(f)) {
         $$0.a($$4, $$1.a(dts.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dca $$0, ir $$1, boolean $$2, boolean $$3) {
      ayt $$4 = $$0.F_();
      le $$5 = $$2 ? lb.as : lb.ar;
      $$0.b(
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
            lb.ac,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dca $$0, ir $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         ir $$3 = $$1.c($$2);
         dtc $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = exk.c(h, $$4.b($$0, $$1, ewz.a()), ewy.i);
         if ($$5) {
            dtc $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dtc $$0) {
      return $$0.b(d) && $$0.a(awe.aX) && $$0.c(d);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(f) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(d, e, f, g);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      if ($$0.C) {
         return $$1.c(d) ? a($$2, dqe.H, dqi::c) : null;
      } else {
         return $$1.c(d) ? a($$2, dqe.H, dqi::a) : a($$2, dqe.H, dqi::b);
      }
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   public static boolean h(dtc $$0) {
      return $$0.a(awe.aX, $$0x -> $$0x.b(f) && $$0x.b(d)) && !$$0.c(f) && !$$0.c(d);
   }
}
