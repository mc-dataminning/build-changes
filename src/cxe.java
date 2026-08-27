import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxe extends cwc implements ddq {
   public static final MapCodec<cxe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, cxe::new)
   );
   protected static final emm b = cwq.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final djy c = djx.r;
   public static final djy d = djx.y;
   public static final djy e = djx.C;
   public static final dkb f = djx.R;
   private static final emm g = cwq.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<cxe> a() {
      return a;
   }

   public cxe(boolean $$0, int $$1, djg.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ic.c));
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.c_($$2) instanceof dhb $$7) {
         cmy $$8 = $$3.b($$4);
         Optional<cqe<cpq>> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fT().d ? $$8.p() : $$8, $$9.get().b().d())) {
               $$3.a(asc.av);
               return bkb.a;
            }

            return bkb.b;
         }
      }

      return bkb.d;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if ($$0.c(c) && $$3 instanceof bml && !crl.j((bml)$$3)) {
         $$3.a($$1.ai().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgv $$5 = $$1.c_($$2);
         if ($$5 instanceof dhb) {
            bjx.a($$1, $$2, ((dhb)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      ctq $$1 = $$0.q();
      hx $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == ees.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return $$1 == ic.a ? $$0.a(d, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(djh $$0) {
      return $$0.a(cws.ij);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ars.dk, art.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(jx.V, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable blv $$0, ctq $$1, hx $$2, djh $$3) {
      if ($$1.y_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((ctp)$$1, $$2, $$3.c(d), true);
         }
      }

      dgv $$5 = $$1.c_($$2);
      if ($$5 instanceof dhb) {
         ((dhb)$$5).f();
      }

      $$1.a($$0, dnr.c, $$2);
   }

   @Override
   public boolean a(ctq $$0, hx $$1, djh $$2, eer $$3) {
      if (!$$2.c(djx.C) && $$3.a() == ees.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.y_()) {
               $$0.a(null, $$1, ars.jB, art.e, 1.0F, 1.0F);
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
   public void a(ctp $$0, djh $$1, elp $$2, cga $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(djx.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(ctp $$0, hx $$1, boolean $$2, boolean $$3) {
      auv $$4 = $$0.F_();
      ka $$5 = $$2 ? jx.ar : jx.aq;
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
            jx.ab,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(ctp $$0, hx $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         hx $$3 = $$1.c($$2);
         djh $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = emj.c(g, $$4.b($$0, $$1, ely.a()), elx.i);
         if ($$5) {
            djh $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(djh $$0) {
      return $$0.b(c) && $$0.a(ash.aU) && $$0.c(c);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(e) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dgx.G, dhb::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dgx.G, dhb::a) : a($$2, dgx.G, dhb::b);
      }
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   public static boolean h(djh $$0) {
      return $$0.a(ash.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
