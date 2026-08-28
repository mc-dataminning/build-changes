import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhx extends dgv implements dol {
   public static final MapCodec<dhx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, dhx::new)
   );
   protected static final ezm b = dhj.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dvf c = dve.r;
   public static final dvf d = dve.y;
   public static final dvf e = dve.C;
   public static final dvi f = dve.R;
   private static final ezm g = dhj.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   public dhx(boolean $$0, int $$1, dun.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.l(this.F.b().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)).b(f, jj.c));
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if ($$2.c_($$3) instanceof dry $$8) {
         cvp $$9 = $$4.b($$5);
         Optional<daj<czt>> $$10 = $$8.b($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$9, $$10.get().b().d())) {
               $$4.a(awo.av);
               return brp.b;
            }

            return brp.c;
         }
      }

      return brp.f;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if ($$0.c(c) && $$3 instanceof buk) {
         $$3.a($$1.ak().b(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         drs $$5 = $$1.c_($$2);
         if ($$5 instanceof dry) {
            brl.a($$1, $$2, ((dry)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      deh $$1 = $$0.q();
      je $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eqq.c;
      return this.o().b(e, Boolean.valueOf($$3)).b(d, Boolean.valueOf(this.o($$1.a_($$2.e())))).b(c, Boolean.valueOf(!$$3)).b(f, $$0.g());
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return $$1 == jj.a ? $$0.b(d, Boolean.valueOf(this.o($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean o(duo $$0) {
      return $$0.a(dhl.ij);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awe.dJ, awf.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ln.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bto $$0, deh $$1, je $$2, duo $$3) {
      if ($$1.w_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((deg)$$1, $$2, $$3.c(d), true);
         }
      }

      drs $$5 = $$1.c_($$2);
      if ($$5 instanceof dry) {
         ((dry)$$5).d();
      }

      $$1.a($$0, dzl.c, $$2);
   }

   @Override
   public boolean a(deh $$0, je $$1, duo $$2, eqp $$3) {
      if (!$$2.c(dve.C) && $$3.a() == eqq.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.w_()) {
               $$0.a(null, $$1, awe.kg, awf.e, 1.0F, 1.0F);
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
   protected void a(deg $$0, duo $$1, eyo $$2, coo $$3) {
      je $$4 = $$2.b();
      if (!$$0.B && $$3.bV() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.b(dve.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(deg $$0, je $$1, boolean $$2, boolean $$3) {
      azl $$4 = $$0.C_();
      lr $$5 = $$2 ? ln.au : ln.at;
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
            ln.ae,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(deg $$0, je $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         je $$3 = $$1.c($$2);
         duo $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = ezj.c(g, $$4.b($$0, $$1, eyx.a()), eyw.i);
         if ($$5) {
            duo $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(duo $$0) {
      return $$0.b(c) && $$0.a(awt.aW) && $$0.c(c);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(e) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dry($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dru.G, dry::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dru.G, dry::a) : a($$2, dru.G, dry::b);
      }
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   public static boolean i(duo $$0) {
      return $$0.a(awt.aW, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
