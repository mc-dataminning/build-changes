import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class czc extends cya implements dfo {
   public static final MapCodec<czc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, czc::new)
   );
   protected static final eol b = cyo.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dlw c = dlv.r;
   public static final dlw d = dlv.y;
   public static final dlw e = dlv.C;
   public static final dlz f = dlv.R;
   private static final eol g = cyo.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<czc> a() {
      return a;
   }

   public czc(boolean $$0, int $$1, dle.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ie.c));
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if ($$2.c_($$3) instanceof diz $$8) {
         coz $$9 = $$4.b($$5);
         Optional<csd<crp>> $$10 = $$8.a($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fU().d ? $$9.q() : $$9, $$10.get().b().d())) {
               $$4.a(atu.av);
               return blw.a;
            }

            return blw.b;
         }
      }

      return blw.d;
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if ($$0.c(c) && $$3 instanceof bog && !ctj.j((bog)$$3)) {
         $$3.a($$1.ai().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dit $$5 = $$1.c_($$2);
         if ($$5 instanceof diz) {
            blq.a($$1, $$2, ((diz)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      cvo $$1 = $$0.q();
      hz $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == egq.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return $$1 == ie.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dlf $$0) {
      return $$0.a(cyq.ij);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, atk.dz, atl.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(jz.V, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bno $$0, cvo $$1, hz $$2, dlf $$3) {
      if ($$1.y_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cvn)$$1, $$2, $$3.c(d), true);
         }
      }

      dit $$5 = $$1.c_($$2);
      if ($$5 instanceof diz) {
         ((diz)$$5).f();
      }

      $$1.a($$0, dpp.c, $$2);
   }

   @Override
   public boolean a(cvo $$0, hz $$1, dlf $$2, egp $$3) {
      if (!$$2.c(dlv.C) && $$3.a() == egq.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.y_()) {
               $$0.a(null, $$1, atk.jQ, atl.e, 1.0F, 1.0F);
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
   protected void a(cvn $$0, dlf $$1, eno $$2, chz $$3) {
      hz $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dlv.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cvn $$0, hz $$1, boolean $$2, boolean $$3) {
      awo $$4 = $$0.F_();
      kc $$5 = $$2 ? jz.ar : jz.aq;
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
            jz.ab,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(cvn $$0, hz $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         hz $$3 = $$1.c($$2);
         dlf $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = eoi.c(g, $$4.b($$0, $$1, enx.a()), enw.i);
         if ($$5) {
            dlf $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dlf $$0) {
      return $$0.b(c) && $$0.a(atz.aU) && $$0.c(c);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(e) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new diz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, div.G, diz::c) : null;
      } else {
         return $$1.c(c) ? a($$2, div.G, diz::a) : a($$2, div.G, diz::b);
      }
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   public static boolean h(dlf $$0) {
      return $$0.a(atz.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
