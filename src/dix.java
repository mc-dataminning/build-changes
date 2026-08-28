import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dix extends dhv implements dpk {
   public static final MapCodec<dix> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, dix::new)
   );
   protected static final fal b = dij.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dwf c = dwe.r;
   public static final dwf d = dwe.y;
   public static final dwf e = dwe.C;
   public static final dwl<jm> f = dwe.R;
   private static final fal g = dij.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dix> a() {
      return a;
   }

   public dix(boolean $$0, int $$1, dvn.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.F.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jm.c));
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if ($$2.c_($$3) instanceof dsx $$8) {
         cwf $$9 = $$4.b($$5);
         Optional<dav<daf>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.C && $$8.a($$4, $$9, $$10.get().b().d())) {
               $$4.a(awy.av);
               return bsh.b;
            }

            return bsh.c;
         }
      }

      return bsh.f;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if ($$0.c(c) && $$3 instanceof bve) {
         $$3.a($$1.ai().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsr $$5 = $$1.c_($$2);
         if ($$5 instanceof dsx) {
            bsd.a($$1, $$2, ((dsx)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dfg $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == erp.c;
      return this.m().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return $$4 == jm.a ? $$0.b(d, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(dvo $$0) {
      return $$0.a(dil.ij);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awo.dJ, awp.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ls.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bui $$0, dfg $$1, jh $$2, dvo $$3) {
      if ($$1.y_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dff)$$1, $$2, $$3.c(d), true);
         }
      }

      dsr $$5 = $$1.c_($$2);
      if ($$5 instanceof dsx) {
         ((dsx)$$5).d();
      }

      $$1.a($$0, eak.c, $$2);
   }

   @Override
   public boolean a(dfg $$0, jh $$1, dvo $$2, ero $$3) {
      if (!$$2.c(dwe.C) && $$3.a() == erp.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.y_()) {
               $$0.a(null, $$1, awo.kg, awp.e, 1.0F, 1.0F);
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
   protected void a(dff $$0, dvo $$1, ezn $$2, cpk $$3) {
      jh $$4 = $$2.b();
      if (!$$0.C && $$3.ca() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(dwe.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dff $$0, jh $$1, boolean $$2, boolean $$3) {
      azv $$4 = $$0.E_();
      lw $$5 = $$2 ? ls.au : ls.at;
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
            ls.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dff $$0, jh $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jh $$3 = $$1.c($$2);
         dvo $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fai.c(g, $$4.b($$0, $$1, ezw.a()), ezv.i);
         if ($$5) {
            dvo $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dvo $$0) {
      return $$0.b(c) && $$0.a(axd.aW) && $$0.c(c);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(e) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dsx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      if ($$0.C) {
         return $$1.c(c) ? a($$2, dst.G, dsx::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dst.G, dsx::a) : a($$2, dst.G, dsx::b);
      }
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   public static boolean i(dvo $$0) {
      return $$0.a(axd.aW, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
