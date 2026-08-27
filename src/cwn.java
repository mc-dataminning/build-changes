import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwn extends cvl implements dcz {
   public static final MapCodec<cwn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, cwn::new)
   );
   protected static final elu b = cvz.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final djg c = djf.r;
   public static final djg d = djf.y;
   public static final djg e = djf.C;
   public static final djj f = djf.R;
   private static final elu g = cvz.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<cwn> a() {
      return a;
   }

   public cwn(boolean $$0, int $$1, dio.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ia.c));
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.c_($$2) instanceof dgj $$7) {
         cmh $$8 = $$3.b($$4);
         Optional<cpn<coz>> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fT().d ? $$8.p() : $$8, $$9.get().b().d())) {
               $$3.a(arm.av);
               return bjl.a;
            }

            return bjl.b;
         }
      }

      return bjl.d;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if ($$0.c(c) && $$3 instanceof blv && !cqu.j((blv)$$3)) {
         $$3.a($$1.ah().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgd $$5 = $$1.c_($$2);
         if ($$5 instanceof dgj) {
            bjh.a($$1, $$2, ((dgj)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      csz $$1 = $$0.q();
      hv $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eea.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return $$1 == ia.a ? $$0.a(d, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dip $$0) {
      return $$0.a(cwb.ij);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, arc.dk, ard.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(jv.V, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable blf $$0, csz $$1, hv $$2, dip $$3) {
      if ($$1.y_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((csy)$$1, $$2, $$3.c(d), true);
         }
      }

      dgd $$5 = $$1.c_($$2);
      if ($$5 instanceof dgj) {
         ((dgj)$$5).f();
      }

      $$1.a($$0, dmz.c, $$2);
   }

   @Override
   public boolean a(csz $$0, hv $$1, dip $$2, edz $$3) {
      if (!$$2.c(djf.C) && $$3.a() == eea.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.y_()) {
               $$0.a(null, $$1, arc.jB, ard.e, 1.0F, 1.0F);
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
   public void a(csy $$0, dip $$1, ekx $$2, cfj $$3) {
      hv $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(djf.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(csy $$0, hv $$1, boolean $$2, boolean $$3) {
      auf $$4 = $$0.F_();
      jy $$5 = $$2 ? jv.ar : jv.aq;
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
            jv.ab,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(csy $$0, hv $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         hv $$3 = $$1.c($$2);
         dip $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = elr.c(g, $$4.b($$0, $$1, elg.a()), elf.i);
         if ($$5) {
            dip $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dip $$0) {
      return $$0.b(c) && $$0.a(arr.aU) && $$0.c(c);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(e) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dgf.G, dgj::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dgf.G, dgj::a) : a($$2, dgf.G, dgj::b);
      }
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   public static boolean h(dip $$0) {
      return $$0.a(arr.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
