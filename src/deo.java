import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class deo extends ddm implements dlb {
   public static final MapCodec<deo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, deo::new)
   );
   protected static final evf b = dea.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dru c = drt.r;
   public static final dru d = drt.y;
   public static final dru e = drt.C;
   public static final drx f = drt.R;
   private static final evf g = dea.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   public deo(boolean $$0, int $$1, drc.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, it.c));
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if ($$2.c_($$3) instanceof doo $$8) {
         ctq $$9 = $$4.b($$5);
         Optional<cxy<cxk>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fP() ? $$9.s() : $$9, $$10.get().b().d())) {
               $$4.a(avs.av);
               return bpy.a;
            }

            return bpy.b;
         }
      }

      return bpy.d;
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if ($$0.c(c) && $$3 instanceof bsq && !czc.j((bsq)$$3)) {
         $$3.a($$1.ai().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         doi $$5 = $$1.c_($$2);
         if ($$5 instanceof doo) {
            bps.a($$1, $$2, ((doo)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      dba $$1 = $$0.q();
      io $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == emx.c;
      return this.n().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return $$1 == it.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(drd $$0) {
      return $$0.a(dec.ij);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avi.dI, avj.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ky.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable brw $$0, dba $$1, io $$2, drd $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((daz)$$1, $$2, $$3.c(d), true);
         }
      }

      doi $$5 = $$1.c_($$2);
      if ($$5 instanceof doo) {
         ((doo)$$5).d();
      }

      $$1.a($$0, dvw.c, $$2);
   }

   @Override
   public boolean a(dba $$0, io $$1, drd $$2, emw $$3) {
      if (!$$2.c(drt.C) && $$3.a() == emx.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, avi.kf, avj.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.a(e, Boolean.valueOf(true)).a(c, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(daz $$0, drd $$1, eui $$2, cmq $$3) {
      io $$4 = $$2.a();
      if (!$$0.B && $$3.bQ() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(drt.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(daz $$0, io $$1, boolean $$2, boolean $$3) {
      aym $$4 = $$0.E_();
      lb $$5 = $$2 ? ky.au : ky.at;
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
            ky.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(daz $$0, io $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         io $$3 = $$1.c($$2);
         drd $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = evc.c(g, $$4.b($$0, $$1, eur.a()), euq.i);
         if ($$5) {
            drd $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(drd $$0) {
      return $$0.b(c) && $$0.a(avx.aV) && $$0.c(c);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(e) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new doo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dok.G, doo::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dok.G, doo::a) : a($$2, dok.G, doo::b);
      }
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   public static boolean h(drd $$0) {
      return $$0.a(avx.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
