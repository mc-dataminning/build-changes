import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dia extends dgy implements doo {
   public static final MapCodec<dia> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), t()
            )
            .apply($$0, dia::new)
   );
   protected static final ezq b = dhm.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dvj c = dvi.r;
   public static final dvj d = dvi.y;
   public static final dvj e = dvi.C;
   public static final dvm f = dvi.R;
   private static final ezq g = dhm.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   public dia(boolean $$0, int $$1, dur.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.F.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jk.c));
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if ($$2.c_($$3) instanceof dsb $$8) {
         cvs $$9 = $$4.b($$5);
         Optional<dam<czw>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$9, $$10.get().b().d())) {
               $$4.a(awq.av);
               return brs.b;
            }

            return brs.c;
         }
      }

      return brs.f;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if ($$0.c(c) && $$3 instanceof bun) {
         $$3.a($$1.ak().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         drv $$5 = $$1.c_($$2);
         if ($$5 instanceof dsb) {
            bro.a($$1, $$2, ((dsb)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dek $$1 = $$0.q();
      jf $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == equ.c;
      return this.n().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return $$1 == jk.a ? $$0.b(d, Boolean.valueOf(this.o($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean o(dus $$0) {
      return $$0.a(dho.ij);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awg.dJ, awh.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(lo.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable btr $$0, dek $$1, jf $$2, dus $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dej)$$1, $$2, $$3.c(d), true);
         }
      }

      drv $$5 = $$1.c_($$2);
      if ($$5 instanceof dsb) {
         ((dsb)$$5).d();
      }

      $$1.a($$0, dzp.c, $$2);
   }

   @Override
   public boolean a(dek $$0, jf $$1, dus $$2, eqt $$3) {
      if (!$$2.c(dvi.C) && $$3.a() == equ.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, awg.kg, awh.e, 1.0F, 1.0F);
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
   protected void a(dej $$0, dus $$1, eys $$2, cor $$3) {
      jf $$4 = $$2.b();
      if (!$$0.B && $$3.bV() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(dvi.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(dej $$0, jf $$1, boolean $$2, boolean $$3) {
      azn $$4 = $$0.D_();
      ls $$5 = $$2 ? lo.au : lo.at;
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
            lo.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(dej $$0, jf $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jf $$3 = $$1.c($$2);
         dus $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = ezn.c(g, $$4.b($$0, $$1, ezb.a()), eza.i);
         if ($$5) {
            dus $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(dus $$0) {
      return $$0.b(c) && $$0.a(awv.aW) && $$0.c(c);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(e) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, drx.G, dsb::c) : null;
      } else {
         return $$1.c(c) ? a($$2, drx.G, dsb::a) : a($$2, drx.G, dsb::b);
      }
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   public static boolean i(dus $$0) {
      return $$0.a(awv.aW, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
