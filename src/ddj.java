import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddj extends dch implements djw {
   public static final MapCodec<ddj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, ddj::new)
   );
   protected static final ety b = dcv.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dqp c = dqo.r;
   public static final dqp d = dqo.y;
   public static final dqp e = dqo.C;
   public static final dqs f = dqo.R;
   private static final ety g = dcv.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<ddj> a() {
      return a;
   }

   public ddj(boolean $$0, int $$1, dpx.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ir.c));
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if ($$2.c_($$3) instanceof dnj $$8) {
         csd $$9 = $$4.b($$5);
         Optional<cwi<cvu>> $$10 = $$8.a($$9);
         if ($$10.isPresent()) {
            if (!$$2.B && $$8.a($$4, $$4.fN() ? $$9.r() : $$9, $$10.get().b().d())) {
               $$4.a(avj.av);
               return bos.a;
            }

            return bos.b;
         }
      }

      return bos.d;
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if ($$0.c(c) && $$3 instanceof bre && !cxo.j((bre)$$3)) {
         $$3.a($$1.ai().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dnd $$5 = $$1.c_($$2);
         if ($$5 instanceof dnj) {
            bom.a($$1, $$2, ((dnj)$$5).b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      czv $$1 = $$0.q();
      im $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == els.c;
      return this.n().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.m($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return $$1 == ir.a ? $$0.a(d, Boolean.valueOf(this.m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean m(dpy $$0) {
      return $$0.a(dcx.ij);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, auz.dI, ava.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(kw.V, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bql $$0, czv $$1, im $$2, dpy $$3) {
      if ($$1.x_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((czu)$$1, $$2, $$3.c(d), true);
         }
      }

      dnd $$5 = $$1.c_($$2);
      if ($$5 instanceof dnj) {
         ((dnj)$$5).d();
      }

      $$1.a($$0, dur.c, $$2);
   }

   @Override
   public boolean a(czv $$0, im $$1, dpy $$2, elr $$3) {
      if (!$$2.c(dqo.C) && $$3.a() == els.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.x_()) {
               $$0.a(null, $$1, auz.ka, ava.e, 1.0F, 1.0F);
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
   protected void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
      im $$4 = $$2.a();
      if (!$$0.B && $$3.bO() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(dqo.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(czu $$0, im $$1, boolean $$2, boolean $$3) {
      ayd $$4 = $$0.E_();
      kz $$5 = $$2 ? kw.ar : kw.aq;
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
            kw.ab,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(czu $$0, im $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         im $$3 = $$1.c($$2);
         dpy $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = etv.c(g, $$4.b($$0, $$1, etk.a()), etj.i);
         if ($$5) {
            dpy $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dpy $$0) {
      return $$0.b(c) && $$0.a(avo.aV) && $$0.c(c);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(e) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dnj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dnf.G, dnj::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dnf.G, dnj::a) : a($$2, dnf.G, dnj::b);
      }
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   public static boolean h(dpy $$0) {
      return $$0.a(avo.aV, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
