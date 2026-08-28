import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dmj extends dlg implements dtb {
   public static final MapCodec<dmj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.C), t()
            )
            .apply($$0, dmj::new)
   );
   public static final eaf b = eae.u;
   public static final eaf c = eae.D;
   public static final eaf d = eae.I;
   public static final eam<ja> e = eae.T;
   private static final feq f = dlu.b(16.0, 0.0, 7.0);
   private static final feq g = dlu.b(4.0, 0.0, 16.0);
   private static final int h = 5;
   private final boolean i;
   private final int C;

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   public dmj(boolean $$0, int $$1, dzn.d $$2) {
      super($$2);
      this.i = $$0;
      this.C = $$1;
      this.l(this.B.b().b(b, Boolean.valueOf(true)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)).b(e, ja.c));
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if ($$2.c_($$3) instanceof dwu $$8) {
         cys $$9 = $$4.b($$5);
         if ($$2.Q().a(dds.h).a($$9)) {
            if ($$2 instanceof aro $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(awv.av);
               return bty.b;
            }

            return bty.c;
         }
      }

      return bty.f;
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if ($$0.c(b) && $$3 instanceof bwz) {
         $$3.a($$1.al().b(), (float)this.C);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      diq $$1 = $$0.q();
      iu $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == evw.c;
      return this.m().b(d, Boolean.valueOf($$3)).b(c, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(b, Boolean.valueOf(!$$3)).b(e, $$0.g());
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return $$4 == ja.a ? $$0.b(c, Boolean.valueOf(this.o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(dzo $$0) {
      return $$0.a(dlw.iH);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return f;
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awl.dK, awm.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lx.ab, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bwa $$0, diq $$1, iu $$2, dzo $$3) {
      if ($$1.w_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dip)$$1, $$2, $$3.c(c), true);
         }
      }

      $$1.a($$0, eeo.c, $$2);
   }

   @Override
   public boolean a(diq $$0, iu $$1, dzo $$2, evv $$3) {
      if (!$$2.c(eae.I) && $$3.a() == evw.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.w_()) {
               $$0.a(null, $$1, awl.kF, awm.e, 1.0F, 1.0F);
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
   protected void a(dip $$0, dzo $$1, fds $$2, crm $$3) {
      iu $$4 = $$2.b();
      if ($$0 instanceof aro $$5 && $$3.bY() && $$3.c($$5, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.b(eae.u, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dip $$0, iu $$1, boolean $$2, boolean $$3) {
      azt $$4 = $$0.C_();
      mb $$5 = $$2 ? lx.ax : lx.aw;
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
            lx.ah,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dip $$0, iu $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         iu $$3 = $$1.c($$2);
         dzo $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fen.c(g, $$4.b($$0, $$1, feb.a()), fea.i);
         if ($$5) {
            dzo $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dzo $$0) {
      return $$0.b(b) && $$0.a(axa.aX) && $$0.c(b);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(d) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      if ($$0 instanceof aro $$3) {
         if ($$1.c(b)) {
            ddq.a<dec, dcu> $$4 = ddq.a(ddu.e);
            return a($$2, dwp.H, ($$2x, $$3x, $$4x, $$5) -> dwu.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, dwp.H, dwu::a);
         }
      } else {
         return $$1.c(b) ? a($$2, dwp.H, dwu::b) : null;
      }
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   public static boolean i(dzo $$0) {
      return $$0.a(axa.aX, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
