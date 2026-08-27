import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxd extends cwb implements ddp {
   public static final MapCodec<cxd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.j), u()
            )
            .apply($$0, cxd::new)
   );
   protected static final eml b = cwp.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final djx c = djw.r;
   public static final djx d = djw.y;
   public static final djx e = djw.C;
   public static final dka f = djw.R;
   private static final eml g = cwp.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int h = 5;
   private final boolean i;
   private final int j;

   @Override
   public MapCodec<cxd> a() {
      return a;
   }

   public cxd(boolean $$0, int $$1, djf.d $$2) {
      super($$2);
      this.i = $$0;
      this.j = $$1;
      this.k(this.E.b().a(c, Boolean.valueOf(true)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, ic.c));
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.c_($$2) instanceof dha $$7) {
         cmx $$8 = $$3.b($$4);
         Optional<cqd<cpp>> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fT().d ? $$8.p() : $$8, $$9.get().b().d())) {
               $$3.a(asb.av);
               return bka.a;
            }

            return bka.b;
         }
      }

      return bka.d;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if ($$0.c(c) && $$3 instanceof bmk && !crk.j((bmk)$$3)) {
         $$3.a($$1.ai().a(), (float)this.j);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgu $$5 = $$1.c_($$2);
         if ($$5 instanceof dha) {
            bjw.a($$1, $$2, ((dha)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eer.c;
      return this.o().a(e, Boolean.valueOf($$3)).a(d, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(c, Boolean.valueOf(!$$3)).a(f, $$0.g());
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return $$1 == ic.a ? $$0.a(d, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(djg $$0) {
      return $$0.a(cwr.ij);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if ($$0.c(c)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, arr.dk, ars.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(jx.V, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable blu $$0, ctp $$1, hx $$2, djg $$3) {
      if ($$1.y_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cto)$$1, $$2, $$3.c(d), true);
         }
      }

      dgu $$5 = $$1.c_($$2);
      if ($$5 instanceof dha) {
         ((dha)$$5).f();
      }

      $$1.a($$0, dnq.c, $$2);
   }

   @Override
   public boolean a(ctp $$0, hx $$1, djg $$2, eeq $$3) {
      if (!$$2.c(djw.C) && $$3.a() == eer.c) {
         boolean $$4 = $$2.c(c);
         if ($$4) {
            if (!$$0.y_()) {
               $$0.a(null, $$1, arr.jB, ars.e, 1.0F, 1.0F);
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
   public void a(cto $$0, djg $$1, elo $$2, cfz $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(c) && !$$1.c(e)) {
         $$0.a($$4, $$1.a(djw.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cto $$0, hx $$1, boolean $$2, boolean $$3) {
      auu $$4 = $$0.F_();
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

   public static boolean a(cto $$0, hx $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         hx $$3 = $$1.c($$2);
         djg $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = emi.c(g, $$4.b($$0, $$1, elx.a()), elw.i);
         if ($$5) {
            djg $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(djg $$0) {
      return $$0.b(c) && $$0.a(asg.aU) && $$0.c(c);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(e) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(f, $$1.a($$0.c(f)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c, d, e, f);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dha($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      if ($$0.B) {
         return $$1.c(c) ? a($$2, dgw.G, dha::c) : null;
      } else {
         return $$1.c(c) ? a($$2, dgw.G, dha::a) : a($$2, dgw.G, dha::b);
      }
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   public static boolean h(djg $$0) {
      return $$0.a(asg.aU, $$0x -> $$0x.b(e) && $$0x.b(c)) && !$$0.c(e) && !$$0.c(c);
   }
}
